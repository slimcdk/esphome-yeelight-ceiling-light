package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.j7 */
public final class C1845j7 extends AbstractList<String> implements C1766e5, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1766e5 f3505a;

    public C1845j7(C1766e5 e5Var) {
        this.f3505a = e5Var;
    }

    /* renamed from: D */
    public final List<?> mo11599D() {
        return this.f3505a.mo11599D();
    }

    /* renamed from: b */
    public final Object mo11600b(int i) {
        return this.f3505a.mo11600b(i);
    }

    /* renamed from: b0 */
    public final void mo11601b0(C1779f3 f3Var) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f3505a.get(i);
    }

    public final Iterator<String> iterator() {
        return new C1877l7(this);
    }

    /* renamed from: k0 */
    public final C1766e5 mo11602k0() {
        return this;
    }

    public final ListIterator<String> listIterator(int i) {
        return new C1829i7(this, i);
    }

    public final int size() {
        return this.f3505a.size();
    }
}
