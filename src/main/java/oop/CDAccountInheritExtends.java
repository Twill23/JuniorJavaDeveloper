package oop;
//child of bank account  inheritance
public class CDAccountInheritExtends extends BankAccount implements IRate {
    String interestRate;
    void compound(){
        System.out.println("Compounding interest");
    }
}
