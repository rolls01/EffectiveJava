package pl.michalrola._3_MethodsCommonToAllObjects.Item14_comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {


  public static void main(String[] args) {
    int[] a = new int[]{2, 3, 1, 4, 7, 2, 4, 5, 12, 4, 32};

    Arrays.sort(a);

    System.out.println(Arrays.toString(a));

  }

  // BROKEN difference-based comparator - violates transitivity!
  static Comparator<Object> hashCodeOrderBroken = new Comparator<>() {
    public int compare(Object o1, Object o2) {
      return o1.hashCode() - o2.hashCode();
    }
  };

  // Comparator based on static compare method
  static Comparator<Object> hashCodeOrder = new Comparator<>() {
    public int compare(Object o1, Object o2) {
      return Integer.compare(o1.hashCode(), o2.hashCode());
    }
  };

  // Comparator based on Comparator construction method
  static Comparator<Object> hashCodeOrderConstructionMethod =
      Comparator.comparingInt(o -> o.hashCode());


}
