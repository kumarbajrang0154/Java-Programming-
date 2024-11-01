import java.util.*;
public class Palindromic_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = input.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = row-i; j >= 1 ; j--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        input.close();
    }
}
