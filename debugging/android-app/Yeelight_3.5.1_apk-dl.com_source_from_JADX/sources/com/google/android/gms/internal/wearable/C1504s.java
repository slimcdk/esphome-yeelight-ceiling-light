package com.google.android.gms.internal.wearable;

import androidx.appcompat.widget.ActivityChooserView;

/* renamed from: com.google.android.gms.internal.wearable.s */
final class C1504s extends C1509t {

    /* renamed from: a */
    private int f1836a = 0;

    /* renamed from: b */
    private int f1837b;

    /* renamed from: c */
    private int f1838c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* synthetic */ C1504s(byte[] bArr, int i, int i2, boolean z, C1499r rVar) {
        super((C1499r) null);
    }

    /* renamed from: c */
    public final int mo13792c(int i) {
        int i2 = this.f1838c;
        this.f1838c = 0;
        int i3 = this.f1836a + this.f1837b;
        this.f1836a = i3;
        if (i3 > 0) {
            this.f1837b = i3;
            this.f1836a = 0;
        } else {
            this.f1837b = 0;
        }
        return i2;
    }
}
