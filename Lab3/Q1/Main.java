package Lab3.Q1;
import java.util.*;

import Lab3.Q1.Teacher.Arts;
import Lab3.Q1.Teacher.Commerce;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String Student_name, Teacher_name, Staff_name, Teacher_sub, Staff_designation,SciStuds, ArtStuds, ComStuds, Student_roll, Student_ph;
        System.out.println("Enter Student Name: ");
        Student_name = sc.next();
        System.out.println("Enter Student Roll_no.: ");
        Student_roll = sc.next();
        System.out.println("Enter Student Phone_no: ");
        Student_ph = sc.next();
        System.out.println("Enter Teacher Name: ");
        Teacher_name = sc.next();
        System.out.println("Enter Teacher Subject: ");
        Teacher_sub = sc.next();
        System.out.println("Enter Student Strength in Science Class: ");
        SciStuds = sc.next();
        System.out.println("Enter Student Strength in Arts Class: ");
        ArtStuds = sc.next();
        System.out.println("Enter Student Strength in Commerce Class: ");
        ComStuds = sc.next();
        System.out.println("Enter Staff Name: ");
        Staff_name = sc.next();
        System.out.println("Enter Staff Designation: ");
        Staff_designation = sc.next();
        System.out.println("-------------------------------------------");

        System.out.println("STUDENT CLASS OBJECT: ");
        Student object1 = new Student();
        object1.getData(Student_name,Student_ph,Student_roll);
        object1.printData();
        System.out.println("-------------------------------------------");

        System.out.println("TEACHER CLASS OBJECT: ");
        Teacher object2 = new Teacher();
        object2.getData(Student_name,Student_ph, Student_roll,Teacher_sub,  Teacher_name);
        object2.printData();
        System.out.println("-------------------------------------------");

        System.out.println(
                "TEACHER.SCIENCE CLASS OBJECT: ");
        Teacher.Science object3 = object2.new Science();
        object3.getData2(SciStuds);
        object3.printData2();
        System.out.println("-------------------------------------------");


        System.out.println(
                "TEACHER.COMMERCE CLASS OBJECT: ");
        Commerce object4 = object2.new Commerce();
        object4.getData3(ComStuds);
        object4.printData3();
        System.out.println("-------------------------------------------");

        System.out.println(
                "TEACHER.ARTS CLASS OBJECT: ");
        Arts object5 = object2.new Arts();
        object5.getData4(ArtStuds);
        object5.printData4();
        System.out.println("-------------------------------------------");

        System.out.println("STAFF CLASS OBJECT:");
        Staff object6 = new Staff();
        object6.getData(Student_name,Student_ph,Student_roll,Staff_designation,Staff_name);
        object6.printData();
    }

}
