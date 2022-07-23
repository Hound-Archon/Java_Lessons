package Lesson_3_Homework;

import java.util.*;
public class Advanced_Task_2 {
    public static void main(String[] args) {

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] numbersArray = {1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < numbersArray.length; i++) {
            if (i % 2 == 0) {
                numbersArray[i] = 0;
            }
        }
        System.out.println("\nИтоговый массив: " + Arrays.toString(numbersArray));
    }
}
