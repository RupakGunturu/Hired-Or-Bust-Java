package assignment3;

import java.util.Scanner;

public class AreaofParallelogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base value :");
        double base = sc.nextDouble();

        System.out.println("Enter Height Value :");
        double height = sc.nextDouble();

        double area = (base * height) ;

        System.out.println("The Area of Parallelogram : " +area);

        sc.close();
    }
}
