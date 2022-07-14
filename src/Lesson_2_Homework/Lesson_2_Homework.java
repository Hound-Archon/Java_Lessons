package Lesson_2_Homework;

import java.util.Locale;

/**
 * Домашка №1
 */
public class Lesson_2_Homework {
    public static void main(String[] args) {
    //Базовый уровень
    //Задача №1
    //Дано (переменные ниже менять нельзя)
    String hi = "                Hello ";
    String world = " WoRld!";
    char newLine = '\n';
    //Создать из трех переменных единую строку,
    //Привести к правильному виду (Ниже) используя String.trim()
    //затроить (Можно вызвать тольку одну команду System.out.println())
    //
    //Результат вывода на экран:
    //Hello world!
    //Hello world!
    //Hello world!

        hi = hi.trim();
        world = world.toLowerCase();
        String result = hi + world + newLine;
        System.out.println(result.repeat(3));


//Задача №2
//Создать переменные с ростом (!в метрах), весом в кило.
//Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
//Пример результата вывода на экран:
//21.0345645

    double Height = 1.8;
    double Weight = 90.0;

    //Решение индусское
    double CalculationOne = Math.pow(Height,2);
    System.out.println(Weight/CalculationOne);

    //Более красивое решение
    System.out.println(Weight/Math.pow(Height,2));


//Задача №3
// Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
//и снова создать строку, вывести на экран
//Ожидаемый результат:
//abcde
//abche

    char[] LetterArray = new char [] {'a', 'b', 'c', 'd', 'e'};
     System.out.println(LetterArray);
     LetterArray[3]='h';
     System.out.println(LetterArray);

    }
}