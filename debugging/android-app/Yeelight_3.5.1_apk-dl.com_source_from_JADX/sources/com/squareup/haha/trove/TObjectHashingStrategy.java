package com.squareup.haha.trove;

import java.io.Serializable;

public interface TObjectHashingStrategy<T> extends Serializable {
    int computeHashCode(T t);

    boolean equals(T t, T t2);
}
