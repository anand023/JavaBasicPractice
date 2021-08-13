package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>(Arrays.asList(new Integer[]{233,3223,3422}));


        System.out.println(lists);
        // if we want to filter even number from the lists
        ArrayList<Integer> evenInt =
                (ArrayList<Integer>) lists.stream()
                        .filter(StreamFilter::test)
                        .collect(Collectors.toList());
        System.out.println(evenInt);
    }

    private static boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}
