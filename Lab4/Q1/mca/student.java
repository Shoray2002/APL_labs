package Lab4.Q1.mca;

public class student {
    int rollNo;
    String name;
    public int marks_1, marks_2, marks_3, marks_4, marks_5;

    public student(int rollNo, String name, int marks1, int marks2,int marks3,int marks4,int marks5) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks_1 = marks1;
        this.marks_2 = marks2;
        this.marks_3 = marks3;
        this.marks_4 = marks4;
        this.marks_5 = marks5;


    }

    public void display() {
        
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks in 1st subject: " + marks_1);
        System.out.println("Marks in 2nd subject: " + marks_2);
        System.out.println("Marks in 3rd subject: " + marks_3);
        System.out.println("Marks in 4th subject: " + marks_4);
        System.out.println("Marks in 5th subject: " + marks_5);
        System.out.println("Total marks: " + (marks_1 + marks_2 + marks_3 + marks_4 + marks_5));
        // System.out.println("Average marks: " + (marks_1 + marks_2 + marks_3 + marks_4 + marks_5) / 5);
    
    }
}
