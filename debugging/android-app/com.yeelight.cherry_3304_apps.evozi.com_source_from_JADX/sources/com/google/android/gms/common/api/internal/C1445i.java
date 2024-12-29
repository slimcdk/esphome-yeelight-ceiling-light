package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.internal.base.C1697h;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.i */
public final class C1445i<L> {

    /* renamed from: a */
    private final C1448c f2697a;

    /* renamed from: b */
    private volatile L f2698b;

    /* renamed from: c */
    private final C1446a<L> f2699c;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.i$a */
    public static final class C1446a<L> {

        /* renamed from: a */
        private final L f2700a;

        /* renamed from: b */
        private final String f2701b;

        @KeepForSdk
        C1446a(L l, String str) {
            this.f2700a = l;
            this.f2701b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1446a)) {
                return false;
            }
            C1446a aVar = (C1446a) obj;
            return this.f2700a == aVar.f2700a && this.f2701b.equals(aVar.f2701b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f2700a) * 31) + this.f2701b.hashCode();
        }
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.i$b */
    public interface C1447b<L> {
        @KeepForSdk
        /* renamed from: a */
        void mo10954a(L l);

        @KeepForSdk
        /* renamed from: b */
        void mo10955b();
    }

    /* renamed from: com.google.android.gms.common.api.internal.i$c */
    private final class C1448c extends C1697h {
        public C1448c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C1609u.m4465a(z);
            C1445i.this.mo10951d((C1447b) message.obj);
        }
    }

    @KeepForSdk
    C1445i(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.f2697a = new C1448c(looper);
        C1609u.m4476l(l, "Listener must not be null");
        this.f2698b = l;
        C1609u.m4471g(str);
        this.f2699c = new C1446a<>(l, str);
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo10948a() {
        this.f2698b = null;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public final C1446a<L> mo10949b() {
        return this.f2699c;
    }

    @KeepForSdk
    /* renamed from: c */
    public final void mo10950c(C1447b<? super L> bVar) {
        C1609u.m4476l(bVar, "Notifier must not be null");
        this.f2697a.sendMessage(this.f2697a.obtainMessage(1, bVar));
    }

    /* access modifiers changed from: package-private */
    @KeepForSdk
    /* renamed from: d */
    public final void mo10951d(C1447b<? super L> bVar) {
        L l = this.f2698b;
        if (l == null) {
            bVar.mo10955b();
            return;
        }
        try {
            bVar.mo10954a(l);
        } catch (RuntimeException e) {
            bVar.mo10955b();
            throw e;
        }
    }
}
