package Lab5.Q1.pak1;

public abstract class Citizen {
    protected String name;
    protected int age;
    protected String aadhar_no;
    protected String phone_no;
    public Citizen(String name, String phone_no, String aadhar_no, int age) {
        this.name = name;
        this.age = age;
        this.aadhar_no = aadhar_no;
        this.phone_no = phone_no;
    }
    public abstract boolean verifyAge() throws Exception;
}
