import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringsList = Arrays.asList("bacon", "beef", "chicken", "duck", "ham", "lamb", "liver", "meat");
        System.out.println(numberOfLinesInListStartingWithSpecificLetter(stringsList, "b"));

        List<Person> personList = Arrays.asList(
                new Person("Ivan", 15),
                new Person("Olga", 24),
                new Person("Ira", 13),
                new Person("Sergei", 35),
                new Person("Oleg", 45),
                new Person("Igor", 52),
                new Person("Tanja", 33),
                new Person("Elena", 12),
                new Person("Aleksandr", 41),
                new Person("Lena", 26)
        );
        displayPersonObjectsOlder30Years(personList);
    }

    /*
    Создайте список типа String, например, названия пищевых продуктов.
    Напишите программу для подсчета количества строк в списке, начинающихся с определенной буквы,
    с использованием потоков.
    */
    public static long numberOfLinesInListStartingWithSpecificLetter(List<String> list, String c){
        return list.stream()
                .filter(string -> string.substring(0, 1).equalsIgnoreCase(c))
                .count();
    }

    /*
    Создать класс Person с полями name и age.
    В классе с методом main создать список, состоящий не менее, чем из 10 объектов класса Person с произвольными данными.
    Отфильтровать и вывести в консоль объекты Person, возраст которых более 30 лет.
    */
    public static void displayPersonObjectsOlder30Years(List<Person> personList){
        personList.stream()
                .filter(person -> person.getAge() > 30)
                .forEach(System.out::println);
    }
}
