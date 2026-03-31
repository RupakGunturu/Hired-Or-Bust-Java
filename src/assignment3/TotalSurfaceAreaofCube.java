package assignment3;

import java.util.Scanner;

public class TotalSurfaceAreaofCube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Side : ");
        double side = sc.nextDouble();

        double TSA = 6 * side * side ;

        System.out.print(" The TSA is : " + TSA);

        sc.close();
    }
}
