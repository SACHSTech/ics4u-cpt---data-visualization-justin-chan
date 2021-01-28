package basic;

import java.util.Scanner;

public class SelectedKey {
    
    String continentChoice;

    public void setContinentChoice(String continent) {

        continentChoice = continent;

    }

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

    public void continentDetails() {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";

        Scanner sc = new Scanner(filePath);

        String theData = "";
        String theValues[] = {};
        double theGDP;
        String whichContinent;
        double theGDPSum = 0;
        double theFoodExpenditure;
        double theFoodExpenditureSum = 0;

        sc.nextLine();

        for(int i = 0; i < 84; i++) {
                    
            theData = sc.nextLine();
            theValues = theData.split(",");
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
        sc.close();
    }

}
