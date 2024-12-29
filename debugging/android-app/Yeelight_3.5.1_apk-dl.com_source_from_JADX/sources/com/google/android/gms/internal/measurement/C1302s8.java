package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.s8 */
public final class C1302s8 extends C1406z6 implements RandomAccess, C1318t8 {

    /* renamed from: c */
    private static final C1302s8 f1600c;

    /* renamed from: b */
    private final List f1601b;

    static {
        C1302s8 s8Var = new C1302s8(10);
        f1600c = s8Var;
        s8Var.mo13071D();
    }

    public C1302s8() {
        this(10);
    }

    public C1302s8(int i) {
        this.f1601b = new ArrayList(i);
    }

    private C1302s8(ArrayList arrayList) {
        this.f1601b = arrayList;
    }

    /* renamed from: g */
    private static String m2930g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzjb ? ((zzjb) obj).zzn(C1270q8.f1555a) : C1270q8.m2549h((byte[]) obj);
    }

    /* renamed from: a */
    public final C1318t8 mo13347a() {
        return mo13072E() ? new C1304sa(this) : this;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo13526b();
        this.f1601b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo13526b();
        if (collection instanceof C1318t8) {
            collection = ((C1318t8) collection).mo13350c();
        }
        boolean addAll = this.f1601b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public final List mo13350c() {
        return Collections.unmodifiableList(this.f1601b);
    }

    public final void clear() {
        mo13526b();
        this.f1601b.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f1601b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjb) {
            zzjb zzjb = (zzjb) obj;
            String zzn = zzjb.zzn(C1270q8.f1555a);
            if (zzjb.zzi()) {
                this.f1601b.set(i, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String h = C1270q8.m2549h(bArr);
        if (C1270q8.m2550i(bArr)) {
            this.f1601b.set(i, h);
        }
        return h;
    }

    /* renamed from: i */
    public final Object mo13354i(int i) {
        return this.f1601b.get(i);
    }

    /* renamed from: j0 */
    public final void mo13355j0(zzjb zzjb) {
        mo13526b();
        this.f1601b.add(zzjb);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13526b();
        Object remove = this.f1601b.remove(i);
        this.modCount++;
        return m2930g(remove);
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C1254p8 mo12539s(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f1601b);
            return new C1302s8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo13526b();
        return m2930g(this.f1601b.set(i, (String) obj));
    }

    public final int size() {
        return this.f1601b.size();
    }
}
