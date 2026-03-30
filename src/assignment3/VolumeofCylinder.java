package assignment3;

import java.util.Scanner;

public class VolumeofCylinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Radius : ");
        double radius = sc.nextDouble();

        System.out.print(" Enter height : ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height ;

        System.out.print(" The Volume of Cylinder : " + volume );

        sc.close();
    }
}
