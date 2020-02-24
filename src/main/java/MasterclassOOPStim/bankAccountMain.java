package MasterclassOOPStim;

import org.checkerframework.checker.units.qual.A;

public class bankAccountMain {
    public static void main(String[] args) {
        // Create a new class for a bank account = account class
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
        //_______________________________________________________________________________________________________-

        //5. You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown, ", "myemail@bob.com",
                "(087) 123-4567");//9. call the constructor attribute inside the object
        Account bobsAccount2 = new Account();
        //.10
        System.out.println("This come from getNumBer " + bobsAccount.getNumber());
        System.out.println("This come from getBalance " + bobsAccount.getBalance());


        bobsAccount.withdrawal(100.0);//no money

        bobsAccount.deposit(50);//add 50
        bobsAccount.withdrawal(100);//not enough to draw 100

        bobsAccount.deposit(51);//deposit another 51 equals 50+51 =101
        bobsAccount.withdrawal(100.0);// 101-100= 1

    }
}
