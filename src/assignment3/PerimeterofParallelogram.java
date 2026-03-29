package assignment3;

import java.util.Scanner;

public class PerimeterofParallelogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print( " Enter  base :");
        double base = sc.nextDouble();

        System.out.print(" Enter height : ");
        double height = sc.nextDouble();

        double perimeter = 2 * (base + height);

        System.out.print("The Perimeter of Parallelogram : " + perimeter);

        sc.close();
    }
}
