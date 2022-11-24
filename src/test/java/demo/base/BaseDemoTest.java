package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_2() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 2;

        assertEquals(expected, baseDemo.sum(1,1));
    }

    @Test
    public void should_return_0() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 0;

        assertEquals(expected, baseDemo.sum(1,-1));
    }


}
