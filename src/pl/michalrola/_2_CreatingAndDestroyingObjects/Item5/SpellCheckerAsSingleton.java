package pl.michalrola._2_CreatingAndDestroyingObjects.Item5;

import java.util.ArrayList;
import java.util.List;

public class SpellCheckerAsSingleton {

  //Inappropriate use of singleton - inflexible & untestable!
  private final Lexicon dictionary = new Lexicon();

  private SpellCheckerAsSingleton() {
  }

  public static SpellCheckerAsSingleton INSTANCE = new SpellCheckerAsSingleton();

  public boolean isValid(String word) {
    return false;
  }

  public List<String> suggestions(String type) {
    return new ArrayList<>();
  }

}
