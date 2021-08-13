package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<List<List<String>>> strings =
                new ArrayList<>(Arrays.asList(Arrays.asList(Arrays.asList(new String[]{"233","3223","3422"}))));


        int[][] i = {{1,3,4},{2,5,6}};
        //List<Integer> l1=Arrays.stream(i).flatMap(s -> Arrays.stream(s)).collect(Collectors.toList());
        int[] l1= (int[]) Arrays.stream(i).flatMapToInt(array -> Arrays.stream(array)).toArray();
        int sum = Arrays.stream(i).flatMapToInt(s -> Arrays.stream(s)).sum();

        System.out.println(l1);
        System.out.println(strings);
        // if we want to convert list of string into list of Integer we can use map()
        ArrayList<Integer> integers =
                (ArrayList<Integer>) strings.stream()
                        .flatMap(s -> s.stream())
                        .flatMap(s -> s.stream())
                        .map(s -> Integer.parseInt(s))
                        .filter(s -> !(s%2==0))
                        .collect(Collectors.toList());
        System.out.println(integers);

        //
        int[] array = {1, 2, 3, 4, 5, 6};

        //Stream<int[]>
        Stream<int[]> streamArray = Stream.of(array);

        //Stream<int[]> -> flatMap -> IntStream
        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));

        intStream.forEach(x -> System.out.println(x));
        int sum1= intStream.sum();
    }
}
