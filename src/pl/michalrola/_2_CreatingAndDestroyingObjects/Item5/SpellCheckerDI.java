package pl.michalrola._2_CreatingAndDestroyingObjects.Item5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Dependency injection provides flexibility and testability
public class SpellCheckerDI {

  private final Lexicon dictionary;

  public SpellCheckerDI(Lexicon dictionary) {
    this.dictionary = Objects.requireNonNull(dictionary);
  }

  public boolean isValid(String word) {
    return false;
  }

  public List<String> suggestions(String type) {
    return new ArrayList<>();
  }
}
