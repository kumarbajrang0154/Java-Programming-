import java.util.*;
public class Count_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter digits: ");
        int num = input.nextInt();
        int temp = num;
        int count = 0;

        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        System.out.println("Total count of "+num+ " is "+count);
    }
}