package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Scanner input = new Scanner(System.in);

        dog1.name = "Joe";
        dog1.age = 4;
        dog1.breed = "Dalmation";

        dog2.name = "Mike";
        dog2.age = 12;
        dog2.breed = "Lab";

        dog3.name = "John";
        dog3.age = 3;
        dog3.breed = "Pug";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.breed);

        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.breed);

        System.out.println(dog3.name);
        System.out.println(dog3.age);
        System.out.println(dog3.breed);

        }}




        
    

