package assignment3;

import java.util.Scanner;

public class PerimeterofSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side :");
        double side = sc.nextDouble();

        double perimeter = (4 * side );

        System.out.print(" The Perimeter of Side :" + perimeter);

        sc.close();
    }
}
