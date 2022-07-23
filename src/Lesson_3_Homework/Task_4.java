package Lesson_3_Homework;

public class Task_4 {
    public static void main(String[] args) {

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.

          Edible_Animal sus_domesticus = new Edible_Animal("свинья", 4);
          Edible_Animal tremoctopus_violaceus = new Edible_Animal ("осьминог", 8);

          sus_domesticus.sayHi();
          tremoctopus_violaceus.sayHi();

          sus_domesticus.setNumberOfLegs(3);
          System.out.println("Привет! Я " + sus_domesticus.getEdibleAnimalName() + " и иду на холодец, после чего буду махать " + sus_domesticus.getNumberOfLegs() + " оставшимися конечностями.");

          Domestic_Animal felis_domesticus = new Domestic_Animal("кошка","маленькая");
          Domestic_Animal canis_domesticus = new Domestic_Animal("собака", "большая");

          felis_domesticus.play();
          canis_domesticus.play();
          felis_domesticus.setDomesticAnimalSize("очень большая");
          System.out.println("Через полгода " + felis_domesticus.getdomesticAnimalName() + " подросла и стала " + felis_domesticus.getdomesticAnimalSize() + "." );
    }
}