package week8.phonebook;

import java.util.Scanner;

public class PhoneBookDriver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] names;
        long[] phoneNumbers;

        System.out.println("How many names and numbers do you want to store?");
        long size = Long.parseLong(in.nextLine());

        names = new String[(int)size];
        phoneNumbers = new long[names.length];

        for(int i = 0; i < names.length; i++){
            System.out.println("Please enter a name.");
            names[i] = in.nextLine();
            System.out.println("Please enter the number.");
            phoneNumbers[i] = Long.parseLong(in.nextLine());
        }

        System.out.print(names);
        System.out.print(phoneNumbers);


    }


}
