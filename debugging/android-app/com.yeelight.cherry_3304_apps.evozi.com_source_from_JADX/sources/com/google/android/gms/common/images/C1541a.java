package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C1548c;
import com.google.android.gms.internal.base.zak;

/* renamed from: com.google.android.gms.common.images.a */
public abstract class C1541a {

    /* renamed from: a */
    protected int f2933a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11107a(Context context, Bitmap bitmap, boolean z) {
        C1548c.m4204c(bitmap);
        mo11109c(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11108b(Context context, zak zak, boolean z) {
        int i = this.f2933a;
        mo11109c(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo11109c(Drawable drawable, boolean z, boolean z2, boolean z3);
}
