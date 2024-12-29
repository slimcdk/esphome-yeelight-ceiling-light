package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C1518c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1550d;
import com.google.android.gms.common.internal.C1574i;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C1572h<T extends IInterface> extends C1550d<T> implements C1382a.C1390f, C1574i.C1575a {

    /* renamed from: B */
    private final Set<Scope> f3036B;

    /* renamed from: C */
    private final Account f3037C;

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C1572h(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C1564e r13, com.google.android.gms.common.api.C1399f.C1401b r14, com.google.android.gms.common.api.C1399f.C1402c r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.C1577j.m4331a(r10)
            com.google.android.gms.common.c r4 = com.google.android.gms.common.C1518c.m4095q()
            com.google.android.gms.common.internal.C1609u.m4475k(r14)
            r7 = r14
            com.google.android.gms.common.api.f$b r7 = (com.google.android.gms.common.api.C1399f.C1401b) r7
            com.google.android.gms.common.internal.C1609u.m4475k(r15)
            r8 = r15
            com.google.android.gms.common.api.f$c r8 = (com.google.android.gms.common.api.C1399f.C1402c) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1572h.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.f$b, com.google.android.gms.common.api.f$c):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    protected C1572h(Context context, Looper looper, C1577j jVar, C1518c cVar, int i, C1564e eVar, C1399f.C1401b bVar, C1399f.C1402c cVar2) {
        super(context, looper, jVar, cVar, i, m4316k0(bVar), m4317l0(cVar2), eVar.mo11197f());
        this.f3037C = eVar.mo11192a();
        Set<Scope> c = eVar.mo11194c();
        m4318m0(c);
        this.f3036B = c;
    }

    @Nullable
    /* renamed from: k0 */
    private static C1550d.C1551a m4316k0(C1399f.C1401b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C1545a0(bVar);
    }

    @Nullable
    /* renamed from: l0 */
    private static C1550d.C1552b m4317l0(C1399f.C1402c cVar) {
        if (cVar == null) {
            return null;
        }
        return new C1547b0(cVar);
    }

    /* renamed from: m0 */
    private final Set<Scope> m4318m0(@NonNull Set<Scope> set) {
        mo11216j0(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Set<Scope> mo11143D() {
        return this.f3036B;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: j0 */
    public Set<Scope> mo11216j0(@NonNull Set<Scope> set) {
        return set;
    }

    /* renamed from: n */
    public int mo11167n() {
        return super.mo11167n();
    }

    /* renamed from: y */
    public final Account mo11177y() {
        return this.f3037C;
    }
}
