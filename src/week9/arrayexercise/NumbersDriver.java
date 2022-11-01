package week9.arrayexercise;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersDriver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] numbers = userPromptArraySize(in);
        numbers = userPromptFillArray(in, numbers);


        String userResponse;
        do{
            System.out.println("Please make a selection: (1) quit, (2) max, " +
                    "(3) median, (4) min, (5) average");
            userResponse = in.nextLine();

            if(userResponse.equals("2")){
                System.out.println("The max value is " + max(numbers));
            }else if(userResponse.equals("3")){
                System.out.println("The median value is " + median(numbers));
            }else if(userResponse.equals("4")){

            }else if(userResponse.equals("5")){

            }

        }while(!userResponse.equals("1"));

    }

    private static double max(double[] num){
        double max = num[0];

        for(int i = 1; i < num.length; i++){
            if(max < num[i]){
                max = num[i];
            }
        }

        return max;
    }

    private static double median(double[] numbers){
        double[] copy = Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(copy);

        double median;

        if(numbers.length %2 == 0){
            median = (copy[copy.length/2] + copy[copy.length/2 - 1]) / 2;
        }else{
            median = copy[copy.length/2];
        }
        return median;

    }


    private static double[] userPromptArraySize(Scanner in){
        System.out.println("How many numbers would you like to store.");
        int numberOfNumbers = Integer.parseInt(in.nextLine());

        double[] numbers = new double[numberOfNumbers];

        return numbers;
    }

    private static double[] userPromptFillArray(Scanner in, double[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Please enter a number.");
            numbers[i] = Double.parseDouble(in.nextLine());
        }

        return numbers;

    }

}
