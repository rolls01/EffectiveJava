package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone.offBookTests;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    //testing same properties references between original and cloned object
    System.out.println("\n-----------\nCreating 3 persons: first original, second person copy of original person, third to increase counter.");
    PersonNoDeepCopy firstPerson = new PersonNoDeepCopy("Don", 1, new City("London"), new Country("England"), Arrays.asList(new City("Cairo")));
    PersonNoDeepCopy secondPerson = firstPerson.clone();
    PersonNoDeepCopy someRandomPerson = new PersonNoDeepCopy("Don", 1, new City("London"), new Country("England"), Arrays.asList(new City("Cairo")));

    System.out.println("\nPrinting first person and copy");
    System.out.println("first: " + firstPerson);
    System.out.println("copy: " + secondPerson); //have same id as original person - better to have copy constructor!
    System.out.println();

    System.out.println("Actions -> Changing First Person: City, County, add City to List");
    firstPerson.setCity(new City("Rome"));
    firstPerson.setCountry(new Country("Italy"));
    firstPerson.addVisitedCity(new City("Athens"));
    System.out.println("first: " + firstPerson);
    System.out.println("copy: " + secondPerson);
    System.out.println("Results -> object City, Country change in first object Person; List of visited Cities changed in both objects!");
    System.out.println();

    System.out.println("Actions -> Changing Second Person(copy of first): City, County, add City to List");
    secondPerson.setCity(new City("Prague"));
    secondPerson.setCountry(new Country("Czech"));
    firstPerson.addVisitedCity(new City("Berlin"));
    System.out.println("first: " + firstPerson);
    System.out.println("copy: " + secondPerson);
    System.out.println("Results -> object City, Country change in second object Person; List of visited Cities changed in both objects!");

    System.out.println("\nIn the end we can notice that copied object has reference to same list - it's BAD");

    System.out.println("\n---------------------------\nCreating fresh person and copy with correct implemented clone method with deep copy");
    Person firstPersonProper = new Person("Don", 1, new City("London"), new Country("England"), Arrays.asList(new City("Cairo")));
    Person secondPersonProper = firstPersonProper.clone();

    System.out.println("\nPrinting fresh person and copy");
    System.out.println("first: " + firstPersonProper);
    System.out.println("copy: " + secondPersonProper); //have same id as original person - better to have copy constructor!
    System.out.println();

    System.out.println("Actions -> Changing First Person: City, County, add City to List");
    firstPersonProper.setCity(new City("Rome"));
    firstPersonProper.setCountry(new Country("Italy"));
    firstPersonProper.addVisitedCity(new City("Athens"));
    System.out.println("first: " + firstPersonProper);
    System.out.println("copy: " + secondPersonProper);
    System.out.println("Results -> object City, Country change in first object Person; List of visited Cities changed in only firs one - Correct!");
    System.out.println();

    System.out.println("Actions -> Changing Second Person(copy of first): City, County, add City to List");
    secondPersonProper.setCity(new City("Prague"));
    secondPersonProper.setCountry(new Country("Czech"));
    firstPersonProper.addVisitedCity(new City("Berlin"));
    System.out.println("first: " + firstPersonProper);
    System.out.println("copy: " + secondPersonProper);
    System.out.println("Results -> object City, Country change in second object Person; ist of visited Cities changed in only firs one - Correct!");

    System.out.println("Counter still not working properly as we didn't use copy constructor!");

  }

}
