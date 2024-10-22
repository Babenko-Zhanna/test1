import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // примитивные переменные не могут использоваться в дженериках (лист интов нельзя сделать, только массив)
        // List<int> xxx - так нельзя
        // придумали классы-обертки -> можно создавать листы условно примитивных типов

        Scanner scanner = new Scanner(System.in);

        Integer i1 = 10; //переменная ссылочного типа (класс)    // auto boxing
        // Integer i1 = new Integer (10); - под капотом
        Integer i2 = 10;
        Double d = 5.3; // Double d = new Double (5.3);
        double q; // примитивная переменная

        // if (i1 == null) {int k = 0;}
        int k = i1; // i1.intValue(); - внутри вызывается этот метод и возвращает int - auto unboxing
        // i1 может быть null -> null pointer exception

        i1 = i1 + i2; // сначала 2 unboxing, потом сложение, потом boxing (тоже может вылезти null)

        List<Integer> ints = getIntsFromScanner(scanner);
        System.out.println(ints);
        System.out.println(isExists(ints, 5));

        scanner.close();
    }

    public static List<Integer> getIntsFromScanner (Scanner scanner) {
        List<Integer> result = new ArrayList<>(); // если бы был массив, надо было бы заранее знать сколько пользователь введет чисел
        while (true) {
            System.out.println("Введите целое число или 0 для завершения:");
            int number = scanner.nextInt();
            if (number==0){
                return result;
            }
            result.add(number);
        }
    }

   public static boolean checkIntInList (List<Integer> ints, int number) {
        /*for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i).equals(number)) {  //Integer - объект, == не подходит
                return true;
            }
        }
        return false;*/

        for (Integer element : ints) {
            // перебор без индекса (но все подряд без выбора) / "объявить переменную необходимого типа" : "что перебирать"
            if (element.equals(number)) {
                return true;
            }
        }
        return false;
    }

    // краткий аналог прошлому методу (благодаря свойствам листа)
    public static boolean isExists (List<Integer> list, int number) {
        return list.contains(number);
    }

    public static int getIndexOf (List<Integer> list, int number) {
        return list.indexOf(number);
    }

    public static boolean isPersonExist (List<Person> list, Person person) { // create equals() in Person !!!
        return list.contains(person);
    }

    public static boolean isPersonByAgeExists (List<Person> list, int age) {
        for (Person person : list) {
            if (person.getAge() == age) {
                return true;
            }
        }
        return false;
    }

}