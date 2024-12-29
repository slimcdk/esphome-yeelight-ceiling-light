package com.google.p017ar.sceneform.rendering;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* renamed from: com.google.ar.sceneform.rendering.ViewAttachmentManager */
class ViewAttachmentManager {

    /* renamed from: a */
    private final View f3349a;

    /* renamed from: b */
    private final WindowManager f3350b;

    /* renamed from: c */
    private final WindowManager.LayoutParams f3351c = m5308d();

    /* renamed from: d */
    private final FrameLayout f3352d;

    /* renamed from: e */
    private final ViewGroup.LayoutParams f3353e;

    ViewAttachmentManager(Context context, View view) {
        this.f3349a = view;
        this.f3350b = (WindowManager) context.getSystemService("window");
        this.f3352d = new FrameLayout(context);
        this.f3353e = m5307c();
    }

    /* renamed from: c */
    private static ViewGroup.LayoutParams m5307c() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: d */
    private static WindowManager.LayoutParams m5308d() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1000, 16777752, -3);
        layoutParams.setTitle("ViewRenderableWindow");
        return layoutParams;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m5309e() {
        if (this.f3352d.getParent() == null && this.f3349a.isAttachedToWindow()) {
            this.f3350b.addView(this.f3352d, this.f3351c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17687b(View view) {
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = this.f3352d;
        if (parent != frameLayout) {
            frameLayout.addView(view, this.f3353e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo17688f() {
        if (this.f3352d.getParent() != null) {
            this.f3350b.removeView(this.f3352d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo17689g() {
        this.f3349a.post(new C2147m0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo17690h(View view) {
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = this.f3352d;
        if (parent == frameLayout) {
            frameLayout.removeView(view);
        }
    }
}
