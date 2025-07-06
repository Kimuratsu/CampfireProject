public class Flame implements Displayable
{
    private final String startTime;
    /// This would be a String but because Fuel uses the same parameter (time since the start)
    /// I opted for making this a generic int used for both, and just adding a calculator for the Flame
    /// that will translate between the int and the needed String
    private final int burnHours;

    public Flame(String startTime, int burnHours)
    {
        this.startTime = startTime;
        this.burnHours = burnHours;
    }

    @Override
    public String getDisplayText(String currentTime)
    {
        String endTime = calculateEndTime(startTime, burnHours);

        /// This just gives specific output based on whether the timer is ongoing, not yet started or ended
        if (currentTime.compareTo(endTime) >= 0)
        {
            return "Flame is extinguished (timer complete)";
        }
        else if (currentTime.compareTo(startTime) < 0)
        {
            return "Flame is not yet burning (timer not started)";
        }
        else
        {
            return "Flame is burning (timer on-going)";
        }
    }

    /// simple calculator that translates the given Int that's used for Fuel as well into a String
    private String calculateEndTime(String startTime, int burnHours)
    {
        int startHour = Integer.parseInt(startTime.split(":")[0]);
        int endHour = startHour + burnHours;
        return (endHour % 24) + ":" + startTime.split(":")[1];
    }

    @Override
    public void display(String currentTime)
    {
        System.out.println(getDisplayText(currentTime));
    }
}