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
//        Meter meter = new Meter(1);
//        Centimeter centimeter = new Centimeter(100);
//        double meterValue;
//        meterValue = meter.getBaseValue();
//        meterValue = meter.length * meterValue;
//
//        assertThat(centimeter * centimeter.getBaseValue() , is(meter));

    }
}
