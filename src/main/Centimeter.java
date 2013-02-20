/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 2/20/13
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Centimeter {
    private int length;

    public Centimeter(int length) {
         this.length = length;
    }

    public double getBaseValue(){
        return 0.01;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Centimeter that = (Centimeter) o;

        if (length != that.length) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return length;
    }
}
