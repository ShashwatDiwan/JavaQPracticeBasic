package QuestionBank;
import java.util.*;

 class Student{
    private String name;
    private int roll_no;
    private String grade;

    public Student(String name,int roll_no,String grade){
        this.name = name;
        this.roll_no = roll_no;
        this.grade = grade;
    }

    //Getters
    public String getName(){
        return name;
    }

     public int getRoll_no(){
        return roll_no;
     }

     public String getGrade(){
        return grade;
     }

     //Setters
     public void setName(String name){
        this.name = name;
     }

     public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
     }

     public void setGrade(String grade){
        this.grade=grade;
     }

     // Overriding toString() to display student details
     @Override
     public String toString() {
         return "Student [Name: " + name + ", Roll Number: " + roll_no + ", Grade: " + grade + "]";
     }
 }

 class StudentManager{
      private List <String> list = new ArrayList <String>();
 }

public class IteratorInterface {
    public static void main(String[] args) {

    }
}
