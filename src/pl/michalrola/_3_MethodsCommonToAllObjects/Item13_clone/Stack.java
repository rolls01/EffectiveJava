package pl.michalrola._3_MethodsCommonToAllObjects.Item13_clone;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable{

  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public Stack() {
    this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public Object[] getElements() {
    return elements;
  }

  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  public Object pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    Object result = elements[--size];
    elements[size] = null; // Eliminate obsolete reference
    return result;
  }

  // Ensure space for at least one more element.
  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }

  @Override public Stack clone() {
    try {
//      return (Stack) super.clone();//no deep copy, just same size of array
      Stack stack = (Stack) super.clone();
      stack.elements = elements.clone();
      return stack;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError(); // Can't happen
    }
  }

}
