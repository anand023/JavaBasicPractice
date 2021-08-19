package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamForString {
    public static void main(String[] args) {
        String str="hello welcome to the world";
        // find the count of w
        List<String> str1=Stream.of(str.split(","))
                .map (elem -> new String(elem))
                .collect(Collectors.toList());

        List<Character> str2=str.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toList());

        List<String> str3 = str.codePoints()
                .mapToObj(s -> String.valueOf((char)s))
                .collect(Collectors.toList());

        List<Character> str4 = str.codePoints()
                .mapToObj(s -> (char)s)
                .collect(Collectors.toList());

        List<String> str5 = str.chars()
                .mapToObj(item -> String.valueOf((char) item))
                .collect(Collectors.toList());

    }
}
