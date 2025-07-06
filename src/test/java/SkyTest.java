import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SkyTest
{
    private final Sky sky = new Sky();

    @Test
    public void testNightSky_Starry()
    {
        assertEquals("Dark starry sky", sky.getDisplayText("00:01"));
        assertEquals("Dark starry sky", sky.getDisplayText("05:59"));
    }

    @Test
    public void testSunriseSky()
    {
        assertEquals("Bright orange sunrise", sky.getDisplayText("06:01"));
        assertEquals("Bright orange sunrise", sky.getDisplayText("09:59"));
    }

    @Test
    public void testDaySky_Blue()
    {
        assertEquals("Blue sky", sky.getDisplayText("10:01"));
        assertEquals("Blue sky", sky.getDisplayText("17:59"));
    }

    @Test
    public void testSunsetSky_Pink()
    {
        assertEquals("Deep pink sunset", sky.getDisplayText("18:01"));
        assertEquals("Deep pink sunset", sky.getDisplayText("19:59"));
    }

    @Test
    public void testEveningSky_DarkBlue()
    {
        assertEquals("Dark blue sky", sky.getDisplayText("20:01"));
        assertEquals("Dark blue sky", sky.getDisplayText("23:59"));
    }

    /// Testing if nothing weird happens on the boundary between two timeslots
    @Test
    public void testBoundaryTimes()
    {
        assertEquals("Bright orange sunrise", sky.getDisplayText("06:00"));
        assertEquals("Blue sky", sky.getDisplayText("10:00"));
        assertEquals("Deep pink sunset", sky.getDisplayText("18:00"));

        /// Testing some more transitions because it broke last time and I need to make sure my fix was like
        /// actually proper and didn't just fix that one edge case somehow
        assertEquals("Dark starry sky", sky.getDisplayText("05:59"));
        assertEquals("Bright orange sunrise", sky.getDisplayText("06:00"));
        assertEquals("Bright orange sunrise", sky.getDisplayText("09:59"));
        assertEquals("Blue sky", sky.getDisplayText("10:00"));
    }
}
