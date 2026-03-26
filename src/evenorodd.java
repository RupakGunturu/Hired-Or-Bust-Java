import java.sql.SQLOutput;
import java.util.Scanner;

public class evenorodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if  (num % 2 ==0){
        System.out.println("Even Number");
    }
    else{
        System.out.println("Odd Number");
    }
    }

}
