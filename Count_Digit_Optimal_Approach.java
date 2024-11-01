import java.util.*;
public class Count_Digit_Optimal_Approach {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter digits: ");
        int num = input.nextInt();

        int count = (int)(Math.log10(num) + 1);

        System.out.println("Number of digits in "+num+" is "+count);
    }
}
