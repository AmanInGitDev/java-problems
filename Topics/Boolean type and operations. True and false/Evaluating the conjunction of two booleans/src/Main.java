import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean bool1 = in.nextBoolean();
        boolean bool2 = in.nextBoolean();

        System.out.println(bool1 && bool2);
        in.close();
    }
}