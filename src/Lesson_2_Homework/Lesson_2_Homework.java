package Lesson_2_Homework;

import java.util.*;

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
    double CalculationOne = Height*Height;
    System.out.println(Weight/CalculationOne);

    //Более красивое решение
    System.out.println(Weight/(Math.pow(Height,2)));


//Задача №3
// Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
//и снова создать строку, вывести на экран
//Ожидаемый результат:
//abcde
//abche

    char[] LetterArray = {'a', 'b', 'c', 'd', 'e'};
     System.out.println("\nИсходный массив: " + Arrays.toString(LetterArray));
     LetterArray[3]='h';
        System.out.println("\nМассив с заменой: " + Arrays.toString(LetterArray));

//Продвинутый уровень
//Задача №1
//Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"

    String EntryData = "234";
    String some_text = "some_text";
    int ParsedData = Integer.parseInt(EntryData);
    int TotalCharactersInString = some_text.length();
    System.out.println(ParsedData+TotalCharactersInString);

//Задача №2
//Посчитать (a+b)^2 = ?, при a=3, b=5

    double VariableA = 3;
    double VariableB = 5;
    System.out.println(Math.pow((VariableA+VariableB),2));

        //Задача №3
//Создать два массив чисел:
// 1,2,5,7,10
// 2,3,2,17,15
// Создать массив чисел, в котором будут: все числа из этих двух массивов,
// и результат умножения чисел с одинаковым порядковым номером
//
//Ожидаемый результат:
//1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
//(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
//(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        int[] NumbersArrayOne = {1, 2, 5, 7, 10}; // инициализация первого массива
        int[] NumbersArrayTwo = {2, 3, 2, 17, 15}; // инициализация второго массива
        int[] finalresult = new int[15]; // инициализация третьего массива, в который будут укладываться значения из первых двух и результаты их перемножения

        for (int i = 0; i < NumbersArrayOne.length; i++) { // инициализация цикла. i = 0 определяет точку старта, i < NumbersArrayOne.length; определяет количество циклов, которое должно равняться количеству символов в массиве, i++ определяет сдвиг на 1 позицию после исполнения тела цикла. У циклов for всегда 3 параметра.
            int num1 = NumbersArrayOne[i]; // инициализация первой переменной в цикле
            int num2 = NumbersArrayTwo[i]; // инициализация второй переменной в цикле
            finalresult[i] = num1; // вывод чисел из первого массива c 1 по 5 позицию
            finalresult[i+5] = num2; // вывод чисел из второго массива с 6 по 10 позицию
            finalresult[i+10] = num1 * num2; // паеремножение чисел из массивов и вывод их с 11 по 15 позицию
        }

        System.out.println("\nПервый массив: " + Arrays.toString(NumbersArrayOne)); // в стринги выводим, потому что там можно закомментировать, чтобы было красиво
        System.out.println("\nВторой массив: " + Arrays.toString(NumbersArrayTwo));
        System.out.println("\nИтоговый массив с числами и перемножением: " + Arrays.toString(finalresult));

//Задача №4
//В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран

        String HelloWorld = "Hello World!".replaceAll("l", "r").toUpperCase();
        System.out.println("\nПервые восемь букв нашего Херро Воррда:");
        for(int i = 0; i < 9; i++) { //инициализация цикла. i = 0 определяет точку старта, i < 9 определяет длину (первые восемь символов), i++ традиционно сдвигает цикл на 1 позицию вперед
            System.out.print(HelloWorld.charAt(i)); // метод CharAt() позволяет вывести порядковый символ в стринге, что как бы намекает нам, что индекс есть не только у массивов
        }

        }
}

