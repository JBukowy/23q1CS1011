package week5.dieexample;

public class Cat {

    public static final String LEXICON = "Meow";
    private String name;
    private int age;
    private double weight;
    private int lives = 9;

    public Cat(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, double weight){
        this(name, 0, weight);
    }


    public double getWeight(){
        return this.weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void die(String method){
        lives--;
        if(lives >=1 ){
            System.out.println(this.name + " says: " + LEXICON);
        }else if(lives < 1){
            System.out.println(this.name +  " says: \"Bye forever\" ");
            System.out.println(this.name +  " died of " + method + " causes.");
        }
    }

}
