import java.util.Scanner;
public class Largest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter a number: ");
        float num2 = input.nextFloat();
        if(num1 > num2){
            System.out.println(num1+ "is greater than " +num2);
        }else if(num1 < num2){
            System.out.println(num2+ "is greater than " +num1);
        }else{
            System.out.println(num1+ " is equal to " +num2);
        }
    }
}