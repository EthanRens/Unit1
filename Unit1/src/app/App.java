package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("How much money are you starting with?");
        int money = input.nextInt();

        System.out.println("Please enter a password.");
        String pass = input.nextLine();

        System.out.println("Account created, please log in.");

        System.out.println("Enter your name");
        String nameInput = input.nextLine();
        if(nameInput.equals(name)){
            System.out.println("Enter your password.");
            String passInput = input.nextLine();
            if(passInput.equals(pass)){
                System.out.println("Access granted, welcome " + name);
                String access = "true";
            } else {
                System.out.println("Access denied");
            }
        } else {
            System.out.println("Access denied");
        }

        if(access.equals("true")){
            System.out.println("What would you like to do? Press 1 to check balance, press 2 to withdraw money, press 3 to change password.");
            String answer = input.nextLine();
            if(answer.equals("1")){
                System.out.println("Your balance is currently, " + money);
            } if(answer.equals("2")){
                System.out.println("How much money would you like to withdraw?");
                int amt = input.nextInt();
                System.out.println("You withdrew " + amt + " dollars, your current ballance is now " + (money - amt) + ".");
            } if(answer.equals("3")){
                System.out.println("Please enter your new password.");
                String pass2 = input.nextLine();
                System.out.println("Your new password is " + pass2);
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println();
        }

        }}




        
    

