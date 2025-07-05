import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();

        if (A <= H && B >= H) {
            System.out.println("Normal");
        }
        else if (A < H) {
            System.out.println("Excess");
        }
        else if (B > H) {
            System.out.println("Deficiency");
        }
    }
}