package org.example.part2;

public class VarInitDemo {
    public static void main(String[] args){
        int x;

        for(x = 0; x < 3; x++){
            int y = -1; // y инициализируется при каждом входе в блок
            System.out.println("Значение y равно: "+ y);
            y = 100;
            System.out.println("Теперь y равно: " + y);
        }
    }
}
