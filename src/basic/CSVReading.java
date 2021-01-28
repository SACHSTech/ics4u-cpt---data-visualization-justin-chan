package basic;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CSVReading {
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
            }else if(sv.setGDPFoodChoice().equalsIgnoreCase("food")) {

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
    }
}
