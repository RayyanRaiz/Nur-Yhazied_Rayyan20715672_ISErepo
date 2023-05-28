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
        //ENTER Australia Meteorological Case
        //enter Summer case
        assert "Summer".equals(ISADP.countrySeason(1,1));
        //enter Autumn case
        assert "Autumn".equals(ISADP.countrySeason(1,4));
        //enter Winter case
        assert "Winter".equals(ISADP.countrySeason(1,7));
        //enter Spring case
        assert "Spring".equals(ISADP.countrySeason(1,10));
        //enter error case
        assert "error".equals(ISADP.countrySeason(1,13));

        //ENTER Australia Noongar Case
        //enter Birak case
        assert "Birak".equals(ISADP.countrySeason(2,1));
        //enter Bunuru case
        assert "Bunuru".equals(ISADP.countrySeason(2,3));
        //enter Djeran case
        assert "Djeran".equals(ISADP.countrySeason(2,5));
        //enter Makuru case
        assert "Makuru".equals(ISADP.countrySeason(2,7));
        //enter Dijiba case
        assert "Dijiba".equals(ISADP.countrySeason(2,9));
        //enter Kambarang case
        assert "Kambarang".equals(ISADP.countrySeason(2,11));
        //enter error case
        assert "error".equals(ISADP.countrySeason(2,14));

        //ENTER Spain and Japan Case
        //enter Winter case
        assert "Winter".equals(ISADP.countrySeason(4,12));
        //enter Spring case
        assert "Spring".equals(ISADP.countrySeason(4,4));
        //enter Summer case
        assert "Summer".equals(ISADP.countrySeason(4,7));
        //enter Autumn case
        assert "Autumn".equals(ISADP.countrySeason(4,10));
        //enter error case
        assert "error".equals(ISADP.countrySeason(4,14));

        //ENTER Mauritius Case
        //enter Summer case
        assert "Summer".equals(ISADP.countrySeason(5,1));
        //enter Autumn case
        assert "Autumn".equals(ISADP.countrySeason(5,5));
        //enter Winter case
        assert "Winter".equals(ISADP.countrySeason(5,8));
        //enter Spring case
        assert "Spring".equals(ISADP.countrySeason(5,10));
        //enter error case
        assert "error".equals(ISADP.countrySeason(5,20));

        //ENTER Malaysia and Sri Lanka Case
        //enter Northeast Monsoon case
        assert "Northeast Monsoon".equals(ISADP.countrySeason(7,1));
        //enter Inter-monsoon case
        assert "Inter-monsoon".equals(ISADP.countrySeason(7,4));
        //enter Southeast-monsoon case
        assert "Southeast-monsoon".equals(ISADP.countrySeason(7,8));
        //enter Inter-monsoon case
        assert "Inter-monsoon".equals(ISADP.countrySeason(7,11));
        //enter error case
        assert "error".equals(ISADP.countrySeason(7,0));
    }
}   