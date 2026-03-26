import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Amount on Rupees : ");
        double Rupee = sc.nextDouble();

        double Usd = Rupee / 93 ;

        System.out.println( " The USD is : " +Usd);

        sc.close();
    }
}
