import java.util.Random;

public class Weather implements Displayable
{
    private final Random random = new Random();

    @Override
    public String getDisplayText(String currentTime)
    {
        int hour = Integer.parseInt(currentTime.split(":")[0]);
        /// This just rolls a random int from 1-3 so we can get random weather from 3 options
        int weatherType = random.nextInt(3) + 1;

        /// This is pretty much the same as the Sky, just checking for whether or not the hour int is
        /// corresponding with some specific time of day or in this case time in which certain weather
        /// happens
        if (hour >= 0 && hour < 8)
        {
            return getNightWeather(weatherType);
        }
        else if (hour >= 8 && hour < 18)
        {
            return getDayWeather(weatherType);
        }
        else
        {
            return getEveningWeather(weatherType);
        }
    }

    /// And this also same as sky just displays stuff, but this time with the bonus of random output
    public String getNightWeather(int type)
    {
        return switch (type)
        {
            case 1 -> "Rainy and Cold";
            case 2 -> "Misty and Humid";
            case 3 -> "Clear and Quiet";
            default -> "";
        };
    }

    public String getDayWeather(int type)
    {
        return switch (type)
        {
            case 1 -> "Sunny and Warm";
            case 2 -> "Rainy and Humid";
            case 3 -> "Windy and Cold";
            default -> "";
        };
    }

    public String getEveningWeather(int type)
    {
        return switch (type)
        {
            case 1 -> "Warm and Quiet";
            case 2 -> "Rainy and Calm";
            case 3 -> "Snowy and Cold";
            default -> "";
        };
    }

    @Override
    public void display(String currentTime)
    {
        System.out.println(getDisplayText(currentTime));
    }
}