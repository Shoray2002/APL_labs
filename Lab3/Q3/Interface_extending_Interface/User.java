package Lab3.Q3.Interface_extending_Interface;

public class User implements SmartPhone {
    public void showAppDetails()
    {
        System.out.println("Opening App : " + App_name);
        System.out.println("App Id : " + App_id);
    }
}
