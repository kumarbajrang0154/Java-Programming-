import  java.util.*;
public class Positive_Negative{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if(num == 0){
            System.out.println("Please enter greater than 0.");
        }else if(num > 0){
            System.out.println("Positive Number.");
        }else{
            System.out.println("Negative Number.");
        }
    }
}