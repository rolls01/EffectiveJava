package pl.michalrola._2_CreatingAndDestroyingObjects.Item2;

import pl.michalrola._2_CreatingAndDestroyingObjects.Item2.NyPizza.Size;
import pl.michalrola._2_CreatingAndDestroyingObjects.Item2.Pizza.Topping;

public class Main {

  /**
   * Item 2: Consider a builder when faced with many constructor parameters
   *
   * @param args
   */
  public static void main(String[] args) {
    NutritionFacts cocaCola = new NutritionFacts.Builder(1, 1).calories(1).carbohydrate(1).fat(1).sodium(1).build();

    System.out.println(cocaCola);

    NyPizza nyPizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.HAM).build();

    System.out.println(nyPizza);

    Calzone calzone = new Calzone.Builder().addTopping(Topping.HAM).sauceInside().build();

    System.out.println(calzone);
  }
}
