package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strA = reader.readLine();
        String strB = reader.readLine();
        String strC = reader.readLine();
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        int c = Integer.parseInt(strC);

        if (a == b) System.out.println("3");
        if (a == c) System.out.println("2");
        if (b == c) System.out.println("1");

    }
}
