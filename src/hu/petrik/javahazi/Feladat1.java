package hu.petrik.javahazi;

import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a medence átmérőjét: ");
        double diameter = sc.nextDouble();
        System.out.print("Kérem adja meg a medence mélységét: ");
        double deept = sc.nextDouble();
        double radius = diameter / 2;
        double area = radius * radius * Math.PI;
        double volume = area * deept;
        /*  Egész szám %d
            Tört szám %f (%.3f = három tizedes jegy)
            Szöveg, egyébb %s
        */
        System.out.printf("A medence térfogata %.3f köbméter", volume);
    }
}
