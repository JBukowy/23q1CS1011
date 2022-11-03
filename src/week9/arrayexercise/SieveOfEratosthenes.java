package week9.arrayexercise;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Up to what number would you like to check for primes?");
        int limit = Integer.parseInt(in.nextLine());

        boolean[] primes = new boolean[limit];
        Arrays.fill(primes, true);

        primes[0] = false;

        for(int i = 2; i<Math.sqrt(limit); i++){

            if(primes[i]){
                int counter = 0;
                for(int j = i*i; j<limit; j = (i*i) + ++counter * i){
                    primes[j] = false;
                }

            }

        }



        for(int i = 0; i<limit; i++){
            if(primes[i]){
                System.out.println(i);
            }
        }




    }


}

//vbonus
//        primes[0] = false;
//        for(int divisor = 2; divisor <= limit/2; divisor++){
//            int i=2;
//            for(int j = divisor * i; j < limit; j = divisor * ++i ){
//                primes[j] = false;
//            }
//        }