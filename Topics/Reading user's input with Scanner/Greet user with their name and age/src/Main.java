import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Hello, I am "+name+"! I am "+age+" years old.");
        // Write your code for receiving user's name and age here.

        // Print the message using the user's name and age.

        sc.close();
    }
}