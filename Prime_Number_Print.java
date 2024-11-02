import java.util.*;
public class Prime_Number_Print {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int range = input.nextInt();

        for(int num = 1; num <= range; num++){
            int count = 0;
            for(int i = 1; i <= num; i++){
                if(num%i == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(num);
            }
        }
    }
}
