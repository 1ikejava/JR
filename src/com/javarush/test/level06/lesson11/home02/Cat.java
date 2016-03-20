package com.javarush.test.level06.lesson11.home02;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats
добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

import java.util.ArrayList;

public class Cat {

    public Cat() {
    }
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>(10);

    public static void main(String[] args) {
        //Создай тут 10 котов
        for (int i = 0; i < 10; i++)
        {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        //Добавь свой код для пункта 3 тут
        String catname = "";
        for (int i = 0; i < cats.size(); i++) {
            catname = catname + cats.get(i) + " ";
        }
        System.out.println("Все коты: " + catname);
    }
}
