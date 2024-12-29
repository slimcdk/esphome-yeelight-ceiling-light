package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.q */
abstract class C1004q extends C0995h {

    /* renamed from: a */
    private final int f1220a;

    /* renamed from: b */
    private int f1221b;

    protected C1004q(int i, int i2) {
        C1002o.m1660b(i2, i, "index");
        this.f1220a = i;
        this.f1221b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo12463a(int i);

    public final boolean hasNext() {
        return this.f1221b < this.f1220a;
    }

    public final boolean hasPrevious() {
        return this.f1221b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f1221b;
            this.f1221b = i + 1;
            return mo12463a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f1221b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f1221b - 1;
            this.f1221b = i;
            return mo12463a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f1221b - 1;
    }
}
