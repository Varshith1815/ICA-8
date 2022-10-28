import org.example.EmptyFileException;
import org.example.Urinals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

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

    @Test
    void checkInputNegativeTest()
    {
        System.out.println("====== Varshith Sriram Mandalapu == TEST TWO EXECUTED =======");
        Assertions.assertFalse(Urinals.checkInput("0010a"));
    }

    @Test
    void validateInputTest()
    {
        System.out.println("====== Varshith Sriram Mandalapu == TEST THREE EXECUTED =======");
        Assertions.assertTrue(Urinals.validateInput("10101"));
    }

    @Test
    void validateInputNegativeTest()
    {
        System.out.println("====== Varshith Sriram Mandalapu == TEST FOUR EXECUTED =======");
        Assertions.assertFalse(Urinals.validateInput("111101"));
    }

    @Test
    void countUrinalsTest()
    {
        System.out.println("====== Varshith Sriram Mandalapu == TEST FIVE EXECUTED =======");
        Assertions.assertEquals(2,Urinals.countUrinals("0000"));
    }

    @Test
    void countUrinalsNegativeTest()
    {
        System.out.println("====== Varshith Sriram Mandalapu == TEST SIX EXECUTED =======");
        Assertions.assertEquals(0,Urinals.countUrinals("10101001"));
    }
    @Test
    void readInputNegativeTest() {
        System.out.println("====== Varshith Sriram Mandalapu == TEST SEVEN EXECUTED =======");
        Assertions.assertThrows(FileNotFoundException.class, () -> Urinals.readInput("FileNotFound.dat"));
    }

    @Test
    void readInputNegativeTest1() {
        System.out.println("====== Varshith Sriram Mandalapu == TEST EIGHT EXECUTED =======");
        Assertions.assertThrows(EmptyFileException.class, () -> Urinals.readInput("FileNotFound.dat"));
    }


}
