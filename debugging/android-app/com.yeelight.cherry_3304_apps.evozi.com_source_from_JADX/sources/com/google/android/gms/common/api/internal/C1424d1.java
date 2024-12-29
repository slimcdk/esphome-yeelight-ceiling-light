package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.d1 */
public interface C1424d1 {
    /* renamed from: b */
    void mo10897b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void connect();

    /* renamed from: d */
    void mo10899d();

    void disconnect();

    /* renamed from: f */
    <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10901f(@NonNull T t);

    /* renamed from: g */
    <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10902g(@NonNull T t);

    boolean isConnected();
}
