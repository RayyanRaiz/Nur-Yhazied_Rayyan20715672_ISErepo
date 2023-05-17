import java.util.Scanner;
import java.util.*;
import java.io.*;

public class ISADP
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Would you like to:\n> (1) Find the season of the year given a country name and month?\n> (2) Find whether a given temperature reading is above or below the average temperature of a city.\n> (0) Exit the program. ");
        choice = input.nextInt();

        do
        {
            switch(choice)
            {
                case 1:
                //seasonMethod();

                case 2:
                //temperatureMethod()

        }while(choice!=0);
    }

}
