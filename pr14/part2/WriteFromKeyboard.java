package ru.mirea.katerina.pr14.part2;

import java.io.*;
import java.util.Scanner;

public class WriteFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для записи в файл:");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", false)) {
            writer.write(input);
            System.out.println("Текст успешно записан в файл 'output.txt'");
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}
