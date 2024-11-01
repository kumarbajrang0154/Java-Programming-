import java.util.*;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int num = input.nextInt();
        int temp = num;

        int Reverse_Number = 0;

        while(temp > 0){
            int last_digit = temp % 10;
            Reverse_Number = (Reverse_Number*10)+last_digit;
            temp = temp / 10;
        }
        System.out.println("Reverse of "+num+" is "+Reverse_Number);
    }
}
