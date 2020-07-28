package pl.michalrola._2_CreatingAndDestroyingObjects.Item4;

public class UtilityClass {

  private UtilityClass() {
    throw new AssertionError();
  }

  public static void utilityAction() {
  }

  public static void willFailAsShould() {
    new UtilityClass();
  }

}
