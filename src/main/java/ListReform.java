/*Задание 2#
Метод принимает на вход список из строк (можно список из Задания 1).
Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListReform {

    private static final List<String> LIST_OF_NAMES = Arrays.asList(
            "Serge", "Andrey", "Ivan", "Alex", "Elena", "Egor", "Nelly");

    public static void main(String[] args) {

        UnaryOperator<List<String>> listReforms = list -> {
            List<String> result = new ArrayList<>();
            for (String str : list) {
                result.add(str.toUpperCase());
            }
            result.sort(Comparator.reverseOrder());
            return result;
        };

        System.out.println(listReforms.apply(LIST_OF_NAMES));
    }
}
