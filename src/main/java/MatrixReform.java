/*Задание 3#
Дан массив:
["1, 2, 0", "4, 5"]
Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
"0, 1, 2, 4, 5"
*/

import java.util.*;

public class MatrixReform {

    private static final String[] INPUT_ARRAY = {"1, 2, 0", "4, 5"};

    public static void main(String[] args) {

        ArrayList<String> output = new ArrayList<>(Arrays.asList(INPUT_ARRAY));
        StringBuilder result = output.stream()
                .map(str -> str.split(", "))
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .mapToInt(Integer::parseInt)
                .sorted()
                .collect(StringBuilder::new, (str, e) -> str.append(e).append(", "), StringBuilder::append);

        result.deleteCharAt(result.length() - 1);
        result.deleteCharAt(result.length() - 1);

        System.out.println(result);
    }
}
