package Lesson_3_Homework;

public class Edible_Animal {

    String edibleAnimalName;
    int numberOfLegs;

    public Edible_Animal(String edibleAnimalName, int edibleAnimalLegs){
        this.edibleAnimalName = edibleAnimalName;
        this.numberOfLegs = edibleAnimalLegs;
    }

    public void sayHi() {
        System.out.println("Привет! Я " + this.edibleAnimalName + " и машу " + this.numberOfLegs + " конечностями.");
    }
    public String getEdibleAnimalName() {
        return this.edibleAnimalName;
    }
    public void setEdibleAnimalName(String newEdibleAnimalName) {
        this.edibleAnimalName = newEdibleAnimalName;
    }
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
    public void setNumberOfLegs(int newNumberoflegs) {
        this.numberOfLegs = newNumberoflegs;
    }
}
