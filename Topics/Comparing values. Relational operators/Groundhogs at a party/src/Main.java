import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanut = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean nonWeekend = (peanut >= 10 && peanut <= 20) && !isWeekend;
        boolean inWeekend = (peanut >= 15 && peanut <= 25) && isWeekend;

        System.out.println(nonWeekend || inWeekend);
        scanner.close();
    }
}
