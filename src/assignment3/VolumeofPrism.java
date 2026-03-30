package assignment3;

import java.util.Scanner;

public class VolumeofPrism {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter base Area : ");
        double baseArea = sc.nextDouble();

        System.out.print(" Enter Height : ");
        double height = sc.nextDouble();

        double volume = baseArea * height ;


        System.out.print(" The Volume of Prism : " + volume);
        sc.close();
    }
}
