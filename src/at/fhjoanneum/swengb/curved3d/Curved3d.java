package at.fhjoanneum.swengb.curved3d;

import at.fhjoanneum.swengb.Dimension3;

/**
 * Created by Nad on 09.11.2016.
 */
public abstract class Curved3d extends Dimension3{
    protected int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Curved3d curved3d = (Curved3d) o;

        return radius == curved3d.radius;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + radius;
        return result;
    }
}
