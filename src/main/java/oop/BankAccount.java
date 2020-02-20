package oop;

import zmq.Msg;

public class BankAccount implements IRate {
    //Define variables
    String accountNumber;
    //static >> belongs to the Class not the object instance
    //Final >> is constant and often goes with static final
    private static final String routingNumber = "1234564";

    //these are instance variables
    private String name;//private encapsulation: Generate Getters and setters
    private String ssn;//private encapsulation: Generate Getters and setters
    String accountType;
    double balance = 0;
    // Constructor definitions: unique methods
        //1. They are used to define/ setup/intialize properties of an object
        //2. Constructors are IMPLICITLY called upon instantiation
        //3.The same name as the class itself
        //4.Constructors have NO return type


    public BankAccount() {
        System.out.println("NEW ACCOUNT CREATED");

    }

    public BankAccount(String accountType) {
        System.out.println("NEW ACCOUNT:" + accountType);
    }

    public BankAccount(String accountType, double initDeposit) {
        //initDeposit,accountType,Msg are local variables
        System.out.println("NEW ACCOUNT:" + accountType);
        System.out.println("Intitial Deposit:" + initDeposit);
        String Msg = null;
        if(initDeposit < 1000){
            Msg = "ERROR: must be $1,000";
        }else {
            Msg = "Thanks for your deposit of: $" + initDeposit;
        }
        System.out.println(Msg);
        balance = initDeposit;
    }
    //Getter / Setters this goes with encapsulation
    //Allow the user to define the name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Mr." + name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //Interface methods

    public void setRate() {
        System.out.println("SETTING RATE");
    }

    public void increaseRate() {
        System.out.println("INCREASING RATE");
    }

    //Define Methods

    public void deposit(double amount){
        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    void withdraw(double amount){
        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    //Private only availible in the class

    private void showActivity(String activity){
        System.out.println("YOUR RECENT TRANSACTION " + activity);
        System.out.println("YOUR NEW BALANCE IS: " + balance);;
    }

    void checkBalance(){
        System.out.println("Balance: " + balance);

    }

    void getStatus(){

    }

    public String toString(){
        return "[Name:" + name + ", ACCOUNT" + accountNumber + ". ROUTING #" + routingNumber + ". BALANCE: $" + balance + "]";

    }
}
