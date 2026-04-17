import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(70);
        marks.add(90);
        marks.add(60);
        marks.add(85);

        System.out.println("Marks: " + marks);
        System.out.println("Max: " + Collections.max(marks));
        System.out.println("Min: " + Collections.min(marks));
    }
}
