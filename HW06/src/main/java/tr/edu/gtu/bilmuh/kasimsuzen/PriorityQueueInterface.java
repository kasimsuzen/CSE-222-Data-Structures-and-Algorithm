package tr.edu.gtu.bilmuh.kasimsuzen;


import java.util.NoSuchElementException;

/**
 * Created by oguzhan on 14/04/16.
 */
public interface PriorityQueueInterface<E extends Comparable<E>> {
    boolean add(E e);

    boolean offer(E e);

    E remove() throws NoSuchElementException;

    E poll();

    E element() throws NoSuchElementException;

    E peek();

    int size();

    /**
     * Checks that if vector is empty is empty returns true else returns false
     * @return True on success false on fail
     */
    boolean isEmpty();
}
