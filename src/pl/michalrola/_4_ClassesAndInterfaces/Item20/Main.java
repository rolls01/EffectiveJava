package pl.michalrola._4_ClassesAndInterfaces.Item20;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Main {

	// Concrete implementation built atop skeletal implementation AbstractList
	//public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
	//public abstract class AbstractCollection<E> implements Collection<E> {
	//public interface List<E> extends Collection<E> {
	//Adapter example also
	static List<Integer> intArrayAsLost(int[] array) {
		Objects.requireNonNull(array);

		return new AbstractList<Integer>() {
			@Override
			public Integer get(int index) {
				return array[index];
			}

			@Override
			public Integer set(int i, Integer val) {
				int oldVal = array[i];
				array[i] = val;
				return oldVal;
			}

			@Override
			public int size() {
				return array.length;
			}

		};
	}
}
