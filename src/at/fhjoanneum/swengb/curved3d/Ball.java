package at.fhjoanneum.swengb.curved3d;

/**
 * Created by Nad on 09.11.2016.
 */
public class Ball extends Curved3d {

    public Ball(int x, int y, int z, int radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calcSurface() {
        return 4*Math.PI*radius*radius;
    }

    public double calcVolume() {
        return (4/3)*Math.PI*radius*radius*radius;
    }


}
