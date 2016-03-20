package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String strD = reader.readLine();
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        int c = Integer.parseInt(strC);
        int d = Integer.parseInt(strD);

        if (a > b && a > c && a > d) System.out.println(a);
        else if  (b > a && b > c && b > d) System.out.println(b);
        else if  (c > a && c > b && c > d) System.out.println(c);
        else System.out.println(d);
    }
}
