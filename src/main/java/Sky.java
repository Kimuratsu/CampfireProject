public class Sky implements Displayable
{
    @Override
    public String getDisplayText(String currentTime)
    {
        int hour = Integer.parseInt(currentTime.split(":")[0]);
        int minute = Integer.parseInt(currentTime.split(":")[1]);

        if (isBetween(0, 6, hour, minute))
        {
            return "Dark starry sky";
        }
        else if (isBetween(6, 10, hour, minute))
        {
            return "Bright orange sunrise";
        }
        else if (isBetween(10, 18, hour, minute))
        {
            return "Blue sky";
        }
        else if (isBetween(18, 20, hour, minute))
        {
            return "Deep pink sunset";
        }
        else
        {
            return "Dark blue sky";
        }
    }

    private boolean isBetween(int startHour, int endHour, int currentHour, int currentMinute)
    {
        /// This is just here to handle the case of midnight since it broke a test previously
        if (startHour == 0 && endHour == 6) {
            return currentHour < 6 || (currentHour == 0 && currentMinute >= 0);
        }
        return (currentHour > startHour || (currentHour == startHour && currentMinute >= 0))
                && currentHour < endHour;
    }

    @Override
    public void display(String currentTime)
    {
        System.out.println(getDisplayText(currentTime));
    }
}
