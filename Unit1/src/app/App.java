package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Type a number");
        int num1 = input.nextInt();

        System.out.println("Type a second number");
        int num2 = input.nextInt();

        System.out.println("Type 1 for Addition, 2 for multiplication, 3 for subtraction, and 4 for division.");
        int function = input.nextInt();

                if (function == 1){
            System.out.println(num1 + num2);
        }
        if (function == 2){
            System.out.println(num1 * num2);
    }
if (function == 3){
            System.out.println(num1 - num2);
        }
        if (function == 4){
            System.out.println(num1 / num2);

        }}}




        
    

