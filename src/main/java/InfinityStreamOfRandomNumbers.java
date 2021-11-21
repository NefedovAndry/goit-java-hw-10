/*Задание 4#
Используя Stream.iterate сделайте бесконечный стрим рандомных чисел, но не используя Math.random.
Реализуйте свой "линейный конгруэнтный генератор". Для этого начните с x[0] = seed и затем каждый
следующий элемент
x[n + 1] = 1 (a x[n] + c) % m,
для корректных значений a, c, и m.
Необходимо имплементировать метод, который принимает на вход параметры a, c, m и seed и возвращает Stream.
Для теста используйте данные
a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).
*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfinityStreamOfRandomNumbers {

    private static final long A = 25214903917L;
    private static final long C = 11;
    private static final long M = (long) Math.pow(2, 48);

    public static void main(String[] args) {

        long seed = 1L;

        List<Long> result = infinityStreamOfRandomNumbers(seed, A, C, M)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);

    }

    public static Stream<Long> infinityStreamOfRandomNumbers(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> ((x * a + c) % m));
    }
}