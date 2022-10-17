package week6.estimatorexample;

public class PiEstimator {

    static final double CENTER_POINT_CORRECTION = 0.5;
    static final int FULL_CIRCLE_AREA_CORRECTION = 4;


    private int numberOfPoints;
    private int numberOfPointInCircle;
    private double currentEstimate;

    public PiEstimator(){
        this.numberOfPoints = 1;
        this.numberOfPointInCircle = 1;

        this. currentEstimate = 4 * ((double) this.numberOfPointInCircle / this.numberOfPoints);
    }

    public int getNumberOfPoints(){
        return this.numberOfPoints;
    }

    public double getCurrentEstimate() {
        return currentEstimate;
    }

    public int getNumberOfPointInCircle() {
        return numberOfPointInCircle;
    }

    public double generateEstimate(int radius){

        estimate(radius);

        return this.currentEstimate;

    }

    public double generateEstimate(double error){

        int radius = 0;

        do{

            estimate(++radius);

        }while( Math.abs(Math.PI - this.currentEstimate) > error);

        return this.currentEstimate;

    }


    private void estimate(int radius){

        this.numberOfPoints = 0;
        this.numberOfPointInCircle = 0;

        for( int i = 0; i < radius; i++){
            for(int j = 0; j < radius; j++){
                if(Math.sqrt( i*i + j*j ) < radius - CENTER_POINT_CORRECTION){
                    this.numberOfPointInCircle++;
                }
                this.numberOfPoints++;
            }
        }

        this.currentEstimate = FULL_CIRCLE_AREA_CORRECTION * ((double) this.numberOfPointInCircle / this.numberOfPoints);

    }



    public static PiEstimator bestEstimate(PiEstimator other, PiEstimator another){

        PiEstimator best;

        double otherError = Math.abs(Math.PI - other.getCurrentEstimate());
        double error = Math.abs(Math.PI - another.getCurrentEstimate());

        if(otherError < error){
            best = other;
        }else{
            best = another;
        }


        return best;

    }


}
