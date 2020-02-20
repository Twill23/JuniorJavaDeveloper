package oop;

public class AccountAppPoly {
    public static void main(String[]args){
        //polymorh call classes and methods for differnt classes
        LoanAccountCallInterface loan1 = new LoanAccountCallInterface();
                loan1.increaseRate();
                loan1.setRate();
                loan1.setAmmortSchedule();
                loan1.setTerm(20);

                //Polymorphism changes where we are pointing

                IRate accountpoly = new LoanAccountCallInterface();
                accountpoly.increaseRate();
                accountpoly.setRate();

    }
}
