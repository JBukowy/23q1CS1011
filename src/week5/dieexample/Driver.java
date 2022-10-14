package week5.dieexample;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Die schroedingersDie = new Die(9);

        Cat tesla = new Cat("Tesla",12,6);

        schroedingersDie.roll();

        for(int i = 0; i<schroedingersDie.getCurrentValue(); i++){
            tesla.die("curiosity");
        }



    }

}
