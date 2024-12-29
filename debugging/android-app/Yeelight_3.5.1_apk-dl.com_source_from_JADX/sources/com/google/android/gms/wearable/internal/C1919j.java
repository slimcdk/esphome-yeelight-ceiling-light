package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.DataApi;
import java.util.List;
import javax.annotation.Nullable;
import p069n0.C3355a;
import p069n0.C3357c;
import p069n0.C3364j;
import p076o0.C3462n0;
import p076o0.C3471q0;

@VisibleForTesting
/* renamed from: com.google.android.gms.wearable.internal.j */
public final class C1919j<T> extends C3471q0 {

    /* renamed from: a */
    private C0793j<? extends DataApi.C1899a> f2995a;

    /* renamed from: b */
    private C0793j<? extends C3364j> f2996b;

    /* renamed from: c */
    private C0793j<? extends C3357c> f2997c;

    /* renamed from: d */
    private C0793j<? extends C3355a> f2998d;

    /* renamed from: e */
    private final IntentFilter[] f2999e;
    @Nullable

    /* renamed from: f */
    private final String f3000f;

    private C1919j(IntentFilter[] intentFilterArr, @Nullable String str) {
        this.f2999e = (IntentFilter[]) C0917i.m1419j(intentFilterArr);
        this.f3000f = str;
    }

    /* renamed from: G0 */
    private static void m5062G0(C0793j<?> jVar) {
        if (jVar != null) {
            jVar.mo12006a();
        }
    }

    /* renamed from: T */
    public static C1919j<C3355a> m5063T(C0793j<? extends C3355a> jVar, IntentFilter[] intentFilterArr) {
        C1919j<C3355a> jVar2 = new C1919j<>(intentFilterArr, (String) null);
        jVar2.f2998d = (C0793j) C0917i.m1419j(jVar);
        return jVar2;
    }

    /* renamed from: e */
    public static C1919j<DataApi.C1899a> m5064e(C0793j<? extends DataApi.C1899a> jVar, IntentFilter[] intentFilterArr) {
        C1919j<DataApi.C1899a> jVar2 = new C1919j<>(intentFilterArr, (String) null);
        jVar2.f2995a = (C0793j) C0917i.m1419j(jVar);
        return jVar2;
    }

    /* renamed from: f */
    public static C1919j<C3364j> m5065f(C0793j<? extends C3364j> jVar, IntentFilter[] intentFilterArr) {
        C1919j<C3364j> jVar2 = new C1919j<>(intentFilterArr, (String) null);
        jVar2.f2996b = (C0793j) C0917i.m1419j(jVar);
        return jVar2;
    }

    /* renamed from: B0 */
    public final void mo14839B0(zzfw zzfw) {
    }

    /* renamed from: D0 */
    public final void mo14840D0() {
        m5062G0(this.f2995a);
        this.f2995a = null;
        m5062G0(this.f2996b);
        this.f2996b = null;
        m5062G0(this.f2997c);
        this.f2997c = null;
        m5062G0(this.f2998d);
        this.f2998d = null;
    }

    /* renamed from: E0 */
    public final IntentFilter[] mo14841E0() {
        return this.f2999e;
    }

    @Nullable
    /* renamed from: F0 */
    public final String mo14842F0() {
        return this.f3000f;
    }

    /* renamed from: H */
    public final void mo14843H(zzfj zzfj, C3462n0 n0Var) {
    }

    /* renamed from: L */
    public final void mo14844L(zzax zzax) {
        C0793j<? extends C3357c> jVar = this.f2997c;
        if (jVar != null) {
            jVar.mo12008c(new C1918i(zzax));
        }
    }

    /* renamed from: S */
    public final void mo14845S(zzi zzi) {
    }

    /* renamed from: p */
    public final void mo14846p(zzfj zzfj) {
        C0793j<? extends C3364j> jVar = this.f2996b;
        if (jVar != null) {
            jVar.mo12008c(new C1917h(zzfj));
        }
    }

    /* renamed from: p0 */
    public final void mo14847p0(zzl zzl) {
    }

    /* renamed from: u */
    public final void mo14848u(List<zzfw> list) {
    }

    /* renamed from: v0 */
    public final void mo14849v0(DataHolder dataHolder) {
        C0793j<? extends DataApi.C1899a> jVar = this.f2995a;
        if (jVar != null) {
            jVar.mo12008c(new C1916g(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    /* renamed from: w0 */
    public final void mo14850w0(zzfw zzfw) {
    }

    /* renamed from: x */
    public final void mo14851x(zzag zzag) {
        C0793j<? extends C3355a> jVar = this.f2998d;
        if (jVar != null) {
            jVar.mo12008c(new C1915f(zzag));
        }
    }
}
