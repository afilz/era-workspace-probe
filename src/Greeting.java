/** Deliberately small, and deliberately wrong in one place. */
public class Greeting {

    /** The marker: an answer containing this came from reading the file. */
    public static final String MARKER = "seventeen-copper-kettles";

    public String greet(String name) {
        // The bug an agent might be asked to find: no space between the two.
        return "Hello" + name;
    }
}
