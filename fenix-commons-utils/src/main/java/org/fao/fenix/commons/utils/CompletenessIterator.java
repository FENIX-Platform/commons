package org.fao.fenix.commons.utils;

import java.util.Iterator;

public interface  CompletenessIterator<T> extends Iterator<T> {
    int getIndex();
}
