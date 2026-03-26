import java.util.Scanner;

public class Armstrong{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( " Enter a Start Range : ");
        int start = sc.nextInt();

        System.out.println( " Enter a End Range : ");
        int end = sc.nextInt();

        for (int num = start; num <= end ; num++) {

            int temp = num ;
            int Sum = 0 ;

            while( temp > 0){

                int digit = temp % 10 ;
                Sum = Sum + ( digit * digit * digit);
                temp = temp /10 ;

            }
            if (Sum == num) {

                System.out.println(num);
            }
        }
        sc.close();
    }
}