package ru.mirea.katerina.pr14.part2;

import java.io.*;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для добавления в конец файла:");
        String newText = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", true)) { // true = режим дозаписи
            writer.append("\n"); // Добавляем новую строку перед текстом
            writer.append(newText);
            System.out.println("Текст добавлен в конец файла.");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
