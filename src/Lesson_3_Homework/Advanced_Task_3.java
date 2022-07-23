package Lesson_3_Homework;

public class Advanced_Task_3 {
    public static void main(String[] args) {

        // Задание №3:
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

        int totalBill = 0;
        int consultingBill = 0;
        int motorBill = 0;
        int electricsBill = 0;
        int transmissionBill = 0;
        int wheelsBill = 0;
        int malfunctionsCounter = 0;


        System.out.println("Счет за ремонт автомобиля: ");

        if (hasFuel == false && hasElectricsProblem == false && hasMotorProblem == false && hasTransmissionProblem == false && hasTransmissionProblem == false) {
                        consultingBill = 1000;
            System.out.println("Консультация: 1000 р.");
        } if  (hasMotorProblem == true) {
                        motorBill = 10000;
                        malfunctionsCounter++;
            System.out.println("Устранение неполадок с мотором: 10000 р.");
        } if  (hasElectricsProblem == true) {
                        electricsBill = 5000;
                        malfunctionsCounter++;
            System.out.println("Устранение неполадок с электрикой: 5000 р.");
        } if  (hasTransmissionProblem == true) {
                        transmissionBill = 4000;
                        malfunctionsCounter++;
            System.out.println("Устранение неполадок с корообкой передач: 4000 р.");
        } if  (hasWheelsProblem == true) {
            System.out.println("Устранение неполадок с колесами: 2000 р.");
                        wheelsBill = 2000;
                        malfunctionsCounter++;
        }
        totalBill = consultingBill + motorBill + electricsBill + transmissionBill + wheelsBill;
        System.out.println("Итоговый счет: " + totalBill);

        int minorDiscountSize = 0;
        int majorDiscountSize = 0;

        if (hasTransmissionProblem == true && (hasElectricsProblem == true || hasMotorProblem == true)) {
            majorDiscountSize = ((totalBill / 100) * 20);
            System.out.println("Вам предоставлена скидка 20%");
                    }
        else if (malfunctionsCounter >= 2) {
            minorDiscountSize = ((totalBill / 100) * 10);
            System.out.println("Вам предоставлена скидка 10%");
        }
            System.out.println("Итоговый счет c учетом скидок: " + (totalBill - minorDiscountSize - majorDiscountSize));
    }
}