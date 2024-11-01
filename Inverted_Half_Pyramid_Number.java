import java.util.*;
public class Inverted_Half_Pyramid_Number {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. rows: ");
        int row = input.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = input.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 1; j <= columns - i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
