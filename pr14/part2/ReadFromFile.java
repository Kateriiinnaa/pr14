package ru.mirea.katerina.pr14.part2;
import java.io.*;
public class ReadFromFile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("output.txt")) {
            int character;
            System.out.println("Содержимое файла 'output.txt':");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println(); // Перевод строки в конце
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
