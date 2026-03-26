import java.util.Scanner;

public class HCF_LCM {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number :");
        int a = sc.nextInt();

        System.out.println("Enter Second number :");
        int b = sc.nextInt();

        int hcf = 1;

        for(int i =1; i <=a && i <=b ; i++){
            if(a % i == 0 && b % i ==0){
                hcf = i;
            }
        }

        int lcm = ( a * b ) /hcf ;

        System.out.println("HCF = " +hcf);
        System.out.println("LCM = " +lcm);
    }
}
