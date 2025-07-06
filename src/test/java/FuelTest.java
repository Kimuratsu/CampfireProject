import org.junit.jupiter.api.Test;
/// This will be present in all tests because its, well, the import for tests
import static org.junit.jupiter.api.Assertions.*;

public class FuelTest
{
    ///Just a test for Fuel checking if it properly displays the different fuel names (Twigs, More twigs, Logs)
    @Test
    public void testDisplay_TwigsAfter1Hour()
    {
        Fuel fuel = new Fuel(1);
        String result = fuel.getDisplayText("1:00");
        assertEquals("Displaying twigs (1h)", result);
    }

    @Test
    public void testDisplay_MoreTwigsAfter6Hours()
    {
        Fuel fuel = new Fuel(6);
        String result = fuel.getDisplayText("1:00");
        assertEquals("Displaying more twigs (6h)", result);
    }

    @Test
    public void testDisplay_LogsAfter1Day()
    {
        Fuel fuel = new Fuel(24);
        String result = fuel.getDisplayText("0:00");
        assertEquals("Displaying 1 log (24h)", result);
    }
}
