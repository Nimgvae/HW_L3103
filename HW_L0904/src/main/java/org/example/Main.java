package org.example;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

/*
 1 уровень сложности: Task1:
Допустим, у нас есть коллекция состоящая из строк. Arrays.asList(«Highload», «"High"», «Load», «Highload»). Посчитайте, сколько раз объект «High» встречается в коллекции. Используйте Stream API.

Task2:
Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. Используем функциональный интерфейс Predicate.


Task3:
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.


Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
*/
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("TASK1");
        List<String> arr = Arrays.asList("Highload", "High", "Load", "High", "High", "Highload", "Highlander");
        Stream stream = arr.stream();
        System.out.println("Task 1. Количество слов 'High' в коллекции: "+ stream.filter(x->x.equals("High")).count());

        //Task2
        System.out.println();
        System.out.println("TASK2");
        Predicate<String> isFirstLetterJandLastA = x -> (x.charAt(0)=='J' || x.charAt(0)=='N') && (x.charAt(x.length()-1)=='A');
        String str = "Jane Air B";
        String str2 = "Jane Air A";
        System.out.println("2. Строка -> " + str + " <- содержит первую J или N и последнюю A? " + isFirstLetterJandLastA.test(str));
        System.out.println("2.1 Строка -> " + str2 + " <- содержит первую J или N и последнюю A? " + isFirstLetterJandLastA.test(str2));

        //Task3(Решение подсмотрел так как оно простое до отвратительности, хотя и узконаправленное(только под одно отсутствующее))
        System.out.println();
        System.out.println("TASK3");
        int[] array = {0, 1, 3, 4,5,6,7,8};
        System.out.println("3. Недостающий элемент массива " + Arrays.toString(array) + " : " +
                (array.length * (array.length + 1)/2 - Arrays.stream(array).sum()));
    }
}