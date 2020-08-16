package pl.michalrola._3_MethodsCommonToAllObjects.Item14_comparable;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {

  public static void main(String[] args) {
    Set<String> s = new TreeSet<>();
    String[] words = new String[]{"one","two","three","One"};

    Collections.addAll(s, words);

    System.out.println(s);
  }

}
