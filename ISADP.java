import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.*;
import java.io.*;
import java.lang.invoke.VarHandle;

public class ISADP
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int choiceC = 0;
        int choiceM = 0;

        do
        {
            System.out.println("Would you like to:\n> (1) Find the season of the year given a country name and month?\n> (2) Find whether a given temperature reading is above or below the average temperature of a city?\n> (0) Exit the program. ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                choiceC = choosingCountry();
                choiceM = choosingMonth();
                System.out.println(CountrySeason(choiceC, choiceM));
                break;
                
                case 2:
                choosingOverall();
                break;
            }
        }while(choice!=0);
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

    public static String CountrySeason(int pCountry, int pMonth)
    {
        String result = "";
        switch(pCountry)
        {
            case 1:
            result = AustraliaMeteorological(pMonth);
            break;

            case 2:
            result = AustraliaNoongar(pMonth);
            break;

            case 3: case 4:
            result = SpainAndJapan(pMonth);
            break;

            case 5:
            result = Mauritius(pMonth);
            break;

            case 6: case 7:
            result = MalaysiaAndSriLanka(pMonth);
            break;
        }
        return result;
    }



    public static String AustraliaMeteorological(int pMonth)
    {
        String seasonAM = "";
        switch(pMonth)
        {
            case 12: case 1: case 2:
            seasonAM = "Summer";
            break;

            case 3: case 4: case 5:
            seasonAM = "Autumn";
            break;

            case 6: case 7: case 8:
            seasonAM = "Winter";
            break;

            case 9: case 10: case 11:
            seasonAM = "Spring";
            break;
        }
        return seasonAM;
    }

    public static String AustraliaNoongar(int pMonth)
    {
        String seasonAN = "";
        switch(pMonth)
        {
            case 12: case 1:
            seasonAN = "Birak";
            break;

            case 2: case 3:
            seasonAN = "Bunuru";
            break;

            case 4: case 5:
            seasonAN = "Djeran";
            break;

            case 6: case 7:
            seasonAN = "Makuru";
            break;

            case 8: case 9:
            seasonAN = "Dijiba";
            break;

            case 10: case 11:
            seasonAN = "Kambarang";
            break;
        }
        return seasonAN;
    }

    public static String SpainAndJapan(int pMonth)
    {
        String seasonSJ = "";
        switch(pMonth)
        {
            case 12: case 1: case 2:
            seasonSJ = "Winter";
            break;

            case 3: case 4: case 5:
            seasonSJ = "Spring";
            break;

            case 6: case 7: case 8:
            seasonSJ = "Summer";
            break;

            case 9: case 10: case 11:
            seasonSJ = "Autumn";
            break;
        }
        return seasonSJ;
    }

    public static String Mauritius(int pMonth)
    {
        String seasonM = "";
        switch(pMonth)
        {
            case 11: case 12: case 1: case 2: case 3: case 4:
            seasonM = "Summer";
            break;

            case 5:
            seasonM = "Autumn";
            break;

            case 6: case 7: case 8: case 9:
            seasonM = "Winter";
            break;

            case 10:
            seasonM = "Spring";
            break;
        }
        return seasonM;
    }

    public static String MalaysiaAndSriLanka(int pMonth)
    {
        String seasonMSL = "";
        switch(pMonth)
        {
            case 12: case 1: case 2:
            seasonMSL = "Northeast Monsoon";
            break;

            case 3: case 4:
            seasonMSL = "Inter-monsoon";
            break;

            case 5: case 6: case 7: case 8: case 9:
            seasonMSL = "Southeast-monsoon";
            break;

            case 10: case 11:
            seasonMSL = "Inter-monsoon";
            break;
        }
        return seasonMSL;
    }

    public static double choosingOverall()
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        double temperature = 0;
        double result = 0;
        int choiceTime = 0;
        System.out.println("Which average temperature would you like to compare to?\n> (1) Perth Morning\n> (2) Perth Afternoon\n> (3) Adelaide Morning\n> (4) Adelaide Afternoon");
        choiceTime= input.nextInt();

        switch(choiceTime)
        {
            case 1:
            temperature = choosingTemp();
            TempPerth(temperature, 18.2);
            break;

            case 2:
            temperature = choosingTemp();
            TempPerth(temperature, 23.0);
            break;

            case 3:
            temperature = choosingTemp();
            TempPerth(temperature, 16.5);
            break;

            case 4:
            temperature = choosingTemp();
            TempPerth(temperature, 21.0);
            break;

        }
        return result;
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

    public static void TempPerth(double pTemp, double avg)
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
}
