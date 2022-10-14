package week6.estimatorexample;

public class DriverEstimator {

    public static void main(String[] args) {

        PiEstimator one = new PiEstimator();
        PiEstimator two = new PiEstimator();

        //System.out.println( one.getCurrentEstimate()  );

        one.generateEstimateRadius(10000);

        System.out.println( one.getCurrentEstimate() );

        two.generateEstimateError(0.001);

        System.out.println( two.getCurrentEstimate() );

        PiEstimator best;

        best = PiEstimator.bestEstimate(one,two);

        System.out.println("The best estimate is: " + best.getCurrentEstimate());


    }

}
