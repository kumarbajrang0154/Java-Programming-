import java.util.Scanner;

public class Calculator {

    public  static  void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Operators: ");
        char oper = input.next().charAt(0);
        switch (oper) {
            case '+' :
                System.out.println("Total sum: "+ (num1+num2));
                break;
            case '*' :
                System.out.println("Total mul: "+ (num1*num2));
                break;
            case '-' :
                System.out.println("Total sub: "+ (num1-num2));
                break;
            case '/' :
                System.out.println("Total div: "+ (num1/num2));
                break;
            default:
                throw new AssertionError();
        }
    }
}