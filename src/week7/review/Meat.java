package week7.review;

public class Meat {

    private String type;
    private int calories;
    private double pricePerPound;

    public Meat(String type){
        this.type = type;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public int getCalories(){
        return this.calories;
    }

    public void setPricePerPound(double price){
        this.pricePerPound = price;
    }

    public double getPricePerPound(){
        return this.pricePerPound;
    }

    public String getType(){
        return this.type;
    }

}
