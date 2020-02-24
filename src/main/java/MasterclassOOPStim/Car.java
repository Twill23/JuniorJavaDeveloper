package MasterclassOOPStim;

public class Car {//1. create car attributes
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //3. create getter and setter to access encapsulated variables

    public void setModel(String model){
        //5.
        String validateModel = model.toLowerCase();//only these 2 cars are version
        if (validateModel.equals("carrera") || validateModel.equals("commodore")){
            this.model = model;
        }else {
            this.model = "Uknown";
        }


    }

    public String getModel(){
        return this.model;
    }
}
