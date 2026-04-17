import java.util.*;

public class Main {

    static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1); nums.add(2); nums.add(3);

        System.out.println(searchElement(nums, 2));

        LinkedList<String> names = new LinkedList<>();
        names.add("Aarav"); names.add("Raj");

        System.out.println(searchElement(names, "Raj"));
    }
}
