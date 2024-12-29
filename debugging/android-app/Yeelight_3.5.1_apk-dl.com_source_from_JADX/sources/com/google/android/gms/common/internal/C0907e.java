package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0721a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C0773f;
import com.google.android.gms.common.api.internal.C0810m;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p109w.C3858r;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.e */
public abstract class C0907e<T extends IInterface> extends C0897c<T> implements C0722a.C0730f, C3858r {

    /* renamed from: Q */
    private final Set f1016Q;
    @Nullable

    /* renamed from: R */
    private final Account f1017R;

    @KeepForSdk
    @Deprecated
    protected C0907e(@NonNull Context context, @NonNull Looper looper, int i, @NonNull C0904d dVar, @NonNull C0736d.C0738b bVar, @NonNull C0736d.C0739c cVar) {
        this(context, looper, i, dVar, (C0773f) bVar, (C0810m) cVar);
    }

    @KeepForSdk
    protected C0907e(@NonNull Context context, @NonNull Looper looper, int i, @NonNull C0904d dVar, @NonNull C0773f fVar, @NonNull C0810m mVar) {
        this(context, looper, C0909f.m1388b(context), C0721a.m617p(), i, dVar, (C0773f) C0917i.m1419j(fVar), (C0810m) C0917i.m1419j(mVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0907e(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull android.os.Looper r12, @androidx.annotation.NonNull com.google.android.gms.common.internal.C0909f r13, @androidx.annotation.NonNull com.google.android.gms.common.C0721a r14, int r15, @androidx.annotation.NonNull com.google.android.gms.common.internal.C0904d r16, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.C0773f r17, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.C0810m r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.l r3 = new com.google.android.gms.common.internal.l
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.m r0 = new com.google.android.gms.common.internal.m
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo12251h()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r0 = r16.mo12244a()
            r9.f1017R = r0
            java.util.Set r0 = r16.mo12246c()
            java.util.Set r0 = r10.m1371m0(r0)
            r9.f1016Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0907e.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.f, com.google.android.gms.common.a, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.m):void");
    }

    /* renamed from: m0 */
    private final Set m1371m0(@NonNull Set set) {
        Set<Scope> l0 = mo12261l0(set);
        for (Scope contains : l0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return l0;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: E */
    public final Set<Scope> mo12196E() {
        return this.f1016Q;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Set<Scope> mo11830b() {
        return mo12230q() ? this.f1016Q : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: l0 */
    public Set<Scope> mo12261l0(@NonNull Set<Scope> set) {
        return set;
    }

    @Nullable
    /* renamed from: w */
    public final Account mo12235w() {
        return this.f1017R;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: y */
    public final Executor mo12237y() {
        return null;
    }
}
