package com.google.android.gms.common;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p032f0.C3155a;
import p032f0.C3157b;
import p109w.C3850k0;
import p109w.C3852l0;

/* renamed from: com.google.android.gms.common.n */
abstract class C0941n extends C3850k0 {

    /* renamed from: a */
    private final int f1106a;

    protected C0941n(byte[] bArr) {
        C0917i.m1410a(bArr.length == 25);
        this.f1106a = Arrays.hashCode(bArr);
    }

    /* renamed from: f */
    protected static byte[] m1525f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: E */
    public final int mo12360E() {
        return this.f1106a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public abstract byte[] mo12361T();

    /* renamed from: b */
    public final C3155a mo12362b() {
        return C3157b.m8427T(mo12361T());
    }

    public final boolean equals(@Nullable Object obj) {
        C3155a b;
        if (obj != null && (obj instanceof C3852l0)) {
            try {
                C3852l0 l0Var = (C3852l0) obj;
                if (l0Var.mo12360E() != this.f1106a || (b = l0Var.mo12362b()) == null) {
                    return false;
                }
                return Arrays.equals(mo12361T(), (byte[]) C3157b.m8428f(b));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1106a;
    }
}
