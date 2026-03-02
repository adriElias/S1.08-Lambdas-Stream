package n4SortedString;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedString {
    public List<String> ascSort(List<String> words) {
        return words.stream()
                    .sorted(Comparator.comparingInt(String::length))
                    .collect(Collectors.toList());
    }
}
