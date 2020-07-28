package pl.michalrola._2_CreatingAndDestroyingObjects.Item6;

public class Main {

  public static void main(String[] args) {

    String createsInstances = new String("bikini"); //DON'T DO THIS

    String stringPool = "bikini";

    //String matches is slow
    System.out.println("Simple string matcher");
    long startTime = System.nanoTime();

    System.out.println(isRomanNumeral("XVIII"));
    ;

    long endTime = System.nanoTime();
    double duration = (endTime - startTime) / 1000000.0;
    System.out.println(duration);
    //-------------------------------------

    //uses Pattern instance which is immutable and can be reused
    System.out.println("Pattern and immutable matcher");
    startTime = System.nanoTime();

    System.out.println(RomanNumerals.isRomanNumeral("XVIII"));

    endTime = System.nanoTime();
    duration = (endTime - startTime) / 1000000;
    System.out.println(duration);
    //-------------------------------------

    System.out.println("Long vs long");
    //Autoboxing blurs but does not erase the distinction between primitive and boxed primitive types
    System.out.println("Long");
    startTime = System.nanoTime();

    System.out.println(sumLong());

    endTime = System.nanoTime();
    duration = (endTime - startTime) / 1000000;
    System.out.println(duration);

    System.out.println("long");
    startTime = System.nanoTime();

    System.out.println(sum_long());

    endTime = System.nanoTime();
    duration = (endTime - startTime) / 1000000;
    System.out.println(duration);

    //-------------------------------------
  }

  //Performance can be greatly improved!
  //  The problem with this implementation is that it relies on the String.matches
  // method. While String.matches is the easiest way to check if a string matches
  // a regular expression, it’s not suitable for repeated use in performance-critical situations.`

  static boolean isRomanNumeral(String s) {
    return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})([XV]|V?I{0,3})$");
  }

  //Hideously slow! Can you spot the object creation?
  private static long sumLong() {
    Long sum = 0L;
    for (long i = 0; i <= Integer.MAX_VALUE; i++) {
      sum += i;
    }
    return sum;
  }

  private static long sum_long() {
    long sum = 0L;
    for (long i = 0; i <= Integer.MAX_VALUE; i++) {
      sum += i;
    }
    return sum;
  }

}
