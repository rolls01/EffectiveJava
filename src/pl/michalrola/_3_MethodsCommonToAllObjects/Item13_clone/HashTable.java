package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone;

public class HashTable implements Cloneable {

  private Entry[] buckets;

  private static class Entry {

    final Object key;
    Object value;
    Entry next;

    public Entry(Object key, Object value, Entry next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }

    Entry deepCopy() {
//      return new Entry(key, value, next == null ? null : next.deepCopy()); //if list in long can cause stack overflow
      Entry result = new Entry(key, value, next);
      for (Entry entry = result; entry.next != null; entry = entry.next) {
        entry.next = new Entry(entry.next.key, entry.next.value, entry.next.next);
      }
      return result;
    }
  }

  //Broken clone method - result in shared mutable state!
  @Override
  protected Object clone() {
    try {
      HashTable result = (HashTable) super.clone();
      result.buckets = new Entry[buckets.length];
      for (int i = 0; i < buckets.length; i++) {
        if (buckets[i] != null) {
          result.buckets[i] = buckets[i].deepCopy();
        }
        return result;
      }
      return result;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
