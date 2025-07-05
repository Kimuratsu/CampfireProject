import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        int flame1 = 1;
        int flame2 = 6;
        int flame3 = 24;


        System.out.println();

        /// Prints out the output of an on-going small flame (flame with short timer)
        System.out.println("---=====Example 1: On-going Small Fire=====---");
        Campfire smallFire1 = new Campfire(List.of(new Fuel(flame1), new Flame("12:00", flame1)));
        smallFire1.display("12:30");
        new Sky().display("12:30");
        new Weather().display("12:30");


        System.out.println();

        /// Prints out not-yet-started fire that lasts 6 hours (multiple twigs)
        System.out.println("---=====Example 2: Future Medium Fire=====---");
        Campfire mediumFire1 = new Campfire(List.of(new Fuel(flame2), new Flame("12:00", flame2)));
        mediumFire1.display("08:00");
        new Sky().display("08:00");
        new Weather().display("08:00");

        System.out.println();

        /// Prints out already finished large fire (log)
        System.out.println("---=====Example 3: Past Large Fire=====---");
        Campfire largeFire1 = new Campfire(List.of(new Fuel(flame3), new Flame("22:00", flame3)));
        largeFire1.display("23:00");
        new Sky().display("23:00");
        new Weather().display("23:00");
    }
}
