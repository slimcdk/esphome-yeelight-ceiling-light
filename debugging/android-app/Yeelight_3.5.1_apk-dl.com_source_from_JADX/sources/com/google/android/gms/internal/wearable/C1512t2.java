package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.t2 */
public final class C1512t2 extends AbstractList<String> implements RandomAccess, C1536z0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1536z0 f1861a;

    public C1512t2(C1536z0 z0Var) {
        this.f1861a = z0Var;
    }

    /* renamed from: c */
    public final List<?> mo13798c() {
        return this.f1861a.mo13798c();
    }

    /* renamed from: d */
    public final C1536z0 mo13799d() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C1532y0) this.f1861a).get(i);
    }

    public final Iterator<String> iterator() {
        return new C1507s2(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C1497q2(this, i);
    }

    /* renamed from: p */
    public final Object mo13803p(int i) {
        return this.f1861a.mo13803p(i);
    }

    /* renamed from: q */
    public final void mo13804q(zzau zzau) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f1861a.size();
    }
}
