package at.fhjoanneum.swengb.curved3d;

/**
 * Created by Nad on 09.11.2016.
 */
public class Ellipsoid extends Ball {

    private int b;
    private int c;

    public Ellipsoid(int x, int y, int z, int radius, int b, int c) {
        super(x, y, z, radius);
        this.b = b;
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ellipsoid ellipsoid = (Ellipsoid) o;

        if (b != ellipsoid.b) return false;
        return c == ellipsoid.c;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }

    @Override
    public double calcVolume() {
        return (4/3)*Math.PI*radius*b*c;
    }

    @Override
    public double calcSurface() {


        /*System.out.println((((radius*radius)-(c*c)))/c);

        System.out.println((radius*radius)-(c*c));


        System.out.println((Math.sqrt((radius*radius)-(c*c)))/c);
        System.out.println(asinh((Math.sqrt((radius*radius)-(c*c)))/c));*/
        if (radius < c){
            return 0.0;
        }
        return 2*Math.PI*radius*(radius + ((c*c)/(Math.sqrt((radius*radius)-(c*c))))*asinh((Math.sqrt((radius*radius)-(c*c)))/c));
    }

    static double asinh(double x)
    {
        return Math.log(x + Math.sqrt(x*x + 1.0));
    }
}
