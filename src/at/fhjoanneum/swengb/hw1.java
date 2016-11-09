package at.fhjoanneum.swengb;

import at.fhjoanneum.swengb.curved.Circle;
import at.fhjoanneum.swengb.curved.CircleSegment;
import at.fhjoanneum.swengb.curved3d.Ball;
import at.fhjoanneum.swengb.curved3d.Cone;
import at.fhjoanneum.swengb.curved3d.Ellipsoid;
import at.fhjoanneum.swengb.trilateral.RightTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nad on 09.11.2016.
 */
public class hw1 {
    public static void main(String[] args) {
        List<Dimension2> twoDimList = new ArrayList<>();
        List<Dimension3> threeDimList = new ArrayList<>();

        CircleSegment segment1 = new CircleSegment(1,4,3.4,1);
        CircleSegment segment2 = new CircleSegment(1,2,6.4,1);
        CircleSegment segment3 = new CircleSegment(1,2,3.4,8);
        CircleSegment segment4 = new CircleSegment(4,2,3.4,1);

        Circle circle = new Circle(1,2,3.4);

        RightTriangle triangle = new RightTriangle(1,2,2.0,2.0);

        twoDimList.add(segment1);
        twoDimList.add(segment2);
        twoDimList.add(segment3);
        twoDimList.add(segment4);

        twoDimList.add(circle);
        twoDimList.add(triangle);

        Ball ball1 = new Ball(1,2,3,8);
        Ball ball2 = new Ball(3,1,2,2);
        Ball ball3 = new Ball(6,1,2,5);
        Ball ball4 = new Ball(2,2,2,2);

        Cone cone = new Cone(2,4,2,3,2,1);

        Ellipsoid elli = new Ellipsoid(4,3,5,9,8,6);


        threeDimList.add(ball1);
        threeDimList.add(ball2);
        threeDimList.add(ball3);
        threeDimList.add(ball4);

        threeDimList.add(cone);

        threeDimList.add(elli);

        System.out.println("------ Dimension 2 -------");
        double dimensionTwoArea = 0.0;
        double dimensionTwoPerimeter = 0.0;

        for (Dimension2 dimension2 : twoDimList) {
            dimensionTwoArea += dimension2.calcArea();
            dimensionTwoPerimeter += dimension2.calcPerimeter();
        }

        System.out.println("The overall area is: " + dimensionTwoArea + " The overall Perimeter is: " + dimensionTwoPerimeter);

        System.out.println("----- Dimension 3 --------");

        double dimensionThreeSurface = 0.0;
        double dimensionThreeVolume = 0.0;

        for (Dimension3 dimension3 : threeDimList) {
            dimensionThreeSurface += dimension3.calcSurface();
            dimensionThreeVolume += dimension3.calcVolume();
        }

        System.out.println("The overall surface is: " + dimensionThreeSurface + " The overall volume is: " + dimensionThreeVolume);

    }
}
