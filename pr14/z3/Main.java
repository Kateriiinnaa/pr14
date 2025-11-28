package ru.mirea.katerina.pr14.z3;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Список: " + list);
        System.out.println("Элемент по индексу 1: " + list.get(1));

        list.set(1, "Blueberry");
        System.out.println("После замены: " + list);

        list.remove(0);
        System.out.println("После удаления первого: " + list);

        System.out.println("Содержит 'Cherry'? " + list.contains("Cherry"));
        System.out.println("Размер: " + list.size());
    }
}
