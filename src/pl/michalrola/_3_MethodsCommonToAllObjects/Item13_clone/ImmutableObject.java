package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone;

public class ImmutableObject {

  private final int size;
  private final String name;

  public ImmutableObject(int size, String name) {
    this.size = size;
    this.name = name;
  }

  public int getSize() {
    return size;
  }

  public String getName() {
    return name;
  }

  //
  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }
}
