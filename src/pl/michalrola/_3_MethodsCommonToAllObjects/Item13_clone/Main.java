package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone;

import java.util.Set;

/**
 * Though the specification doesn’t say it, in practice, a class implementing Cloneable is expected to provide a properly functioning public clone method. In
 * order to achieve this, the class and all of its superclasses must obey a complex, unenforceable, thinly documented protocol. The resulting mechanism is
 * fragile, dangerous, and extralinguistic: it creates objects without calling a constructor. The general contract for the clone method is weak. Here it is,
 * copied from the Object specification : Creates and returns a copy of this object. The precise meaning of “copy” may depend on the class of the object. The
 * general intent is that, for any object x , the expression x.clone() != x will be true , and the expression x.clone().getClass() == x.getClass() will be true
 * , but these are not absolute requirements. While it is typically the case that x.clone().equals(x) will be true , this is not an absolute requirement.
 */
public class Main {

  public static void main(String[] args) {

    //PhoneNumber with Cloneable -> not recommended

    short areaCode = 707;
    short prefix = 867;
    short lineNumber = 5309;

    PhoneNumber phoneNumber = new PhoneNumber(areaCode, prefix, lineNumber);

    System.out.println("The general contract for the clone method is weak.");
    System.out.println("Checking PhoneNumber clone implemented with Cloneable if meets the Object protocol:");
    System.out.println("phoneNumber.clone() != phoneNumber: " + (phoneNumber.clone() != phoneNumber)); //will be true as the are different
    System.out.println("phoneNumber.clone().getClass() == phoneNumber.getClass(): " + (phoneNumber.clone().getClass() == phoneNumber
        .getClass())); //will be true as they are same type, not absolute requirement
    System.out.println("phoneNumber.clone().equals(phoneNumber): " + phoneNumber.clone().equals(phoneNumber));//will be true, not absolute requirement

    //Stack clone override form object

    /**
     * Suppose you want to make this class (Stack) cloneable. If the clone method merely
     * returns super.clone() , the resulting Stack instance will have the correct value in
     * its size field, but its elements field will refer to the same array as the original
     * Stack instance. Modifying the original will destroy the invariants in the clone and
     * vice versa. You will quickly find that your program produces nonsensical results
     * or throws a NullPointerException .
     */

    Stack stackOriginal = new Stack();
    stackOriginal.push("one");
    stackOriginal.push("two");
    stackOriginal.push("three");

    Stack stackCloned = stackOriginal.clone();
    stackCloned.push("four");

    System.out.println(stackOriginal.pop());//three
    System.out.println(stackOriginal.pop());//two
    System.out.println(stackOriginal.pop());//one

    System.out.println(stackCloned.pop());//four
    System.out.println(stackCloned.pop());//null
    System.out.println(stackCloned.pop());//null
    System.out.println(stackCloned.pop());//null

    //we have array same size but no elements just nulls (return (Stack) super.clone();)

    //after making deep copy of elements in stack we have proper values in lust no nulls

    CopyConstructor object = new CopyConstructor("", 1, Set.of("note1, note2"));
    CopyConstructor objectByCopyConstructor = new CopyConstructor(object);
    CopyConstructor objectByCopyFactor = CopyConstructor.newInstance(object);

    System.out.println(object);
    System.out.println(objectByCopyConstructor);
    System.out.println(objectByCopyFactor);
  }

}
