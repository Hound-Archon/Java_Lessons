package Lesson_3_Homework;

public class Domestic_Animal {

    String domesticAnimalName;
    String domesticAnimalSize;

    public Domestic_Animal(String domesticAnimalName, String domesticAnimalSize){
        this.domesticAnimalName = domesticAnimalName;
        this.domesticAnimalSize = domesticAnimalSize;
    }

    public void play() {
        System.out.println("Я " + this.domesticAnimalSize + " " + this.domesticAnimalName + " и я ловлю свой хвост.");
    }
    public String getdomesticAnimalName() {
        return this.domesticAnimalName;
    }
    public void setDomesticAnimalName(String newDomesticAnimalname) {
        this.domesticAnimalName = newDomesticAnimalname;
    }
    public String getdomesticAnimalSize() {
        return this.domesticAnimalSize;
    }
    public void setDomesticAnimalSize(String newDomesticAnimalSize) {
        this.domesticAnimalSize = newDomesticAnimalSize;
    }
  }
