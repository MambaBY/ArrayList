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

        for (int i = 0; i < 20; i++) {
            arrayList.add(Math.random());
        }
        printListElements(arrayList);
        System.out.println("Avarage value is " + countAverageValue(arrayList) +"\n");
        multiplyByTwo(arrayList);
        printListElements(arrayList);



    }

    //Task 'Б'. Method for printig elements of ArrayList to console
    public static void printListElements(ArrayList<Double> arrayList){
        System.out.println("Elements of ArrayList: ");
        for (double element : arrayList  ) {
            System.out.println(element);
        }
        System.out.println();
    }

    // Task 'B' Method for counting the average value of ArrayList elements
    public static double countAverageValue(ArrayList<Double> arrayList){
        double sum =0;
        for (double element : arrayList) {
            sum += element;
        }
        return sum/arrayList.size();
    }

    //Task 'Г'. Method of multiplying elements by two that are less than the average value.
    public static void multiplyByTwo(ArrayList<Double> arrayList){
        double averageValue = countAverageValue(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) < averageValue){
                arrayList.set(i, arrayList.get(i)*2);
            }
        }
    }
}