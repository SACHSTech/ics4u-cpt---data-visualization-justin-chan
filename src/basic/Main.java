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

        sk.setContinentChoice(keyboard.readLine());

        sk.continentDetails();

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
        ir.setCountryChoice(keyboard.readLine());

        ir.countryDetails();
        
    }
}
