package assignment3;

import java.util.Scanner;

public class PerimeterofRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Length :");
        double length = sc.nextDouble();

        System.out.print(" Enter Width :");
        double width = sc.nextDouble();

        double perimeter =  2 * (length + width);

        System.out.print(" The perimeter of Rectangle :  " + perimeter);

        sc.close();
    }
}
