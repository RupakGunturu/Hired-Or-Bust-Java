package assignment3;

import java.util.Scanner;
public class perimeterofEquilateralTriangle {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter Side :");
        double side = sc.nextDouble();

        double perimeter = 3 * side;

        System.out.print("Perimeter of Equilateral Triangle is : " + perimeter);

        sc.close();
    }
}
