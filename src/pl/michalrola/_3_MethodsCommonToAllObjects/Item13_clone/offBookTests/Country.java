package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone.offBookTests;

class Country {

  private String name;

  public Country(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Country{" +
        "name='" + name + '\'' +
        '}';
  }
}