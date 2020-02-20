package oop;

class Person{

String name;
String email;
String phone;

void walk(){
    System.out.println(name + " is walking");
}

void eat(){
    System.out.println(email);
}

void sleep(){
    System.out.println(name + " is sleeping");

}

}

public class DemoOOP {
    public static void main(String[] args) {
        //Instantiating an Object
        Person person1 = new Person();

        //Define some properties
        person1.name = "Joe";
//        person1.email = "joe@testemail.com";
//        person1.phone = "33444333332";

        //Abstraction
        person1.walk();

        Person person2 = new Person();
        person2.name = "Sarah";
        //Abstraction
        person2.sleep();

        /*//Person--


        //Attributes, variables, adjectives, descriptors
        String name = "Joe";
        String email = "joe@testemail.com";
        String phone = "3344299944";

        //Action, Activity, Behavior
        //System.out.println(name + " is walking ");
        walking(name);
        System.out.println(name + " is eating ");

        //if we did it for another person
        String name2 = "Sarah";
        String email2 = "sarah@testemail.com";
        String phone2 = "32143323344";

        //Action, Activity, behavior
       // System.out.println(name2 + " is walking ");
        walking(name2);
        System.out.println(name2 + " is eating ");
        //What about binding attributes and properties together;
    }

    //Enhance by adding functions to minimize code
    static void walking(String name){
        System.out.println(name + " is walking");*/
    }
}


