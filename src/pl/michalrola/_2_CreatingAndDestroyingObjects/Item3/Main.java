package pl.michalrola._2_CreatingAndDestroyingObjects.Item3;

public class Main {

  public static void main(String[] args) {

    Elvis elvisSingleton = Elvis.getInstance();
    Elvis elvisSingletonInstance = Elvis.INSTANCE;

    System.out.println(elvisSingleton == elvisSingletonInstance);
    System.out.println(elvisSingleton == Elvis.INSTANCE);
    System.out.println(elvisSingleton == Elvis.getInstance());

    //Enum Singleton
    EnumSingletonElvis.INSTANCE.leaveTheBuilding();

  }

}
