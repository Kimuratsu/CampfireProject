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
        /// Now handles all cases except the edge cases
        if (currentHour > startHour && currentHour < endHour) {
            return true;
        }
        /// Now handles the starting edge (:00)
        if (currentHour == startHour) {
            return currentMinute >= 0;
        }
        ///  Handles the ending edge case
        return false;
    }

    @Override
    public void display(String currentTime)
    {
        System.out.println(getDisplayText(currentTime));
    }
}
