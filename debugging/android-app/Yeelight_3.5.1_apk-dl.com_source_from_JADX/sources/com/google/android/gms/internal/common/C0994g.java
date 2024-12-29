package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.g */
public abstract class C0994g implements Iterator {
    protected C0994g() {
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
