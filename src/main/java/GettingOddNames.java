/*Задание 1#
Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка,
стоящими под нечетным индексом (1, 3 и т.д.).
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class GettingOddNames {

    private static final List<String> LIST_OF_NAMES = Arrays.asList(
            "Serge", "Andry", "Ivan", "Alex", "Elena", "Egor", "Nelly");

    public static void main(String[] args) {

        StringBuilder resultString = IntStream.range(0, LIST_OF_NAMES.size() - 1)
                .filter(i -> i % 2 != 0)
                .mapToObj((i) -> i + ". " + LIST_OF_NAMES.get(i))
                .collect(StringBuilder::new,
                        (c, e) -> c.append(e).append(", "),
                        StringBuilder::append);
        resultString.deleteCharAt(resultString.length() - 1);
        resultString.deleteCharAt(resultString.length() - 1);

        System.out.println(resultString);
    }
}
