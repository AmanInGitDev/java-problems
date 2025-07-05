import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0;

        while (true) {
            int temperature = scanner.nextInt();

            if (temperature >= 100) {
                break;
            }

            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }
        }

        System.out.println(maxTemperature);
        scanner.close();
    }
}
