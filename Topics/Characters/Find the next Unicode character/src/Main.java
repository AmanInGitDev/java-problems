import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char inputChar = input.next().charAt(0);

        char nextChar = (char) (inputChar + 1);

        System.out.println(nextChar);
    }
}