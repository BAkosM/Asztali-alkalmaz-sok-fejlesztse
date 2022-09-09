package hu.petrik.javahazi;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a fal szélességét méterben: ");
        double szel = sc.nextDouble();
        System.out.print("Kérem adja meg a fal magasságát méterben: ");
        double mag = sc.nextDouble();
        double csemp = Math.pow(0.2,2);
        double db = (szel*mag/csemp)*1.1;
        System.out.printf("%.0f darab csempe fog kelleni!", Math.ceil(db));
    }
}
