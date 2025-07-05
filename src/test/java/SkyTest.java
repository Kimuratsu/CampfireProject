import org.junit.jupiter.api.Test;

    public class SkyTest
    {
        @Test
        public void testNightSky_Starry()
        {
            Sky sky = new Sky();
            sky.display("00:01");
            sky.display("05:59");
        }

        @Test
        public void testSunriseSky()
        {
            Sky sky = new Sky();
            sky.display("06:01");
            sky.display("09:59");
        }

        @Test
        public void testDaySky_Blue()
        {
            Sky sky = new Sky();
            sky.display("10:01");
            sky.display("17:59");
        }

        @Test
        public void testSunsetSky_Pink()
        {
            Sky sky = new Sky();
            sky.display("18:01");
            sky.display("19:59");
        }

        @Test
        public void testEveningSky_DarkBlue()
        {
            Sky sky = new Sky();
            sky.display("20:01");
            sky.display("23:59");
        }
    }
