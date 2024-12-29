package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.C2418a;
import com.google.android.gms.wearable.C2420c;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import java.util.List;
import javax.annotation.Nullable;

@VisibleForTesting
/* renamed from: com.google.android.gms.wearable.internal.h2 */
public final class C2458h2<T> extends C2498s0 {

    /* renamed from: a */
    private C1445i<DataApi.C2413a> f4889a;

    /* renamed from: b */
    private C1445i<MessageApi.C2415a> f4890b;

    /* renamed from: c */
    private C1445i<C2420c> f4891c;

    /* renamed from: d */
    private C1445i<C2418a> f4892d;

    /* renamed from: e */
    private final IntentFilter[] f4893e;
    @Nullable

    /* renamed from: f */
    private final String f4894f;

    private C2458h2(IntentFilter[] intentFilterArr, @Nullable String str) {
        C1609u.m4475k(intentFilterArr);
        this.f4893e = intentFilterArr;
        this.f4894f = str;
    }

    /* renamed from: O0 */
    public static C2458h2<MessageApi.C2415a> m7974O0(C1445i<MessageApi.C2415a> iVar, IntentFilter[] intentFilterArr) {
        C2458h2<MessageApi.C2415a> h2Var = new C2458h2<>(intentFilterArr, (String) null);
        C1609u.m4475k(iVar);
        h2Var.f4890b = iVar;
        return h2Var;
    }

    /* renamed from: P0 */
    public static C2458h2<C2418a> m7975P0(C1445i<C2418a> iVar, IntentFilter[] intentFilterArr) {
        C2458h2<C2418a> h2Var = new C2458h2<>(intentFilterArr, (String) null);
        C1609u.m4475k(iVar);
        h2Var.f4892d = iVar;
        return h2Var;
    }

    /* renamed from: e */
    public static C2458h2<DataApi.C2413a> m7976e(C1445i<DataApi.C2413a> iVar, IntentFilter[] intentFilterArr) {
        C2458h2<DataApi.C2413a> h2Var = new C2458h2<>(intentFilterArr, (String) null);
        C1609u.m4475k(iVar);
        h2Var.f4889a = iVar;
        return h2Var;
    }

    /* renamed from: f */
    private static void m7977f(C1445i<?> iVar) {
        if (iVar != null) {
            iVar.mo10948a();
        }
    }

    /* renamed from: C0 */
    public final void mo13317C0(zzl zzl) {
    }

    /* renamed from: I */
    public final void mo13318I(zzfo zzfo) {
    }

    /* renamed from: L */
    public final void mo13319L(zzah zzah) {
        C1445i<C2418a> iVar = this.f4892d;
        if (iVar != null) {
            iVar.mo10950c(new C2474l2(zzah));
        }
    }

    /* renamed from: N0 */
    public final void mo13320N0(List<zzfo> list) {
    }

    /* renamed from: Q0 */
    public final IntentFilter[] mo13321Q0() {
        return this.f4893e;
    }

    @Nullable
    /* renamed from: R0 */
    public final String mo13322R0() {
        return this.f4894f;
    }

    /* renamed from: V */
    public final void mo13323V(zzi zzi) {
    }

    /* renamed from: c */
    public final void mo13324c() {
        m7977f((C1445i<?>) null);
        m7977f((C1445i<?>) null);
        m7977f(this.f4889a);
        this.f4889a = null;
        m7977f(this.f4890b);
        this.f4890b = null;
        m7977f((C1445i<?>) null);
        m7977f((C1445i<?>) null);
        m7977f(this.f4891c);
        this.f4891c = null;
        m7977f(this.f4892d);
        this.f4892d = null;
    }

    /* renamed from: c0 */
    public final void mo13325c0(zzfe zzfe) {
        C1445i<MessageApi.C2415a> iVar = this.f4890b;
        if (iVar != null) {
            iVar.mo10950c(new C2466j2(zzfe));
        }
    }

    /* renamed from: g */
    public final void mo13326g(zzaw zzaw) {
        C1445i<C2420c> iVar = this.f4891c;
        if (iVar != null) {
            iVar.mo10950c(new C2470k2(zzaw));
        }
    }

    /* renamed from: v */
    public final void mo13327v(DataHolder dataHolder) {
        C1445i<DataApi.C2413a> iVar = this.f4889a;
        if (iVar != null) {
            iVar.mo10950c(new C2462i2(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    /* renamed from: w0 */
    public final void mo13328w0(zzfo zzfo) {
    }
}
