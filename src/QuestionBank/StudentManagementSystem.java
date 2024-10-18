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
 class StudentManager {
     List<Student> list = new ArrayList<Student>();

     public void addStudent(String name, int roll_no, String grade) {
         Student student = new Student(name, roll_no, grade);
         list.add(student);
     }

     public void removeStudent(int roll_no) {
         Iterator<Student> itr = list.iterator();
         while (itr.hasNext()) {
             Student student = itr.next();
             if (student.getRoll_no() == roll_no) {
                 itr.remove();
                 System.out.println("Student having roll number " + roll_no + " removed..");
                 return;
             }
         }
     }

     public void displayAllStudents() {
         if (list.isEmpty()) {
             System.out.println("No students in the list.");
         } else {
             for (Student student : list) {
                 System.out.println(student);
             }
         }
     }

     public void replaceGrade(int roll_no, String grade) {
         Iterator<Student> itr = list.iterator();
         while (itr.hasNext()) {
             Student student = itr.next();
             if (student.getRoll_no() == roll_no) {
                 student.setGrade(grade);
             }
             System.out.println("Grade of student with roll number " + roll_no + " replaced with " + grade);
         }
     }
 }

     public class StudentManagementSystem {
         public static void main(String[] args) {
             StudentManager studentManager = new StudentManager();
             Scanner sc = new Scanner(System.in);

             while (true) {
                 System.out.println("\n--- Student Management System ---");
                 System.out.println("1. Add Student");
                 System.out.println("2. Remove Student");
                 System.out.println("3. Display All Students");
                 System.out.println("4. Replace Grade of Student");
                 System.out.println("5. Exit");
                 System.out.print("Choose an option: ");
                 int choice = sc.nextInt();

                 sc.nextLine();

                 switch (choice) {
                     case 1:
                         // Adding a student
                         System.out.println("Enter student name: ");
                         String name = sc.nextLine();
                         System.out.println("Enter roll number: ");
                         int rollNumber = sc.nextInt();
                         sc.nextLine();
                         System.out.print("Enter grade: ");
                         String grade = sc.next();
                         studentManager.addStudent(name, rollNumber, grade);
                         break;

                     case 2:
                         System.out.print("Enter the roll number of student,you want to remove from the list :");
                         int roll_no = sc.nextInt();
                         studentManager.removeStudent(roll_no);
                         break;

                     case 3:
                         studentManager.displayAllStudents();
                         break;

                     case 4:
                         System.out.print("Enter the roll number of student whose grade you wanna change :");
                         int Roll_no = sc.nextInt();

                         System.out.print("Enter the updated grade of Student :");
                         String Grade = sc.next();
                         studentManager.replaceGrade(Roll_no, Grade);
                         break;

                     case 5:
                         // Exiting the program
                         System.out.println("Exiting...");
                         sc.close();
                         System.exit(0);
                         break;
                     default:
                         System.out.println("Invalid option! Please choose again.");
                 }
             }
         }
     }
