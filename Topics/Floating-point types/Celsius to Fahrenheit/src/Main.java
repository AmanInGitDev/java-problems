import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C = scanner.nextDouble();
        System.out.printf("%.2f",C * 1.8 + 32);
    }
}