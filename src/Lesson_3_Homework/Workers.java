package Lesson_3_Homework;

public class Workers {

    String workerName;
    int goodsRuined;

    public Workers(String workerName) {
        this.workerName = workerName;
        this.goodsRuined = 0;
    }

    public int getGoodsRuined() {
        return this.goodsRuined;
    }

    public void stealingVodka(Warehouse vodka) {
        System.out.println(this.workerName + " говорит, 'Ура я испортил водку'");
        goodsRuined++;
        vodka.goodsReduced();
        System.out.println(this.workerName + " не сознается, что у него на совести " + this.goodsRuined + " шт. пропавшей водки.");

    }
}