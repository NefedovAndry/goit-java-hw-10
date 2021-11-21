/*Задание 2#
Метод принимает на вход список из строк (можно список из Задания 1).
Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListReform {

    private static final List<String> LIST_OF_NAMES = Arrays.asList(
            "Serge", "Andrey", "Ivan", "Alex", "Elena", "Egor", "Nelly");

    public static void main(String[] args) {

        List<String> result = LIST_OF_NAMES.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
