package assignment3;

import java.util.Scanner;

public class VolumeofPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter base Area : ");
        double baseArea = sc.nextDouble();

        System.out.print(" Enter height : ");
        double height = sc.nextDouble();

        double volume = ( 1.0 / 3 ) * baseArea * height ;

        System.out.print( " The Volume of Pyramid : " + volume);

        sc.close();
    }
}
