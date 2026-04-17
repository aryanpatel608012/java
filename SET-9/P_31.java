import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Song1");
        list.add("Song2");
        list.add("Song3");

        System.out.println("Playlist: " + list);

        list.removeFirst();
        System.out.println("After playing first: " + list);

        list.removeLast();
        System.out.println("After skipping last: " + list);
    }
}
