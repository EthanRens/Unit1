package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Type a number");
        int num1 = input.nextInt();

        System.out.println("Type a second number");
        int num2 = input.nextInt();

        System.out.println("Enter a function");
        String function = input.nextLine();

        if (function.equals("+")){
            System.out.println(num1 + num2);
        }

        if (function.equals("*"))    {
            System.out.println(num1 * num2);
        }

        if (function.equals("-")){
            System.out.println(num1 - num2);
                }

        if (function.equals("/")){
         System.out.println(num1 / num2);
        }}}


        
    

