package app;

public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " is divisible by 4");
            } else {
                System.out.println(i + " is not divisible by 4");
            }
        }
        System.out.println("All finished");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is and even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }
        System.out.println("All finished");
    }
}
