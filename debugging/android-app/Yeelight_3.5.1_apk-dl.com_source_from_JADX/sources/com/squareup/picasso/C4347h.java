package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.h */
class C4347h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final C4364r f7193a;

    /* renamed from: b */
    final WeakReference<ImageView> f7194b;

    /* renamed from: c */
    C4343e f7195c;

    C4347h(C4364r rVar, ImageView imageView, C4343e eVar) {
        this.f7193a = rVar;
        this.f7194b = new WeakReference<>(imageView);
        this.f7195c = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28166a() {
        this.f7195c = null;
        ImageView imageView = (ImageView) this.f7194b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f7194b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f7193a.mo28227h().mo28226g(width, height).mo28224e(imageView, this.f7195c);
        }
        return true;
    }
}
