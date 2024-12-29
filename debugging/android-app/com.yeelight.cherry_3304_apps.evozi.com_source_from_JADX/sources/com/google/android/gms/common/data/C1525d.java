package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.C1609u;

@KeepForSdk
/* renamed from: com.google.android.gms.common.data.d */
public class C1525d {
    @KeepForSdk

    /* renamed from: a */
    protected final DataHolder f2895a;
    @KeepForSdk

    /* renamed from: b */
    protected int f2896b;

    /* renamed from: c */
    private int f2897c;

    @KeepForSdk
    public C1525d(DataHolder dataHolder, int i) {
        C1609u.m4475k(dataHolder);
        this.f2895a = dataHolder;
        mo11083d(i);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public byte[] mo11080a(String str) {
        return this.f2895a.mo11062Q(str, this.f2896b, this.f2897c);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public int mo11081b(String str) {
        return this.f2895a.mo11063R(str, this.f2896b, this.f2897c);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: c */
    public String mo11082c(String str) {
        return this.f2895a.mo11066V(str, this.f2896b, this.f2897c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo11083d(int i) {
        C1609u.m4478n(i >= 0 && i < this.f2895a.getCount());
        this.f2896b = i;
        this.f2897c = this.f2895a.mo11067W(i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1525d) {
            C1525d dVar = (C1525d) obj;
            return C1599s.m4388a(Integer.valueOf(dVar.f2896b), Integer.valueOf(this.f2896b)) && C1599s.m4388a(Integer.valueOf(dVar.f2897c), Integer.valueOf(this.f2897c)) && dVar.f2895a == this.f2895a;
        }
    }

    public int hashCode() {
        return C1599s.m4389b(Integer.valueOf(this.f2896b), Integer.valueOf(this.f2897c), this.f2895a);
    }
}
