package com.kelemengergo.javaexercise.Josephus_permutation;

import java.util.Iterator;
import java.util.List;

/**
 * Created by keli on 2017.08.09..
 */
public class CircularIterator<T> implements Iterator<T> {

    private List<T> list;
    private Iterator<T> iterator;

    public CircularIterator(List<T> list){
        this.list = list;
        this.iterator = list.iterator();
    }

    @Override
    public void remove() {
        this.iterator.remove();
    }

    @Override
    public boolean hasNext() {
        if (list.size() > 1){
            return true;
        }
        else return false;
    }

    @Override
    public T next() {
        if (!iterator.hasNext()) {
            iterator = list.iterator();
        }
        return iterator.next();
    }
}
