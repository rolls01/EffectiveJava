package pl.michalrola._4_ClassesAndInterfaces.Item18;

import java.util.Collection;
import java.util.Set;

//Wrapper class - uses composition in place of inheritance
//Decorator Pattern
public class InstrumentedSet<E> extends ForwardingSet<E> {

  private int addCount = 0;

  public InstrumentedSet(Set<E> set) {
    super(set);
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
