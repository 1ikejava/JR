package com.javarush.test.level04.lesson16.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strName = reader.readLine();
        String strA = reader.readLine();
        String strB = reader.readLine();
        String strC = reader.readLine();
        int c = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        int a = Integer.parseInt(strC);

        System.out.println("Меня зовут " + strName);
        System.out.println("Я родился " + a + "." + b + "." + c);
    }
}
