import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Greater");
        } else if (a < b) {
            System.out.println("Less");
        }else {
            System.out.println("Equal");
        }
    }
}