package at.fhjoanneum.swengb;

import at.fhjoanneum.swengb.GeometricShape.GeometricShape;

/**
 * Created by Nad on 09.11.2016.
 */
public abstract class Dimension3 extends GeometricShape {
    protected int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public abstract double calcSurface();

    public abstract double calcVolume();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dimension3 that = (Dimension3) o;

        return z == that.z;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + z;
        return result;
    }
}
