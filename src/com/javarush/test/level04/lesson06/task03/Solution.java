package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        if (a > b && a > c)
        {
            System.out.println(a);
            if (b > c)
            {
                System.out.println(b);
                System.out.println(c);
            } else
            {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b > a && b > c)
        {
            System.out.println(b);
            if (a > c)
            {
                System.out.println(a);
                System.out.println(c);
            } else
            {
                System.out.println(c);
                System.out.println(a);
            }
        } else if (c > a && c > b)
        {
            System.out.println(c);
            if (a > b)
            {
                System.out.println(a);
                System.out.println(b);
            } else
            {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}