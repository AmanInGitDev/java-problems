import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (String names : nameList){
            System.out.println(names);        
        }
    }
}
