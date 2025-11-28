package ru.mirea.katerina.pr14.part2;

import java.io.*;
import java.util.Scanner;

public class ReplaceFileContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новый текст (старый будет заменён):");
        String newText = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) { // false по умолчанию
            writer.write(newText);
            System.out.println("Содержимое файла заменено.");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
