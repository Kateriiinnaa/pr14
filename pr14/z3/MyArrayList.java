package ru.mirea.katerina.pr14.z3;

public class MyArrayList {
    private String[] data;
    private int size;
    private int capacity;

    // Конструктор
    public MyArrayList() {
        this.capacity = 10;
        this.data = new String[capacity];
        this.size = 0;
    }

    // Автоматическое расширение массива
    private void ensureCapacity() {
        if (size >= capacity) {
            capacity *= 2;
            String[] newData = new String[capacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    // Добавление элемента в конец
    public void add(String item) {
        ensureCapacity();
        data[size] = item;
        size++;
    }

    // Получение по индексу
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    // Установка значения по индексу
    public void set(int index, String item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        data[index] = item;
    }

    // Удаление по индексу
    public String remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        String removed = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return removed;
    }

    // Размер списка
    public int size() {
        return size;
    }

    // Проверка наличия элемента
    public boolean contains(String item) {
        for (int i = 0; i < size; i++) {
            if (data[i] != null && data[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    // Вывод списка
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
