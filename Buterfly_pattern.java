import java.util.*;

public class Buterfly_pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = input.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(columns-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = row-1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(columns-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
