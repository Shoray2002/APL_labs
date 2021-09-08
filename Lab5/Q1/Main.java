package Lab5.Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String Name, Aadhar, Mobile;
        int Age;
        System.out.print("Enter Name : ");
        Name = x.nextLine();
        System.out.print("Enter Aadhar Number : ");
        Aadhar = x.nextLine();
        System.out.print("Enter Mobile Number : ");
        Mobile = x.nextLine();
        System.out.print("Enter Age : ");
        Age = x.nextInt();
        Vaccine v1 = new Vaccine(Name, Aadhar, Mobile, Age);
        try {
            if(v1.verifyAge()){
                System.out.println("Age is valid and the candidate is elible for COVID vaccination");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
