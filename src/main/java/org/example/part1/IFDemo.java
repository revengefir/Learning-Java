package org.example.part1;

public class IFDemo {
    public static void main(String[] args){
        int a, b, c;
        a = 2;
        b = 3;
        if (a < b) System.out.println("Значение а меньше b - правда");
        if (a==b) System.out.println("Тут ничего не будет");
        System.out.println();
        c = a-b;
        System.out.println("Переменная равна " + c);
        if (c >= 0) System.out.println("Значение положительное");
        if (c <= 0) System.out.println("Значение отрицательное");
        System.out.println();
        c = b - a;
        System.out.println("Переменная равна " + c);
        if (c >= 0) System.out.println("Значение неотрицательное");
        if (c <= 0) System.out.println("Значение отрицательное");
    }
}
