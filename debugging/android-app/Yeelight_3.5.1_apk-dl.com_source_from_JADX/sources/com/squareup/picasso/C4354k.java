package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.k */
class C4354k extends C4332a<ImageView> {

    /* renamed from: m */
    C4343e f7215m;

    C4354k(Picasso picasso, ImageView imageView, C4361q qVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, C4343e eVar, boolean z) {
        super(picasso, imageView, qVar, i, i2, i3, drawable, str, obj, z);
        this.f7215m = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28122a() {
        super.mo28122a();
        if (this.f7215m != null) {
            this.f7215m = null;
        }
    }

    /* renamed from: b */
    public void mo28123b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f7149c.get();
            if (imageView != null) {
                Picasso picasso = this.f7147a;
                Bitmap bitmap2 = bitmap;
                Picasso.LoadedFrom loadedFrom2 = loadedFrom;
                C4358o.m12365c(imageView, picasso.f7122e, bitmap2, loadedFrom2, this.f7150d, picasso.f7130m);
                C4343e eVar = this.f7215m;
                if (eVar != null) {
                    eVar.mo28163b();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: c */
    public void mo28124c() {
        ImageView imageView = (ImageView) this.f7149c.get();
        if (imageView != null) {
            int i = this.f7153g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable = this.f7154h;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            C4343e eVar = this.f7215m;
            if (eVar != null) {
                eVar.mo28164c();
            }
        }
    }
}
