package pl.michalrola._2_CreatingAndDestroyingObjects.Item5;

import java.util.ArrayList;
import java.util.List;

//Inappropriate use of static utility - inflexible & untestable!
public class SpellCheckerAsUtility {

  private static final Lexicon dictionary = new Lexicon();

  private SpellCheckerAsUtility() {
  }

  public static boolean isValid(String word) {
    return false;
  }

  public static List<String> suggestions(String word) {
    return new ArrayList<>();
  }
}
