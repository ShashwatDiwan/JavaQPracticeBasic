//  22. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
//  Create a subclass called Employee that adds a new method named getEmployeeId() and
//  overrides the getLastName() method to include the employee's job title.
package QuestionBank;

class Person{
     String getFirstName(String FirstName){
         return FirstName;
     };
     String getLastName(String LastName,String EmployeeTitle){ //---> why their sequence affected results
         return LastName;
     };
}

class Employee extends Person{
    @Override
    public String getLastName(String LastName,String EmployeeTitle){
        return LastName + " " +EmployeeTitle ;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Person p1 = new Employee();
        System.out.println(p1.getFirstName("Shashwat") + p1.getLastName("Diwan", "Admin"));
    }
}
