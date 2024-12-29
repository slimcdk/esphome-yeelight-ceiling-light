package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1393b;
import com.google.android.gms.common.api.C1403g;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.t */
public class C1605t {

    /* renamed from: a */
    private static final C1607b f3081a = new C1549c0();

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.t$a */
    public interface C1606a<R extends C1507j, T> {
        @KeepForSdk
        /* renamed from: a */
        T mo11288a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.t$b */
    public interface C1607b {
        /* renamed from: a */
        C1393b mo11139a(Status status);
    }

    @KeepForSdk
    /* renamed from: a */
    public static <R extends C1507j, T> C0619h<T> m4461a(C1403g<R> gVar, C1606a<R, T> aVar) {
        C1607b bVar = f3081a;
        C0620i iVar = new C0620i();
        gVar.mo10839b(new C1563d0(gVar, iVar, aVar, bVar));
        return iVar.mo8666a();
    }
}
