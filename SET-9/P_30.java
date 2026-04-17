import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : str.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
