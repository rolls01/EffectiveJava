package pl.michalrola._3_MethodsCommonToAllObjects.Item10_equals._3_Transitive;

import java.util.Objects;

public class Point {

  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Point)) {
      return false;
    }
    Point p = (Point) obj;
    return p.x == x && p.y == y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x+y);
  }

  //Broken - violates Liskov substitution principle
  //only for same implementation class
  public boolean equalsBrokenLiskov(Object o) {
    if (o == null || o.getClass() != getClass()) {
      return false;
    }
    Point point = (Point) o;
    return point.x == x && point.y == y;
  }

  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}
