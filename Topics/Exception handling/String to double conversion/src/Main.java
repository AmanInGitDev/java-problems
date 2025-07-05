import java.util.Scanner;

class Converter {
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(convertStringToDouble(userInput));
        scanner.close();
    }
}