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
        br.close();
    }

    public void IndiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] indiaInfo = line.split(",");
            theCountry = indiaInfo[0];

            if(theCountry.equalsIgnoreCase("india")) {

                countryPrints(indiaInfo);
                printedDetails = true;

            }
        }
        br.close(); 
    }

    public void UzbekistanDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] uzbekistanInfo = line.split(",");
            theCountry = uzbekistanInfo[0];

            if(theCountry.equalsIgnoreCase("uzbekistan")) {

                countryPrints(uzbekistanInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void CameroonDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] cameroonInfo = line.split(",");
            theCountry = cameroonInfo[0];

            if(theCountry.equalsIgnoreCase("cameroon")) {

                countryPrints(cameroonInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void PakistanDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] pakistanInfo = line.split(",");
            theCountry = pakistanInfo[0];

            if(theCountry.equalsIgnoreCase("pakistan")) {

                countryPrints(pakistanInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void VietnamDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] vietnamInfo = line.split(",");
            theCountry = vietnamInfo[0];

            if(theCountry.equalsIgnoreCase("vietnam")) {

                countryPrints(vietnamInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void UkraineDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] ukraineInfo = line.split(",");
            theCountry = ukraineInfo[0];

            if(theCountry.equalsIgnoreCase("ukraine")) {

                countryPrints(ukraineInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void IranDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] iranInfo = line.split(",");
            theCountry = iranInfo[0];

            if(theCountry.equalsIgnoreCase("iran")) {

                countryPrints(iranInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void KenyaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] kenyaInfo = line.split(",");
            theCountry = kenyaInfo[0];

            if(theCountry.equalsIgnoreCase("kenya")) {

                countryPrints(kenyaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void BoliviaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] boliviaInfo = line.split(",");
            theCountry = boliviaInfo[0];

            if(theCountry.equalsIgnoreCase("bolivia")) {

                countryPrints(boliviaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void IndonesiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] indonesiaInfo = line.split(",");
            theCountry = indonesiaInfo[0];

            if(theCountry.equalsIgnoreCase("indonesia")) {

                countryPrints(indonesiaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void TunisiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] tunisiaInfo = line.split(",");
            theCountry = tunisiaInfo[0];

            if(theCountry.equalsIgnoreCase("tunisia")) {

                countryPrints(tunisiaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void ColombiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] colombiaInfo = line.split(",");
            theCountry = colombiaInfo[0];

            if(theCountry.equalsIgnoreCase("colombia")) {

                countryPrints(colombiaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void SouthAfricaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] saInfo = line.split(",");
            theCountry = saInfo[0];

            if(theCountry.equalsIgnoreCase("south africa")) {

                countryPrints(saInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void MoroccoDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] moroccoInfo = line.split(",");
            theCountry = moroccoInfo[0];

            if(theCountry.equalsIgnoreCase("morocco")) {

                countryPrints(moroccoInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void AlgeriaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] algeriaInfo = line.split(",");
            theCountry = algeriaInfo[0];

            if(theCountry.equalsIgnoreCase("algeria")) {

                countryPrints(algeriaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void ChinaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] chinaInfo = line.split(",");
            theCountry = chinaInfo[0];

            if(theCountry.equalsIgnoreCase("china")) {

                countryPrints(chinaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void BulgariaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] bulgariaInfo = line.split(",");
            theCountry = bulgariaInfo[0];

            if(theCountry.equalsIgnoreCase("china")) {

                countryPrints(bulgariaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void BrazilDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] brazilInfo = line.split(",");
            theCountry = brazilInfo[0];

            if(theCountry.equalsIgnoreCase("brazil")) {

                countryPrints(brazilInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void GeorgiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] georgiaInfo = line.split(",");
            theCountry = georgiaInfo[0];

            if(theCountry.equalsIgnoreCase("georgia")) {

                countryPrints(georgiaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void ThailandDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] thailandInfo = line.split(",");
            theCountry = thailandInfo[0];

            if(theCountry.equalsIgnoreCase("thailand")) {

                countryPrints(thailandInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void EcuadorDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] ecuadorInfo = line.split(",");
            theCountry = ecuadorInfo[0];

            if(theCountry.equalsIgnoreCase("ecuador")) {

                if(theCountry.equalsIgnoreCase("philippines")) {

                    countryPrints(ecuadorInfo);
                    printedDetails = true;
    
                }

            }

        } 
        br.close(); 
    }

    public void PhilippinesDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] philippinesInfo = line.split(",");
            theCountry = philippinesInfo[0];

            if(theCountry.equalsIgnoreCase("philippines")) {

                countryPrints(philippinesInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void SerbiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] serbiaInfo = line.split(",");
            theCountry = serbiaInfo[0];

            if(theCountry.equalsIgnoreCase("serbia")) {

                countryPrints(serbiaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void BelarusDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] belarusInfo = line.split(",");
            theCountry = belarusInfo[0];

            if(theCountry.equalsIgnoreCase("belarus")) {

                countryPrints(belarusInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void BosniaHerzegovinaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] bosniaherzegovinaInfo = line.split(",");
            theCountry = bosniaherzegovinaInfo[0];

            if(theCountry.equalsIgnoreCase("bosnia and herzegovina")) {

                countryPrints(bosniaherzegovinaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void NMacedoniaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] nMacedoniaInfo = line.split(",");
            theCountry = nMacedoniaInfo[0];

            if(theCountry.equalsIgnoreCase("north macedonia")) {

                countryPrints(nMacedoniaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void EgyptDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] egyptInfo = line.split(",");
            theCountry = egyptInfo[0];

            if(theCountry.equalsIgnoreCase("egypt")) {

                countryPrints(egyptInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void MalaysiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] malaysiaInfo = line.split(",");
            theCountry = malaysiaInfo[0];

            if(theCountry.equalsIgnoreCase("malaysia")) {

                countryPrints(malaysiaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void NigeriaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] nigeriaInfo = line.split(",");
            theCountry = nigeriaInfo[0];

            if(theCountry.equalsIgnoreCase("nigeria")) {

                countryPrints(nigeriaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void HungaryDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] hungaryInfo = line.split(",");
            theCountry = hungaryInfo[0];

            if(theCountry.equalsIgnoreCase("hungary")) {

                countryPrints(hungaryInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void MontenegroDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] montenegroInfo = line.split(",");
            theCountry = montenegroInfo[0];

            if(theCountry.equalsIgnoreCase("Montenegro")) {

                countryPrints(montenegroInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void DRepublicDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] dRepublicInfo = line.split(",");
            theCountry = dRepublicInfo[0];

            if(theCountry.equalsIgnoreCase("dominican republic")) {

                countryPrints(dRepublicInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void PolandDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] polandInfo = line.split(",");
            theCountry = polandInfo[0];

            if(theCountry.equalsIgnoreCase("poland")) {

                countryPrints(polandInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void AzerbaijanDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] azerbaijanInfo = line.split(",");
            theCountry = azerbaijanInfo[0];

            if(theCountry.equalsIgnoreCase("azerbaijan")) {

                countryPrints(azerbaijanInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void ChileDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] chileInfo = line.split(",");
            theCountry = chileInfo[0];

            if(theCountry.equalsIgnoreCase("chile")) {

                countryPrints(chileInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void RussiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] russiaInfo = line.split(",");
            theCountry = russiaInfo[0];

            if(theCountry.equalsIgnoreCase("russia")) {

                countryPrints(russiaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void SingaporeDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] singaporeInfo = line.split(",");
            theCountry = singaporeInfo[0];

            if(theCountry.equalsIgnoreCase("singapore")) {

                countryPrints(singaporeInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void CzechiaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] czechiaInfo = line.split(",");
            theCountry = czechiaInfo[0];

            if(theCountry.equalsIgnoreCase("czechia")) {

                countryPrints(czechiaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void GuatemalaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] guatemalaInfo = line.split(",");
            theCountry = guatemalaInfo[0];

            if(theCountry.equalsIgnoreCase("guatemala")) {

                countryPrints(guatemalaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void TurkmenistanDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] turkmenistanInfo = line.split(",");
            theCountry = turkmenistanInfo[0];

            if(theCountry.equalsIgnoreCase("turkmenistan")) {

                countryPrints(turkmenistanInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void MexDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] mexInfo = line.split(",");
            theCountry = mexInfo[0];

            if(theCountry.equalsIgnoreCase("mexico")) {

                countryPrints(mexInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void PeruDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] peruInfo = line.split(",");
            theCountry = peruInfo[0];

            if(theCountry.equalsIgnoreCase("peru")) {

                countryPrints(peruInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void TurkeyDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] turkeyInfo = line.split(",");
            theCountry = turkeyInfo[0];

            if(theCountry.equalsIgnoreCase("turkey")) {

                countryPrints(turkeyInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void BahrainDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] bahrainInfo = line.split(",");
            theCountry = bahrainInfo[0];

            if(theCountry.equalsIgnoreCase("bahrain")) {

                countryPrints(bahrainInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void RomaniaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] romaniaInfo = line.split(",");
            theCountry = romaniaInfo[0];

            if(theCountry.equalsIgnoreCase("romania")) {

                countryPrints(romaniaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void CRicaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] cRicaInfo = line.split(",");
            theCountry = cRicaInfo[0];

            if(theCountry.equalsIgnoreCase("costa rica")) {

                countryPrints(cRicaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void QatarDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] qatarInfo = line.split(",");
            theCountry = qatarInfo[0];

            if(theCountry.equalsIgnoreCase("qatar")) {

                countryPrints(qatarInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void KuwaitDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] kuwaitInfo = line.split(",");
            theCountry = kuwaitInfo[0];

            if(theCountry.equalsIgnoreCase("kuwait")) {

                countryPrints(kuwaitInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void SlovakDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] slovakInfo = line.split(",");
            theCountry = slovakInfo[0];

            if(theCountry.equalsIgnoreCase("slovakia")) {

                countryPrints(slovakInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void SouthKoreaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] southKoreaInfo = line.split(",");
            theCountry = southKoreaInfo[0];

            if(theCountry.equalsIgnoreCase("south korea")) {

                countryPrints(southKoreaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void LatviaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] latviaInfo = line.split(",");
            theCountry = latviaInfo[0];

            if(theCountry.equalsIgnoreCase("latvia")) {

                countryPrints(latviaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void SloveniaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] sloveniaInfo = line.split(",");
            theCountry = sloveniaInfo[0];

            if(theCountry.equalsIgnoreCase("slovenia")) {

                countryPrints(sloveniaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void ArgentinaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] argentinaInfo = line.split(",");
            theCountry = argentinaInfo[0];

            if(theCountry.equalsIgnoreCase("argentina")) {

                countryPrints(argentinaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void JordanDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] jordanInfo = line.split(",");
            theCountry = jordanInfo[0];

            if(theCountry.equalsIgnoreCase("jordan")) {

                countryPrints(jordanInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void EstoniaDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] estoniaInfo = line.split(",");
            theCountry = estoniaInfo[0];

            if(theCountry.equalsIgnoreCase("estonia")) {

                countryPrints(estoniaInfo);
                printedDetails = true;

            }

        } 
        br.close(); 
    }

    public void IrelandDetails() throws IOException {

        String filePath = "C:/Users/justi/OneDrive/Desktop/ics4uSTUFF/mainCPT/ics4u-cpt---data-visualization-justin-chan/src/basic/annual-food-expenditure-per-person-vs-gdp-per-capita_2.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line = "";
        boolean printedDetails = false;
        String theCountry = "";

        while((line = br.readLine()) != null && printedDetails == false) {

            String[] irelandInfo = line.split(",");
            theCountry = irelandInfo[0];

            if(theCountry.equalsIgnoreCase("ireland")) {

                countryPrints(irelandInfo);
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

    public void countryIfs() throws IOException {

        if (setCountryChoice().equalsIgnoreCase("india")) {

            IndiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("uzbekistan")) {

            UzbekistanDetails();

        }else if (setCountryChoice().equalsIgnoreCase("cameroon")) {

            CameroonDetails();

        }else if (setCountryChoice().equalsIgnoreCase("pakistan")) {

            PakistanDetails();

        }else if (setCountryChoice().equalsIgnoreCase("vietnam")) {

            VietnamDetails();

        }else if (setCountryChoice().equalsIgnoreCase("ukraine")) {

            UkraineDetails();

        }else if (setCountryChoice().equalsIgnoreCase("iran")) {

            IranDetails();

        }else if (setCountryChoice().equalsIgnoreCase("kenya")) {

            KenyaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("bolivia")) {

            BoliviaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("indonesia")) {

            IndonesiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("tunisia")) {

            TunisiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("colombia")) {

            ColombiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("south africa")) {

            SouthAfricaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("morocco")) {

            MoroccoDetails();

        }else if (setCountryChoice().equalsIgnoreCase("algeria")) {

            AlgeriaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("china")) {

            ChinaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("bulgaria")) {

            BulgariaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("brazil")) {

            BrazilDetails();

        }else if (setCountryChoice().equalsIgnoreCase("georgia")) {

            GeorgiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("thailand")) {

            ThailandDetails();

        }else if (setCountryChoice().equalsIgnoreCase("ecuador")) {

            EcuadorDetails();

        }else if (setCountryChoice().equalsIgnoreCase("philippines")) {

            PhilippinesDetails();

        }else if (setCountryChoice().equalsIgnoreCase("serbia")) {

            SerbiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("belarus")) {

            BelarusDetails();

        }else if (setCountryChoice().equalsIgnoreCase("bosnia and herzegovina")) {

            BosniaHerzegovinaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("north macedonia")) {

            NMacedoniaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("egypt")) {

            EgyptDetails();

        }else if (setCountryChoice().equalsIgnoreCase("malaysia")) {

            MalaysiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("nigeria")) {

            NigeriaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("hungary")) {

            HungaryDetails();

        }else if (setCountryChoice().equalsIgnoreCase("montenegro")) {

            MontenegroDetails();

        }else if (setCountryChoice().equalsIgnoreCase("dominican republic")) {

            DRepublicDetails();

        }else if (setCountryChoice().equalsIgnoreCase("poland")) {

            PolandDetails();

        }else if (setCountryChoice().equalsIgnoreCase("azerbaijan")) {

            AzerbaijanDetails();

        }else if (setCountryChoice().equalsIgnoreCase("chile")) {

            ChileDetails();

        }else if (setCountryChoice().equalsIgnoreCase("russia")) {

            RussiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("singapore")) {

            SingaporeDetails();

        }else if (setCountryChoice().equalsIgnoreCase("czechia")) {

            CzechiaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("guatemala")) {

            GuatemalaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("turkmenistan")) {

            TurkmenistanDetails();

        }else if (setCountryChoice().equalsIgnoreCase("mexico")) {

            MexDetails();

        }else if (setCountryChoice().equalsIgnoreCase("peru")) {

            PeruDetails();

        }else if (setCountryChoice().equalsIgnoreCase("turkey")) {

            TurkeyDetails();

        }else if (setCountryChoice().equalsIgnoreCase("bahrain")) {

            BahrainDetails();

        }else if (setCountryChoice().equalsIgnoreCase("romania")) {

            RomaniaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("costa rica")) {

            CRicaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("qatar")) {

            QatarDetails();

        }else if (setCountryChoice().equalsIgnoreCase("kuwait")) {

            KuwaitDetails();

        }else if (setCountryChoice().equalsIgnoreCase("slovakia")) {

            SlovakDetails();

        }else if (setCountryChoice().equalsIgnoreCase("south korea")) {

            SouthKoreaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("latvia")) {

            LatviaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("slovenia")) {

            SloveniaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("argentina")) {

            ArgentinaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("jordan")) {

            JordanDetails();

        }else if (setCountryChoice().equalsIgnoreCase("estonia")) {

            EstoniaDetails();

        }else if (setCountryChoice().equalsIgnoreCase("ireland")) {

            IrelandDetails();

        }

    }
}
