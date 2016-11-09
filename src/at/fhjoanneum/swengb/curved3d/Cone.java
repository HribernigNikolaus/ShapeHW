package at.fhjoanneum.swengb.curved3d;

/**
 * Created by Nad on 09.11.2016.
 */
public class Cone extends Ball {

    private int height;

    private int s;

    public Cone(int x, int y, int z, int radius, int height, int s) {
        super(x, y, z, radius);
        this.height = height;
        this.s = s;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (height != cone.height) return false;
        return s == cone.s;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + height;
        result = 31 * result + s;
        return result;
    }

    @Override
    public double calcSurface() {
        return Math.PI*radius*(radius + s);
    }

    @Override
    public double calcVolume() {
        return (1/3)*Math.PI*radius*radius* height;
    }
}
