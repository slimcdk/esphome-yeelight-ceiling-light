package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;

/* renamed from: com.google.android.gms.internal.measurement.n7 */
final class C1221n7 extends C1253p7 {

    /* renamed from: b */
    private int f1436b = 0;

    /* renamed from: c */
    private int f1437c;

    /* renamed from: d */
    private int f1438d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* synthetic */ C1221n7(byte[] bArr, int i, int i2, boolean z, C1205m7 m7Var) {
        super((C1237o7) null);
    }

    /* renamed from: c */
    public final int mo13019c(int i) {
        int i2 = this.f1438d;
        this.f1438d = 0;
        int i3 = this.f1436b + this.f1437c;
        this.f1436b = i3;
        if (i3 > 0) {
            this.f1437c = i3;
            this.f1436b = 0;
        } else {
            this.f1437c = 0;
        }
        return i2;
    }
}
