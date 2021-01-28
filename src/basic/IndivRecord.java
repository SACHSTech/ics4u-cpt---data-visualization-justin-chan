package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IndivRecord {

    String country;

    public void setCountryChoice(String whichCountry) {

        country = whichCountry;

    }

    public String getCountryChoice() {

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
        br.close();
    }

    public void countryDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] theInfo = line.split(",");
            theCountry = theInfo[0];

            if(theCountry.equalsIgnoreCase(getCountryChoice())) {

                countryPrints(theInfo);
                printedDetails = true;

            }
        }
        br.close(); 
    }
    
    public void countryPrints(String[] countryPrinting) {

        System.out.println("Country: " + countryPrinting[0]);
        System.out.println("Total Population: " + countryPrinting[3]);
        System.out.println("Continent: " + countryPrinting[4]);
        System.out.println("GDP/capita : $" + countryPrinting[5]);
        System.out.println("Food expenditure/person: $" + countryPrinting[6]);

    }
}
