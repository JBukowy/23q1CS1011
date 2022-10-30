package week7.exam;

import java.util.Scanner;

public class PointChecker {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x;
        double y;

        do{
            System.out.println("Please enter x coordinate.");
            x = Double.parseDouble(in.nextLine());
            System.out.println("Please enter y coordinate");
            y = Double.parseDouble(in.nextLine());
        }while(!(Math.abs(x) < 5 && Math.abs(y) < 5));

        Point p = new Point(x,y);
        double distance = Point.distance(p);

        if(distance < 1){
            System.out.println("This point is within the unit circle");
        }else{
            System.out.println("This point is outside the unit circle");
        }


    }


}
