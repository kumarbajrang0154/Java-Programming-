import java.util.*;

public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = input.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = columns; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
