package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++)
        {
            System.out.print("8");
        }

        System.out.println();

        for (int z = 0; z < 10; z++)
        {
            System.out.println("8");
        }

    }
}
