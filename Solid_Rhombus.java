import java.util.*;
public class Solid_Rhombus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = input.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = row-i; j >= 1 ; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
