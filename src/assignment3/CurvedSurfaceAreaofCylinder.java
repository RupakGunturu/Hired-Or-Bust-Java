package assignment3;

import java.util.Scanner;

public class CurvedSurfaceAreaofCylinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Radius : ");
        double r = sc.nextDouble();

        System.out.print(" Enter Height : ");
        double h = sc.nextDouble();

        double CSA = 2 * Math.PI * r * h ;

        System.out.print(" The CSA is : " + CSA);
        sc.close();
    }
}
