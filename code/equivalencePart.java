public class equivalencePart
{
    public static void main(String[] args)
    {
        //SCENARIO 1
        testAustraliaMeteorological();
        testAustraliaNoongar();
        testSpainAndJapan();
        testMauritius();
        testMalaysiaAndSriLanka();

        //SCENARIO 2
        testPerthMorning();
        testPerthAfternoon();
        testAdelaideMorning();
        testAdelaideAfternoon();
    }
    public static void testAustraliaMeteorological()
    {
        assert "Summer".equals(ISADP.australiaMeteorological(2));
        assert "Autumn".equals(ISADP.australiaMeteorological(5));
        assert "Winter".equals(ISADP.australiaMeteorological(6));
        assert "Spring".equals(ISADP.australiaMeteorological(11));
        assert "error".equals(ISADP.australiaMeteorological(-8));
        assert "error".equals(ISADP.australiaMeteorological(15));
    }

    public static void testAustraliaNoongar()
    {
        assert "Birak".equals(ISADP.australiaNoongar(1));
        assert "Bunuru".equals(ISADP.australiaNoongar(2));
        assert "Djeran".equals(ISADP.australiaNoongar(5));
        assert "Makuru".equals(ISADP.australiaNoongar(6));
        assert "Dijiba".equals(ISADP.australiaNoongar(8));
        assert "Kambarang".equals(ISADP.australiaNoongar(10));
        assert "error".equals(ISADP.australiaNoongar(-7));
        assert "error".equals(ISADP.australiaNoongar(16));
    }

    public static void testSpainAndJapan()
    {
        assert "Winter".equals(ISADP.spainAndJapan(1));
        assert "Spring".equals(ISADP.spainAndJapan(3));
        assert "Summer".equals(ISADP.spainAndJapan(6));
        assert "Autumn".equals(ISADP.spainAndJapan(11));
        assert "error".equals(ISADP.spainAndJapan(-19));
        assert "error".equals(ISADP.spainAndJapan(18));
    }

    public static void testMauritius()
    {
        assert "Summer".equals(ISADP.mauritius(3));
        assert "Autumn".equals(ISADP.mauritius(5));
        assert "Winter".equals(ISADP.mauritius(6));
        assert "Spring".equals(ISADP.mauritius(10));
        assert "error".equals(ISADP.mauritius(-20));
        assert "error".equals(ISADP.mauritius(20));
    }

    public static void testMalaysiaAndSriLanka()
    {
        assert "Northeast Monsoon".equals(ISADP.malaysiaAndSriLanka(1));
        assert "Inter-monsoon".equals(ISADP.malaysiaAndSriLanka(3));
        assert "Southeast-monsoon".equals(ISADP.malaysiaAndSriLanka(5));
        assert "error".equals(ISADP.malaysiaAndSriLanka(-21));
        assert "error".equals(ISADP.malaysiaAndSriLanka(22));
    }

    public static void testPerthMorning()
    {
        assert "18.2 is the same as the average temperature of 18.2".equals(ISADP.perthMorning(18.2));
        assert "16.0 is below the average temperature of 18.2".equals(ISADP.perthMorning(16.0));
        assert "22.0 is above the average temperature of 18.2".equals(ISADP.perthMorning(22.0));
        assert "7.0 is below the average temperature of 18.2\n7.0 is below the average temperature of 18.2 by more than 5 degrees celsius".equals(ISADP.perthMorning(7.0));
        assert "27.0 is above the average temperature of 18.2\n27.0 is above the average temperature of 18.2 by more than 5 degrees celsius".equals(ISADP.perthMorning(27.0));
    }

    public static void testPerthAfternoon()
    {
        assert "23.0 is the same as the average temperature of 23.0".equals(ISADP.perthAfternoon(23.0));
        assert "19.0 is below the average temperature of 23.0".equals(ISADP.perthAfternoon(19.0));
        assert "25.0 is above the average temperature of 23.0".equals(ISADP.perthAfternoon(25.0));
        assert "15.0 is below the average temperature of 23.0\n15.0 is below the average temperature of 23.0 by more than 5 degrees celsius".equals(ISADP.perthAfternoon(15.0));
        assert "30.0 is above the average temperature of 23.0\n30.0 is above the average temperature of 23.0 by more than 5 degrees celsius".equals(ISADP.perthAfternoon(30.0));
    }
    public static void testAdelaideMorning()
    {
        assert "16.5 is the same as the average temperature of 16.5".equals(ISADP.adelaideMorning(16.5));
        assert "15.0 is below the average temperature of 16.5".equals(ISADP.adelaideMorning(15.0));
        assert "17.0 is above the average temperature of 16.5".equals(ISADP.adelaideMorning(17.0));
        assert "10.0 is below the average temperature of 16.5\n10.0 is below the average temperature of 16.5 by more than 5 degrees celsius".equals(ISADP.adelaideMorning(10.0));
        assert "25.0 is above the average temperature of 16.5\n25.0 is above the average temperature of 16.5 by more than 5 degrees celsius".equals(ISADP.adelaideMorning(25.0));
    }

    public static void testAdelaideAfternoon()
    {
        assert "21.0 is the same as the average temperature of 21.0".equals(ISADP.adelaideAfternoon(21.0));
        assert "19.0 is below the average temperature of 21.0".equals(ISADP.adelaideAfternoon(19.0));
        assert "23.0 is above the average temperature of 21.0".equals(ISADP.adelaideAfternoon(23.0));
        assert "10.0 is below the average temperature of 21.0\n10.0 is below the average temperature of 21.0 by more than 5 degrees celsius".equals(ISADP.adelaideAfternoon(10.0));
        assert "28.0 is above the average temperature of 21.0\n28.0 is above the average temperature of 21.0 by more than 5 degrees celsius".equals(ISADP.adelaideAfternoon(28.0));
    }


    
}
