package pl.michalrola._4_ClassesAndInterfaces.Item18;

import java.util.Collection;
import java.util.HashSet;

//Broken - Inappropriate use of inheritance
public class InstrumentHashSet<E> extends HashSet<E> {

  // The number of attempted element insertion
  private int addCount = 0;

  public InstrumentHashSet() {
  }

  public InstrumentHashSet(int initCap, float loadFactor) {
    super(initCap, loadFactor);
  }

  @Override
  public boolean add(E e) {
    addCount++;
    return super.add(e);
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    addCount += c.size();
    return super.addAll(c);
  }

  public int getAddCount() {
    return addCount;
  }
}
