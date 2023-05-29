public class boundaryVA
{
    public static void main(String[] args) //TEST SUITE
    {
        testAustraliaMeteorologicalBVA();
        testAustraliaNoongarBVA();
        testMalaysiaAndSriLankaBVA();
        testPerthMorningBVA();
        testPerthAfternoonBVA();

    }

    public static void testAustraliaMeteorologicalBVA()
    {
        //BETWEEN SUMMER AND AUTUMN
        assert "Summer".equals(ISADP.australiaMeteorological(2));
        assert "Autumn".equals(ISADP.australiaMeteorological(3));

        //BETWEEN AUTUMN ADN WINTER
        assert "Autumn".equals(ISADP.australiaMeteorological(5));
        assert "Winter".equals(ISADP.australiaMeteorological(6));

        //BETWEEN WINTER AND SPRING
        assert "Winter".equals(ISADP.australiaMeteorological(8));
        assert "Spring".equals(ISADP.australiaMeteorological(9));

        //BETWEEN SPRING AND SUMMER
        assert "Spring".equals(ISADP.australiaMeteorological(11));
        assert "Summer".equals(ISADP.australiaMeteorological(12));
    }

    public static void testAustraliaNoongarBVA()
    {
        //BETWEEN BIRAK AND BUNURU
        assert "Birak".equals(ISADP.australiaNoongar(1));
        assert "Bunuru".equals(ISADP.australiaNoongar(2));

        //BETWEEN BUNURU AND DJERAN
        assert "Bunuru".equals(ISADP.australiaNoongar(3));
        assert "Djeran".equals(ISADP.australiaNoongar(4));

        //BETWEEN DJERAN AND MAKURU
        assert "Djeran".equals(ISADP.australiaNoongar(5));
        assert "Makuru".equals(ISADP.australiaNoongar(6));

        //BETWEEN MAKURU AND DIJIBA
        assert "Makuru".equals(ISADP.australiaNoongar(7));
        assert "Dijiba".equals(ISADP.australiaNoongar(8));

        //BETWEEN DIJIBA AND KAMBARANG
        assert "Dijiba".equals(ISADP.australiaNoongar(9));
        assert "Kambarang".equals(ISADP.australiaNoongar(10));

        //BETWEEN KAMBARANG AND BIRAK
        assert "Kambarang".equals(ISADP.australiaNoongar(11));
        assert "Birak".equals(ISADP.australiaNoongar(12));
    }

    public static void testMalaysiaAndSriLankaBVA()
    {
        //BETWEEN NORTHEAST MONSOON AND INTER-MONSOON
        assert "Northeast Monsoon".equals(ISADP.malaysiaAndSriLanka(2));
        assert "Inter-monsoon".equals(ISADP.malaysiaAndSriLanka(3));

        //BETWEEN INTER-MONSOON AND SOUTHEAST-MONSOON
        assert "Inter-monsoon".equals(ISADP.malaysiaAndSriLanka(4));
        assert "Southeast-monsoon".equals(ISADP.malaysiaAndSriLanka(5));

        //BETWEEN SOUTHEAST-MONSTOON AND INTER-MONSOON
        assert "Southeast-monsoon".equals(ISADP.malaysiaAndSriLanka(9));
        assert "Inter-monsoon".equals(ISADP.malaysiaAndSriLanka(10));

        //BETWEEN INTER-MONSOON AND NORTHEAST MONSSON
        assert "Inter-monsoon".equals(ISADP.malaysiaAndSriLanka(11));
        assert "Northeast Monsoon".equals(ISADP.malaysiaAndSriLanka(12));
    }

    public static void testPerthMorningBVA()
    {
        //Between below 18.2 by more than 5 / below 18.2 by less than 5 
        assert "13.1999 is below the average temperature of 18.2\n13.1999 is below the average temperature of 18.2 by more than 5 degrees celsius".equals(ISADP.perthMorning(13.1999));
        assert "13.2 is below the average temperature of 18.2".equals(ISADP.perthMorning(13.2));

        //Between below 18.2 by less than 5 / equal to 18.2
        assert "18.1999 is below the average temperature of 18.2".equals(ISADP.perthMorning(18.1999));
        assert "18.2 is the same as the average temperature of 18.2".equals(ISADP.perthMorning(18.2));

        //Between equal to 18.2 / above 18.2 by less than 5
        assert "18.2 is the same as the average temperature of 18.2".equals(ISADP.perthMorning(18.2));
        assert "18.2001 is above the average temperature of 18.2".equals(ISADP.perthMorning(18.2001));

        //Between above 18.2 by less than 5 / above 18.2 by more than 5
        assert "23.2 is above the average temperature of 18.2".equals(ISADP.perthMorning(23.2));
        assert "23.2001 is above the average temperature of 18.2\n23.2001 is above the average temperature of 18.2 by more than 5 degrees celsius".equals(ISADP.perthMorning(23.2001));
    }

    public static void testPerthAfternoonBVA()
    {
        //Between below 23.0 by more than 5 / below 23.0 by less than 5
        assert "17.9999 is below the average temperature of 23.0\n17.9999 is below the average temperature of 23.0 by more than 5 degrees celsius".equals(ISADP.perthAfternoon(17.9999));
        assert "18.0 is below the average temperature of 23.0".equals(ISADP.perthAfternoon(18.0));

        //Between below 23.0 by less than 5 / equal to 23.0
        assert "22.9999 is below the average temperature of 23.0".equals(ISADP.perthAfternoon(22.9999));
        assert "23.0 is the same as the average temperature of 23.0".equals(ISADP.perthAfternoon(23.0));

        //Between equal to 23.0 / above 23.0 by less than 5
        assert "23.0 is the same as the average temperature of 23.0".equals(ISADP.perthAfternoon(23.0));
        assert "23.0001 is above the average temperature of 23.0".equals(ISADP.perthAfternoon(23.0001));

        //Between above 23.0 by less than 5 / above 23.0 by more than 5
        assert "28.0 is above the average temperature of 23.0".equals(ISADP.perthAfternoon(28.0));
        assert "28.0001 is above the average temperature of 23.0\n28.0001 is above the average temperature of 23.0 by more than 5 degrees celsius".equals(ISADP.perthAfternoon(28.0001));
    }
}