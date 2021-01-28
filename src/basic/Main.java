package basic;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        String filePath;
        filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        File file = new File(filePath);
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));        

        SpecifiedValues sv = new SpecifiedValues();

        System.out.print("Would you like to sort by GDP or food expenditure? (y/n): ");
        sv.getGDPExpenditureChoice(keyboard.readLine());

        if(sv.setGDPExpenditureChoice().equalsIgnoreCase("y")) {

            System.out.print("GDP or Food Expenditure (GDP/food) (lowest to highest)?: ");
            sv.getGDPFoodChoice(keyboard.readLine());

            if(sv.setGDPFoodChoice().equalsIgnoreCase("gdp")) {

                Scanner sc = new Scanner(file);

                String data2 = "";
                String values[] = {};
                double allGDP;

                sc.nextLine();

                ArrayList<Double> gdpArray = new ArrayList<>();

                for(int i = 0; i < 84; i++) {
                    
                    data2 = sc.nextLine();
                    values = data2.split(",");
                    allGDP = Double.parseDouble(values[5]);
                    gdpArray.add(allGDP);

                }
                double gdpArray2[] = new double[gdpArray.size()];
                sv.mergeSort(gdpArray2);
                System.out.println("These are the GDPs sorted: " + Arrays.toString(gdpArray2));
                sc.close();
            } else if(sv.setGDPFoodChoice().equalsIgnoreCase("food")) {

                Scanner sc = new Scanner(file);

                String data3 = "";
                String values2[] = {};
                double allFoodExpenditure;

                sc.nextLine();

                ArrayList<Double> foodExpenditureArray = new ArrayList<>();

                for(int i = 0; i < 84; i++) {
                    
                    data3 = sc.nextLine();
                    values2 = data3.split(",");
                    allFoodExpenditure = Double.parseDouble(values2[6]);
                    foodExpenditureArray.add(allFoodExpenditure);

                }
                double foodExpenditureArray2[] = new double[foodExpenditureArray.size()];
                sv.mergeSort(foodExpenditureArray2);
                System.out.println("These are the GDPs sorted: " + Arrays.toString(foodExpenditureArray2));
                sc.close();
            }

        }
        SelectedKey sk = new SelectedKey();
        
        sk.printContinentChoice();

        sk.getContinentChoice(keyboard.readLine());

        if(sk.setContinentChoice().equalsIgnoreCase("Asia")) {

            Scanner sc = new Scanner(file);

            String asiaData = "";
            String asiaValues[] = {};
            double AsiaGDP;
            String whichContinent;
            double AsiaGDPSum = 0;
            double AsiaFoodExpenditure;
            double AsiaFoodExpenditureSum = 0;

            sc.nextLine();

            for(int i = 0; i < 84; i++) {
                    
                asiaData = sc.nextLine();
                asiaValues = asiaData.split(",");
                whichContinent = (asiaValues[4]);

                if(whichContinent.equalsIgnoreCase("asia")) {

                    AsiaGDP = Double.parseDouble(asiaValues[5]);
                    AsiaGDPSum = AsiaGDPSum + AsiaGDP;
                    AsiaFoodExpenditure = Double.parseDouble(asiaValues[6]);
                    AsiaFoodExpenditureSum = AsiaFoodExpenditureSum + AsiaFoodExpenditure;

                }
            }
            System.out.println("Total GDP of " + sk.setContinentChoice() + ": $" + AsiaGDPSum);
            System.out.println("Total Food Expenditure of " + sk.setContinentChoice() + ": $" + AsiaFoodExpenditureSum);
            sc.close();
        } else if(sk.setContinentChoice().equalsIgnoreCase("Africa")) {

            Scanner sc = new Scanner(file);

            String africaData = "";
            String africaValues[] = {};
            double AfricaGDP;
            String whichContinent;
            double AfricaGDPSum = 0;
            double AfricaFoodExpenditure;
            double AfricaFoodExpenditureSum = 0;

            sc.nextLine();

            for(int i = 0; i < 84; i++) {
                    
                africaData = sc.nextLine();
                africaValues = africaData.split(",");
                whichContinent = (africaValues[4]);

                if(whichContinent.equalsIgnoreCase("Africa")) {

                    AfricaGDP = Double.parseDouble(africaValues[5]);
                    AfricaGDPSum = AfricaGDPSum + AfricaGDP;
                    AfricaFoodExpenditure = Double.parseDouble(africaValues[6]);
                    AfricaFoodExpenditureSum = AfricaFoodExpenditureSum + AfricaFoodExpenditure;

                }
            }
            System.out.println("Total GDP of " + sk.setContinentChoice() + ": $" + AfricaGDPSum);
            System.out.println("Total Food Expenditure of " + sk.setContinentChoice() + ": $" + AfricaFoodExpenditureSum);
            sc.close();
        } else if(sk.setContinentChoice().equalsIgnoreCase("Europe")) {

            Scanner sc = new Scanner(file);

            String europeData = "";
            String europeValues[] = {};
            double europeGDP;
            String whichContinent;
            double EuropeGDPSum = 0;
            double EuropeFoodExpenditure;
            double EuropeFoodExpenditureSum = 0;

            sc.nextLine();

            for(int i = 0; i < 84; i++) {
                    
                europeData = sc.nextLine();
                europeValues = europeData.split(",");
                whichContinent = (europeValues[4]);

                if(whichContinent.equalsIgnoreCase("Europe")) {

                    europeGDP = Double.parseDouble(europeValues[5]);
                    EuropeGDPSum = EuropeGDPSum + europeGDP;
                    EuropeFoodExpenditure = Double.parseDouble(europeValues[6]);
                    EuropeFoodExpenditureSum = EuropeFoodExpenditureSum + EuropeFoodExpenditure;

                }
            }
            System.out.println("Total GDP of " + sk.setContinentChoice() + ": $" + EuropeGDPSum);
            System.out.println("Total Food Expenditure of " + sk.setContinentChoice() + ": $" + EuropeFoodExpenditureSum);
            sc.close();
        } else if(sk.setContinentChoice().equalsIgnoreCase("North America")) {

            Scanner sc = new Scanner(file);

            String naData = "";
            String naValues[] = {};
            double NAGDP;
            String whichContinent;
            double NAGDPSum = 0;
            double NAFoodExpenditure;
            double NAFoodExpenditureSum = 0;

            sc.nextLine();

            for(int i = 0; i < 84; i++) {
                    
                naData = sc.nextLine();
                naValues = naData.split(",");
                whichContinent = (naValues[4]);

                if(whichContinent.equalsIgnoreCase("North America")) {

                    NAGDP = Double.parseDouble(naValues[5]);
                    NAGDPSum = NAGDPSum + NAGDP;
                    NAFoodExpenditure = Double.parseDouble(naValues[6]);
                    NAFoodExpenditureSum = NAFoodExpenditureSum + NAFoodExpenditure;

                }
            }
            System.out.println("Total GDP of " + sk.setContinentChoice() + ": $" + NAGDPSum);
            System.out.println("Total Food Expenditure of " + sk.setContinentChoice() + ": $" + NAFoodExpenditureSum);
            sc.close();
        } else if(sk.setContinentChoice().equalsIgnoreCase("South America")) {

            Scanner sc = new Scanner(file);

            String saData = "";
            String saValues[] = {};
            double SAGDP;
            String whichContinent;
            double SAGDPSum = 0;
            double SAFoodExpenditure;
            double SAFoodExpenditureSum = 0;

            sc.nextLine();

            for(int i = 0; i < 84; i++) {
                    
                saData = sc.nextLine();
                saValues = saData.split(",");
                whichContinent = (saValues[4]);

                if(whichContinent.equalsIgnoreCase("South America")) {

                    SAGDP = Double.parseDouble(saValues[5]);
                    SAGDPSum = SAGDPSum + SAGDP;
                    SAFoodExpenditure = Double.parseDouble(saValues[6]);
                    SAFoodExpenditureSum = SAFoodExpenditureSum + SAFoodExpenditure;

                }
            }
            System.out.println("Total GDP of " + sk.setContinentChoice() + ": $" + SAGDPSum);
            System.out.println("Total Food Expenditure of " + sk.setContinentChoice() + ": $" + SAFoodExpenditureSum);
            sc.close();
        } else if(sk.setContinentChoice().equalsIgnoreCase("Oceania")) {

            Scanner sc = new Scanner(file);

            String oceData = "";
            String oceValues[] = {};
            double OCEGDP;
            String whichContinent;
            double OCEGDPSum = 0;
            double OCEFoodExpenditure;
            double OCEFoodExpenditureSum = 0;

            sc.nextLine();

            for(int i = 0; i < 84; i++) {
                    
                oceData = sc.nextLine();
                oceValues = oceData.split(",");
                whichContinent = (oceValues[4]);

                if(whichContinent.equalsIgnoreCase("Oceania")) {

                    OCEGDP = Double.parseDouble(oceValues[5]);
                    OCEGDPSum = OCEGDPSum + OCEGDP;
                    OCEFoodExpenditure = Double.parseDouble(oceValues[6]);
                    OCEFoodExpenditureSum = OCEFoodExpenditureSum + OCEFoodExpenditure;

                }
            }
            System.out.println("Total GDP of " + sk.setContinentChoice() + ": $" + OCEGDPSum);
            System.out.println("Total Food Expenditure of " + sk.setContinentChoice() + ": $" + OCEFoodExpenditureSum);
            sc.close();
        }

        YearFilter yf = new YearFilter();

        System.out.print("Enter the year of which you would like to see the GDP and Food Expenditure totals (2015/2016): ");
        yf.getYear(Integer.parseInt(keyboard.readLine()));

        if(yf.setYear() == 2015) {

            Scanner sc = new Scanner(file);

            double gdpIn2015;
            String gdpIn2015Data;
            double foodin2015;
            String[] the2015Data;
            double gdpIn2015Sum = 0;
            double foodin2015Sum = 0;
            int whichYear;

            sc.nextLine();

            while(sc.hasNext()) {

                gdpIn2015Data = sc.nextLine();
                the2015Data = gdpIn2015Data.split(",");
                whichYear = Integer.parseInt(the2015Data[2]);

                if(whichYear == 2015) {

                    gdpIn2015 = Double.parseDouble(the2015Data[5]);
                    gdpIn2015Sum = gdpIn2015Sum + gdpIn2015;
                    foodin2015 = Double.parseDouble(the2015Data[6]);
                    foodin2015Sum = foodin2015Sum + foodin2015;

                }
            }
            System.out.println("Total GDP in " + yf.setYear() + ": $" + gdpIn2015Sum);
            System.out.println("Total Food Expenditure in " + yf.setYear() + ": $" + foodin2015Sum);
            sc.close();
        }else if(yf.setYear() == 2016) {

            Scanner sc = new Scanner(file);

            double gdpIn2016;
            double foodin2016;
            String gdpIn2016Data;
            String[] the2016Data;
            double gdpIn2016Sum = 0;
            double foodin2016Sum = 0;
            int whichYear;

            sc.nextLine();

            while(sc.hasNext()) {

                gdpIn2016Data = sc.nextLine();
                the2016Data = gdpIn2016Data.split(",");
                whichYear = Integer.parseInt(the2016Data[2]);

                if(whichYear == 2016) {

                    gdpIn2016 = Double.parseDouble(the2016Data[5]);
                    gdpIn2016Sum = gdpIn2016Sum + gdpIn2016;
                    foodin2016 = Double.parseDouble(the2016Data[6]);
                    foodin2016Sum = foodin2016Sum + foodin2016;

                }
            }
            System.out.println("Total GDP in " + yf.setYear() + ": $" + gdpIn2016Sum);
            System.out.println("Total Food Expenditure in " + yf.setYear() + ": $" + foodin2016Sum);
            sc.close();
        } 

        IndivRecord ir = new IndivRecord();

        ir.countryList();

        System.out.println("Which country would you like to view the individual record of? (only 2015, list above): ");
        ir.getCountryChoice(keyboard.readLine());

        ir.countryIfs();
        
    }
}
