import java.util.*;
public class Floyd_Triangle {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = input.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = input.nextInt();
        int show = 1;

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(show+ " ");
                show++;
            }
            System.out.println();
        }

    }
}
