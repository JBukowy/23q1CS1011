package week10;

import java.util.*;
import java.util.Arrays;

public class ArrayDriver {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println(a.toString());

        System.out.println("Transform applied");

        adder(a);

        System.out.println(a.toString());

    }

    public static void adder(ArrayList<Integer> b){

        for(Integer a: b){
            a = a + 1;
        }

    }

}
