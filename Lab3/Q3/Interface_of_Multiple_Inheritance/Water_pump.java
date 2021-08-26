package Lab3.Q3.Interface_of_Multiple_Inheritance;

public class Water_pump implements Volume,Time
{
    public void showVolumeofWater()
    {
        System.out.println("The Volume of Water pumped (in Litre) is  : " + volume);
    }
    public void showTimeofPumping()
    {
        System.out.println("The Time taken to Pump all the water (in Minute) is : " + time);
    }
    public void showRateofFlow()
    {   float rate=volume/time;
        System.out.println("The Rate of Flow (in Litre/Minute) is : " + rate);
     }
}