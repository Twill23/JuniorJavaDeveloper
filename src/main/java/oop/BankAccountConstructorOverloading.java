package oop;

public class BankAccountConstructorOverloading {
    public static void main(String[] args) {
        //Creating a new bank account instantiate an pbject
        BankAccount account1 = new BankAccount();
        //account1.name = "Roger Hue";
        //with encapsulation: public API methods: access hidden private variable and getter setter method
        account1.setName("Roger Hue");
        System.out.println(account1.getName());
        account1.setSsn("423-76-9087");
        System.out.println("SSN: " + account1.getSsn());

        account1.accountNumber = "012345654";
        account1.balance = 10000;
        //this comes from the interface
        account1.balance = 10000;

        account1.deposit(1500);
        account1.deposit(1500);
        account1.deposit(1500);
        account1.deposit(2000);

        //Polymorphism through overriding
        System.out.println(account1.toString());

        //Polymorphism through overloading
        BankAccount account2 = new BankAccount("Checking Account");
        BankAccount account3 = new BankAccount("Savings Account", 5000);
        account3.checkBalance();
//we made this private
//        System.out.println(account1.routingNumber);
//        System.out.println(account2.routingNumber);
//        System.out.println(account3.routingNumber);
        //Demo for Inheritance
        CDAccountInheritExtends cd1 = new CDAccountInheritExtends();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.setName("Juan");//encapsulation
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());
        cd1.compound();



    }

    LoanAccountCallInterface loan1 = new LoanAccountCallInterface();



}
