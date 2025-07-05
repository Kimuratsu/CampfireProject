import org.junit.jupiter.api.Test;
/// This is an import that lets us assert what is the expected output, basically checking if its correct
import static org.junit.jupiter.api.Assertions.*;

/// couldn't get getConsoleOutput() working, so these are some imports I found for a workaround
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FlameTest
{
    /// Same deal, just parts of the workaround for getConsoleOutput()
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void testDisplay_FlameBurnsIfOngoing()
    {
        System.setOut(new PrintStream(outContent));
        /// constructing an example flame
        Flame flame = new Flame("1:00", 3);
        flame.display("1:30"); //ongoing flame
        System.setOut(originalOut);
        /// asserting that its a specific output, and checking if it matches the actual one
        assertEquals("Flame is burning (timer on-going)", outContent.toString().trim());
    }

    @Test
    public void testDisplay_FlameExtinguishedIfComplete()
    {
        System.setOut(new PrintStream(outContent));
        int burnHours = 2;
        Flame flame = new Flame("1:00", burnHours);
        flame.display("4:00"); //extinguished flame
        System.setOut(originalOut);
        assertEquals("Flame is extinguished (timer complete)", outContent.toString().trim());
    }

    @Test
    public void testDisplay_FlameNotYetOngoing()
    {
        System.setOut(new PrintStream(outContent));
        Flame flame = new Flame("1:00", 4);
        flame.display("0:00"); //not yet started flame
        System.setOut(originalOut);
        assertEquals("Flame is not yet burning (timer not started)", outContent.toString().trim());
    }
}
