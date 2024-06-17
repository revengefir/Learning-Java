package org.example.part2;

public class NestVar {
    public static void main(String[] args){
        int count;

        for (count = 0; count < 10; count = count+1){
            System.out.println("Значение count: " + count);

            //  int count; // Ошибка второй раз переменную объявлять нельзя
            // for (count = 0; count < 2; count++)
             //   System.out.println("Ошибка");
        }
    }
}
