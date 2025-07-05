import org.junit.jupiter.api.Test;
import java.util.List;

public class CampfireTest
{
    @Test
    public void testDisplay_FireShowsAllComponents()
    {
        /// gotta initialise burnHours to have some sort of value
        int burnHours = 3;
        Campfire campfire = new Campfire(List.of(new Fuel(burnHours), new Flame("12:00", burnHours)));
        campfire.display("12:30");
    }
}
