package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone.offBookTests;

import java.util.concurrent.atomic.AtomicInteger;

class City implements Cloneable {

  private static final AtomicInteger id = new AtomicInteger(); //cloning don;t increase values here and make it BAD!
  private String name;

  public City(String name) {
    this.name = name;
    this.id.incrementAndGet();
  }

  //works even if not used, might depends on environment
  public City clone() throws CloneNotSupportedException {
    return (City) super.clone();
  }

  @Override
  public String toString() {
    return "City{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
