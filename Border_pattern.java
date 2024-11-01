import java.util.*;

public class Border_pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = input.nextInt();

        for(int i = 1; i <= row; i++){
            if(i == 1 || i == row){
                for(int j = 1; j <= columns; j++){
                    System.out.print("* ");
                }
            }else{
                for(int k = 1; k <= 1; k++){
                    System.out.print("*");  
                }
                for(int l = 1; l < columns*2-2; l++){
                    System.out.print(" ");
                }
                for(int m = 1; m <= 1; m++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}
