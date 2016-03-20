package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isEnd = false;
        int intSum = 0;

        while (!isEnd)
        {
            String sNum = reader.readLine();
            if (sNum.equals("сумма")) { isEnd = true; break;}
            int num = Integer.parseInt(sNum);
            intSum += num;
        }
        System.out.println(intSum);
    }
}
