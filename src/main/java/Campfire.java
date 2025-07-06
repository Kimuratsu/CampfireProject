import java.util.List;
import java.util.stream.Collectors;

public class Campfire implements Displayable
{
    private final List<Displayable> fireComponents;

    public Campfire(List<Displayable> fireComponents)
    {
        this.fireComponents = fireComponents;
    }

    /// This just displays all the components of the Campfire, so its Fuel and its Flame state
    @Override
    public void display(String currentTime)
    {
        for (Displayable component : fireComponents)
        {
            component.display(currentTime);
        }
    }

    @Override
    public String getDisplayText(String currentTime)
    {
        return fireComponents.stream().map(component -> component.getDisplayText(currentTime))
                .collect(Collectors.joining("\n"));
    }
}
