package pl.michalrola._3_MethodsCommonToAllObjects.Item14_comparable;

import java.util.Comparator;

public class PhoneNumber implements Comparable<PhoneNumber> {

  private final short areaCode;
  private final short prefix;
  private final short lineNumber;
  private int hashCode;

  public PhoneNumber(short areaCode, short prefix, short lineNumber) {
    this.areaCode = rangeCheck(areaCode, 999, "areaCode");
    this.prefix = rangeCheck(prefix, 999, "prefix");
    this.lineNumber = rangeCheck(lineNumber, 9999, "lineNumber");
  }

  public static PhoneNumber create(short areaCode, short prefix, short lineNumber) {
    return new PhoneNumber(areaCode, prefix, lineNumber);
  }

  private static short rangeCheck(int val, int max, String arg) {
    if (val < 0 || val > max) {
      throw new IllegalArgumentException(arg + ": " + val);
    }
    return (short) val;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof PhoneNumber)) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) obj;
    return phoneNumber.lineNumber == lineNumber &&
        phoneNumber.prefix == prefix &&
        phoneNumber.areaCode == areaCode;
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = Short.hashCode(areaCode);
      result = 31 + result + Short.hashCode(prefix);
      result = 31 + result + Short.hashCode(lineNumber);
      hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    return "PhoneNumber{" +
        "areaCode=" + areaCode +
        ", prefix=" + prefix +
        ", lineNumber=" + lineNumber +
        ", hashCode=" + hashCode +
        '}';
  }

  //Java 7
//  @Override
//  public int compareTo(PhoneNumber phoneNumber) {
//    int result = Short.compare(areaCode, phoneNumber.areaCode);
//    if (result == 0) {
//      result = Short.compare(prefix, phoneNumber.prefix);
//      if (result == 0) {
//        result = Short.compare(lineNumber, phoneNumber.lineNumber);
//      }
//    }
//    return result;
//  }

  //Java 8

  private static final Comparator<PhoneNumber> COMPARATOR =
      Comparator.comparingInt((PhoneNumber phoneNumber) -> phoneNumber.areaCode)
          .thenComparing(phoneNumber -> phoneNumber.prefix)
          .thenComparing(phoneNumber -> phoneNumber.lineNumber);

  @Override
  public int compareTo(PhoneNumber phoneNumber) {
    return COMPARATOR.compare(this, phoneNumber);
  }
}
