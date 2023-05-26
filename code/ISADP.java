import java.util.Scanner;


import java.util.*;
import java.io.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ISADP
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int choiceC = 0;
        int choiceM = 0;
        double temperature = 0;

        do
        {
            System.out.println("Would you like to:\n> (1) Find the season of the year given a country name and month?\n> (2) Find whether a given temperature reading is above or below the average temperature of a city?\n> (0) Exit the program. ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                choiceC = choosingCountry();
                choiceM = choosingMonth();
                System.out.println(countrySeason(choiceC, choiceM));
                break;
                
                case 2:
                temperature = choosingTemp();
                averageTemp(temperature);
                break;
            }
        }while(choice!=0);
        System.exit(0);
    }

    public static int choosingCountry()
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int choiceCountry = 0;
        System.out.println("Which country would you like?\n> (1) Australia - Meteorological\n> (2) Australia - The Noongar Seasons\n> (3) Spain\n> (4) Japan\n> (5) Mauritius\n> (6) Malaysia\n> (7) Sri Lanka");
        choiceCountry = input.nextInt();
        return choiceCountry;
    }

    public static int choosingMonth()
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int choiceMonth = 0;
        System.out.println("Which month?\n> (1) January\n> (2) February\n> (3) March\n> (4) April\n> (5) May\n> (6) June\n> (7) July\n> (8) August\n> (9) September\n> (10) October\n> (11) November\n> (12) December");
        choiceMonth = input.nextInt();
        return choiceMonth;
    }

    public static String countrySeason(int pCountry, int pMonth)
    {
        String result = "";
        switch(pCountry)
        {
            case 1:
            result = australiaMeteorological(pMonth);
            break;

            case 2:
            result = australiaNoongar(pMonth);
            break;

            case 3: case 4:
            result = spainAndJapan(pMonth);
            break;

            case 5:
            result = mauritius(pMonth);
            break;

            case 6: case 7:
            result = malaysiaAndSriLanka(pMonth);
            break;
        }
        return result;
    }



    public static String australiaMeteorological(int pMonth)
    {
        String seasonAM = "";
        switch(pMonth)
        {
            case 12: case 1: case 2:
            seasonAM = "Summer";
            displayImage("summer.png");
            break;

            case 3: case 4: case 5:
            seasonAM = "Autumn";
            displayImage("autumn.png");
            break;

            case 6: case 7: case 8:
            seasonAM = "Winter";
            displayImage("winter.png");
            break;

            case 9: case 10: case 11:
            seasonAM = "Spring";
            displayImage("spring.png");
            break;
        }
        return seasonAM;
    }

    public static String australiaNoongar(int pMonth)
    {
        String seasonAN = "";
        switch(pMonth)
        {
            case 12: case 1:
            seasonAN = "Birak";
            displayImage("birak.png");
            break;

            case 2: case 3:
            seasonAN = "Bunuru";
            displayImage("bunuru.png");
            break;

            case 4: case 5:
            seasonAN = "Djeran";
            displayImage("djeran.png");
            break;

            case 6: case 7:
            seasonAN = "Makuru";
            displayImage("makuru.png");
            break;

            case 8: case 9:
            seasonAN = "Dijiba";
            displayImage("dijilba.png");
            break;

            case 10: case 11:
            seasonAN = "Kambarang";
            displayImage("kambarang");
            break;
        }
        return seasonAN;
    }

    public static String spainAndJapan(int pMonth)
    {
        String seasonSJ = "";
        switch(pMonth)
        {
            case 12: case 1: case 2:
            seasonSJ = "Winter";
            displayImage("winter.png");
            break;

            case 3: case 4: case 5:
            seasonSJ = "Spring";
            displayImage("spring.png");
            break;

            case 6: case 7: case 8:
            seasonSJ = "Summer";
            displayImage("summer.png");
            break;

            case 9: case 10: case 11:
            seasonSJ = "Autumn";
            displayImage("autumn.png");
            break;
        }
        return seasonSJ;
    }

    public static String mauritius(int pMonth)
    {
        String seasonM = "";
        switch(pMonth)
        {
            case 11: case 12: case 1: case 2: case 3: case 4:
            seasonM = "Summer";
            displayImage("summer.png");
            break;

            case 5:
            seasonM = "Autumn";
            displayImage("autumn.png");
            break;

            case 6: case 7: case 8: case 9:
            seasonM = "Winter";
            displayImage("winter.png");
            break;

            case 10:
            seasonM = "Spring";
            displayImage("spring.png");
            break;
        }
        return seasonM;
    }

    public static String malaysiaAndSriLanka(int pMonth)
    {
        String seasonMSL = "";
        switch(pMonth)
        {
            case 12: case 1: case 2:
            seasonMSL = "Northeast Monsoon";
            displayImage("monsoon.png");
            break;

            case 3: case 4:
            seasonMSL = "Inter-monsoon";
            displayImage("inter-monsoon.png");
            break;

            case 5: case 6: case 7: case 8: case 9:
            seasonMSL = "Southeast-monsoon";
            displayImage("monsoon.png");
            break;

            case 10: case 11:
            seasonMSL = "Inter-monsoon";
            displayImage("inter-monsoon.png");
            break;
        }
        return seasonMSL;
    }
    ////////////////////////////////////////////////////////////////////SECONDS SCENARIO///////////////////////////////////////////////////////
    public static void averageTemp(double pTemp)
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int choiceTime = 0;
        System.out.println("Which average temperature would you like to compare to?\n> (1) Perth Morning\n> (2) Perth Afternoon\n> (3) Adelaide Morning\n> (4) Adelaide Afternoon");
        choiceTime= input.nextInt();

        switch(choiceTime)
        {
            case 1:
            tempStrings(pTemp, 18.2);
            break;

            case 2:
            tempStrings(pTemp, 23.0);
            break;

            case 3:
            tempStrings(pTemp, 16.5);
            break;

            case 4:
            tempStrings(pTemp, 21.0);
            break;

        }
    }

    public static double choosingTemp()
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        double choiceTemp = 0;
        String result = "";
        System.out.println("Insert temperature reading (up to one decimal place):");
        choiceTemp = input.nextDouble();
        return choiceTemp;
    }

    public static void tempStrings(double pTemp, double avg)
    {
        if(pTemp < avg)
        {
            System.out.println(pTemp + " is below the average temperature of "+avg);

            if(pTemp < avg - 5)
            {
                System.out.println(pTemp + " is below the average temperature of "+avg+ " by more than 5 degrees celsius");
            }
        }
        else if(pTemp > avg)
        {
            System.out.println(pTemp + " is above the average temperature of "+avg);

            if(pTemp > avg + 5)
            {
                System.out.println(pTemp + " is above the average temperature of "+avg+ " by more than 5 degrees celsius");
            }
        }
        else
        {
            System.out.println(pTemp + " is the same as the average temperature of "+avg);
        }
    }

    public static void displayImage(String pImagefile)
    {
        // Load the image from a file
        ImageIcon imageIcon = new ImageIcon(pImagefile);

        // Create a label to display the image
        JLabel label = new JLabel(imageIcon);
            
        // Create a frame to hold the label
        JFrame frame = new JFrame("IMAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
