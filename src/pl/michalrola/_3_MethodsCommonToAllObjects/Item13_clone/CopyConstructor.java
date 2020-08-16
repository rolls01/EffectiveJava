package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone;

import java.util.HashSet;
import java.util.Set;

public class CopyConstructor {

  //instead of using clone we recommend use copy constructor or copy factor

  private String name;
  private int age;
  private Set<String> notes;

  public CopyConstructor(String name, int age, Set<String> notes) {
    this.name = name;
    this.age = age;
    this.notes = notes;
  }

  //Copy Constructor
  public CopyConstructor(CopyConstructor copyConstructor) {
    this.name = copyConstructor.name;
    this.age = copyConstructor.age;
    this.notes = new HashSet<>(copyConstructor.notes);
  }

  //Copy factor
  public static CopyConstructor newInstance(CopyConstructor copyConstructor) {
    return new CopyConstructor(copyConstructor);
  }

  @Override
  public String toString() {
    return "CopyConstructor{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", notes=" + notes +
        '}';
  }
}
