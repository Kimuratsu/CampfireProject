import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Weather weather;

    /// As far as I understand it this is meant to organise the tests so that this piece of code goes off
    /// first before every test does what it needs to, hence why we're putting the important initialising
    /// stuff here. Also it helps that we don't have to write it for every test
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        weather = new Weather();
    }

    /// Tests for weather during the Night
    @Test
    public void testNightWeather_RainyAndCold()
    {
        weather.displayNightWeather(1);
        assertEquals("Rainy and Cold", outContent.toString().trim());
    }

    @Test
    public void testNightWeather_MistyAndHumid()
    {
        weather.displayNightWeather(2);
        assertEquals("Misty and Humid", outContent.toString().trim());
    }

    @Test
    public void testNightWeather_ClearAndQuiet()
    {
        weather.displayNightWeather(3);
        assertEquals("Clear and Quiet", outContent.toString().trim());
    }

    /// Tests for weather during the Day
    @Test
    public void testDayWeather_SunnyAndWarm()
    {
        weather.displayDayWeather(1);
        assertEquals("Sunny and Warm", outContent.toString().trim());
    }

    @Test
    public void testDayWeather_RainyAndHumid()
    {
        weather.displayDayWeather(2);
        assertEquals("Rainy and Humid", outContent.toString().trim());
    }

    @Test
    public void testDayWeather_WindyAndCold()
    {
        weather.displayDayWeather(3);
        assertEquals("Windy and Cold", outContent.toString().trim());
    }

    /// Test for weather during the evening
    @Test
    public void testEveningWeather_WarmAndQuiet()
    {
        weather.displayEveningWeather(1);
        assertEquals("Warm and Quiet", outContent.toString().trim());
    }

    @Test
    public void testEveningWeather_RainyAndCalm()
    {
        weather.displayEveningWeather(2);
        assertEquals("Rainy and Calm", outContent.toString().trim());
    }

    @Test
    public void testEveningWeather_SnowyAndCold()
    {
        weather.displayEveningWeather(3);
        assertEquals("Snowy and Cold", outContent.toString().trim());
    }

    @Test
    public void testRandomWeatherOutput()
    {
        /// Just testing the output at random to ensure it can handle it and its not like, super taxing
        /// for whatever reason
        for (int i = 0; i < 10; i++)
        {
            weather.display("07:00"); /// Night
            weather.display("12:00"); /// Day
            weather.display("20:00"); /// Evening
            outContent.reset();
        }
    }
}