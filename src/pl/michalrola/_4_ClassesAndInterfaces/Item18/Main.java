package pl.michalrola._4_ClassesAndInterfaces.Item18;

import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  private static final int INIT_CAPACITY = 16;

  public static void main(String[] args) {
    InstrumentHashSet<String> stringInstrumentHashSet = new InstrumentHashSet<>();
    stringInstrumentHashSet.addAll(List.of("One", "Two", "Three"));
    System.out.println("Should return 3 result is: " + stringInstrumentHashSet.getAddCount()); // returns 6 - BAD

    //example of using ForwardingSet and InstrumentedSet - composition - GREAT solution!


    //we can use different implementation of Set with ForwardingSet
    Set<Instant> instants = new ForwardingSet<>(new TreeSet<>());

//    Set<E> s = new InstrumentedSet<>(new HashSet<>(INIT_CAPACITY))]

  }

  // Disadvantage:
  // not suited for callback frameworks
  // aka "SELF problem"

  static void walk(Set<Dog> dogs) {
    InstrumentedSet<Dog> iDogs = new InstrumentedSet<>(dogs); //Decorator pattern!
  }
}
