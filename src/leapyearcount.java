import java.util.Scanner;

public class leapyearcount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Year :");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " is leap Year" );
        }
        else
        {
            System.out.println(year + " is Not a Leap Year");
        }

        sc.close();
    }
}

