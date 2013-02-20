/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 2/20/13
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meter {
    private int length;

    public Meter(int length) {
        this.length = length;
    }

    public double getBaseValue(){
        return 1.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meter meter = (Meter) o;

        if (length != meter.length) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (length);
    }
}
