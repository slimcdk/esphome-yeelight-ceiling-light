package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
public interface C1472o0 {
    /* renamed from: a */
    void mo10957a(int i);

    /* renamed from: c */
    void mo10958c(Bundle bundle);

    void connect();

    boolean disconnect();

    /* renamed from: e */
    void mo10961e(ConnectionResult connectionResult, C1382a<?> aVar, boolean z);

    /* renamed from: f */
    <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10962f(T t);

    /* renamed from: g */
    <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10963g(T t);

    /* renamed from: h */
    void mo10964h();
}
