package org.example.part2.exercises;

public class Sound {
    public static void main(String[] args){
        double dist;
        double time;
        time = 7.2;
        dist = 7.2 * 335;
        System.out.println("Место вспышки находится на расстоянии " + dist +
                " метров");
        // Дополнительно задание //
        time = 80.0;
        double timeback;
        timeback = 80.0 / 2;
        dist = timeback * 335;
        System.out.println("Расстояние до скалы " + dist);
    }
}
