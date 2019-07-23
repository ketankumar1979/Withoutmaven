package ketanselanium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetValueTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("before test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after test");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
}