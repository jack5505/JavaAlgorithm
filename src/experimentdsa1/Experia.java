package experimentdsa1;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Experia {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        Predicate<Integer> evenNumber = i -> i % 2 == 0;

        Predicate<Integer> oddNumber = i -> i % 2 != 0;

        Map<Boolean, List<Integer>> collect = stream
                .collect(Collectors.partitioningBy(evenNumber));

        System.out.println(collect.get(true).size());

        System.out.println(collect.get(false).size());

    }
}
