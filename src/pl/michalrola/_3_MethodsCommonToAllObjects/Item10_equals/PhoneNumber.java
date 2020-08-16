package pl.michalrola._3_MethodsCommonToAllObjects.Item10_equals;

public class PhoneNumber {

  private final short areaCode;
  private final short prefix;
  private final short lineNumber;

  public PhoneNumber(short areaCode, short prefix, short lineNumber) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNumber = lineNumber;
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
}
