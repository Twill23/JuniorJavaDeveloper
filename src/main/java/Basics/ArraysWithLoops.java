package Basics;

public class ArraysWithLoops {
    public static void main(String[] args) {
        //Declare and define an array
        String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};//implicitly define
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        //Declare array
        String[] countries;

        //Define the array
        countries = new String[3];
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "UK";
        System.out.println(countries[2]);

        System.out.println("*************************************8");

        //Declare the array printout in loop
        String[] states = new String[5];
        states[0] = "Louisiana";
        states[1] = "Ohio";
        states[2] = "Tennesse";
        states[3] = "Texas";
        states[4] = "Kansas";
        System.out.println("Do loop **********");
        int i = 0;
        //Do loop: enters loop Then test condition
        do {
            System.out.println("STATE: " + states[i]);
            i = i + 1;
        }while (i < 5);

        //While loop: test condition fiirst then enters loop
        System.out.println("While loop *****************");
        int n = 0;
        while (n <= 4){
            System.out.println("STATE at " + n + ": " + states[n]);
            n++;
        }

        //While loop: test condition fiirst then enters loop
        System.out.println("While loop2 *****************");
        int l = 0;
        boolean stateFound = false;
        while (!stateFound){
            String state = states[l];
            System.out.println(state);
            if (state == "Texas") {
                System.out.println("STATE FOUND!");
                stateFound = true;
            }
            l++;
        }

        System.out.println("\\nPRINTING WITH FOR LOOP");

        //For Loop: Best structure for iterating through an array
        for (int x = 0; x < 5; x++){
            System.out.println(states[x]);
        }

    }
}
