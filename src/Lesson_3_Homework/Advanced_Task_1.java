package Lesson_3_Homework;

public class Advanced_Task_1 {
       public static void main(String[] args) {

        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:

        double increment = 0.5;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        int counter = 0;
        for (result = 0; result < 1000000; counter++) {
            if (increment < 0) {
                break;
                                                      }
            result = result + increment;
                                                      }
            if (counter != 0) {
                System.out.println("Для завершения цикла понадобилось " + counter + " итераций.");
                                                      }




    }
}
