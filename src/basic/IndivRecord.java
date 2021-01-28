package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IndivRecord {

    String country;

    public void getCountryChoice(String whichCountry) {

        country = whichCountry;

    }

    public String setCountryChoice() {

        return country;

    }

    public void countryList() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";

        for(int i = 0; i < 84; i++) {

            while((line = br.readLine()) != null) {

                String[] countries = line.split(",");
                System.out.println(countries[0]);
            }
        }

    }

    public void IndiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] indiaInfo = line.split(",");
            System.out.println("Country: " + indiaInfo[0]);
            System.out.println("Total Population: " + indiaInfo[3]);
            System.out.println("Continent: " + indiaInfo[4]);
            System.out.println("GDP/capita : $" + indiaInfo[5]);
            System.out.println("Food expenditure/person: $" + indiaInfo[6]);
            printedDetails = true;
        }
        br.close(); 
    }

    public void UzbekistanDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] uzbekistanInfo = line.split(",");
            System.out.println("Country: " + uzbekistanInfo[0]);
            System.out.println("Total Population: " + uzbekistanInfo[3]);
            System.out.println("Continent: " + uzbekistanInfo[4]);
            System.out.println("GDP/capita : $" + uzbekistanInfo[5]);
            System.out.println("Food expenditure/person: $" + uzbekistanInfo[6]);

        } 
        br.close(); 
    }

    public void CameroonDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] cameroonInfo = line.split(",");
            System.out.println("Country: " + cameroonInfo[0]);
            System.out.println("Total Population: " + cameroonInfo[3]);
            System.out.println("Continent: " + cameroonInfo[4]);
            System.out.println("GDP/capita : $" + cameroonInfo[5]);
            System.out.println("Food expenditure/person: $" + cameroonInfo[6]);

        } 
        br.close(); 
    }

}
