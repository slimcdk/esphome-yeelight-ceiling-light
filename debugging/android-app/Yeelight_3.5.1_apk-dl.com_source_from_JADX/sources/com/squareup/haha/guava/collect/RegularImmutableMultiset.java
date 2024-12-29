package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.collect.Multiset;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

final class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    private final transient ImmutableMap<E, Integer> map;
    private final transient int size = 0;

    RegularImmutableMultiset(ImmutableMap<E, Integer> immutableMap, int i) {
        this.map = immutableMap;
    }

    public final boolean contains(@Nullable Object obj) {
        return this.map.containsKey(obj);
    }

    public final int count(@Nullable Object obj) {
        Integer num = this.map.get(obj);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final /* bridge */ /* synthetic */ Set elementSet() {
        return this.map.keySet();
    }

    /* access modifiers changed from: package-private */
    public final Multiset.Entry<E> getEntry(int i) {
        Map.Entry entry = this.map.entrySet().asList().get(i);
        return Multisets.immutableEntry(entry.getKey(), ((Integer) entry.getValue()).intValue());
    }

    public final int hashCode() {
        return this.map.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return this.map.isPartialView();
    }

    public final int size() {
        return this.size;
    }
}
