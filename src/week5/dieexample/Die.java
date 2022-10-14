package week5.dieexample;

public class Die {

    public static final int FACE_SIZE_LIMIT = 100;
    public static final int MIN_FACE_SIZE_LIMIT = 2;

    private int numOfSides;
    private int currentValue;
    private String color;

    public Die(int sides){
        if(sides > FACE_SIZE_LIMIT){
            numOfSides = FACE_SIZE_LIMIT;
        }else if(sides < MIN_FACE_SIZE_LIMIT){
            numOfSides = MIN_FACE_SIZE_LIMIT;
        }else{
            this.numOfSides = sides;
        }

        this.color = "red";

    }

    public int getNumOfSides(){
        return this.numOfSides;
    }

    public void setNumOfSides(int sides){
        if(sides > FACE_SIZE_LIMIT){
            numOfSides = FACE_SIZE_LIMIT;
        }else if(sides < MIN_FACE_SIZE_LIMIT){
            numOfSides = MIN_FACE_SIZE_LIMIT;
        }else{
            this.numOfSides = sides;
        }

    }

    public void foo(int sides){
        if(sides > FACE_SIZE_LIMIT){
            numOfSides = FACE_SIZE_LIMIT;
        }else if(sides < MIN_FACE_SIZE_LIMIT){
            numOfSides = MIN_FACE_SIZE_LIMIT;
        }else{
            this.numOfSides = sides;
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void roll(){

        this.currentValue = (int) Math.round( Math.random() * (this.numOfSides)) + 1;

    }



}
