package day39_CustomClass_Statics.carpetTask;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width,double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


}
