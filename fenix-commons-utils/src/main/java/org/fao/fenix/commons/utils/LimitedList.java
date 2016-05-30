package org.fao.fenix.commons.utils;


import javax.ws.rs.NotAcceptableException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LimitedList <T> extends LinkedList<T> {
    private int limit;
    private int size = 0;

    public LimitedList(Collection<T> source, int limit) {
        super();
        this.limit = limit>0 ? limit : Integer.MAX_VALUE;
        addAll(source);
    }


    @Override
    public boolean add(T t) {
        if (++size>limit)
            throw new NotAcceptableException();
        return super.add(t);
    }

    @Override
    public void add(int index, T element) {
        if (++size>limit)
            throw new NotAcceptableException();
        super.add(index, element);
    }

    @Override
    public void addFirst(T t) {
        if (++size>limit)
            throw new NotAcceptableException();
        super.addFirst(t);
    }

    @Override
    public void addLast(T t) {
        if (++size>limit)
            throw new NotAcceptableException();
        super.addLast(t);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (Iterator<? extends T> iterator = c.iterator(); iterator.hasNext(); add(iterator.next()));
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        for (Iterator<? extends T> iterator = c.iterator(); iterator.hasNext(); add(index++, iterator.next()));
        return true;
    }
}
