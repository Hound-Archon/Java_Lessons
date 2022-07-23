package Lesson_3_Homework;

public class Warehouse {

    String goodsName;
    int goodsStored;

    public Warehouse(String goodsName, int goodsStored) {
        this.goodsName = goodsName;
        this.goodsStored = goodsStored;
    }

    public int getGoodsStored() {
        return this.goodsStored;
    }

    public void goodsReduced() {
        goodsStored--;
        System.out.println("Кладовщица Никитична сообщает, что после неожиданной пропажи на складе осталось " + goodsStored + " позиций.");
    }
}