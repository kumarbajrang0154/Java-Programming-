import java.util.Scanner;

public class GreetingMessage{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = input.nextLine();

        System.out.println("Welcome " +name);
    }
}
