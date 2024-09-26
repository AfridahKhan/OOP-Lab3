import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzyPrinterTest {

    FizzyPrinter fizzyPrinter = new FizzyPrinter();

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzyPrinter.printFizzy(9, false));
    }
    @Test
    public void testBuzz(){
        assertEquals("BUZZ",fizzyPrinter.printFizzy(20,true));
    }
    @Test
    public void testBang(){
        assertEquals("Bang",fizzyPrinter.printFizzy(14,false));
    }
    @Test
    public void testFizzbuzz() {
        assertEquals("Fizzbuzzbang", fizzyPrinter.printFizzy(105, false));
    }
    @Test
    public void testFizzbuzzbang() {
        assertEquals("Fizzbuzz", fizzyPrinter.printFizzy(15, false));
    }
    @Test
    public void testBoom(){
        assertEquals("Boom",fizzyPrinter.printFizzy(13,false));
    }
    @Test
    public void testFizzUpperCase() {
        assertEquals("FIZZ", fizzyPrinter.printFizzy(3, true));
    }
}
