package org.example.part2;

public class ScopeDemo {
    public static void main(String[] args){
        int x;
        x = 10;
        if(x == 10) {   // начало новой области видимости
            int y = 20; // Переменная известная только в области
            // Обе переменные известны
            System.out.println("x и y: " + x + " " + y);
            x = y*2;
        }
            // y = 100; // Ошибка переменная неизвестна в этом блоке
        // x здесь по прежнему известна
        System.out.println("Значение x равно " + x);
    }
}
