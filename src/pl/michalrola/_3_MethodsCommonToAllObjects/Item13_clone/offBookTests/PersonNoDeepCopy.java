package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone.offBookTests;

import java.util.ArrayList;
import java.util.List;

public class PersonNoDeepCopy implements Cloneable {

  private String name;
  private int income;
  private City city; //deep copy
  private Country country; //shallow copy
  private List<City> visitedCity;

  public PersonNoDeepCopy(String name, int income, City city, Country country, List<City> visitedCity) {
    this.name = name;
    this.income = income;
    this.city = city;
    this.country = country;
    this.visitedCity = new ArrayList<>(visitedCity);
  }

  public void addVisitedCity(City city) {
    visitedCity.add(city);
  }

  public void setName(String name) {
    this.name = name;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", income=" + income +
        ", city=" + city +
        ", country=" + country +
        ", visitedCity=" + visitedCity +
        '}';
  }

  @Override
  public PersonNoDeepCopy clone() {
    try {
      return (PersonNoDeepCopy) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError(); // Can't happen
    }
  }

}
