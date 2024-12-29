package com.google.p107ar.sceneform.rendering;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* renamed from: com.google.ar.sceneform.rendering.ViewAttachmentManager */
class ViewAttachmentManager {

    /* renamed from: a */
    private final View f5274a;

    /* renamed from: b */
    private final WindowManager f5275b;

    /* renamed from: c */
    private final WindowManager.LayoutParams f5276c = m8357c();

    /* renamed from: d */
    private final FrameLayout f5277d;

    /* renamed from: e */
    private final ViewGroup.LayoutParams f5278e;

    ViewAttachmentManager(Context context, View view) {
        this.f5274a = view;
        this.f5275b = (WindowManager) context.getSystemService("window");
        this.f5277d = new FrameLayout(context);
        this.f5278e = m8356b();
    }

    /* renamed from: b */
    private static ViewGroup.LayoutParams m8356b() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: c */
    private static WindowManager.LayoutParams m8357c() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1000, 16777752, -3);
        layoutParams.setTitle("ViewRenderableWindow");
        return layoutParams;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16244a(View view) {
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = this.f5277d;
        if (parent != frameLayout) {
            frameLayout.addView(view, this.f5278e);
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo16245d() {
        if (this.f5277d.getParent() == null && this.f5274a.isAttachedToWindow()) {
            this.f5275b.addView(this.f5277d, this.f5276c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16246e() {
        if (this.f5277d.getParent() != null) {
            this.f5275b.removeView(this.f5277d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16247f() {
        this.f5274a.post(new C2749g0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16248g(View view) {
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = this.f5277d;
        if (parent == frameLayout) {
            frameLayout.removeView(view);
        }
    }
}
