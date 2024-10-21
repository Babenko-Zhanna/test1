import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Task> taskList1 = new ArrayList<>(); // создаем пустой лист для Task
        taskList1.add(new Task(1, "задача №1", "Реализовать задачу №1")); // добавляем задачу в лист
        taskList1.add(new Task(2, "задача №2", "Реализовать задачу №2"));
        taskList1.add(new Task(3, "задача №3", "Реализовать задачу №3"));

        List<Task> taskList2 = List.of( // создаем лист Task сразу с данными
                new Task(4, "задача №4", "Реализовать задачу №4"),
                new Task(5, "задача №5", "Реализовать задачу №5"),
                new Task(6, "задача №6", "Реализовать задачу №6"),
                new Task(7, "задача №7", "Реализовать задачу №7")
        );

        List<String> technologies1 = List.of("Java", "go", "mySQL");
        List<String> technologies2 = List.of("Java", "C++", "mySQL", "go");

        List<Programmer> programmerList1 = List.of(
                new Programmer("Jack", technologies1),
                new Programmer("Lena", technologies2),
                new Programmer("Nick", List.of("Java", "mySQL", "C#"))
        );

        for (int i = 0; i < programmerList1.size(); i++) {
            System.out.println(programmerList1.get(i));
        }

        System.out.println("------------------ добавили всем задачу №1 -----------------");
        for (int i = 0; i < programmerList1.size(); i++) {
            programmerList1.get(i).addTask(taskList1.get(0));
        }

        for (int i = 0; i < programmerList1.size(); i++) {
            System.out.println(programmerList1.get(i));
        }

        System.out.println("------------------- добавили Лене задачу №2 ----------------------");
        programmerList1.get(1).addTask(taskList1.get(1));

        for (int i = 0; i < programmerList1.size(); i++) {
            System.out.println(programmerList1.get(i));
        }

        System.out.println("Есть ли у Лены задача №2?");
        System.out.println(programmerList1.get(1).checkTaskByNumber(2));

        System.out.println("Есть ли у Джека задача №2?");
        System.out.println(programmerList1.get(0).checkTaskByNumber(2));

    }
}