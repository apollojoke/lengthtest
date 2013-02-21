/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 2/20/13
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meter {
    public double length;

    public Meter(double lengthInMeter) {
        this.length = lengthInMeter;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Meter meter = (Meter) o;

        if (length != meter.length) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int)(length);
    }

    public Meter add(Meter num) {
        return new Meter(this.length + num.length);
    }

    public Meter mul(int i) {
        return new Meter(length * i);
    }
}
