/* Implementing “Multiple Inheritance”.
 Create a two interfaces Account containing methods set() and display() And interface Person containing methods store() and disp().
 Derive a class Customer from Person and Account.
Accept the name, account number, balance and display all the information related to account along with the interest. */

package QuestionBank;

import java.util.Scanner;

interface Account{
    void set();
    void display();
}

interface User{
    void store();
    void disp();

}

public class Customer implements User,Account{
    Scanner sc = new Scanner(System.in);

    String UserName;
    long AccountNumber;
    double Balance;
    double Interest;

    @Override
    public void store(){
        System.out.println("Please enter your name :");
         UserName = sc.nextLine();
    }

    @Override
    public void disp(){
        System.out.println("Name :" + UserName);
    }

    @Override
    public void set(){
        System.out.println("Enter your Account Number :");
        AccountNumber = sc.nextLong();

        System.out.println("Enter your Account Balance :");
        Balance = sc.nextDouble();

        Interest = CalculateInterest(Balance);
        System.out.println("Account details stored");
    }

    @Override
    public void display(){
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: $" + Balance);
        System.out.println("Interest: $" + Interest);
    }

    public double CalculateInterest(double balance) {
        return balance * 0.05;  // 5% of the balance
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.store();
        customer.set();

        System.out.println("\n--- Customer Details ---");

        customer.disp();
        customer.display();

    }
}

