package assignment3;

import java.util.Scanner;

public class PerimeterofCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius :");
        double radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.print("The Perimeter of Circle is : " + perimeter);

        sc.close();

    }
}
