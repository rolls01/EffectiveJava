package pl.michalrola._2_CreatingAndDestroyingObjects.Item5;

public class Main {

  public static void main(String[] args) {
    //wrong approach
//    SpellCheckerAsSingleton
//    SpellCheckerAsUtility
//    Static utility classes and singletons are inappropriate for classes whose behaviour is parameterized by an underlying resource.

    //right approach
//    Simple pattern that satisfies requirements (as multiple instances that resource is desired by the client)
//    is to pass resource into the constructor when creating a new instance

    //one form of dependency injection DI
    //the dictionary is a dependency of spell checker and is injected into the spell checker when it is created


  }

}
