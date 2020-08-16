package pl.michalrola._3_MethodsCommonToAllObjects.Item10_equals._3_Transitive;

import java.awt.Color;
import java.util.Set;

public class Main {

  //for broken Liskov substitution
  private static final Set<Point> unitCircle = Set.of(
      new Point(1, 0),
      new Point(0, 1),
      new Point(-1, 0),
      new Point(0, -1),
      new CounterPoint(2, 0)
  );

  public static boolean onUnitCircle(Point p) {
    return unitCircle.contains(p);
  }

  public static void main(String[] args) {

    System.out.println("Not symmetric");
    Point point1 = new Point(1, 2);
    ColorPointBroken colorPointBroken1 = new ColorPointBroken(1, 2, Color.RED);

    System.out.println("point1.equals(colorPoint1): " + point1.equals(colorPointBroken1));
    System.out.println("colorPoint1.equals(point1): " + colorPointBroken1.equalsNotSymmetric(point1));

    System.out.println("\nNot Transitive");
    ColorPointBroken p1 = new ColorPointBroken(1, 2, Color.RED);
    Point p2 = new Point(1, 2);
    ColorPointBroken p3 = new ColorPointBroken(1, 2, Color.BLUE);

    System.out.println("p1.equals(p2): " + p1.equals(p2));
    System.out.println("p2.equals(p3): " + p2.equals(p3));
    System.out.println("p1.equals(p3): " + p1.equals(p3));

    /**
     * There is no way to extend an
     * instantiable class and add a value component
     * while preserving the equals contract
     */

    //remember to override equals + hashCode
    System.out.println("\nonUnitCircle");
    System.out.println(onUnitCircle(new Point(1, 0)));//true
    System.out.println(onUnitCircle(new Point(0, 1)));//true
    System.out.println(onUnitCircle(new Point(-1, 0)));//true
    System.out.println(onUnitCircle(new Point(0, -1)));//true

    //to test
    System.out.println(onUnitCircle(new Point(0, 0)));//false
    System.out.println(onUnitCircle(new Point(2, 2)));//false

    System.out.println(onUnitCircle(new Point(2, 0)));//true -> getClass() in Point().equalsBrokenLiskov will return false and break it
    System.out.println(onUnitCircle(new CounterPoint(2, 0)));//true


  }

}
