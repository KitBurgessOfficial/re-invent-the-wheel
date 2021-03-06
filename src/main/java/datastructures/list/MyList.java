package datastructures.list;


/**
 * Based on https://en.wikipedia.org/wiki/List_(abstract_data_type)
 *
 * @param <E>
 */
public interface MyList<E> {

    void append(E entry);

    void prepend(E entry);

    int size();

    boolean isempty();

    E getHead();

    E getElement(int index);
}
