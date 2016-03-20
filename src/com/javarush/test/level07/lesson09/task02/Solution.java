package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lines = new ArrayList<String>();

        for (int i = 0; i < 5 ; i++)
        {
            lines.add(i, reader.readLine());
        }

        lines.remove(2);
        System.out.println();

        for (int i = 0; i < lines.size(); i++)
        {
            System.out.println(lines.get(lines.size() - i - 1));
        }

    }
}
