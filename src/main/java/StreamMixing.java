/*Задание 5#
Напишите метод public static Stream zip(Stream first, Stream second)
который "перемешивает" элементы из стримов first и second,
останавливается тогда, когда у одного из стримов закончатся элементы.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMixing {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);

        Stream<Integer> first = list1.stream();
        Stream<Integer> second = list2.stream();

        Stream<Integer> zippingStream = zip(first, second);

        List<Integer> result = zippingStream.collect(Collectors.toList());

        System.out.println(result);

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> streamBuilder = Stream.<T>builder();
        long firstSize = first.count();
        long secondSize = second.count();

        long smallestStreamSize = Math.min(firstSize, secondSize);
        for (int i = 0; i < smallestStreamSize ; i++) {
            streamBuilder
                    .add((T) first.skip(i).limit(1))
                    .add(second.skip(i).findFirst().get());
        }
        return streamBuilder.build();
    }
}
