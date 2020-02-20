package demos;

import utilities.CSV;

import java.util.List;

public class DataReaders {
    public static void main(String[] args) {
        readCSV();

    }

    public static void readCSV(){
        String filename = "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\UserAccounts.csv";
        List<String[]> records = utilities.CSV.get(filename);
        //reading through the list and cvs file
        for (String[] record : records){
            for(String field : record){
                System.out.println(field);
            }

        }

    }
}
