package com.google.android.gms.wearable;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C1548c;
import com.google.android.gms.common.util.VisibleForTesting;
import p011c.p012a.p019b.p028b.p032c.p036d.C0584d;
import p011c.p012a.p019b.p028b.p032c.p036d.C0585e;
import p011c.p012a.p019b.p028b.p032c.p036d.C0599s;

@VisibleForTesting
/* renamed from: com.google.android.gms.wearable.n */
public class C2526n {

    /* renamed from: a */
    private final PutDataRequest f5018a;

    /* renamed from: b */
    private final C2425h f5019b;

    private C2526n(PutDataRequest putDataRequest, C2425h hVar) {
        this.f5018a = putDataRequest;
        C2425h hVar2 = new C2425h();
        this.f5019b = hVar2;
        if (hVar != null) {
            hVar2.mo13234d(hVar);
        }
    }

    /* renamed from: b */
    public static C2526n m8126b(@NonNull String str) {
        C1548c.m4205d(str, "path must not be null");
        return new C2526n(PutDataRequest.m7859Q(str), (C2425h) null);
    }

    /* renamed from: a */
    public PutDataRequest mo13457a() {
        C0585e a = C0584d.m361a(this.f5019b);
        this.f5018a.mo13211T(C0599s.m455d(a.f235a));
        int size = a.f236b.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = a.f236b.get(i);
            if (num == null) {
                String valueOf = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("asset key cannot be null: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (asset == null) {
                String valueOf2 = String.valueOf(num);
                throw new IllegalStateException(valueOf2.length() != 0 ? "asset cannot be null: key=".concat(valueOf2) : new String("asset cannot be null: key="));
            } else {
                if (Log.isLoggable("DataMap", 3)) {
                    String valueOf3 = String.valueOf(asset);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(num).length() + 33 + String.valueOf(valueOf3).length());
                    sb2.append("asPutDataRequest: adding asset: ");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(valueOf3);
                    sb2.toString();
                }
                this.f5018a.mo13210S(num, asset);
                i++;
            }
        }
        return this.f5018a;
    }

    /* renamed from: c */
    public C2425h mo13458c() {
        return this.f5019b;
    }
}
