package assignment3;


import java.util.Scanner;

public class AreaofRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Value of Length : ");
        double length = sc.nextDouble();

        System.out.println(" Enter The Value of Width : ");
        double width = sc.nextDouble();

        double area = length * width ;

        System.out.println( " The Area of Rectangle is : " +area );
    }
}
