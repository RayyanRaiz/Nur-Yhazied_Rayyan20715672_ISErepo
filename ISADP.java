import java.util.Scanner;
import java.util.*;
import java.io.*;

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
            System.out.println("Would you like to:\n> (1) Find the season of the year given a country name and month?\n> (2) Find whether a given temperature reading is above or below the average temperature of a city.\n> (0) Exit the program. ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                choiceC = choosingCountry();
                System.out.println(choiceC);
                choiceM = choosingMonth();
                System.out.println(choiceM);

                //typeOfseason();

                

                //seasonMethod();
                break;
                
                case 2:
                //temperatureMethod()
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

}
