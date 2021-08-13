package streamApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamForStringArrayToMap {
    public static void main(String[] args) {
        String[] json={"language:java","os:linux","editor:notepad"};;

        Map<String,String>  map = Arrays.stream(json)
                .map(s -> s.split(":"))
                .collect(Collectors.toMap(s -> s[0], s -> s[1]));

        System.out.println(map);
    }
}
