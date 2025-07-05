import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int n = inputScanner.nextInt();

        n = ++n;
        n = --n;
        n = --n;
        n = ++n;
        n = ++n;
        n = ++n;

        
        System.out.println(n);
    }
}