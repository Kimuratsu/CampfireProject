public class Sky implements Displayable
{
    @Override
    public void display(String currentTime)
    {
        int hour = Integer.parseInt(currentTime.split(":")[0]);
        int minute = Integer.parseInt(currentTime.split(":")[1]);

        if (isBetween(0, 6, hour, minute))
        {
            System.out.println("Dark starry sky");
        }
        else if (isBetween(6, 10, hour, minute))
        {
            System.out.println("Bright orange sunrise");
        }
        else if (isBetween(10, 18, hour, minute))
        {
            System.out.println("Blue sky");
        }
        else if (isBetween(18, 20, hour, minute))
        {
            System.out.println("Deep pink sunset");
        }
        else
        {
            System.out.println("Dark blue sky");
        }
    }

    private boolean isBetween(int startHour, int endHour, int currentHour, int currentMinute)
    {
        /// This is just here to handle the case of midnight since it broke a test previously
        if (startHour == 0 && endHour == 6)
        {
            return currentHour >= 0 && currentHour < 6;
        }
        return (currentHour > startHour || (currentHour == startHour && currentMinute >= 1))
                && currentHour < endHour;
    }
}
