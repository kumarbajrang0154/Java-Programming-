import java.util.*;
public class Sum_N_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int range = input.nextInt();
        int sum = 0;

        for(int i = 1; i <= range; i++){
            sum = sum + i;
        }
        System.out.println("Total Sum from 0 to " +range  + " : " +sum);
    }
}
