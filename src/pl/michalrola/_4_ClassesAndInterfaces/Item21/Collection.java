package pl.michalrola._4_ClassesAndInterfaces.Item21;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;

public interface Collection<E> extends java.util.Collection {
    default boolean removeIf(Predicate filter) {
        Objects.requireNonNull(filter);

        boolean result = false;
        for (Iterator<E> it = iterator(); it.hasNext(); ) {
            if (filter.test(it.next())) {
                it.remove();
                result = true;
            }
        }
        return result;
    }
}
