package org.example.part2;

public class Inches {
    public static void main(String[] args){
        long ci;
        long im;
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("В кубической мили содержится "+ ci +
                " кубических дюймов");
    }
}
