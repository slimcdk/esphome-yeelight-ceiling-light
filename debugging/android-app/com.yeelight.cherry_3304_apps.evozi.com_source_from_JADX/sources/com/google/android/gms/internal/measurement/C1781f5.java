package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.f5 */
public final class C1781f5 extends C2091z2<String> implements C1766e5, RandomAccess {

    /* renamed from: c */
    private static final C1781f5 f3348c;

    /* renamed from: b */
    private final List<Object> f3349b;

    static {
        C1781f5 f5Var = new C1781f5();
        f3348c = f5Var;
        f5Var.mo12092t();
    }

    public C1781f5() {
        this(10);
    }

    public C1781f5(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C1781f5(ArrayList<Object> arrayList) {
        this.f3349b = arrayList;
    }

    /* renamed from: d */
    private static String m5106d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C1779f3 ? ((C1779f3) obj).mo11647m() : C1925o4.m5647i((byte[]) obj);
    }

    /* renamed from: D */
    public final List<?> mo11599D() {
        return Collections.unmodifiableList(this.f3349b);
    }

    /* renamed from: a */
    public final /* synthetic */ C1999t4 mo11562a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f3349b);
            return new C1781f5((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo12352c();
        this.f3349b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo12352c();
        if (collection instanceof C1766e5) {
            collection = ((C1766e5) collection).mo11599D();
        }
        boolean addAll = this.f3349b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final Object mo11600b(int i) {
        return this.f3349b.get(i);
    }

    /* renamed from: b0 */
    public final void mo11601b0(C1779f3 f3Var) {
        mo12352c();
        this.f3349b.add(f3Var);
        this.modCount++;
    }

    public final void clear() {
        mo12352c();
        this.f3349b.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f3349b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C1779f3) {
            C1779f3 f3Var = (C1779f3) obj;
            String m = f3Var.mo11647m();
            if (f3Var.mo11648o()) {
                this.f3349b.set(i, m);
            }
            return m;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = C1925o4.m5647i(bArr);
        if (C1925o4.m5646h(bArr)) {
            this.f3349b.set(i, i2);
        }
        return i2;
    }

    /* renamed from: k0 */
    public final C1766e5 mo11602k0() {
        return mo12091C() ? new C1845j7(this) : this;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12352c();
        Object remove = this.f3349b.remove(i);
        this.modCount++;
        return m5106d(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo12352c();
        return m5106d(this.f3349b.set(i, (String) obj));
    }

    public final int size() {
        return this.f3349b.size();
    }
}
