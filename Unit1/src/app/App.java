package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Person person1 = new Person();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Scanner input = new Scanner(System.in);

        person1.name = "Dan";
        person1.age = 25;
        person1.eyeColor = "green";
        person1.height = "6 feet";
        person1.amtOfArms = 2;
        person1.birthday = "Febuary 2nd";

        dog1.name = "Joe";
        dog1.age = 4;
        dog1.breed = "Dalmation";

        dog2.name = "Mike";
        dog2.age = 12;
        dog2.breed = "Lab";

        dog3.name = "John";
        dog3.age = 3;
        dog3.breed = "Pug";

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.amtOfArms);
        System.out.println(person1.birthday);
        System.out.println(person1.height);
        System.out.println(person1.eyeColor);

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




        
    

