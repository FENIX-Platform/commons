package org.fao.fenix.commons.utils.database;

public interface Iterator <T> extends java.util.Iterator<T> {

    /**
     * Try to change cursor position relative to the current one and into available data limits.
     * An UnsupportedOperationException can be thrown if the operation isn't available in the current implementation.
     * @param amount Positive skip amount.
     */
    public void skip(int amount);

    /**
     * Current cursor index position.
     * An UnsupportedOperationException can be thrown if the operation isn't available in the current implementation.
     * @return Index position starting from 0.
     */
    public int getIndex();
}
