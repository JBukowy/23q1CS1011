package week7.homework;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public static void main(String[] args) {
        Time time = new Time();

        time.setHours(11).setMinutes(50).setSeconds(0).printTime();
    }

    public Time setHours(int hours)  {
        this.hours = hours;
        return this;
    } // end setMinutes

    public Time setMinutes(int minutes)  {
        this.minutes = minutes;
        return this;
    } // end setMinutes

    public Time setSeconds(int seconds)  {
        this.seconds = seconds;
        return this;
    } // end setSeconds

    public void printTime()  {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    } // end printTime

}
