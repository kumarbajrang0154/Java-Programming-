import java.util.Scanner;
public class CurencyConvert {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Indian currency: ");
        float money = input.nextFloat();

        System.out.println("USD Dollar: "+ (money * 0.012));
    }
}
