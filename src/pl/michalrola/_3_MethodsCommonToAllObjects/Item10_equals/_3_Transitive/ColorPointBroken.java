package pl.michalrola._3_MethodsCommonToAllObjects.Item10_equals._3_Transitive;

import java.awt.Color;

public class ColorPointBroken extends Point {

  private final Color color;

  public ColorPointBroken(int x, int y, Color color) {
    super(x, y);
    this.color = color;
  }

  //Broken - violates symmetry
  //name changed to move forward with solution
  public boolean equalsNotSymmetric(Object obj) {
    if (!(obj instanceof ColorPointBroken)) {
      return false;
    }
    return super.equals(obj) && ((ColorPointBroken) obj).color == color;
  }

  //Broken - violates transitivity!

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Point)) {
      return false;
    }
    //If obj is a normal Point, do a color-blind comparison
    if (!(obj instanceof ColorPointBroken)) {
      return obj.equals(this);
    }

    //obj is a ColorPoint; do a full comparison
    return super.equals(obj) && ((ColorPointBroken) obj).color == color;
  }
}
