import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Pattern;

// 2021-Mar-01  1:30p

class Recitation5Test extends OutputTest{
    @Test
    void test_main_1() {
        setTestInput("12\n14");
        Recitation5.main(new String[]{});
        String expected = "Circles intersects!";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);

    }

    @Test
    void test_main_2() {
        setTestInput("200\n300");
        Recitation5.main(new String[]{});
        String expected = "Circles do not intersect!";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);

    }
}
