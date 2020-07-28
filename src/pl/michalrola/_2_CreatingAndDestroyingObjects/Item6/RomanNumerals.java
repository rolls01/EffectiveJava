package pl.michalrola._2_CreatingAndDestroyingObjects.Item6;

import java.util.regex.Pattern;

//Reusing expensive object for improved performance

//To improve the performance, explicitly compile the regular expression into a
//Pattern instance (which is immutable) as part of class initialization, cache it, and
//reuse the same instance for every invocation of the isRomanNumeral method:

public class RomanNumerals {

  private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})([XV]|V?I{0,3})$");

  static boolean isRomanNumeral(String s) {
    return ROMAN.matcher(s).matches();
  }

}
