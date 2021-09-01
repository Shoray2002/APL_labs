package Lab4.Q1;
import Lab4.Q1.mca.student;
public class Main {
        public static void main(String[] args) {
            student s = new student(37,"Shoray Singhal",98,96,92,98,90);
            s.display();
    
            int total = s.marks_1+s.marks_2+s.marks_3+s.marks_4+s.marks_5;
            System.out.println("Total marks: "+total);
            int percent = (total)/5;
            System.out.println("Percentage: "+percent);
        }
    }

