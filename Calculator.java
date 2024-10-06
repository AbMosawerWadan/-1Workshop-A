import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         char operator;

        System.out.print("Enter First Number:");
        int Fn = sc.nextInt();
        System.out.print("Enter the Secound Number:");
        int Sn = sc.nextInt();

        System.out.print("Please Enter Your Operator(* , / , + , -)--->");
        operator = sc.next().charAt(0);

        int  sum = Fn + Sn ;
        int  product = Fn * Sn;
        double Division = 0;
        if(Sn != 0){
            Division = (double) (Fn / Sn);
        }
        int substraction = Fn - Sn;
        

        switch(operator){
            case ('+'):
            System.out.print("The sum is ="+sum);
            break;
            
            case ('-'):
            System.out.println("The substraction = "+substraction);
            break;

            case ('/'):
            if(Sn  == 0){
                System.out.println("You cant divide (0 / 0)!");
            }
            else
            {
            System.out.println("The Division is = "+Division);
            }
            break;

            case ('*'):
            System.out.println("The Product is = " +product);
            break;
            default:
            System.out.println("Error!!!");
        }    



    }
}
 