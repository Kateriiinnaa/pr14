package ru.mirea.katerina.pr14.z2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();

        // Добавление
        states.add("Германия");
        states.addFirst("Испания");
        states.addLast("Великобритания");
        states.add(1, "Италия");

        System.out.println("Список стран:");
        for (String state : states) {
            System.out.println(state);
        }

        // Удаление с начала и конца
        states.removeFirst();
        states.removeLast();

        System.out.println("\nПосле удаления первого и последнего:");
        states.forEach(System.out::println);

        // Работа с объектами
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        System.out.println("\nСписок людей:");
        for (Person p : people) {
            System.out.println(p.getName());
        }

        // Получение первого элемента
        Person first = people.getFirst();
        System.out.println("\nПервый человек: " + first.getName());
    }
}
