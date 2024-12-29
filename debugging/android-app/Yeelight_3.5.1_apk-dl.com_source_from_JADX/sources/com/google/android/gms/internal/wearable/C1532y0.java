package com.google.android.gms.internal.wearable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.y0 */
public final class C1532y0 extends C1444g<String> implements RandomAccess, C1536z0 {

    /* renamed from: c */
    private static final C1532y0 f1879c;

    /* renamed from: b */
    private final List<Object> f1880b;

    static {
        C1532y0 y0Var = new C1532y0(10);
        f1879c = y0Var;
        y0Var.mo13628D();
    }

    public C1532y0() {
        this(10);
    }

    public C1532y0(int i) {
        this.f1880b = new ArrayList(i);
    }

    private C1532y0(ArrayList<Object> arrayList) {
        this.f1880b = arrayList;
    }

    /* renamed from: g */
    private static String m3961g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzau ? ((zzau) obj).zzo(C1524w0.f1867a) : C1524w0.m3860d((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo13630b();
        this.f1880b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo13630b();
        if (collection instanceof C1536z0) {
            collection = ((C1536z0) collection).mo13798c();
        }
        boolean addAll = this.f1880b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public final List<?> mo13798c() {
        return Collections.unmodifiableList(this.f1880b);
    }

    public final void clear() {
        mo13630b();
        this.f1880b.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final C1536z0 mo13799d() {
        return zza() ? new C1512t2(this) : this;
    }

    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f1880b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzau) {
            zzau zzau = (zzau) obj;
            String zzo = zzau.zzo(C1524w0.f1867a);
            if (zzau.zzi()) {
                this.f1880b.set(i, zzo);
            }
            return zzo;
        }
        byte[] bArr = (byte[]) obj;
        String d = C1524w0.m3860d(bArr);
        if (C1524w0.m3859c(bArr)) {
            this.f1880b.set(i, d);
        }
        return d;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1515u0 mo13609h(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f1880b);
            return new C1532y0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public final Object mo13803p(int i) {
        return this.f1880b.get(i);
    }

    /* renamed from: q */
    public final void mo13804q(zzau zzau) {
        mo13630b();
        this.f1880b.add(zzau);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13630b();
        Object remove = this.f1880b.remove(i);
        this.modCount++;
        return m3961g(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo13630b();
        return m3961g(this.f1880b.set(i, (String) obj));
    }

    public final int size() {
        return this.f1880b.size();
    }
}
