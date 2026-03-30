package assignment3;

import java.util.Scanner;

public class VolumeofSphere {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Radius : ");
        double r = sc.nextDouble();

        double volume = ( 4.0 / 3 * Math.PI * r * r * r );

        System.out.print(" The Volume of Sphere : " + volume);
    }
}
