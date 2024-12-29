package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.a */
public abstract class C1522a<T> implements C1523b<T> {

    /* renamed from: a */
    protected final DataHolder f2892a;

    @KeepForSdk
    protected C1522a(DataHolder dataHolder) {
        this.f2892a = dataHolder;
    }

    public Iterator<T> iterator() {
        return new C1524c(this);
    }

    public void release() {
        DataHolder dataHolder = this.f2892a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
