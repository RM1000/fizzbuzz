import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizz(){
        assertEquals("1",fizzBuzz.fizzFunction.apply(1));
        assertEquals("Fizz",fizzBuzz.fizzFunction.apply(3));
        assertEquals("Fizz",fizzBuzz.fizzFunction.apply(31));
    }

    @Test
    public void testBuzz(){
        assertEquals("Buzz",fizzBuzz.buzzFunction.apply(5));
        assertEquals("2",fizzBuzz.buzzFunction.apply(2));
        assertEquals("Buzz",fizzBuzz.fizzFunction.apply(52));
    }

    @Test
    public void testFizzBuzz(){
        assertEquals("1",fizzBuzz.fizzBuzzFunction.apply(1));
        assertEquals("FizzBuzz",fizzBuzz.fizzBuzzFunction.apply(15));
        assertEquals("Fizz",fizzBuzz.fizzBuzzFunction.apply(3));
        assertEquals("Buzz",fizzBuzz.fizzBuzzFunction.apply(5));
        assertEquals("61",fizzBuzz.fizzBuzzFunction.apply(61));
        assertEquals("Buzz",fizzBuzz.fizzBuzzFunction.apply(52));
        assertEquals("Fizz",fizzBuzz.fizzBuzzFunction.apply(31));

    }

}
