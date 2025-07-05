public class Fuel implements Displayable
{
    /// This is how I made Fuel, but apparently my IDE gives me an alternative simpler piece of code
    /// so I'll try that out in a test branch before I implement the Sky and Weather

    private final int hoursToBurn;

    public Fuel(int hoursToBurn)
    {
        this.hoursToBurn = hoursToBurn;
    }

    public int getHoursToBurn()
    {
        return hoursToBurn;
    }

    @Override
    public void display(String currentTime)
    {
        /// Just checks for how long is it supposed to burn for, and printing out what type of fuel that
        /// time length corresponds to
        if (hoursToBurn <= 1)
        {
            System.out.println("Displaying twigs (1h)");
        }
        else if (hoursToBurn <= 6)
        {
            System.out.println("Displaying more twigs (6h)");
        }
        else if (hoursToBurn <= 24)
        {
            System.out.println("Displaying 1 log (24h)");
        }
        else
        {
            int logs = Math.min(5, hoursToBurn/24);
            System.out.println("Displaying " + logs + " logs (" + hoursToBurn + "h)");
        }
    }
}
