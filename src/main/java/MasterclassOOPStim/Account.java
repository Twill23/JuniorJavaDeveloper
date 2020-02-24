package MasterclassOOPStim;

public class Account {
   //1. Create fields for the account number, balance, customer name, email and phone number.
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    //6. Basic create constructor
    public Account(){//if empty constructor called then set default values by calling parameter constructor
        //11.
        this("56789", 2.20, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }
    //7.  create constructor overloaded parameterized
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){//
        //8. set all field values in the constructor then call the constructor in the class
        System.out.println("Account constructor with parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    // Create two additional methods
// 3. To allow the customer to deposit funds (this should increment the balance field).
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    // 4. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    public void withdrawal(double withdrawalAmount){
        //is there enough money to withdraw
        if(this.balance - withdrawalAmount <0){
            System.out.println("Only " + this.balance + " availible. Withdrawal not processed ");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }


    }
    //2. Create getters and setters for each field

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
