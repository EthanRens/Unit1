package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a noun.");
        String noun1 = input.nextLine();

        System.out.println("Please enter a name.");
        String name1 = input.nextLine();  
        
        System.out.println("Please enter a verb.");
        String verb1 = input.nextLine();    
        
        System.out.println("Please enter an adjective.");
        String adj1 = input.nextLine();            
  
        System.out.println("Please enter a place.");
        String place1 = input.nextLine();      
        
        System.out.println("Please enter a food.");
        String food1 = input.nextLine();   
        
        System.out.println("Please enter an animal.");
        String anim1 = input.nextLine();  
        
        System.out.println("Please enter a number.");
        String num1 = input.nextLine();  
        
        System.out.println("This christmas I really want to get a " + noun1 + ", but my parent, " + name1+ ", would never let me get it.");
        System.out.println("If I were to get it, I would " + verb1 + " straight to my " + adj1 + " friend's house and show them.");
        System.out.println("After that we would go to " + place1 + " to eat " + food1 + ".");
        System.out.println("I heard that they might have a " + anim1 + " there that's almost " + num1 + " years old!");
    }}


        
    

