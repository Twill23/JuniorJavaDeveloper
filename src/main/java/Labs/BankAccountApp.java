package Labs;

public class BankAccountApp {
    public static void main(String[] args) {
        //3 create object of SSN constructor
        BankAccount acct1 = new BankAccount("123456789", 1000);//we need 2 parameters in constructors
        BankAccount acct2 = new BankAccount("987654321", 2000);//9.
        BankAccount acct3 = new BankAccount("123498765", 2500);//10.
        //12.
        acct1.setName("Tom");
        System.out.println(acct1.getName());
        //15.
        acct1.makeDeposit(500);
        acct1.makeDeposit(600);
        acct1.payBill(1000);
        acct1.accrue();//22
        System.out.println(acct1.toString());//25




    }
}
//properties of banl app

class BankAccount implements IInterest{//21. call interface
    //1. Encapsulation private ensure user doesnt have access to var
   private static int iD = 1001;  //4.Internal ID its static so it belongs to the class it will generate unque
   private String accountNumber;  // iD + random 2-digit number + first 2 of SSN
   private static final String routingNumber = "005400657";//final constant wont change and static will be same all objects
   private String name;
   private String SSN;
   private double balance;

   //2. Add Constructor
    public BankAccount(String SSN, double initDeposit) {
        System.out.println("New Account Created");
        balance = initDeposit;
        this.SSN = SSN;
        iD++;//5. increment id each object
        setAccountNumber();
    }

    private void setAccountNumber() {//6.
        //generate random number
        int random = (int) (Math.random() * 100);//7. cast to double
        //System.out.println(random);
        this.accountNumber = iD + "" + random + SSN.substring(0, 2);//8. first 3 digits of ID
        System.out.println("Your Account Number: " + accountNumber);
    }
//11.  getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void payBill(double amount){//13.
        balance = balance - amount;
        System.out.println("Paying Bill: " + amount);
        //17. call show balance to print new balance after withdraw
        showBalance();

    }
    public void makeDeposit(double amount){//14.
        balance = balance + amount;
        System.out.println("Making Deposit: " + amount);
        //18. call show balance to print new balance after deposit
        showBalance();

    }
    //16.after every transaction print Balnce
    public void showBalance(){
        System.out.println("BALANCE: " + balance);
    }
//21. used ide to implement
    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();//23.
    }
    //19. then create new interface class to implement this we delet this after interface creattion
//    public void accrueInterest(){
//
//    }

    @Override
    public String toString(){//24.tostring inherit from object
        return "[Name: " + name + " ]\n[Account Number: " + accountNumber +   "]\n" + "[Routing Number: " + accountNumber + "]\n" + "[Balance " + balance + "]";

    }
}
