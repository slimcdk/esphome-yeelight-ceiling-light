package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.common.d */
public final class C0991d extends C0989b {
    C0991d(int i) {
        super(4);
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public final C0991d mo12461c(Object obj) {
        super.mo12460a(obj);
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public final C0991d mo12462d(Iterator it) {
        while (it.hasNext()) {
            super.mo12460a(it.next());
        }
        return this;
    }
}
