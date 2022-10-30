package week8.phonebook;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookDriver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] names;
        long[] phoneNumbers;

        System.out.println("How many names and numbers do you want to store?");
        int size = Integer.parseInt(in.nextLine());

        names = new String[size];
        phoneNumbers = new long[size];

        for(int i = 0; i < names.length; i++){
            System.out.println("Please enter a name.");
            names[i] = in.nextLine();
            System.out.println("Please enter the number.");
            phoneNumbers[i] = Long.parseLong(in.nextLine());
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(phoneNumbers));


    }


}
