package tr.edu.gtu.bilmuh.kasimsuzen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * Created by oguzhan on 14/04/16.
 */
public class PriorityArrayList<E extends Comparable<E>> implements PriorityQueueInterface<E> {

    private ArrayList<E> data;
    private Comparator<E> myComp;

    /**
     * Creates a new empty Priority array list
     */
    public PriorityArrayList() {
        this.data = new ArrayList<>();
        myComp = null;
    }

    /**
     * Creates a new empty empty Priority array list using custom comparator
     * @param myComp Custom comparator given from user
     */
    public PriorityArrayList(Comparator<E> myComp) {
        this.data = new ArrayList<>();
        this.myComp = myComp;
    }

    /** Adds new element to end of the vector
     * @param e Element to add to vector without sort
     * @return true on success false on fail
     */
    @Override
    public boolean add(E e) {
        boolean result = this.data.add(e);
            Collections.sort(this.data,Collections.reverseOrder());
        return result;
    }

    /**
     * Adds element to list
     * @param e Element to remove
     * @return true on success false on fail
     */
    @Override
    public boolean offer(E e) {
        return this.add(e);
    }

    /**
     * Removes highest prioritized element from list if there is no element at list then throws exception
     * @return Removed element from list
     * @throws NoSuchElementException
     */
    @Override
    public E remove() {
        E elem = this.poll();
        if (elem == null)
            throw new NoSuchElementException();
        return elem;
    }

    /**
     * Removes highest prioritized element form list without exception throwing
     * @return Removed element from list if there is no element then null returned
     */
    @Override
    public E poll() {
        if (this.isEmpty())
            return null;
        return this.data.remove(0);
    }

    /**
     * Peeks highest prioritized element list if there is no element throws exception
     * @return Highest prioritized element at list
     * @throws NoSuchElementException
     */
    @Override
    public E element() {
        E elem = this.element();
        if (elem == null)
            throw new NoSuchElementException();
        return elem;
    }

    /**
     * Peeks highest prioritized element at listif there is no returns null
     * @return Highest prioritized element at list
     */
    @Override
    public E peek() {
        if (this.isEmpty())
            return null;
        return this.data.get(0);
    }

    /**
     * Returns size of vector
     * @return Size of vector
     */
    @Override
    public int size() {
        return this.data.size();
    }

    /**
     * Checks that if vector is empty is empty returns true else returns false
     * @return True on success false on fail
     */
    @Override
    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
