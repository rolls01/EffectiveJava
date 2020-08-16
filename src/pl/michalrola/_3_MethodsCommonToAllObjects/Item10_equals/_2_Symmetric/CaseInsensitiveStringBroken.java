package pl.michalrola._3_MethodsCommonToAllObjects.Item10_equals._2_Symmetric;

public class CaseInsensitiveStringBroken {

  private final String s;

  public CaseInsensitiveStringBroken(String s) {
    this.s = s;
  }

  //Broken - violates symmetry
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof CaseInsensitiveStringBroken) {
      return s.equalsIgnoreCase(((CaseInsensitiveStringBroken) obj).s);
    }
    if (obj instanceof String) { // One-way interoperability!
      return s.equalsIgnoreCase((String) obj);
    }
    return false;
  }

}
