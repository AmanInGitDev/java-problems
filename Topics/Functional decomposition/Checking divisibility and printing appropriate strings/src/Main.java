import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            isDivByThreeAndFive();
        } else if (num % 3 == 0) {
            isDivByThree();
        } else if (num % 5 == 0) {
            isDivByFive();
        } else {
            System.out.println("None");
        }
    }

    public static void isDivByThree() {
        System.out.println("Fizz");
    }

    public static void isDivByFive() {
        System.out.println("Buzz");
    }

    public static void isDivByThreeAndFive() {
        System.out.println("FizzBuzz");
    }
}