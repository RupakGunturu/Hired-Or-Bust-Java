package assignment3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaofIsoscelesTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter equal sides :");
        double side = sc.nextDouble();

        System.out.print("Enter base value :");
        double base = sc.nextDouble();

        double height = sqrt(side*side -(base*base / 4));

        double area = (base * height) / 2;

        System.out.print("The area of Isosceles Triangle : " + area);

        sc.close();
    }
}
