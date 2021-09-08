package Lab5.Q1;

import Lab5.Q1.pak1.Citizen;

public class Vaccine extends Citizen {
    public Vaccine(String name, String phone_no, String aadhar_no,int age)
    {
        super(name,phone_no,aadhar_no,age);
    }

    @Override
    public boolean verifyAge() throws Exception {
        if(age>=18)
            return true;
        else
            throw new Exception("Not eligible for vaccination");
        
    }
}
