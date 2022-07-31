package Lesson_4_homework;


import java.io.*;

public class Task_1 {


    public static void main(String[] args) throws IOException {

        //Базовый уровень
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них

        Toyota toyota = new Toyota();
        Zhiguli zhiguli = new Zhiguli();

        toyota.move();
        toyota.stop();
        zhiguli.move();
        zhiguli.stop();
        toyota.music();
        zhiguli.breakdown();

//Задача №2
//Необходимо:
// 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
// 2. Прочитать файл, и вывести на экран все слова файла в одну строку
// Ожидаемый результат: "Моя бабушка читает газету жизнь"

        FileReader fileReader = new FileReader("C:\\Java\\Java_Lessons\\src\\Lesson_4_homework\\my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.print(line + " ");
                }
        bufferedReader.close();
        fileReader.close();

//Задача №3
//Необходимо:
// 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
// 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
// 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
// 4. Записать в файл "report.txt" данные из объекта класса.
// Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

    Financial_record financial_record = new Financial_record(500, 300);

    String filename = "C:\\Java\\Java_Lessons\\src\\Lesson_4_homework\\report.txt";
    String financial_record_result = ("Доходы: " + financial_record.incomes + ", " + "Расходы: " + financial_record.outcomes);
    FileWriter fileWriter = new FileWriter(filename);
    fileWriter.write(financial_record_result);
    fileWriter.flush();
    fileWriter.close();
    }
}


