package Basics;

public class NumbersCalcFunctionsReturnTypesArguments {
    public static void main(String[]args){
        System.out.println("this is the main method");
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);//pass the number;
        int product = multipleNumbers(numA, numB);
        //System.out.println("The product of numbers " + numA + " and " + numB + " is " +  multipleNumbers(numA, numB));
        System.out.println("The product of numbers " + numA + " and " + numB + " is " +  " is " + product);

    }
    //Functions
    static void printName(){
        System.out.println("My name is Travis");
    }

    static void addNumbers(int numberA, int numberB){//recive the numbers
        //this function will add two numbers
        int sum = numberA + numberB;
        System.out.println("The sum of numbers " + numberA +" and " + numberB + " is " + sum);

    }


    static int multipleNumbers(int valueA, int valueB){//this returns
        int product = valueA * valueB;
        addNumbers(product, product);
        return product;

    }
}
