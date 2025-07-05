import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(); double b = sc.nextDouble(); double c = sc.nextDouble(); double d = sc.nextDouble();
        System.out.println(a * 10.5 + b * 4.4 + (c + d) / 2.2);
    }
}