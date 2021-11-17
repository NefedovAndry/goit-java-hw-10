/*Задание 1#
Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка,
стоящими под нечетным индексом (1, 3 и т.д.).
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class GettingOddNames {

    private static final List<String> LIST_OF_NAMES = Arrays.asList(
            "Serge", "Andry", "Ivan", "Alex", "Elena", "Egor", "Nelly");

    public static void main(String[] args) {

        Function<List<String>, String> getOddNames = list -> {
            StringBuilder result = new StringBuilder();
            for (int i = 1; i < list.size(); i += 2) {
                result.append(i)
                        .append(". ")
                        .append(list.get(i))
                        .append(", ");
            }
            result.delete(result.length() - 2, result.length());
            return result.toString();
        };

        System.out.println(getOddNames.apply(LIST_OF_NAMES));
    }
}
