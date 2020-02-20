package Basics;

public class SalaryCalculatorVariables {
    public static void main(String[] args) {
        //Lets create a variable to define career

        //Declare a variable
        String career;
        System.out.println("Program is starting");

        //Defined a Variable
        career = "Software Developer";
        System.out.println("My career: " + career);

        //Declare & Define
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My Salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year. ");

        //Compute annual Salary

        //rate * hoursPerWeek * weeksPerYear
    }
}
