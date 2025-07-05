public record Fuel(int hoursToBurn) implements Displayable
{
    @Override
    public void display(String currentTime)
    {
        /// Just checks for how long is it supposed to burn for, and printing out what type of fuel that
        /// time length corresponds to
        if (hoursToBurn <= 1)
        {
            System.out.println("Displaying twigs (1h)");
        } else if (hoursToBurn <= 6)
        {
            System.out.println("Displaying more twigs (6h)");
        } else if (hoursToBurn <= 24)
        {
            System.out.println("Displaying 1 log (24h)");
        } else
        {
            int logs = Math.min(5, hoursToBurn / 24);
            System.out.println("Displaying " + logs + " logs (" + hoursToBurn + "h)");
        }
    }
}

/// This has been changed from basically the same format as all my other classes to this by my IDE
/// It looks pretty efficient and didn't break anything so I'm keeping it as is as I like the way it
/// handles things, but I would understand if I should be graded by the code I personally wrote without that
/// factoring so that should be visible in the last commit before the Main branch was merged with the Sky Branch
