import java.io.ByteArrayInputStream;

public class whiteboxTest
{
    public static void main(String[] args)
    {
        testSpainAndJapanWBT();
        testPerthMorningWBT();
        testCountrySeasonWBT();

    }
    public static void testSpainAndJapanWBT()
    {
        //FIRST CASE
        assert "Winter".equals(ISADP.spainAndJapan(12));

        //SECOND CASE
        assert "Spring".equals(ISADP.spainAndJapan(3));

        //THIRD CASE
        assert "Summer".equals(ISADP.spainAndJapan(6));

        //LAST CASE CASE
        assert "Autumn".equals(ISADP.spainAndJapan(9));
    }

    public static void testPerthMorningWBT()
    {
        //Enter First IF
        assert "18.0 is below the average temperature of 18.2".equals(ISADP.perthMorning(18.0));

        //Enter First IF, Then Second IF
        assert "10.0 is below the average temperature of 18.2\n10.0 is below the average temperature of 18.2 by more than 5 degrees celsius".equals(ISADP.perthMorning(10.0));

        //Enters Else If
        assert "19.0 is above the average temperature of 18.2".equals(ISADP.perthMorning(19.0));

        //Enters Else If, Then IF
        assert "30.0 is above the average temperature of 18.2\n30.0 is above the average temperature of 18.2 by more than 5 degrees celsius".equals(ISADP.perthMorning(30.0));

        //Enters Else
        assert "18.2 is the same as the average temperature of 18.2".equals(ISADP.perthMorning(18.2));
    }

    public static void testCountrySeasonWBT()
    {
        //Enter First IF
        //System.setIn(
            //new ByteArrayInputStream("1\n1".getBytes()));
        assert "Summer".equals(ISADP.countrySeason(1,1));

    }
}   