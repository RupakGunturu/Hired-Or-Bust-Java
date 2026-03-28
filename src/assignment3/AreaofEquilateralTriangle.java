package assignment3;

import java.util.Scanner;

public class AreaofEquilateralTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side value :");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.print("The Are of Equilateral Triangle is :" +area);

        sc.close();
    }
}
