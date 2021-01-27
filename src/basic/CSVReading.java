package basic;

import java.io.*;
import java.io.IOException;
import java.io.FileReader;

public class CSVReading {
    public static void main(String[] args) throws IOException {

        String filePath;
        filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));        

        String data = br.readLine();

        String countryChoice = "";

        System.out.print("Enter which country you want to see the record of: " + countryChoice);
        countryChoice = keyboard.readLine();

        if(countryChoice.equalsIgnoreCase("india")) {

            boolean printedCountry = false;
            
            while(data != null && printedCountry == false) {
                String line = br.readLine();
                String[] values = line.split(",");
                System.out.println("Country: " + values[0]);
                System.out.println("Year: " + values[2]);
                System.out.println("Total Population: " + values[3]);
                System.out.println("GDP per capita (current US$): " + values[5]);
                System.out.println("Food expenditure per person: " + values[6]);
                printedCountry = true;
            }

        }else if(countryChoice.equalsIgnoreCase("uzbekistan")) {

            boolean printedCountry = false;
            
            while(data != null && printedCountry == false) {
                String line = br.readLine();
                line = br.readLine();
                String[] values = line.split(",");
                System.out.println("Country: " + values[0]);
                System.out.println("Year: " + values[2]);
                System.out.println("Total Population: " + values[3]);
                System.out.println("GDP per capita (current US$): " + values[5]);
                System.out.println("Food expenditure per person: " + values[6]);
            }
        }
        br.close();
    }
}
