package MasterclassOOPStim;

public class CarObjectsMain {
    public static void main(String[] args) {
        Car porsche = new Car();//2 object of car
        Car holden = new Car();
        //4. call getters and setter
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

    }



}
