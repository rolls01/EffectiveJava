package pl.michalrola._3_MethodsCommonToAllObjects.Item10_equals._3_Transitive;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Liskov broken! The Liskov substitution principle says that any important property of a type should also hold for all it's subtypes so that any method written
 * for the type should work well on its subtypes.
 */

public class CounterPoint extends Point {

  //this important property break Liskov
  private static final AtomicInteger counter = new AtomicInteger();

  public CounterPoint(int x, int y) {
    super(x, y);
  }

  public static int numberCreated() {
    return counter.get();
  }
}

