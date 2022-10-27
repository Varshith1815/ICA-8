import org.example.Urinals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UrinalsTest {
    /**
     *
     * @author - Varshith Sriram Mandalapu
     */

    @Test
    void checkInputTest()
    {
        System.out.println("====== Varshith Sriram Mandalapu == TEST ONE EXECUTED =======");
        Assertions.assertTrue(Urinals.checkInput("00100"));
    }
}
