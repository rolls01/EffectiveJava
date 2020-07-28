package pl.michalrola._2_CreatingAndDestroyingObjects.Item7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackMemoryLeak {

  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public StackMemoryLeak() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(Object element) {
    ensureCapacity();
    elements[size++] = element;
  }

  public Object pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    Object object = elements[--size];
    elements[size] = null; //Eliminate obsolete reference
    return object;
  }

  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }

  public int stackSize(){
    return size;
  }

  public int stackElementLength(){
    return elements.length;
  }

}
