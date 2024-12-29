package com.google.p017ar.sceneform.rendering;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.Surface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.ar.sceneform.rendering.RenderViewToExternalTexture */
class RenderViewToExternalTexture extends LinearLayout {

    /* renamed from: a */
    private final View f3333a;

    /* renamed from: b */
    private final ExternalTexture f3334b;

    /* renamed from: c */
    private final Picture f3335c = new Picture();

    /* renamed from: d */
    private boolean f3336d = false;
    @Nullable

    /* renamed from: e */
    private ViewAttachmentManager f3337e;

    /* renamed from: f */
    private final ArrayList<OnViewSizeChangedListener> f3338f = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.rendering.RenderViewToExternalTexture$OnViewSizeChangedListener */
    public interface OnViewSizeChangedListener {
        void onViewSizeChanged(int i, int i2);
    }

    RenderViewToExternalTexture(Context context, View view) {
        super(context);
        Preconditions.checkNotNull(view, "Parameter \"view\" was null.");
        this.f3334b = new ExternalTexture();
        this.f3333a = view;
        addView(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17518a(OnViewSizeChangedListener onViewSizeChangedListener) {
        if (!this.f3338f.contains(onViewSizeChangedListener)) {
            this.f3338f.add(onViewSizeChangedListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17519b(ViewAttachmentManager viewAttachmentManager) {
        ViewAttachmentManager viewAttachmentManager2 = this.f3337e;
        if (viewAttachmentManager2 == null) {
            this.f3337e = viewAttachmentManager;
            viewAttachmentManager.mo17687b(this);
        } else if (viewAttachmentManager2 != viewAttachmentManager) {
            throw new IllegalStateException("Cannot use the same ViewRenderable with multiple SceneViews.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17520c() {
        ViewAttachmentManager viewAttachmentManager = this.f3337e;
        if (viewAttachmentManager != null) {
            viewAttachmentManager.mo17690h(this);
            this.f3337e = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ExternalTexture mo17521d() {
        return this.f3334b;
    }

    public void dispatchDraw(Canvas canvas) {
        Surface surface = this.f3334b.getSurface();
        if (surface.isValid()) {
            if (this.f3333a.isDirty()) {
                Canvas beginRecording = this.f3335c.beginRecording(this.f3333a.getWidth(), this.f3333a.getHeight());
                beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
                super.dispatchDraw(beginRecording);
                this.f3335c.endRecording();
                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                this.f3335c.draw(lockHardwareCanvas);
                surface.unlockCanvasAndPost(lockHardwareCanvas);
                this.f3336d = true;
            }
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo17523e() {
        return this.f3336d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo17524f() {
        mo17520c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo17525g(OnViewSizeChangedListener onViewSizeChangedListener) {
        this.f3338f.remove(onViewSizeChangedListener);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3334b.getSurfaceTexture().setDefaultBufferSize(this.f3333a.getWidth(), this.f3333a.getHeight());
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Iterator<OnViewSizeChangedListener> it = this.f3338f.iterator();
        while (it.hasNext()) {
            it.next().onViewSizeChanged(i, i2);
        }
    }
}
