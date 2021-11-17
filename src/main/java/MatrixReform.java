/*Задание 3#
Дан массив:
["1, 2, 0", "4, 5"]
Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
"0, 1, 2, 4, 5"
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MatrixReform {

    private static final String[] INPUT_ARRAY = {"1, 2, 0", "4, 5"};

    public static void main(String[] args) {

        List<String> output = new ArrayList<>();

        for (String str : INPUT_ARRAY) {
            String[] buffer = str.split(", ");
            output.addAll(Arrays.asList(buffer));
        }

        List<Integer> numbers = new ArrayList<>();

        for (String str : output) {
            numbers.add(Integer.parseInt(str));
        }

        numbers.sort(Comparator.naturalOrder());

        StringBuilder result = new StringBuilder();

        for (Integer elements : numbers) {
            result.append(elements)
                    .append(", ");
        }

        result.deleteCharAt(result.length() - 1);
        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }

}
