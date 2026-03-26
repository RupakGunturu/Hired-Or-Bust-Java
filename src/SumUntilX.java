import java.util.Scanner;

public class SumUntilX {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.println(" Enter Numer or X to Quit");
            String input = sc.next();

            if(input.equals("x")){
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;
        }

        System.out.println("Total Sum :" +sum);

        sc.close();
    }
}
