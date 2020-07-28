package pl.michalrola._2_CreatingAndDestroyingObjects.Item2;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Builder pattern for class hierarchies
public abstract class Pizza {

  public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

  final Set<Topping> toppings;

  abstract static class Builder<T extends Builder<T>> {

    private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

    public T addTopping(Topping topping) {
      toppings.add(Objects.requireNonNull(topping));
      return self();
    }

    abstract Pizza build();

    //Subclass must override this method to return "this"
    protected abstract T self();

    public Set<Topping> getToppings() {
      return new HashSet<>(toppings);
    }

  }

  public Pizza(Builder<?> builder) {
    this.toppings = builder.getToppings(); //clone() //item 50
  }
}
