package pl.michalrola._4_ClassesAndInterfaces.Item24;

import java.util.AbstractSet;
import java.util.Iterator;

public class MySet<E> extends AbstractSet {

	@Override
	public Iterator iterator() {
		return new MyIterator();
	}

	@Override
	public int size() {
		return 0;
	}

	private class MyIterator implements Iterator {

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public Object next() {
			return null;
		}
	}
}
