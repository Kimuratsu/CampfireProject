import org.junit.jupiter.api.Test;
/// This will be present in all tests because its, well, the import for tests

public class FuelTest
{
    ///Just a test for Fuel checking if it properly displays the different fuel names (Twigs, More twigs, Logs)
    @Test
    public void testDisplay_TwigsAfter1Hour()
    {
        Fuel fuel = new Fuel(1);
        /// The current times here are all arbitrary, I just needed something to let this run since
        /// it still uses current time
        fuel.display("1:00");
    }

    @Test
    public void testDisplay_MoreTwigsAfter6Hours()
    {
        Fuel fuel = new Fuel(6);
        fuel.display("1:00");
    }

    @Test
    public void testDisplay_LogsAfter1Day()
    {
        Fuel fuel = new Fuel(24);
        fuel.display("0:00");
    }
}
