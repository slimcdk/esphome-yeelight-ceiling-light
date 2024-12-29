package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.q */
abstract class C1627q extends C1625o {

    /* renamed from: c */
    private static final WeakReference<byte[]> f3108c = new WeakReference<>((Object) null);

    /* renamed from: b */
    private WeakReference<byte[]> f3109b = f3108c;

    C1627q(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public abstract byte[] mo11316O0();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final byte[] mo11313e() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f3109b.get();
            if (bArr == null) {
                bArr = mo11316O0();
                this.f3109b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
