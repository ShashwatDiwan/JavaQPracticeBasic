/*2.Write a Java program to manage employees in a company. The company has different types of employees,
 including full-time employees and part-time employees.  Each employee has a name, employee ID, and hourly rate.
Full-time employees have additional attributes such as salary and benefits,
(Use super keyword)
while part-time employees have attributes for the number of hours worked and overtime rate.
(Use super keyword)
Your task is to implement a Java program using inheritance to represent these different types of employees and their attributes.
Additionally, the program should provide functionality to calculate the monthly salary for each type of employee.*/

package QuestionBank;

class Employee_details{
    //employee attributes

    String name;
    int employeeID;
    int hourlyRate;

    Employee_details(String name,int employeeID,int hourlyRate){
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
    }

}

class FullTimeEmployee extends Employee_details{
    int salary;
    FullTimeEmployee(String name,int employeeID,int hourlyRate,int salary){
        super(name,employeeID,hourlyRate);
        this.salary = salary;
    }

    int calculateSalary(){
        return salary;
    }
}

class PartTimeEmployee extends Employee_details{
    int hoursWorked;
    int overtimeRate;

    PartTimeEmployee(String name,int employeeID,int hourlyRate, int hoursWorked,int overtimeRate){
        super(name,employeeID,hourlyRate);
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    int calculateSalary(int hoursWorked){
        return hoursWorked*overtimeRate;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Shashwat",100,1000,60000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Chaitanya",101,500,6,200);

        System.out.println(emp1.calculateSalary());
        System.out.println(emp2.calculateSalary(6));
    }
}
