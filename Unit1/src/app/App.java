package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "red";
        boolean winter = false;

        while (count < 10) {
            System.out.println("The count is " + count);
            count = count + 1;
        }

        while (color == "red") {
            System.out.println("The color is " + color);
            color = "green";
        }

        while (winter = false) {
            System.out.println("Is it winter? " + winter);
            winter = true;
        }
        System.out.println("count finished");
        System.out.println("It's Winter");
    }
}