package assignment3;

import java.util.Scanner;

public class AreaofTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of base: ");
        double base = sc.nextDouble();

        System.out.println( " Enter The Value of Height : ");
        double height = sc.nextDouble();

        double area = (base * height) / 2;

        System.out.println( " The Area of Triangle is : " +area);

    }

}
