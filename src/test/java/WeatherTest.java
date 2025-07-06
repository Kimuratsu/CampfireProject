import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherTest
{
    private final Weather weather = new Weather();

    /// this checks for valid responses, decided to make it a helper method since all will use this
    private void assertValidWeather(String actual, List<String> expectedOptions)
    {
        assertTrue(expectedOptions.contains(actual),
                "Expected one of " + expectedOptions + " but got: " + actual);
    }

    /// Testing for whether the time slots align with the string outputs
    @Test
    public void testNightWeatherOptions()
    {
        String result = weather.getDisplayText("03:00");
        assertValidWeather(result, List.of("Rainy and Cold", "Misty and Humid", "Clear and Quiet"));
    }

    @Test
    public void testDayWeatherOptions()
    {
        String result = weather.getDisplayText("12:00");
        assertValidWeather(result, List.of("Sunny and Warm", "Rainy and Humid", "Windy and Cold"));
    }

    @Test
    public void testEveningWeatherOptions()
    {
        String result = weather.getDisplayText("20:00");
        assertValidWeather(result, List.of("Warm and Quiet", "Rainy and Calm", "Snowy and Cold"));
    }

    /// And testing if they align with the randomly generated ints
    @Test
    public void testDirectNightWeatherMethods()
    {
        assertEquals("Rainy and Cold", weather.getNightWeather(1));
        assertEquals("Misty and Humid", weather.getNightWeather(2));
        assertEquals("Clear and Quiet", weather.getNightWeather(3));
    }

    @Test
    public void testDirectDayWeatherMethods()
    {
        assertEquals("Sunny and Warm", weather.getDayWeather(1));
        assertEquals("Rainy and Humid", weather.getDayWeather(2));
        assertEquals("Windy and Cold", weather.getDayWeather(3));
    }

    @Test
    public void testDirectEveningWeatherMethods()
    {
        assertEquals("Warm and Quiet", weather.getEveningWeather(1));
        assertEquals("Rainy and Calm", weather.getEveningWeather(2));
        assertEquals("Snowy and Cold", weather.getEveningWeather(3));
    }
}