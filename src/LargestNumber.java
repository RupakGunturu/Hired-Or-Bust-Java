import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Your Second Number : ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is Largest Number");
        } else if ( num2 > num1) {
            System.out.println( num2 + " is Largest Number");
        } else{
            System.out.println( "Both Numbers Are Equal");
        }

        sc.close();
    }
}
