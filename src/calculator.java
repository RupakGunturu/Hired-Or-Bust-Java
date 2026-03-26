import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.println( " Enter Second Number");
        int num2 = sc.nextInt();

        System.out.println( " Enter a Operator (+ - * /) : ");
        char op = sc.next().charAt(0);

        if(op == '+'){
            System.out.println("The Sum is " +(num1+num2));
        } else if ( op == '-') {
            System.out.println("The Sub is " +(num1-num2));
        } else if ( op == '*') {
            System.out.println("The Mult is " +(num1*num2));
        } else if (op == '/') {
            if (num2 != 0) {
                System.out.println(" The Div is " + (num1 / num2));
            } else {
                System.out.println(" Cannot be Divided ");
            }
        }
            else {
                System.out.println("Invalid Operator");
            }

        sc.close();

    }

    }

