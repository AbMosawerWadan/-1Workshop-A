import java.util.Scanner;
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("You cannot divide by zero!");
        }
        return (double) a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations mathOps = new MathOperations();

        System.out.print("Enter First Number: ");
        int fn = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int sn = sc.nextInt();

        System.out.print("Please Enter Your Operator (* , / , + , -) ---> ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("The sum is = " + mathOps.add(fn, sn));
                break;
                
            case '-':
                System.out.println("The subtraction = " + mathOps.subtract(fn, sn));
                break;
                
            case '*':
                System.out.println("The product is = " + mathOps.multiply(fn, sn));
                break;
                
            case '/':
                if (sn == 0) {
                    System.out.println("You can't divide (0 / 0)!");
                } else {
                    System.out.println("The division is = " + mathOps.divide(fn, sn));
                }
                break;
                
            default:
                System.out.println("Error!!! Invalid Operator.");
        }

        sc.close();
    }
}
