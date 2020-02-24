package exceptionsfiles;


import java.util.Scanner;

public class PaymentsAppUserExc {

    //take a payment fron a user
    public static void main(String[] args) {
        double payment = 0;
        boolean positivePymt = true;

        do {
            //1. Ask the user for input
            System.out.print("Enter the payment amount: ");

            //2. get the amount and test the value
            Scanner in = new Scanner(System.in);
            //3. Handle exceptions appropriatley
            try {
                payment = in.nextDouble();
                if(payment < 0){
                    // throw error
                    throw new NegativePaymentException(payment);
                }else {
                    positivePymt = true;
                }
            }
            catch (NegativePaymentException e) {
                System.out.println("Error" + e.toString());
                System.out.println("Please try again");
                positivePymt = false;
            }
        } while (!positivePymt);


        //4. Print confirmation
        System.out.println("Thank you for your payment of $" + payment);

    }

}
