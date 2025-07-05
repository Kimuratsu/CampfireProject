import java.util.Random;

public class Weather implements Displayable {
    private final Random random = new Random();

    @Override
    public void display(String currentTime) {
        int hour = Integer.parseInt(currentTime.split(":")[0]);
        /// This just rolls a random int from 1-3 so we can get random weather from 3 options
        int weatherType = random.nextInt(3) + 1;

        /// This is pretty much the same as the Sky, just checking for whether or not the hour int is
        /// corresponding with some specific time of day or in this case time in which certain weather
        /// happens
        if (hour >= 0 && hour < 8)
        {
            displayNightWeather(weatherType);
        }
        else if (hour >= 8 && hour < 18)
        {
            displayDayWeather(weatherType);
        }
        else
        {
            displayEveningWeather(weatherType);
        }
    }

    /// And this also same as sky just displays stuff, but this time with the bonus of random output
    public void displayNightWeather(int type)
    {
        switch (type)
        {
            case 1 -> System.out.println("Rainy and Cold");
            case 2 -> System.out.println("Misty and Humid");
            case 3 -> System.out.println("Clear and Quiet");
        }
    }

    public void displayDayWeather(int type)
    {
        switch (type)
        {
            case 1 -> System.out.println("Sunny and Warm");
            case 2 -> System.out.println("Rainy and Humid");
            case 3 -> System.out.println("Windy and Cold");
        }
    }

    public void displayEveningWeather(int type)
    {
        switch (type)
        {
            case 1 -> System.out.println("Warm and Quiet");
            case 2 -> System.out.println("Rainy and Calm");
            case 3 -> System.out.println("Snowy and Cold");
        }
    }
}