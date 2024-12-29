package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.p */
abstract class C0943p extends C0941n {

    /* renamed from: c */
    private static final WeakReference f1108c = new WeakReference((Object) null);

    /* renamed from: b */
    private WeakReference f1109b = f1108c;

    C0943p(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public abstract byte[] mo12344D0();

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final byte[] mo12361T() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f1109b.get();
            if (bArr == null) {
                bArr = mo12344D0();
                this.f1109b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
