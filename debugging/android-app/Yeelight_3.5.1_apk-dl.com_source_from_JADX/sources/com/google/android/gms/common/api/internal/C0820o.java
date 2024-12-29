package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0722a.C0724b;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.tasks.C1872a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.o */
public class C0820o<A extends C0722a.C0724b, L> {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    public final C0815n<A, L> f717a;
    @NonNull

    /* renamed from: b */
    public final C0843t f718b;
    @NonNull

    /* renamed from: c */
    public final Runnable f719c;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.o$a */
    public static class C0821a<A extends C0722a.C0724b, L> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C0826p f720a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C0826p f721b;

        /* renamed from: c */
        private Runnable f722c = C0869z1.f877a;

        /* renamed from: d */
        private C0793j f723d;

        /* renamed from: e */
        private Feature[] f724e;

        /* renamed from: f */
        private boolean f725f = true;

        /* renamed from: g */
        private int f726g;

        /* synthetic */ C0821a(C0761c2 c2Var) {
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public C0820o<A, L> mo12047a() {
            boolean z = true;
            C0917i.m1411b(this.f720a != null, "Must set register function");
            C0917i.m1411b(this.f721b != null, "Must set unregister function");
            if (this.f723d == null) {
                z = false;
            }
            C0917i.m1411b(z, "Must set holder");
            return new C0820o<>(new C0750a2(this, this.f723d, this.f724e, this.f725f, this.f726g), new C0755b2(this, (C0793j.C0794a) C0917i.m1420k(this.f723d.mo12007b(), "Key must not be null")), this.f722c, (C0766d2) null);
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: b */
        public C0821a<A, L> mo12048b(@NonNull C0826p<A, C1872a<Void>> pVar) {
            this.f720a = pVar;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: c */
        public C0821a<A, L> mo12049c(int i) {
            this.f726g = i;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: d */
        public C0821a<A, L> mo12050d(@NonNull C0826p<A, C1872a<Boolean>> pVar) {
            this.f721b = pVar;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: e */
        public C0821a<A, L> mo12051e(@NonNull C0793j<L> jVar) {
            this.f723d = jVar;
            return this;
        }
    }

    /* synthetic */ C0820o(C0815n nVar, C0843t tVar, Runnable runnable, C0766d2 d2Var) {
        this.f717a = nVar;
        this.f718b = tVar;
        this.f719c = runnable;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <A extends C0722a.C0724b, L> C0821a<A, L> m974a() {
        return new C0821a<>((C0761c2) null);
    }
}
