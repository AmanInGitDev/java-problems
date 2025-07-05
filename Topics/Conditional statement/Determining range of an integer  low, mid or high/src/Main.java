import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 5){
            System.out.println("LOW");
        }
        else if (n > 5){
            System.out.println("HIGH");
        }
        else {
            System.out.println("MID");
        }
        // YOUR CODE HERE: If 'n' is less than 5, output 'LOW'. If 'n' is exactly 5, output 'MID'. If 'n' is greater than 5, output 'HIGH'.

    }
}