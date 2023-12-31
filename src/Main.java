import java.util.ArrayList;


/*
 * Задача 18. На коллекции класса ArrayList
 * Используя один класс:
 * а. создать коллекцию и заполнить ее двадцатью случайными числами от ноля до 1, используя метод Math.random() (по умолчанию, он именно так и делает);
 * б. вывести исходную коллекцию на консоль с комментарием, выделив функционал в метод;
 * в. вычислить среднее арифметическое коллекции, выделив функционал в метод;
 * г. умножить на 2 все элементы коллекции, которые меньше среднего арифметического, выделив функционал в метод;
 * д. вывести полученную коллекцию на консоль с комментарием;
 * е. отсортировать коллекцию по возрастанию, не используя метод .sort(), выделив функционал в метод;
 * ж. вывести полученную коллекцию на консоль с комментарием;
 * з. найти среднее арифметическое коллекции;
 * и. удалить из коллекции все элементы, меньшие среднего арифметического, выделив функционал в метод;
 * к. вывести полученную коллекцию на консоль с комментарием;
 * л. найти среднее арифметическое коллекции;
 * м. после всех элементов, меньших среднего арифметического, добавить элемент со значением 1000, выделив функционал в метод;
 * н. вывести полученную коллекцию на консоль с комментарием;
 * о. определить длину коллекции;
 * п. создать новую коллекцию;
 * р. поместить в новую коллекцию три средних элемента исходной коллекции, если ее размер нечетен, и два средних элемента коллекции, если четен, выделив функционал в метод;
 * с. вывести на консоль новую коллекцию;
 * т. оставить в исходной коллекции все элементы, кроме элементов новой коллекции, не создавая собственных методов;
 * у. вывести на консоль конечный состав исходной коллекции.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> arrayListNew = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(Math.random());
        }
        /*
         * а. создать коллекцию и заполнить ее двадцатью случайными числами от ноля до 1, используя метод Math.random() (по умолчанию, он именно так и делает);
         * б. вывести исходную коллекцию на консоль с комментарием, выделив функционал в метод;
         * * в. вычислить среднее арифметическое коллекции, выделив функционал в метод;
         */
        printListElements(arrayList);
        System.out.println("Average value is " + countAverageValue(arrayList) + "\n");

        /*
         * г. умножить на 2 все элементы коллекции, которые меньше среднего арифметического, выделив функционал в метод;
         * д. вывести полученную коллекцию на консоль с комментарием;
         */
        System.out.println("Collection with elements multiplied by two.");
        multiplyByTwo(arrayList);
        printListElements(arrayList);
        System.out.println();

        /*
        е. отсортировать коллекцию по возрастанию, не используя метод .sort(), выделив функционал в метод;
        * ж. вывести полученную коллекцию на консоль с комментарием;
        * з. найти среднее арифметическое коллекции;
         */
        System.out.println("Collection sorted in ascending order");
        sortInAsc(arrayList);
        printListElements(arrayList);
        System.out.println("Average value is " + countAverageValue(arrayList) + "\n");

        /*
         * и. удалить из коллекции все элементы, меньшие среднего арифметического, выделив функционал в метод;
         * к. вывести полученную коллекцию на консоль с комментарием;
         * л. найти среднее арифметическое коллекции;
         */
        System.out.println("Collection after removed elements");
        removeElements(arrayList);
        printListElements(arrayList);
        System.out.println("Average value is " + countAverageValue(arrayList) + "\n");

        /*
         * м. после всех элементов, меньших среднего арифметического, добавить элемент со значением 1000, выделив функционал в метод;
         * н. вывести полученную коллекцию на консоль с комментарием;
         * о. определить длину коллекции;
         */

        System.out.println("Collection with added element: 1000");
        addNumberAfter(arrayList);
        printListElements(arrayList);
        System.out.println("Collection length is " + arrayList.size() + "\n");

        /*
         * п. создать новую коллекцию;
         * р. поместить в новую коллекцию три средних элемента исходной коллекции, если ее размер нечетен, и два средних элемента коллекции, если четен, выделив функционал в метод;
         * с. вывести на консоль новую коллекцию;
         */
        System.out.println("New collection.");
        addMiddleElementsToCollection(arrayList, arrayListNew);
        printListElements(arrayListNew);

        /*
         * т. оставить в исходной коллекции все элементы, кроме элементов новой коллекции, не создавая собственных методов;
         * у. вывести на консоль конечный состав исходной коллекции.
         */
        System.out.println("Updated old collection.");
        arrayList.removeAll(arrayListNew);
        printListElements(arrayList);

    }

    /*
    Task 'Б'. Method for printing elements of ArrayList to console
     */
    public static void printListElements(ArrayList<Double> arrayList) {
        System.out.println("Elements of ArrayList: ");
        for (double element : arrayList) {
            System.out.println(element);
        }
        System.out.println();
    }

    /*
     Task 'B' Method for counting the average value of ArrayList elements
     */
    public static double countAverageValue(ArrayList<Double> arrayList) {
        double sum = 0;
        for (double element : arrayList) {
            sum += element;
        }
        return sum / arrayList.size();
    }

    /*
    Task 'Г'. Method of multiplying elements by two that are less than the average value.
     */
    public static void multiplyByTwo(ArrayList<Double> arrayList) {
        double averageValue = countAverageValue(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < averageValue) {
                arrayList.set(i, arrayList.get(i) * 2);
            }
        }
    }

    /*
    Task 'E'. Method of sorting in ascending order
     */
    public static void sortInAsc(ArrayList<Double> arrayList) {
        boolean isSorted = false;
        double m;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    isSorted = false;
                    m = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, m);
                }

            }
        }
    }

    /*
     * Task 'И'. Method of removing elements from collection that are less than average value
     */

    public static void removeElements(ArrayList<Double> arrayList) {
        double averageValue = countAverageValue(arrayList);
        arrayList.removeIf(aDouble -> aDouble < averageValue);
    }

    /*
     * Task 'M'. Method of adding 1000 to collection
     */
    public static void addNumberAfter(ArrayList<Double> arrayList) {
        double averageValue = countAverageValue(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < averageValue && arrayList.get(i + 1) >= averageValue) {
                arrayList.add(i + 1, 1000d);
            }
        }
    }

    /*
     * Task 'P'. Method of adding middle elements from old collection to a new collection
     */
    public static void addMiddleElementsToCollection(ArrayList<Double> arrayList, ArrayList<Double> arrayListNew) {
        if (arrayList.size() % 2 == 0) {
            arrayListNew.add(arrayList.get(arrayList.size() / 2 - 1));
            arrayListNew.add(arrayList.get(arrayList.size() / 2));
        } else {
            arrayListNew.add(arrayList.get(arrayList.size() / 2 - 1));
            arrayListNew.add(arrayList.get(arrayList.size() / 2));
            arrayListNew.add(arrayList.get(arrayList.size() / 2 + 1));


        }
    }


}