import java.util.*;
public class Reverse_Triangle {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = input.nextInt();

        for(int i = 1; i <= row; i++){
            // for(int j = 1; j < 1 ; j++){
            //     System.out.print(" ");
            // }
            for(int j = 1; j <= row-i; j++){
                System.out.print("*");
            }
            // for(int j = 1; j < row; j++){
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }
}
