package Lab2.Q2;

public class Q2b {
    public static void main(String []args){
        days w=new days();
        System.out.println("The number of days in august is: "+w.getDays());
    }
}
class days{
    private int days=30;
    public int getDays(){
        return days;
    }
}