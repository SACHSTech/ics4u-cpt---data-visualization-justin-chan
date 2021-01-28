package basic;

public class SelectedKey {
    
    String continentChoice;

    public void getContinentChoice(String continent) {

        continentChoice = continent;

    }

    public String setContinentChoice() {

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

}
