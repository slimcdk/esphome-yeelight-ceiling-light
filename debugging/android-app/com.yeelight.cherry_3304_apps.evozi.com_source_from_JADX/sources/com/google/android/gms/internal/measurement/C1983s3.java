package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;

/* renamed from: com.google.android.gms.internal.measurement.s3 */
final class C1983s3 extends C1952q3 {

    /* renamed from: a */
    private int f3709a;

    /* renamed from: b */
    private int f3710b;

    /* renamed from: c */
    private int f3711c;

    /* renamed from: d */
    private int f3712d;

    /* renamed from: e */
    private int f3713e;

    private C1983s3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f3713e = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f3709a = i2 + i;
        this.f3711c = i;
        this.f3712d = i;
    }

    /* renamed from: f */
    private final void m5939f() {
        int i = this.f3709a + this.f3710b;
        this.f3709a = i;
        int i2 = i - this.f3712d;
        int i3 = this.f3713e;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f3710b = i4;
            this.f3709a = i - i4;
            return;
        }
        this.f3710b = 0;
    }

    /* renamed from: d */
    public final int mo12055d(int i) {
        if (i >= 0) {
            int e = i + mo12056e();
            int i2 = this.f3713e;
            if (e <= i2) {
                this.f3713e = e;
                m5939f();
                return i2;
            }
            throw C2046w4.m6265a();
        }
        throw C2046w4.m6266b();
    }

    /* renamed from: e */
    public final int mo12056e() {
        return this.f3711c - this.f3712d;
    }
}
