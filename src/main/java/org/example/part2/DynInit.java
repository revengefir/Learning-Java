package org.example.part2;

public class DynInit {
    public static void main(String[] args){
        double radius = 4, height = 5;
        // Динамическая инициализация volume.
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Объем составляет " + volume);
    }
}
