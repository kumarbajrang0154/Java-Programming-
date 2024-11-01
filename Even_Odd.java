import  java.util.*;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number.");
        }else{
            System.out.println("Odd Number.");
        }
    }
}
