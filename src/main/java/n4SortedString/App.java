package n4SortedString;

import java.util.List;

public class App {
    public static void main(String[] args) {
        SortedString sortedString = new SortedString();

        List<String> input = List.of("Java", "Sorted", "Value", "Programming", "Of", "Words", "U");
        List<String> result = sortedString.ascSort(input);

        System.out.println("--- Unsorted words ---");
        System.out.println(input);

        System.out.println("--- Sorted words ---");
        System.out.println(result);
    }
}
