package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        int otricCount = 0;
        int polozhCount = 0;

        if (a > 0) polozhCount++;
        if (b > 0) polozhCount++;
        if (c > 0) polozhCount++;
        if (a < 0) otricCount++;
        if (b < 0) otricCount++;
        if (c < 0) otricCount++;
        System.out.println("количество отрицательных чисел: " + otricCount);
        System.out.println("количество положительных чисел: " + polozhCount);
    }
}
