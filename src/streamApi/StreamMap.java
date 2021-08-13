package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(new String[]{"233","3223","3422"}));


        System.out.println(strings);
        // if we want to convert list of string into list of Integer we can use map()
        ArrayList<Integer> integers =
                (ArrayList<Integer>) strings.stream()
                        .map(s -> Integer.parseInt(s))
                        .collect(Collectors.toList());
        System.out.println(integers);
    }
}
