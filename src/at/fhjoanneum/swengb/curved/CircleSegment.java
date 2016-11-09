package at.fhjoanneum.swengb.curved;

/**
 * Created by Nad on 09.11.2016.
 */
public class CircleSegment extends Circle{
    private int alpha;

    public int getAlpha() {
        return alpha;
    }

    @Override
    public double calcArea() {
        return alpha/360;
    }

    public CircleSegment(int x, int y, double radius, int alpha) {
        super(x, y, radius);
        this.alpha = alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CircleSegment that = (CircleSegment) o;

        return alpha == that.alpha;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + alpha;
        return result;
    }
}
