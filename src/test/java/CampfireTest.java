import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CampfireTest
{
    @Test
    public void testDisplay_FireShowsAllComponents()
    {
        /// gotta initialise burnHours to have some sort of value
        int burnHours = 3;
        Campfire campfire = new Campfire(List.of(new Fuel(burnHours), new Flame("12:00", burnHours)));

        String result = campfire.getDisplayText("12:30");
        assertTrue(result.contains("Displaying more twigs (6h)"));
        assertTrue(result.contains("Flame is burning"));
    }
}
