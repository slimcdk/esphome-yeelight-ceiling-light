package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1592o0;
import com.google.android.gms.common.internal.C1594p0;
import com.google.android.gms.common.internal.C1609u;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p031b.C0564b;

/* renamed from: com.google.android.gms.common.o */
abstract class C1625o extends C1594p0 {

    /* renamed from: a */
    private int f3106a;

    protected C1625o(byte[] bArr) {
        C1609u.m4465a(bArr.length == 25);
        this.f3106a = Arrays.hashCode(bArr);
    }

    /* renamed from: f */
    protected static byte[] m4508f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: D */
    public final C0561a mo11266D() {
        return C0564b.m335f(mo11313e());
    }

    /* renamed from: E */
    public final int mo11267E() {
        return hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract byte[] mo11313e();

    public boolean equals(Object obj) {
        C0561a D;
        if (obj != null && (obj instanceof C1592o0)) {
            try {
                C1592o0 o0Var = (C1592o0) obj;
                if (o0Var.mo11267E() != hashCode() || (D = o0Var.mo11266D()) == null) {
                    return false;
                }
                return Arrays.equals(mo11313e(), (byte[]) C0564b.m334e(D));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f3106a;
    }
}
