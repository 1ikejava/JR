package com.javarush.test.level04.lesson13.task03;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        for (int i = 0; 11 > i; i++)
        {
            for (int z = 0; i > z; z++)
            {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}