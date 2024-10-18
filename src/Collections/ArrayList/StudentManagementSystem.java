/*Implement a Student class with attributes such as ID, name, age, gender, grade, and contact information using ArrayList .
Create a menu-driven program with an administrator login feature that allows authorized users to:
A. Add a new student to the database.
B.Remove a student from the database by their ID.
C. Update student information (name, age, grade, etc.).
D.Display all students in the database.
E. Search for a student by their ID, name, grade, or any other criteria.
F.Implement error handling and validation for user inputs, such as invalid IDs, duplicate entries, etc.*/

package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
    //attributes
    private String name;
    private int id;
    private String grade;
    private int age;
    private String gender;
    private String contact;
    private String PRN;
    private static int count = 1000;

    public Student(String name,int id,String grade,int age,String gender,String contact){
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.gender = gender;
        this.contact = contact;
    }

    //getters
    public String getName(){return name;}
    public int getId(){return id;}
    public int getAge() {return age;}

    public String getContact() {
        return contact;
    }

    public String getGender() {
        return gender;
    }

    public String getGrade() {
        return grade;
    }


    //setters
    public void setName(String name){this.name = name;}
    public void setId(int id){this.id = id;}
    public void setGrade(String Grade){this.grade =grade;}
    public void setAge(int age){this.age = age;}
    public void setGender(String gender){this.gender = gender;}
    public void setContact(String contact){this.contact = contact;}

}

class StudentManager{
    ArrayList<Student> list = new ArrayList<Student>();

    //Method to add student details
    public void addStudent(String name,int id,String grade,int age,String gender,String contact){
        Student student = new Student(name,id,grade,age,gender,contact);
        list.add(student);
    }

    //Method to remove student of a particular id
    public void removeStudent(int id){
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student student = itr.next();
            if (student.getId() == id){
                itr.remove();
                System.out.println("Student with ID "+ id + " removed successfully ");
            }
            else
                System.out.println("Student with ID "+ id + " not found ! ");
        }
    }

    //Method to update student
//    public void updateStudent(String name){
//
//    }
//
//    public void updateStudent(int age){
//
//    }
//
//    public void updateStudent(String grade){
//
//    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("--------------------------");
            System.out.println("Welcome to");
            System.out.println("Student Management System");
            System.out.println("A.Add a new student to the database.");
            System.out.println("B.Remove a student from the database by their ID.");
            System.out.println("C.Update student information (name, age, grade, etc.).");
            System.out.println("D.Display all students in the database.");
            System.out.println("E.Search for a student by their ID, name, grade, or any other criteria.");
            System.out.println("F.Implement error handling and validation for user inputs, such as invalid IDs, duplicate entries, etc.");
            System.out.println("--------------------------");
            System.out.print("Select you choice:");
            String choice = sc.next();


            switch (choice) {
                case "A":
                    System.out.println("Enter Student Details below :");
                    System.out.print("Name:");
                    String name = sc.next();
                    System.out.print("Age:");
                    int age = sc.nextInt();
                    System.out.print("Id(1-60):");
                    int id = sc.nextInt();
                    System.out.print("Gender(Male/Female):");
                    String gender = sc.next();
                    System.out.print("Grade:");
                    String grade = sc.next();
                    System.out.print("Contact:");
                    String contact = sc.next();
                    studentManager.addStudent(name, id, grade, age, gender, contact);
                    break;


                case "B":
                    System.out.print("Enter the ID of student you wanna remove :");
                    int ID = sc.nextInt();
                    studentManager.removeStudent(ID);
                    break;

                case "C":
                    System.out.println("Select what you want to update:");
                    System.out.println("1.Name");
                    System.out.println("2.Age");
                    System.out.println("3.Grade");
                    System.out.print("Your Choice:");
                    int choicee = sc.nextInt();
            }

        }
    }
}


