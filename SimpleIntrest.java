package Basic Coding.Java Programming;
import java.util.Scanner;

public class SimpleIntrest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        int principal = input.nextInt();
        System.out.print("Enter a time: ");
        float time = input.nextFloat();
        System.out.print("Enter a rate: ");
        float rate = input.nextFloat();

        double result = (principal*time*rate)/100;
        System.out.println("Total Simple intrest: " +result);
    }
}