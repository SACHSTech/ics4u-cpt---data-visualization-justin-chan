package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IndivRecord {

    private String country;

    /**
     * 
     * @param whichCountry  the country that they want to view the data for
     */

    public void setCountryChoice(String whichCountry) {

        country = whichCountry;

    }

    /**
     * 
     * @return 
     */

    public String getCountryChoice() {

        return country;

    }

    /**
     * 
     * @throws IOException   if there is an error with the user's input
     */

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

    /**
     * 
     * @throws IOException  if there is an error with the user's input
     */

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

    /**
     * 
     * @param countryPrinting   takes the String array that is read from the .csv file
     */

    public void countryPrints(String[] countryPrinting) {

        System.out.println("Country: " + countryPrinting[0]);
        System.out.println("Total Population: " + countryPrinting[3]);
        System.out.println("Continent: " + countryPrinting[4]);
        System.out.println("GDP/capita : $" + countryPrinting[5]);
        System.out.println("Food expenditure/person: $" + countryPrinting[6]);

    }
}