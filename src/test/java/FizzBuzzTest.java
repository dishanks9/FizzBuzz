import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void init(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void divisibleByThreeReturnFizz(){
        assertEquals(fizzBuzz.returnFizzBuzzBynumber(3),"Fizz");
    }

//    @Test
//    public void divisibleByFiveReturnBuzz(){
//        assertEquals(fizzBuzz.returnFizzBuzzBynumber(5),"Buzz");
//    }
//
//    @Test
//    public void divisibleByFifteenReturnBuzz(){
//        assertEquals(fizzBuzz.returnFizzBuzzBynumber(15),"FizzBuzz");
//    }
//
//    @Test
//    public void returnOtherNumbers(){
//        assertEquals(fizzBuzz.returnFizzBuzzBynumber(7),"7");
//    }
//
//    @Test
//    public void returnForZero(){
//        assertEquals(fizzBuzz.returnFizzBuzzBynumber(0),"0");
//    }
}
