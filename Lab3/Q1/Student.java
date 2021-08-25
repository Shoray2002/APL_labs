package Lab3.Q1;
public class Student {
    private String name, phone, roll_no;

    void getData(String name, String phone, String roll_no) {
        this.name = name;
        this.phone = phone;
        this.roll_no = roll_no;
    }

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Roll_no. is: " + roll_no);
        System.out.println("Phone_no. is: " + phone);
    }
}


class Teacher extends Student {
    private String subject,Teacher_name;
    
    void getData(String name, String phone, String roll_no, String subject, String Teacher_name) {
        super.getData(name, phone, roll_no);
        this.subject = subject;
        this.Teacher_name = Teacher_name;
    }

    void printData() {
        super.printData();
        System.out.println("Subject is: " + subject);
        System.out.println("Teacher_name is: " + Teacher_name);
    }

    public class Science{
        String numofStudents;
        void getData2(String numofStudents){
            this.numofStudents = numofStudents;
        }
        void printData2(){
            System.out.println("Number of students in Science is: " + numofStudents);
        }
    }
    public class Commerce{  
        String numofStudents;
        void getData3(String numofStudents){

            this.numofStudents = numofStudents;
        }
        void printData3(){
            System.out.println("Number of students in Commerce is: " + numofStudents);
        }
    }
    public class Arts{
        String numofStudents;
        void getData4(String numofStudents){
            this.numofStudents = numofStudents;
        }
        void printData4(){
            System.out.println("Number of students in Arts is: " + numofStudents);
        }
    }
}


class Staff extends Student {
    private String designation, Staff_name;

    void getData(String name, String phone, String roll_no, String designation, String Staff_name) {
        super.getData(name, phone, roll_no);
        this.designation = designation;
        this.Staff_name = Staff_name;
    }

    void printData() {
        super.printData();
        System.out.println("Staff_name is: " + Staff_name);
        System.out.println("Staff Designation is: " + designation);
        
    }


    }
