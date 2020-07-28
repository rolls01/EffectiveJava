package pl.michalrola._2_CreatingAndDestroyingObjects.Item2;

import java.util.Objects;

public class NyPizza extends Pizza {



  enum Size {SMALL, MEDIUM, LARGE;}
  private final Size size;

  public static class Builder extends Pizza.Builder<Builder> {

    private final Size size;

    public Builder(Size size) {
      this.size = Objects.requireNonNull(size);
    }

    @Override
    NyPizza build() {
      return new NyPizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }

  }
  public NyPizza(Builder builder) {
    super(builder);
    this.size = builder.size;
  }

  @Override
  public String toString() {
    return "NyPizza{" +
        "size=" + size +
        ", toppings=" + toppings +
        '}';
  }

}
