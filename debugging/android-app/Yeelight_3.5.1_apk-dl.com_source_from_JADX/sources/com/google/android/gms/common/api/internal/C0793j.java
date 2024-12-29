package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import java.util.concurrent.Executor;
import p024d0.C3123a;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.j */
public final class C0793j<L> {

    /* renamed from: a */
    private final Executor f667a;
    @Nullable

    /* renamed from: b */
    private volatile Object f668b;
    @Nullable

    /* renamed from: c */
    private volatile C0794a f669c;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.j$a */
    public static final class C0794a<L> {

        /* renamed from: a */
        private final Object f670a;

        /* renamed from: b */
        private final String f671b;

        @KeepForSdk
        C0794a(L l, String str) {
            this.f670a = l;
            this.f671b = str;
        }

        @KeepForSdk
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0794a)) {
                return false;
            }
            C0794a aVar = (C0794a) obj;
            return this.f670a == aVar.f670a && this.f671b.equals(aVar.f671b);
        }

        @KeepForSdk
        public int hashCode() {
            return (System.identityHashCode(this.f670a) * 31) + this.f671b.hashCode();
        }
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.j$b */
    public interface C0795b<L> {
        @KeepForSdk
        /* renamed from: a */
        void mo12012a(@NonNull L l);

        @KeepForSdk
        /* renamed from: b */
        void mo12013b();
    }

    @KeepForSdk
    C0793j(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.f667a = new C3123a(looper);
        this.f668b = C0917i.m1420k(l, "Listener must not be null");
        this.f669c = new C0794a(l, C0917i.m1415f(str));
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo12006a() {
        this.f668b = null;
        this.f669c = null;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public C0794a<L> mo12007b() {
        return this.f669c;
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo12008c(@NonNull C0795b<? super L> bVar) {
        C0917i.m1420k(bVar, "Notifier must not be null");
        this.f667a.execute(new C0841s1(this, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12009d(C0795b bVar) {
        Object obj = this.f668b;
        if (obj == null) {
            bVar.mo12013b();
            return;
        }
        try {
            bVar.mo12012a(obj);
        } catch (RuntimeException e) {
            bVar.mo12013b();
            throw e;
        }
    }
}
