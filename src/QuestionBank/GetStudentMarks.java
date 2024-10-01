//5. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B.
// Create an abstract class 'Marks' with an abstract method 'getPercentage'.
//It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
// The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
// Create an object for each of the two classes and print the percentage of marks for both the students.
package QuestionBank;

abstract class Marks{
    abstract double getPercentage();
    double maths,science,biology,physics;
}

class A extends Marks{

    A(double maths,double science,double biology){
        this.maths = maths;
        this.science = science;
        this.biology = biology;
    }

    @Override
    public double getPercentage(){
        double MarksObtained = maths + biology + science ;
        double TotalMarks = 300;
        return ((MarksObtained/TotalMarks)*100);
    }
}

class B extends Marks{


    B(double maths,double science,double biology,double physics){
        this.maths = maths;
        this.science = science;
        this.biology = biology;
        this.physics = physics;
    }

    @Override
    public double getPercentage(){
        double MarksObtained = maths + physics + biology + science ;
        double TotalMarks = 400;
        return ((MarksObtained/TotalMarks)*100);
    }
}

public class GetStudentMarks {
    public static void main(String[] args) {
        A avinash = new A(60, 88, 65);
        B babita = new B(95, 66, 89, 75.6);

        System.out.println("Avinash's Percentage : " + avinash.getPercentage() + "%");
        System.out.println("Babita's Percentage : " + babita.getPercentage() + "%");
    }
}
