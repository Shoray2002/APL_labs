package Lab2.Q2;


public class Q2a {
    public static void main(String []args){
         writeDays w=new writeDays();
         w.setDay(31);
         System.out.println("Number of Days in August is : "+w.getDay());
    }
}

class writeDays{
    private int days;
    public void setDay(int d){
        this.days=d;
    }
    public int getDay(){
         return days;
    }
}
