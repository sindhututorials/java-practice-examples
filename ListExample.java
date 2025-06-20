
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.remove("Java");

        for (String lang : list) {
            System.out.println("Language: " + lang);
        }
    }
}
