package Basic Coding.Java Programming;
import java.util.Scanner;
public class Palindrom {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = input.nextLine();
        
        int reversed = new StringBuilder(input).reverse.toString();

        if(input.equals(reversed)){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not palindrome.");
        }
    }
}
