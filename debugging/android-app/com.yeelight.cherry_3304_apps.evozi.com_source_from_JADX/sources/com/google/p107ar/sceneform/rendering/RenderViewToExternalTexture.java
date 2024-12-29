package com.google.p107ar.sceneform.rendering;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.Surface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.ar.sceneform.rendering.RenderViewToExternalTexture */
class RenderViewToExternalTexture extends LinearLayout {

    /* renamed from: a */
    private final View f5258a;

    /* renamed from: b */
    private final ExternalTexture f5259b;

    /* renamed from: c */
    private final Picture f5260c = new Picture();

    /* renamed from: d */
    private boolean f5261d = false;
    @Nullable

    /* renamed from: e */
    private ViewAttachmentManager f5262e;

    /* renamed from: f */
    private final ArrayList<OnViewSizeChangedListener> f5263f = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.rendering.RenderViewToExternalTexture$OnViewSizeChangedListener */
    public interface OnViewSizeChangedListener {
        void onViewSizeChanged(int i, int i2);
    }

    RenderViewToExternalTexture(Context context, View view) {
        super(context);
        Preconditions.checkNotNull(view, "Parameter \"view\" was null.");
        this.f5259b = new ExternalTexture();
        this.f5258a = view;
        addView(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16072a(OnViewSizeChangedListener onViewSizeChangedListener) {
        if (!this.f5263f.contains(onViewSizeChangedListener)) {
            this.f5263f.add(onViewSizeChangedListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16073b(ViewAttachmentManager viewAttachmentManager) {
        ViewAttachmentManager viewAttachmentManager2 = this.f5262e;
        if (viewAttachmentManager2 == null) {
            this.f5262e = viewAttachmentManager;
            viewAttachmentManager.mo16244a(this);
        } else if (viewAttachmentManager2 != viewAttachmentManager) {
            throw new IllegalStateException("Cannot use the same ViewRenderable with multiple SceneViews.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16074c() {
        ViewAttachmentManager viewAttachmentManager = this.f5262e;
        if (viewAttachmentManager != null) {
            viewAttachmentManager.mo16248g(this);
            this.f5262e = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ExternalTexture mo16075d() {
        return this.f5259b;
    }

    public void dispatchDraw(Canvas canvas) {
        Surface surface = this.f5259b.getSurface();
        if (surface.isValid()) {
            if (this.f5258a.isDirty()) {
                Canvas beginRecording = this.f5260c.beginRecording(this.f5258a.getWidth(), this.f5258a.getHeight());
                beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
                super.dispatchDraw(beginRecording);
                this.f5260c.endRecording();
                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                this.f5260c.draw(lockHardwareCanvas);
                surface.unlockCanvasAndPost(lockHardwareCanvas);
                this.f5261d = true;
            }
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo16077e() {
        return this.f5261d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16078f() {
        mo16074c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16079g(OnViewSizeChangedListener onViewSizeChangedListener) {
        this.f5263f.remove(onViewSizeChangedListener);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5259b.getSurfaceTexture().setDefaultBufferSize(this.f5258a.getWidth(), this.f5258a.getHeight());
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Iterator<OnViewSizeChangedListener> it = this.f5263f.iterator();
        while (it.hasNext()) {
            it.next().onViewSizeChanged(i, i2);
        }
    }
}
