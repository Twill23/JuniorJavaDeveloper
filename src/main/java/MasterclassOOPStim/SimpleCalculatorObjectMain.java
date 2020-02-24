package MasterclassOOPStim;
//this does not work I need to finish

public class SimpleCalculatorObjectMain {
    public static void main(String[] args) {

        SimpleCalculator  calculator = new SimpleCalculator();//2

        //4. call getters and setter
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add = " + calculator.getAdditionResult());

    }
}
