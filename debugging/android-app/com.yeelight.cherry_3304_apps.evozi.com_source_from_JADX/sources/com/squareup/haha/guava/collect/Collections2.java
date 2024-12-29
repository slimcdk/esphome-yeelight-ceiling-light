package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.util.Collection;
import javax.annotation.Nullable;
import org.apache.commons.p271io.FileUtils;

public final class Collections2 {
    static final Ascii STANDARD_JOINER$5f22bbb7 = new Ascii(", ").useForNull$5f7c8ce0("null");

    static StringBuilder newStringBuilderForCollection(int i) {
        Ascii.checkNonnegative(i, "size");
        return new StringBuilder((int) Math.min(((long) i) << 3, FileUtils.ONE_GB));
    }

    static boolean safeContains(Collection<?> collection, @Nullable Object obj) {
        Ascii.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
