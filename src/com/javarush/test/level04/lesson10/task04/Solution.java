package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int i = 10;
        while ( i != 0 ) {
            int z = 10;
            while (z != 0){
                System.out.print("S");
                z--;
            }
            System.out.println();
            i--;
        }
    }
}
