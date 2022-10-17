package week5.dieexample;

public class DieDriver {

    public static void main(String[] args) {

        Die d6 = new Die(6);
        Die d20 = new Die(20);

        d6.roll();
        d20.roll();

        System.out.println(d6.getCurrentValue());

        Die holdingDie = d6;

        holdingDie.roll();


        System.out.println(d20.getCurrentValue());
        System.out.println(d6.getCurrentValue());


    }

}
