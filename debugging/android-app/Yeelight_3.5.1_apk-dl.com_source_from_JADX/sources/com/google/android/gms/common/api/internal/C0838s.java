package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0722a.C0724b;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.tasks.C1872a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.s */
public abstract class C0838s<A extends C0722a.C0724b, ResultT> {
    @Nullable

    /* renamed from: a */
    private final Feature[] f767a;

    /* renamed from: b */
    private final boolean f768b;

    /* renamed from: c */
    private final int f769c;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.s$a */
    public static class C0839a<A extends C0722a.C0724b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C0826p f770a;

        /* renamed from: b */
        private boolean f771b = true;

        /* renamed from: c */
        private Feature[] f772c;

        /* renamed from: d */
        private int f773d = 0;

        /* synthetic */ C0839a(C0803k2 k2Var) {
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public C0838s<A, ResultT> mo12075a() {
            C0917i.m1411b(this.f770a != null, "execute parameter required");
            return new C0798j2(this, this.f772c, this.f771b, this.f773d);
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: b */
        public C0839a<A, ResultT> mo12076b(@NonNull C0826p<A, C1872a<ResultT>> pVar) {
            this.f770a = pVar;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: c */
        public C0839a<A, ResultT> mo12077c(boolean z) {
            this.f771b = z;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: d */
        public C0839a<A, ResultT> mo12078d(@NonNull Feature... featureArr) {
            this.f772c = featureArr;
            return this;
        }
    }

    @KeepForSdk
    protected C0838s(@Nullable Feature[] featureArr, boolean z, int i) {
        this.f767a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f768b = z2;
        this.f769c = i;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <A extends C0722a.C0724b, ResultT> C0839a<A, ResultT> m1059a() {
        return new C0839a<>((C0803k2) null);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public abstract void mo12017b(@NonNull A a, @NonNull C1872a<ResultT> aVar);

    @KeepForSdk
    /* renamed from: c */
    public boolean mo12072c() {
        return this.f768b;
    }

    /* renamed from: d */
    public final int mo12073d() {
        return this.f769c;
    }

    @Nullable
    /* renamed from: e */
    public final Feature[] mo12074e() {
        return this.f767a;
    }
}
