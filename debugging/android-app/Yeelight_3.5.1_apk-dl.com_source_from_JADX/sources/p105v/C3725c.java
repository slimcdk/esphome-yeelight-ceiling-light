package p105v;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* renamed from: v.c */
public class C3725c<T> implements Iterator<T> {
    @NonNull

    /* renamed from: a */
    protected final C3724b f6252a;

    /* renamed from: b */
    protected int f6253b = -1;

    public C3725c(@NonNull C3724b bVar) {
        this.f6252a = (C3724b) C0917i.m1419j(bVar);
    }

    public final boolean hasNext() {
        return this.f6253b < this.f6252a.getCount() + -1;
    }

    @NonNull
    public Object next() {
        if (hasNext()) {
            C3724b bVar = this.f6252a;
            int i = this.f6253b + 1;
            this.f6253b = i;
            return bVar.get(i);
        }
        int i2 = this.f6253b;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i2);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
