import java.util.*;
public class Palindrome_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int num = input.nextInt();
        int temp = num;
        int reverse = 0;
        while(temp != 0){
            int last_digit = temp % 10;
            reverse = (reverse*10)+last_digit;
            temp = temp / 10;
        }
        if(num == reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
