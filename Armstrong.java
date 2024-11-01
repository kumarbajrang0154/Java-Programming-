import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num;
        int length = String.valueOf(num).length();
        int count = 0;
        
        for(int i = 1; i <= length; i++){
            int div = num % 10;
            count = count + (div*div*div);
            num = num / 10;
        }
        if(count == temp){
            System.out.println("Armstrong Number.");
        }else{
            System.out.println("Not Armstrong Number.");
        }
    }
}