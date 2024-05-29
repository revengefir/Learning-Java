package org.example.part1.exercises;

public class Exercise2GalToLitTable {
    public static void main(String[] args){
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons=1; gallons <= 100; gallons++) {
            liters = gallons*3.7854;
            System.out.printf(gallons + " галонов соответствует " + liters + " литрам");

            counter++;
            if (counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}
