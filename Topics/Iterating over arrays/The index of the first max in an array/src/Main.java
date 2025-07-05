import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
