import java.util.Scanner;
public class Fibonaci {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Nth term: ");
        int term = input.nextInt();
        int a = 0, b = 1;

        for(int i = 1; i <= term; i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
