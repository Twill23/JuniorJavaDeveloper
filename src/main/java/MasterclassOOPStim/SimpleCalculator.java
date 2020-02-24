package MasterclassOOPStim;
//this does not work I need to finish
public class SimpleCalculator {//1
    private double firstNumber;
    private double secondNumber;
    private double additionResult = firstNumber + secondNumber;
    private double subtractionResult;
    private double multiplicationResult;
    private double DivisionResult;

    //3. create getter and setter to access encapsulated variables

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {

        //Double addUp = firstNumber + secondNumber;


        return additionResult;
    }

    public double getSubtractionResult() {
        return subtractionResult;
    }

    public double getMultiplicationResult() {
        return multiplicationResult;
    }

    public double getDivisionResult() {
        return DivisionResult;
    }
}
