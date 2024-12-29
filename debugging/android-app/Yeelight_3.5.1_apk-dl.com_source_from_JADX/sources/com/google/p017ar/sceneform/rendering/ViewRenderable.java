package com.google.p017ar.sceneform.rendering;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.p017ar.sceneform.collision.Box;
import com.google.p017ar.sceneform.math.Matrix;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.RenderViewToExternalTexture;
import com.google.p017ar.sceneform.rendering.Renderable;
import com.google.p017ar.sceneform.resources.ResourceRegistry;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;

@RequiresApi(api = 24)
/* renamed from: com.google.ar.sceneform.rendering.ViewRenderable */
public class ViewRenderable extends Renderable {
    private static final String TAG = "ViewRenderable";
    private HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
    private boolean isInitialized;
    private final RenderViewToExternalTexture.OnViewSizeChangedListener onViewSizeChangedListener;
    @Nullable
    private Renderer renderer;
    private VerticalAlignment verticalAlignment = VerticalAlignment.BOTTOM;
    private final View view;
    @Nullable
    private ViewRenderableInternalData viewRenderableData;
    private final Matrix viewScaleMatrix = new Matrix();
    private ViewSizer viewSizer;

    /* renamed from: com.google.ar.sceneform.rendering.ViewRenderable$1 */
    static /* synthetic */ class C21201 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3354a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3355b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment[] r0 = com.google.p017ar.sceneform.rendering.ViewRenderable.VerticalAlignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3355b = r0
                r1 = 1
                com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment r2 = com.google.p017ar.sceneform.rendering.ViewRenderable.VerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3355b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment r3 = com.google.p017ar.sceneform.rendering.ViewRenderable.VerticalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3355b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment r4 = com.google.p017ar.sceneform.rendering.ViewRenderable.VerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment[] r3 = com.google.p017ar.sceneform.rendering.ViewRenderable.HorizontalAlignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3354a = r3
                com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment r4 = com.google.p017ar.sceneform.rendering.ViewRenderable.HorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f3354a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment r3 = com.google.p017ar.sceneform.rendering.ViewRenderable.HorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f3354a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment r1 = com.google.p017ar.sceneform.rendering.ViewRenderable.HorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.sceneform.rendering.ViewRenderable.C21201.<clinit>():void");
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.ViewRenderable$Builder */
    public static final class Builder extends Renderable.Builder<ViewRenderable, Builder> {
        private static final int DEFAULT_DP_TO_METERS = 250;
        /* access modifiers changed from: private */
        public HorizontalAlignment horizontalAlignment;
        private OptionalInt resourceId;
        /* access modifiers changed from: private */
        public VerticalAlignment verticalAlignment;
        @Nullable
        private View view;
        /* access modifiers changed from: private */
        public ViewSizer viewSizer;

        private Builder() {
            this.viewSizer = new DpToMetersViewSizer(250);
            this.verticalAlignment = VerticalAlignment.BOTTOM;
            this.horizontalAlignment = HorizontalAlignment.CENTER;
            this.resourceId = OptionalInt.empty();
        }

        /* synthetic */ Builder(C21201 r1) {
            this();
        }

        private View inflateViewFromResourceId() {
            if (this.context != null) {
                return LayoutInflater.from(this.context).inflate(this.resourceId.getAsInt(), new FrameLayout(this.context), false);
            }
            throw new AssertionError("Context cannot be null");
        }

        public CompletableFuture<ViewRenderable> build() {
            Context context;
            if (!hasSource().booleanValue() && (context = this.context) != null) {
                setSource(context, C2108R.raw.sceneform_view_renderable);
            }
            this.registryId = this.view;
            return super.build();
        }

        /* access modifiers changed from: protected */
        public void checkPreconditions() {
            super.checkPreconditions();
            if (!(this.resourceId.isPresent() || this.view != null)) {
                throw new AssertionError("ViewRenderable must have a source.");
            } else if (this.resourceId.isPresent() && this.view != null) {
                throw new AssertionError("ViewRenderable must have a resourceId or a view as a source. This one has both.");
            }
        }

        /* access modifiers changed from: protected */
        public Class<ViewRenderable> getRenderableClass() {
            return ViewRenderable.class;
        }

        /* access modifiers changed from: protected */
        public ResourceRegistry<ViewRenderable> getRenderableRegistry() {
            return ResourceManager.getInstance().getViewRenderableRegistry();
        }

        /* access modifiers changed from: protected */
        public Builder getSelf() {
            return this;
        }

        public /* bridge */ /* synthetic */ Boolean hasSource() {
            return super.hasSource();
        }

        /* access modifiers changed from: protected */
        public ViewRenderable makeRenderable() {
            return this.view != null ? new ViewRenderable(this, this.view) : new ViewRenderable(this, inflateViewFromResourceId());
        }

        public Builder setHorizontalAlignment(HorizontalAlignment horizontalAlignment2) {
            this.horizontalAlignment = horizontalAlignment2;
            return this;
        }

        public Builder setSizer(ViewSizer viewSizer2) {
            Preconditions.checkNotNull(viewSizer2, "Parameter \"viewSizer\" was null.");
            this.viewSizer = viewSizer2;
            return this;
        }

        public Builder setVerticalAlignment(VerticalAlignment verticalAlignment2) {
            this.verticalAlignment = verticalAlignment2;
            return this;
        }

        public Builder setView(Context context, int i) {
            this.resourceId = OptionalInt.of(i);
            this.context = context;
            this.registryId = null;
            return this;
        }

        public Builder setView(Context context, View view2) {
            this.view = view2;
            this.context = context;
            this.registryId = view2;
            return this;
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment */
    public enum HorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    /* renamed from: com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment */
    public enum VerticalAlignment {
        BOTTOM,
        CENTER,
        TOP
    }

    ViewRenderable(Builder builder, View view2) {
        super((Renderable.Builder<? extends Renderable, ? extends Renderable.Builder<?, ?>>) builder);
        C2149n0 n0Var = new C2149n0(this);
        this.onViewSizeChangedListener = n0Var;
        Preconditions.checkNotNull(view2, "Parameter \"view\" was null.");
        this.view = view2;
        this.viewSizer = builder.viewSizer;
        this.horizontalAlignment = builder.horizontalAlignment;
        this.verticalAlignment = builder.verticalAlignment;
        RenderViewToExternalTexture renderViewToExternalTexture = new RenderViewToExternalTexture(view2.getContext(), view2);
        renderViewToExternalTexture.mo17518a(n0Var);
        ViewRenderableInternalData viewRenderableInternalData = new ViewRenderableInternalData(renderViewToExternalTexture);
        this.viewRenderableData = viewRenderableInternalData;
        viewRenderableInternalData.retain();
        this.collisionShape = new Box(Vector3.zero());
    }

    ViewRenderable(ViewRenderable viewRenderable) {
        super((Renderable) viewRenderable);
        C2149n0 n0Var = new C2149n0(this);
        this.onViewSizeChangedListener = n0Var;
        this.view = viewRenderable.view;
        this.viewSizer = viewRenderable.viewSizer;
        this.horizontalAlignment = viewRenderable.horizontalAlignment;
        this.verticalAlignment = viewRenderable.verticalAlignment;
        ViewRenderableInternalData viewRenderableInternalData = (ViewRenderableInternalData) Preconditions.checkNotNull(viewRenderable.viewRenderableData);
        this.viewRenderableData = viewRenderableInternalData;
        viewRenderableInternalData.retain();
        this.viewRenderableData.mo17705a().mo17518a(n0Var);
    }

    public static Builder builder() {
        AndroidPreconditions.checkMinAndroidApiLevel();
        return new Builder((C21201) null);
    }

    private float getOffsetRatioForAlignment(HorizontalAlignment horizontalAlignment2) {
        IRenderableInternalData renderableData = getRenderableData();
        Vector3 e = renderableData.mo17361e();
        Vector3 v = renderableData.mo17378v();
        int i = C21201.f3354a[horizontalAlignment2.ordinal()];
        if (i == 1) {
            return (-e.f3277x) + v.f3277x;
        }
        if (i == 2) {
            return -e.f3277x;
        }
        if (i == 3) {
            return (-e.f3277x) - v.f3277x;
        }
        String valueOf = String.valueOf(horizontalAlignment2);
        StringBuilder sb = new StringBuilder(valueOf.length() + 29);
        sb.append("Invalid HorizontalAlignment: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private float getOffsetRatioForAlignment(VerticalAlignment verticalAlignment2) {
        IRenderableInternalData renderableData = getRenderableData();
        Vector3 e = renderableData.mo17361e();
        Vector3 v = renderableData.mo17378v();
        int i = C21201.f3355b[verticalAlignment2.ordinal()];
        if (i == 1) {
            return (-e.f3278y) + v.f3278y;
        }
        if (i == 2) {
            return -e.f3278y;
        }
        if (i == 3) {
            return (-e.f3278y) - v.f3278y;
        }
        String valueOf = String.valueOf(verticalAlignment2);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("Invalid VerticalAlignment: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i, int i2) {
        if (this.isInitialized) {
            updateSuggestedCollisionShapeAsync();
        }
    }

    /* access modifiers changed from: private */
    public void updateSuggestedCollisionShape() {
        Box box;
        if (!getId().isEmpty() && (box = (Box) this.collisionShape) != null) {
            IRenderableInternalData renderableData = getRenderableData();
            Vector3 size = this.viewSizer.getSize(this.view);
            Vector3 t = renderableData.mo17376t();
            t.f3277x *= size.f3277x;
            t.f3278y *= size.f3278y;
            Vector3 e = renderableData.mo17361e();
            float f = e.f3277x * size.f3277x;
            e.f3277x = f;
            e.f3278y *= size.f3278y;
            e.f3277x = f + (getOffsetRatioForAlignment(this.horizontalAlignment) * t.f3277x);
            e.f3278y += getOffsetRatioForAlignment(this.verticalAlignment) * t.f3278y;
            box.setSize(t);
            box.setCenter(e);
        }
    }

    private void updateSuggestedCollisionShapeAsync() {
        this.view.post(new C2153p0(this));
    }

    /* access modifiers changed from: package-private */
    public void attachToRenderer(Renderer renderer2) {
        ((ViewRenderableInternalData) Preconditions.checkNotNull(this.viewRenderableData)).mo17705a().mo17519b(renderer2.getViewAttachmentManager());
        this.renderer = renderer2;
    }

    /* access modifiers changed from: package-private */
    public void detatchFromRenderer() {
        ((ViewRenderableInternalData) Preconditions.checkNotNull(this.viewRenderableData)).mo17705a().mo17520c();
        this.renderer = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dispose */
    public void lambda$finalize$1() {
        AndroidPreconditions.checkUiThread();
        ViewRenderableInternalData viewRenderableInternalData = this.viewRenderableData;
        if (viewRenderableInternalData != null) {
            viewRenderableInternalData.mo17705a().mo17525g(this.onViewSizeChangedListener);
            viewRenderableInternalData.release();
            this.viewRenderableData = null;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            ThreadPools.getMainExecutor().execute(new C2151o0(this));
        } catch (Exception unused) {
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    public Matrix getFinalModelMatrix(Matrix matrix) {
        Preconditions.checkNotNull(matrix, "Parameter \"originalMatrix\" was null.");
        Vector3 size = this.viewSizer.getSize(this.view);
        this.viewScaleMatrix.makeScale(new Vector3(size.f3277x, size.f3278y, 1.0f));
        this.viewScaleMatrix.setTranslation(new Vector3(getOffsetRatioForAlignment(this.horizontalAlignment) * size.f3277x, getOffsetRatioForAlignment(this.verticalAlignment) * size.f3278y, 0.0f));
        Matrix matrix2 = this.viewScaleMatrix;
        Matrix.multiply(matrix, matrix2, matrix2);
        return this.viewScaleMatrix;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public ViewSizer getSizer() {
        return this.viewSizer;
    }

    public VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public View getView() {
        return this.view;
    }

    public ViewRenderable makeCopy() {
        return new ViewRenderable(this);
    }

    /* access modifiers changed from: package-private */
    public void prepareForDraw() {
        if (!getId().isEmpty()) {
            RenderViewToExternalTexture a = ((ViewRenderableInternalData) Preconditions.checkNotNull(this.viewRenderableData)).mo17705a();
            if (a.isAttachedToWindow() && a.isLaidOut() && a.mo17523e()) {
                if (!this.isInitialized) {
                    getMaterial().setExternalTexture("viewTexture", a.mo17521d());
                    updateSuggestedCollisionShape();
                    this.isInitialized = true;
                }
                Renderer renderer2 = this.renderer;
                if (renderer2 != null && renderer2.isFrontFaceWindingInverted()) {
                    getMaterial().setFloat2("offsetUv", 1.0f, 0.0f);
                }
                super.prepareForDraw();
            }
        }
    }

    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment2) {
        this.horizontalAlignment = horizontalAlignment2;
        updateSuggestedCollisionShape();
    }

    public void setSizer(ViewSizer viewSizer2) {
        Preconditions.checkNotNull(viewSizer2, "Parameter \"viewSizer\" was null.");
        this.viewSizer = viewSizer2;
        updateSuggestedCollisionShape();
    }

    public void setVerticalAlignment(VerticalAlignment verticalAlignment2) {
        this.verticalAlignment = verticalAlignment2;
        updateSuggestedCollisionShape();
    }
}
