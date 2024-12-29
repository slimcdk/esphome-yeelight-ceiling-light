package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0895b;
import com.google.android.gms.internal.base.zam;

/* renamed from: com.google.android.gms.common.images.c */
public abstract class C0891c {

    /* renamed from: a */
    protected int f930a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12157a(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12158b(Context context, zam zam, boolean z) {
        int i = this.f930a;
        mo12157a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12159c(Context context, Bitmap bitmap, boolean z) {
        C0895b.m1289c(bitmap);
        mo12157a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
