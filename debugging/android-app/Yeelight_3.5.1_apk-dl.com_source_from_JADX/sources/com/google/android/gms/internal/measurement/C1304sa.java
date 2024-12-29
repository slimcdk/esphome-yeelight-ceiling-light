package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.sa */
public final class C1304sa extends AbstractList implements RandomAccess, C1318t8 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1318t8 f1602a;

    public C1304sa(C1318t8 t8Var) {
        this.f1602a = t8Var;
    }

    /* renamed from: a */
    public final C1318t8 mo13347a() {
        return this;
    }

    /* renamed from: c */
    public final List mo13350c() {
        return this.f1602a.mo13350c();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C1302s8) this.f1602a).get(i);
    }

    /* renamed from: i */
    public final Object mo13354i(int i) {
        return this.f1602a.mo13354i(i);
    }

    public final Iterator iterator() {
        return new C1288ra(this);
    }

    /* renamed from: j0 */
    public final void mo13355j0(zzjb zzjb) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator listIterator(int i) {
        return new C1272qa(this, i);
    }

    public final int size() {
        return this.f1602a.size();
    }
}
