import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 2/20/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class LengthTest {
    @org.junit.Test
    public void shouldEqualMeter() throws Exception {
        Meter meter = new Meter(1);
        assertThat(meter, is(new Meter(1)));

    }


    @Test
    public void shouldEqualBetweenCentimeter() throws Exception {
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);
        assertThat(centimeter , is(meter));

    }

    @Test
    public void shouldEqualBetweenMillimeter() throws Exception {
        Meter meter = new Meter(1);
        Millimeter millimeter = new Millimeter(1000);
        assertThat(millimeter, is(meter));
    }

    @Test
    public void shouldAddInMeter() throws Exception {
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(2);
        assertThat(meter1.add(meter2), is(new Meter(3)));
    }

    @Test
    public void shouldAddInCentimeter() throws Exception {
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(2);
        System.out.println(centimeter.length);
        assertThat(meter.add(centimeter),is(new Meter(1.02)));
    }

    @Test
    public void shouldMulInMeter() throws Exception {
        Meter meter = new Meter(1);
        assertThat(meter.mul(2),is(new Meter(2)));
    }
}
