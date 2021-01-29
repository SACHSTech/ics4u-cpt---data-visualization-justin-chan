package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SelectedKey {

    private String continentChoice;

    /**
     * 
     * @param continent the continent that they want to view the data for
     */

    public void setContinentChoice(String continent) {

        continentChoice = continent;

    }

    /**
     * 
     * @return
     */

    public String getContinentChoice() {

        return continentChoice;

    }

    public void printContinentChoice() {

        System.out.println("Which continent would you like to see the total GDP and food expenditure of?: ");
        System.out.println("Asia");
        System.out.println("Africa");
        System.out.println("Europe");
        System.out.println("North America");
        System.out.println("South America");
        System.out.println("Oceania");

    }

    public void continentDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String theData = "";
        double theGDP;
        String whichContinent;
        double theGDPSum = 0;
        double theFoodExpenditure;
        double theFoodExpenditureSum = 0;
   
        while( (theData = br.readLine() ) != null) {

            String theValues[] = theData.split(",");
            whichContinent = (theValues[4]);

            if(whichContinent.equalsIgnoreCase(getContinentChoice())) {

                theGDP = Double.parseDouble(theValues[5]);
                theGDPSum = theGDPSum + theGDP;
                theFoodExpenditure = Double.parseDouble(theValues[6]);
                theFoodExpenditureSum = theFoodExpenditureSum + theFoodExpenditure;
            
            }
        }
        System.out.println("Total GDP of " + getContinentChoice() + ": $" + theGDPSum);
        System.out.println("Total Food Expenditure of " + getContinentChoice() + ": $" + theFoodExpenditureSum);
        br.close();
    }

}
