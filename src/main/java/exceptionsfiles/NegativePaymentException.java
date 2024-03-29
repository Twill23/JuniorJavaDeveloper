package exceptionsfiles;

public class NegativePaymentException extends Exception{
    //Define class variable
    double payment;
    //1. constructor that takes the value that would throw the exception
    //2. Assign value of local variable class variable
    public NegativePaymentException(double payment){
        //System.out.println("ERROR: negative payment");
        this.payment = payment;
    }

    //3. Override the toString() method to include the specific exception message

    public String toString(){
        return "Error: Cannot take negative payment: $" + payment;
    }

}
