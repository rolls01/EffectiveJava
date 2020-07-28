package pl.michalrola._2_CreatingAndDestroyingObjects.Item1;

public class Main {

  /**
   * Item 1: Consider static factory methods instead of constructor.
   *
   * adv:
   * Unliike constructors they have names
   * @param args
   */
  public static void main(String[] args) {

    Boolean asFactoryMethod = CustomBoolean.valueOf(true);
    System.out.println(asFactoryMethod);

  }
}
