package pl.michalrola._3_MethodsCommonToAllObjects.Item10_equals._2_Symmetric;

public class CaseInsensitiveString {

  private final String s;

  public CaseInsensitiveString(String s) {
    this.s = s;
  }

  //To eliminate problem
  @Override
  public boolean equals(Object obj) {
    return obj instanceof CaseInsensitiveString &&
        ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
  }
}
