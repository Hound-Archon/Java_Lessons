package Lesson_3_Homework;

public class Task_3 {
    public static void main(String[] args) {

        // Дано:
        boolean chicken = true;
        boolean vegetables = true;
        boolean sauce = true;
        boolean toast = false;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        boolean saladIsReady = false;

        if (chicken == true && vegetables == true && sauce == true && toast == true) {
                 System.out.println("Повар приготовил салат 'Цезарь'");
        }
        else if (saladIsReady == false && vegetables == true && (sausage == true || chicken == true) && eggs == true) {
            System.out.println("Повар приготовил салат 'Оливье'");
        }
        else if (saladIsReady == false && vegetables == true) {
            System.out.println("Повар приготовил салат 'Овощной'");
        }
        else {
            System.out.println("У повара ничего нет");
        }
    }
}