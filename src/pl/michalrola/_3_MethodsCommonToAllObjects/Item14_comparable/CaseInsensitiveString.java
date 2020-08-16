package pl.michalrola._3_MethodsCommonToAllObjects.Item14_comparable;

public class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {


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

  @Override
  public int compareTo(CaseInsensitiveString cis) {
    return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
  }
}
