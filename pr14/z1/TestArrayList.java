package ru.mirea.katerina.pr14.z1;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Создание списка
        ArrayList<String> countries = new ArrayList<>();

        // Добавление элементов
        countries.add("Германия");
        countries.add("Франция");
        countries.add(1, "Италия"); // Вставка по индексу

        // Получение и изменение элемента
        System.out.println("Элемент по индексу 1: " + countries.get(1));
        countries.set(1, "Дания");

        // Вывод всех элементов
        System.out.println("Список стран:");
        for (String country : countries) {
            System.out.println(country);
        }

        // Проверка наличия и удаление
        if (countries.contains("Германия")) {
            System.out.println("Германия найдена в списке");
        }

        countries.remove("Германия");    // по значению
        countries.remove(0);             // по индексу

        System.out.println("\nПосле удаления:");
        countries.forEach(System.out::println);

        // Преобразование в массив
        Object[] array = countries.toArray();
        System.out.println("\nПреобразовано в массив:");
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
