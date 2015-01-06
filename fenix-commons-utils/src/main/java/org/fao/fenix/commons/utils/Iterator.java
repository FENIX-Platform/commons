package org.fao.fenix.commons.utils;

public interface Iterator extends java.util.Iterator {

    /**
     * Try to change cursor position relative to the current one and into available data limits.
     * An UnsupportedOperationException can be thrown if the operation isn't available in the current implementation.
     * @param amount Positive or negative skip amount.
     */
    public void skip(int amount);

    /**
     * Current cursor index position.
     * @return Index position starting from 0.
     */
    public int getIndex();
}
