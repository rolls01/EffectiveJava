package pl.michalrola._4_ClassesAndInterfaces.Item17;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.BitSet;

public class Main {

  public static void main(String[] args) {
    Complex complex = Complex.newInstance(0, 0);
    System.out.println(
        complex.plus(
            Complex.newInstance(2, 3.3)
        ).times(
            Complex.newInstance(5, 5)
        )
    );

    /**
     * Not only can you share immutable objects, but they can share their inter-
     * nals. For example, the BigInteger class uses a sign-magnitude representation
     * internally. The sign is represented by an int , and the magnitude is represented by
     * an int array. The negate method produces a new BigInteger of like magnitude
     * and opposite sign. It does not need to copy the array even though it is mutable; the
     * newly created BigInteger points to the same internal array as the original.
     */

    int sign = -1;

    System.out.println(Arrays.toString(BigInteger.valueOf(7).toByteArray()));

    //we can see that there is array and when clone would be possible then we could modify it when not secured - very BAD
    BigInteger signMagnitude = new BigInteger(sign, BigInteger.valueOf(7).toByteArray());

    System.out.println(signMagnitude);

    //we dont have clone fo BigInteger on purpose
    BigInteger copy = signMagnitude.add(BigInteger.ZERO);
    //we cannot change variables and we have new BigInteger (not a clone)
    //still this field points to same array in original one // fro papers
    System.out.println(copy.negate());
    //checking that it is new object and we don't have clone - original didn't change
    System.out.println(copy.add(new BigInteger("1")));
    copy.clearBit(1);
    copy.flipBit(1);
    copy.pow(2);
    copy.shiftLeft(1);
    copy.shiftRight(3);
    copy.setBit(5);

    System.out.println(signMagnitude);

    //costly when changing for example one bit in milion-bit BigInteger object or other immutable big costly object
    BigInteger mobyImmutable = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    mobyImmutable = mobyImmutable.flipBit(0); // costly rewrite whole object

    //solution is mutable object for example
    BitSet mobyMutable = new BitSet(101010100);
    mobyMutable.flip(0);


  }

}
