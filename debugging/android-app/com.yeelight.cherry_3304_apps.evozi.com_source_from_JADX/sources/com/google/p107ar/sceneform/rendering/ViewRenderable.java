package com.google.p107ar.sceneform.rendering;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.p107ar.sceneform.collision.Box;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.RenderViewToExternalTexture;
import com.google.p107ar.sceneform.rendering.Renderable;
import com.google.p107ar.sceneform.resources.ResourceRegistry;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;

@RequiresApi(api = 24)
/* renamed from: com.google.ar.sceneform.rendering.ViewRenderable */
public class ViewRenderable extends Renderable {
    private static final String TAG = "ViewRenderable";
    private HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
    private boolean isInitialized;
    private final RenderViewToExternalTexture.OnViewSizeChangedListener onViewSizeChangedListener = new C2755j0(this);
    @Nullable
    private Renderer renderer;
    private VerticalAlignment verticalAlignment = VerticalAlignment.BOTTOM;
    private final View view;
    @Nullable
    private ViewRenderableInternalData viewRenderableData;
    private final Matrix viewScaleMatrix = new Matrix();
    private ViewSizer viewSizer;

    /* renamed from: com.google.ar.sceneform.rendering.ViewRenderable$1 */
    static /* synthetic */ class C27351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5279a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5280b;

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
                com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment[] r0 = com.google.p107ar.sceneform.rendering.ViewRenderable.VerticalAlignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5280b = r0
                r1 = 1
                com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment r2 = com.google.p107ar.sceneform.rendering.ViewRenderable.VerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5280b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment r3 = com.google.p107ar.sceneform.rendering.ViewRenderable.VerticalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5280b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment r4 = com.google.p107ar.sceneform.rendering.ViewRenderable.VerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment[] r3 = com.google.p107ar.sceneform.rendering.ViewRenderable.HorizontalAlignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f5279a = r3
                com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment r4 = com.google.p107ar.sceneform.rendering.ViewRenderable.HorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f5279a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment r3 = com.google.p107ar.sceneform.rendering.ViewRenderable.HorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f5279a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment r1 = com.google.p107ar.sceneform.rendering.ViewRenderable.HorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.rendering.ViewRenderable.C27351.<clinit>():void");
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

        /* synthetic */ Builder(C27351 r1) {
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
                setSource(context, C2722R.raw.sceneform_view_renderable);
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
        Preconditions.checkNotNull(view2, "Parameter \"view\" was null.");
        this.view = view2;
        this.viewSizer = builder.viewSizer;
        this.horizontalAlignment = builder.horizontalAlignment;
        this.verticalAlignment = builder.verticalAlignment;
        RenderViewToExternalTexture renderViewToExternalTexture = new RenderViewToExternalTexture(view2.getContext(), view2);
        renderViewToExternalTexture.mo16072a(this.onViewSizeChangedListener);
        ViewRenderableInternalData viewRenderableInternalData = new ViewRenderableInternalData(renderViewToExternalTexture);
        this.viewRenderableData = viewRenderableInternalData;
        viewRenderableInternalData.retain();
        this.collisionShape = new Box(Vector3.zero());
    }

    ViewRenderable(ViewRenderable viewRenderable) {
        super((Renderable) viewRenderable);
        this.view = viewRenderable.view;
        this.viewSizer = viewRenderable.viewSizer;
        this.horizontalAlignment = viewRenderable.horizontalAlignment;
        this.verticalAlignment = viewRenderable.verticalAlignment;
        ViewRenderableInternalData viewRenderableInternalData = (ViewRenderableInternalData) Preconditions.checkNotNull(viewRenderable.viewRenderableData);
        this.viewRenderableData = viewRenderableInternalData;
        viewRenderableInternalData.retain();
        this.viewRenderableData.mo16265a().mo16072a(this.onViewSizeChangedListener);
    }

    public static Builder builder() {
        AndroidPreconditions.checkMinAndroidApiLevel();
        return new Builder((C27351) null);
    }

    private float getOffsetRatioForAlignment(HorizontalAlignment horizontalAlignment2) {
        IRenderableInternalData renderableData = getRenderableData();
        Vector3 e = renderableData.mo15909e();
        Vector3 v = renderableData.mo15926v();
        int i = C27351.f5279a[horizontalAlignment2.ordinal()];
        if (i == 1) {
            return (-e.f5202x) + v.f5202x;
        }
        if (i == 2) {
            return -e.f5202x;
        }
        if (i == 3) {
            return (-e.f5202x) - v.f5202x;
        }
        String valueOf = String.valueOf(horizontalAlignment2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("Invalid HorizontalAlignment: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private float getOffsetRatioForAlignment(VerticalAlignment verticalAlignment2) {
        IRenderableInternalData renderableData = getRenderableData();
        Vector3 e = renderableData.mo15909e();
        Vector3 v = renderableData.mo15926v();
        int i = C27351.f5280b[verticalAlignment2.ordinal()];
        if (i == 1) {
            return (-e.f5203y) + v.f5203y;
        }
        if (i == 2) {
            return -e.f5203y;
        }
        if (i == 3) {
            return (-e.f5203y) - v.f5203y;
        }
        String valueOf = String.valueOf(verticalAlignment2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Invalid VerticalAlignment: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    public void updateSuggestedCollisionShape() {
        Box box;
        if (!getId().isEmpty() && (box = (Box) this.collisionShape) != null) {
            IRenderableInternalData renderableData = getRenderableData();
            Vector3 size = this.viewSizer.getSize(this.view);
            Vector3 t = renderableData.mo15924t();
            t.f5202x *= size.f5202x;
            t.f5203y *= size.f5203y;
            Vector3 e = renderableData.mo15909e();
            float f = e.f5202x * size.f5202x;
            e.f5202x = f;
            e.f5203y *= size.f5203y;
            e.f5202x = f + (getOffsetRatioForAlignment(this.horizontalAlignment) * t.f5202x);
            e.f5203y += getOffsetRatioForAlignment(this.verticalAlignment) * t.f5203y;
            box.setSize(t);
            box.setCenter(e);
        }
    }

    private void updateSuggestedCollisionShapeAsync() {
        this.view.post(new C2751h0(this));
    }

    /* access modifiers changed from: package-private */
    public void attachToRenderer(Renderer renderer2) {
        ((ViewRenderableInternalData) Preconditions.checkNotNull(this.viewRenderableData)).mo16265a().mo16073b(renderer2.getViewAttachmentManager());
        this.renderer = renderer2;
    }

    /* renamed from: c */
    public /* synthetic */ void mo16250c(int i, int i2) {
        if (this.isInitialized) {
            updateSuggestedCollisionShapeAsync();
        }
    }

    /* access modifiers changed from: package-private */
    public void detatchFromRenderer() {
        ((ViewRenderableInternalData) Preconditions.checkNotNull(this.viewRenderableData)).mo16265a().mo16074c();
        this.renderer = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dispose */
    public void mo16249b() {
        AndroidPreconditions.checkUiThread();
        ViewRenderableInternalData viewRenderableInternalData = this.viewRenderableData;
        if (viewRenderableInternalData != null) {
            viewRenderableInternalData.mo16265a().mo16079g(this.onViewSizeChangedListener);
            viewRenderableInternalData.release();
            this.viewRenderableData = null;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            ThreadPools.getMainExecutor().execute(new C2753i0(this));
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
        this.viewScaleMatrix.makeScale(new Vector3(size.f5202x, size.f5203y, 1.0f));
        this.viewScaleMatrix.setTranslation(new Vector3(getOffsetRatioForAlignment(this.horizontalAlignment) * size.f5202x, getOffsetRatioForAlignment(this.verticalAlignment) * size.f5203y, 0.0f));
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
            RenderViewToExternalTexture a = ((ViewRenderableInternalData) Preconditions.checkNotNull(this.viewRenderableData)).mo16265a();
            if (a.isAttachedToWindow() && a.isLaidOut() && a.mo16077e()) {
                if (!this.isInitialized) {
                    getMaterial().setExternalTexture("viewTexture", a.mo16075d());
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