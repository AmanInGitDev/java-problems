import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        String c = a.replaceAll(" ", "");
        String d = b.replaceAll(" ", "");

        System.out.println(c.equals(d));
    }
}