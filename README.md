Home work 10

Задание 1#
Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка, стоящими 
под нечетным индексом (1, 3 и т.д.).

Задание 2#
Метод принимает на вход список из строк (можно список из Задания 1). Возвращает список этих строк в верхнем регистре 
и отсортированные по убыванию (от Z до А).

Задание 3#
Дан массив:

["1, 2, 0", "4, 5"]

Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть

"0, 1, 2, 4, 5"

Задание 4#
Используя Stream.iterate сделайте бесконечный стрим рандомных чисел, но не используя Math.random. Реализуйте свой 
"линейный конгруэнтный генератор". Для этого начните с x[0] = seed и затем каждый следующий элемент 
x[n + 1] = 1 (a x[n] + c) % m, для корректных значений a, c, и m. Необходимо имплементировать метод, который принимает 
на вход параметрыa, c, m и seed и возвращает Stream<Long>. Для теста используйте данные a = 25214903917, 
c = 11 и m = 2^48 (2 в степени 48).

Задание 5#
Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) который "перемешивает" элементы из 
стримов first и second, останавливается тогда, когда у одного из стримов закончатся элементы.
