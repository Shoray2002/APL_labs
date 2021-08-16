package Lab2.Q2;

public class Q2b {
    public static void main(String []args){
        days w=new days();
        System.out.println("Number of Days in August is : "+w.getDays());
    }
}
class days{
    private int days=31;
    public int getDays(){
        return days;
    }
}