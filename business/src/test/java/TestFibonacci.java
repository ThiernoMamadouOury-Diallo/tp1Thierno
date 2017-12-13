import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Assert.*;

import org.junit.Test;

public class TestFibonacci {

    final static Logger logger = Logger.getLogger(TestFibonacci.class);

    Fibonacci fibonacci=new Fibonacci();
    @Test
    public void testFibonacci(){
        int i =fibonacci.fib(5);
        Assert.assertEquals(1, i);
    }
}
