package Assignment;
/*Create a Student class to simulate a student's profile. 
The class should have the following attributes: student ID, name, and GPA. 
Include methods to updateGPA() and printProfiIe(). 
Implement functionality to create new student profiles, update GPAs, and print student profiles.
*/

public class task1 {
    public static void main(String[] args) {
        Student std = new Student(101,"Ram",3.30);
        
        std.printProfile();
        std.updateGPA(3.60);
    }    
}

class Student{
    int studentId;
    String name;
    double GPA;

    public Student(int studentId, String name, double GPA){
        this.studentId=studentId;
        this.name=name;
        this.GPA=GPA;
    }
    public void updateGPA(double newGPA){
        if(GPA>=0 && GPA<=4.00){
            System.out.println("Updated Gpa:"+newGPA);
        }else{
            System.out.println("Error");
        }
    }
    public void printProfile(){
        System.out.println("Student ID:"+this.studentId);
        System.out.println("Name:"+this.name);
        System.out.println("Gpa:"+this.GPA);
    }
}
