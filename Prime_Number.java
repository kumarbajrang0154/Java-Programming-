import java.util.*;
public class Prime_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("Prime number.");
        }else{
            System.out.print("Not prime number.");
        }
    }
}
