package Lesson_3_Homework;

public class Advanced_Task_4 {
    public static void main(String[] args) {

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

        Warehouse vodka = new Warehouse("Водка 'Столичная'", 10000);

        Workers ivan_Ivanovich = new Workers("Иван Иванович Замухин");
        Workers pavel_Borisovich = new Workers("Павел Борисович Ёжиков");
        Workers nikolai_Romanovich = new Workers("Николай Романович Могильных");

        ivan_Ivanovich.stealingVodka(vodka);
        ivan_Ivanovich.stealingVodka(vodka);
        pavel_Borisovich.stealingVodka(vodka);
    }

}