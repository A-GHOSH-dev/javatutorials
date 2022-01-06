public class Secondsinyear {
    public static void main(String[] args) {
        float days, hours, seconds, yearssec;
        days=(float) 365.2425;
        hours= 24;
        seconds= 3600;
        yearssec= days*hours*seconds;
        System.out.println("Seconds in year:" + yearssec);
    }
}
