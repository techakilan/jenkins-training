package hello;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.*;
import org.junit.Test;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

}