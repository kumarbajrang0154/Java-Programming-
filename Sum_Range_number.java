import java.util.*;

public class Sum_Range_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = input.nextInt();
        System.out.print("Enter ending number: ");
        int end = input.nextInt();
        int sum = 0;

        for(int i = start; i <= end; i++){
            sum = sum + i;
        }
        System.out.println("Total sum from "+start+ " to "+end+": "+sum);
    }
}
