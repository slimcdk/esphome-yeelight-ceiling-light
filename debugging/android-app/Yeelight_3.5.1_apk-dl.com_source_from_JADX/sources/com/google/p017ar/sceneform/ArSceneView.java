package com.google.p017ar.sceneform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.p017ar.core.Camera;
import com.google.p017ar.core.CameraConfig;
import com.google.p017ar.core.Config;
import com.google.p017ar.core.Frame;
import com.google.p017ar.core.LightEstimate;
import com.google.p017ar.core.Session;
import com.google.p017ar.core.exceptions.CameraNotAvailableException;
import com.google.p017ar.sceneform.rendering.CameraStream;
import com.google.p017ar.sceneform.rendering.Color;
import com.google.p017ar.sceneform.rendering.GLHelper;
import com.google.p017ar.sceneform.rendering.PlaneRenderer;
import com.google.p017ar.sceneform.rendering.Renderer;
import com.google.p017ar.sceneform.rendering.ThreadPools;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.ArCoreVersion;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

/* renamed from: com.google.ar.sceneform.ArSceneView */
public class ArSceneView extends SceneView {
    private static final Color DEFAULT_COLOR_CORRECTION = new Color(DEFAULT_PIXEL_INTENSITY, DEFAULT_PIXEL_INTENSITY, DEFAULT_PIXEL_INTENSITY);
    private static final float DEFAULT_PIXEL_INTENSITY = 1.0f;
    private static final String REPORTED_ENGINE_TYPE = "Sceneform";
    private static final String REPORTED_ENGINE_VERSION = "1.7";
    private static final String TAG = ArSceneView.class.getSimpleName();
    @Nullable
    private Config cachedConfig;
    private CameraStream cameraStream;
    private int cameraTextureId;
    private final float[] colorCorrectionPixelIntensity = new float[4];
    @Nullable
    private Frame currentFrame;
    private Display display;
    private boolean isLightDirectionUpdateEnabled = true;
    private final Color lastValidColorCorrection = new Color(DEFAULT_COLOR_CORRECTION);
    @Nullable
    private float[] lastValidEnvironmentalHdrAmbientSphericalHarmonics;
    @Nullable
    private float[] lastValidEnvironmentalHdrMainLightDirection;
    @Nullable
    private float[] lastValidEnvironmentalHdrMainLightIntensity;
    private float lastValidPixelIntensity = DEFAULT_PIXEL_INTENSITY;
    private boolean lightEstimationEnabled = true;
    private int minArCoreVersionCode;
    private final SequentialTask pauseResumeTask = new SequentialTask();
    private PlaneRenderer planeRenderer;
    @Nullable
    private Session session;

    public ArSceneView(Context context) {
        super(context);
        initializeAr();
    }

    public ArSceneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeAr();
    }

    private void ensureUpdateMode() {
        Session session2 = this.session;
        if (session2 != null && this.minArCoreVersionCode >= 180604036) {
            Config config = this.cachedConfig;
            if (config == null) {
                this.cachedConfig = session2.getConfig();
            } else {
                session2.getConfig(config);
            }
            Config.UpdateMode updateMode = this.cachedConfig.getUpdateMode();
            if (updateMode != Config.UpdateMode.LATEST_CAMERA_IMAGE) {
                String valueOf = String.valueOf(updateMode);
                StringBuilder sb = new StringBuilder(valueOf.length() + 123);
                sb.append("Invalid ARCore UpdateMode ");
                sb.append(valueOf);
                sb.append(", Sceneform requires that the ARCore session is configured to the UpdateMode LATEST_CAMERA_IMAGE.");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    private void initializeAr() {
        this.minArCoreVersionCode = ArCoreVersion.getMinArCoreVersionCode(getContext());
        this.display = ((WindowManager) getContext().getSystemService(WindowManager.class)).getDefaultDisplay();
        initializePlaneRenderer();
        initializeCameraStream();
    }

    private void initializeCameraStream() {
        this.cameraTextureId = GLHelper.createCameraTexture();
        this.cameraStream = new CameraStream(this.cameraTextureId, (Renderer) Preconditions.checkNotNull(getRenderer()));
    }

    private void initializeFacingDirection(Session session2) {
        if (session2.getCameraConfig().getFacingDirection() == CameraConfig.FacingDirection.FRONT) {
            ((Renderer) Preconditions.checkNotNull(getRenderer())).setFrontFaceWindingInverted(Boolean.TRUE);
        }
    }

    private void initializePlaneRenderer() {
        this.planeRenderer = new PlaneRenderer((Renderer) Preconditions.checkNotNull(getRenderer()));
    }

    static final /* synthetic */ void lambda$pauseAsync$2$ArSceneView(WeakReference weakReference) {
        ArSceneView arSceneView = (ArSceneView) weakReference.get();
        if (arSceneView != null) {
            arSceneView.pauseScene();
        }
    }

    static final /* synthetic */ void lambda$pauseAsync$3$ArSceneView(WeakReference weakReference) {
        ArSceneView arSceneView = (ArSceneView) weakReference.get();
        if (arSceneView != null) {
            arSceneView.pauseSession();
        }
    }

    static final /* synthetic */ void lambda$pauseAsync$4$ArSceneView(Void voidR) {
    }

    static final /* synthetic */ void lambda$resumeAsync$0$ArSceneView(WeakReference weakReference) {
        ArSceneView arSceneView = (ArSceneView) weakReference.get();
        if (arSceneView != null) {
            try {
                arSceneView.resumeSession();
            } catch (CameraNotAvailableException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static final /* synthetic */ void lambda$resumeAsync$1$ArSceneView(WeakReference weakReference) {
        ArSceneView arSceneView = (ArSceneView) weakReference.get();
        if (arSceneView != null) {
            arSceneView.resumeScene();
        }
    }

    private static boolean loadUnifiedJni() {
        return false;
    }

    private static native void nativeReportEngineType(Session session2, String str, String str2);

    private void pauseScene() {
        super.pause();
    }

    private void pauseSession() {
        Session session2 = this.session;
        if (session2 != null) {
            session2.pause();
        }
    }

    private void reportEngineType() {
        try {
            if (!loadUnifiedJni()) {
                System.loadLibrary("arsceneview_jni");
            }
            Session session2 = this.session;
            if (session2 != null) {
                nativeReportEngineType(session2, REPORTED_ENGINE_TYPE, REPORTED_ENGINE_VERSION);
            }
        } catch (Throwable unused) {
        }
    }

    private void resumeScene() {
        try {
            super.resume();
        } catch (CameraNotAvailableException e) {
            throw new IllegalStateException(e);
        }
    }

    private void resumeSession() {
        Session session2 = this.session;
        if (session2 != null) {
            reportEngineType();
            session2.resume();
        }
    }

    private boolean shouldRecalculateCameraUvs(Frame frame) {
        return frame.hasDisplayGeometryChanged();
    }

    private void updateHdrLightEstimate(LightEstimate lightEstimate) {
    }

    private void updateLightEstimate(Frame frame) {
        Preconditions.checkNotNull(frame, "Parameter \"frame\" was null.");
        if (this.lightEstimationEnabled) {
            LightEstimate lightEstimate = frame.getLightEstimate();
            if (isEnvironmentalHdrLightingAvailable()) {
                updateHdrLightEstimate(lightEstimate);
            } else {
                updateNormalLightEstimate(lightEstimate);
            }
        }
    }

    private void updateNormalLightEstimate(LightEstimate lightEstimate) {
        float f = this.lastValidPixelIntensity;
        if (lightEstimate.getState() == LightEstimate.State.VALID) {
            lightEstimate.getColorCorrection(this.colorCorrectionPixelIntensity, 0);
            f = Math.max(this.colorCorrectionPixelIntensity[3], 0.0f);
            Color color = this.lastValidColorCorrection;
            float[] fArr = this.colorCorrectionPixelIntensity;
            color.set(fArr[0], fArr[1], fArr[2]);
        }
        getScene().setLightEstimate(this.lastValidColorCorrection, f);
        this.lastValidPixelIntensity = f;
    }

    @UiThread
    @Nullable
    public Frame getArFrame() {
        return this.currentFrame;
    }

    public int getCameraStreamRenderPriority() {
        return this.cameraStream.getRenderPriority();
    }

    public PlaneRenderer getPlaneRenderer() {
        return this.planeRenderer;
    }

    @Nullable
    public Session getSession() {
        return this.session;
    }

    /* access modifiers changed from: protected */
    public boolean isEnvironmentalHdrLightingAvailable() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isLightDirectionUpdateEnabled() {
        return false;
    }

    public boolean isLightEstimationEnabled() {
        return this.lightEstimationEnabled;
    }

    /* access modifiers changed from: protected */
    public boolean onBeginFrame(long j) {
        Session session2 = this.session;
        if (session2 == null || !this.pauseResumeTask.mo16836b()) {
            return false;
        }
        ensureUpdateMode();
        boolean z = true;
        try {
            Frame update = session2.update();
            if (update == null) {
                return false;
            }
            if (!this.cameraStream.isTextureInitialized()) {
                this.cameraStream.initializeTexture(update);
            }
            if (shouldRecalculateCameraUvs(update)) {
                this.cameraStream.recalculateCameraUvs(update);
            }
            Frame frame = this.currentFrame;
            if (frame != null && frame.getTimestamp() == update.getTimestamp()) {
                z = false;
            }
            this.currentFrame = update;
            Camera camera = update.getCamera();
            if (camera == null) {
                return false;
            }
            if (z) {
                getScene().getCamera().updateTrackedPose(camera);
                Frame frame2 = this.currentFrame;
                if (frame2 != null) {
                    updateLightEstimate(frame2);
                    this.planeRenderer.update(frame2, getWidth(), getHeight());
                }
            }
            return z;
        } catch (CameraNotAvailableException unused) {
            return false;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Session session2 = this.session;
        if (session2 != null) {
            session2.setDisplayGeometry(this.display.getRotation(), i3 - i, i4 - i2);
        }
    }

    public void pause() {
        pauseScene();
        pauseSession();
    }

    public CompletableFuture<Void> pauseAsync(Executor executor) {
        WeakReference weakReference = new WeakReference(this);
        this.pauseResumeTask.mo16835a(new C2065c(weakReference), ThreadPools.getMainExecutor());
        return this.pauseResumeTask.mo16835a(new C2070f(weakReference), executor).thenAcceptAsync(C2069e.f3263a, ThreadPools.getMainExecutor());
    }

    public void resume() {
        resumeSession();
        resumeScene();
    }

    public CompletableFuture<Void> resumeAsync(Executor executor) {
        WeakReference weakReference = new WeakReference(this);
        this.pauseResumeTask.mo16835a(new C2064b(weakReference), executor);
        return this.pauseResumeTask.mo16835a(new C2068d(weakReference), ThreadPools.getMainExecutor());
    }

    public void setCameraStreamRenderPriority(@IntRange(from = 0, mo660to = 7) int i) {
        this.cameraStream.setRenderPriority(i);
    }

    /* access modifiers changed from: protected */
    public void setLightDirectionUpdateEnabled(boolean z) {
    }

    public void setLightEstimationEnabled(boolean z) {
        this.lightEstimationEnabled = z;
        if (!z) {
            Scene scene = getScene();
            Color color = DEFAULT_COLOR_CORRECTION;
            scene.setLightEstimate(color, DEFAULT_PIXEL_INTENSITY);
            this.lastValidPixelIntensity = DEFAULT_PIXEL_INTENSITY;
            this.lastValidColorCorrection.set(color);
        }
    }

    public void setupSession(Session session2) {
        if (this.session == null) {
            AndroidPreconditions.checkMinAndroidApiLevel();
            this.session = session2;
            Renderer renderer = (Renderer) Preconditions.checkNotNull(getRenderer());
            int desiredWidth = renderer.getDesiredWidth();
            int desiredHeight = renderer.getDesiredHeight();
            if (!(desiredWidth == 0 || desiredHeight == 0)) {
                session2.setDisplayGeometry(this.display.getRotation(), desiredWidth, desiredHeight);
            }
            initializeFacingDirection(session2);
            session2.setCameraTextureName(this.cameraTextureId);
        }
    }
}
