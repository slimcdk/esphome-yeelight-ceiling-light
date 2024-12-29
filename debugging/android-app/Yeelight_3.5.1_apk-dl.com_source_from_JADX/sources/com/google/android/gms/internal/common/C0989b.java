package com.google.android.gms.internal.common;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.common.b */
class C0989b extends C0990c {

    /* renamed from: a */
    Object[] f1215a = new Object[4];

    /* renamed from: b */
    int f1216b = 0;

    /* renamed from: c */
    boolean f1217c;

    C0989b(int i) {
    }

    /* renamed from: b */
    private final void m1645b(int i) {
        Object[] objArr = this.f1215a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            this.f1215a = Arrays.copyOf(objArr, i2);
        } else if (this.f1217c) {
            this.f1215a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f1217c = false;
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public final C0989b mo12460a(Object obj) {
        Objects.requireNonNull(obj);
        m1645b(this.f1216b + 1);
        Object[] objArr = this.f1215a;
        int i = this.f1216b;
        this.f1216b = i + 1;
        objArr[i] = obj;
        return this;
    }
}
