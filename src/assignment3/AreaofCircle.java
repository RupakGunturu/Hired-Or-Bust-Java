package assignment3;

import java.util.Scanner;

public class AreaofCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Value for Radius :");
        double radius = sc.nextDouble();

        double area = 3.14159 * radius * radius;

        System.out.println("The Area of Circle is : " + area);
    }
}