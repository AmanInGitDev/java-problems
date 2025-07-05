import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Read the number of elements
        int max = 0; // Initialize max to 0 (assuming only positive numbers)

        while (n > 0) { // Loop n times
            int digit = scanner.nextInt(); // Read the next number

            if (digit % 4 == 0 && digit > max) { // Check divisibility & update max
                max = digit;
            }

            n--; // Decrease count
        }

        System.out.println(max); // Print the max value divisible by 4
        scanner.close();
    }
}
