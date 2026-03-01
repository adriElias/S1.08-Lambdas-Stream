package org.lambdasStreams;

import java.util.List;
import java.util.stream.Collectors;

public class StringList {
    public List<String> containO(List<String> list) {
        return list.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }

    public List<String> containOAnd6letters(List<String> list) {
        return list.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }
}
