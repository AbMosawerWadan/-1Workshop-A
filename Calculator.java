import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         char operator;

        System.out.print("Enter First Number:");
        int Fn = sc.nextInt();
        System.out.print("Enter the Secound Number:");
        int Sn = sc.nextInt();

        System.out.print("Please Enter Your Operator(* , / , + , -)");
        operator = sc.next().charAt(0);

        int  sum = Fn + Sn ;
        int  product = Fn * Sn;
        Double Division = (double)(Fn / Sn);
        int substraction = Fn - Sn;
        

    }
}
 