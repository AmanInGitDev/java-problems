import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static <T> T getElementByIndex(List<T> lst, int index) {
        int realIndex = (index >= 0) ? index : lst.size() + index;
        
        if (realIndex < 0 || realIndex >= lst.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + lst.size());
        }
        
        return lst.get(realIndex);
    }
    
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<String> values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        final int index = Integer.parseInt(scanner.nextLine());

        try {
            String element = getElementByIndex(values, index);
            System.out.println(element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }
}