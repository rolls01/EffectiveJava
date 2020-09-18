package pl.michalrola._4_ClassesAndInterfaces.Item20;

import java.util.Map;
import java.util.Objects;

public class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

	@Override
	public K getKey() {
		throw new UnsupportedOperationException();
	}

	@Override
	public V getValue() {
		throw new UnsupportedOperationException();
	}

	@Override
	public V setValue(V value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(o instanceof Map.Entry)) {
			return false;
		}
		Map.Entry<?, ?> e = (Map.Entry) obj;
		return Objects.equals(e.getKey(), getKey()) && Objects.equals(e.getValue(), getValue());
	}

	@Override
	public String toString() {
		return getKey() + "=" + getValue();
	}
}
