package com.google.p017ar.sceneform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import androidx.annotation.Nullable;
import com.google.ar.sceneform.animation.AnimationEngine;
import com.google.ar.sceneform.animation.AnimationLibraryLoader;
import com.google.p017ar.sceneform.rendering.Color;
import com.google.p017ar.sceneform.rendering.Renderer;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.MovingAverageMillisecondsTracker;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ar.sceneform.SceneView */
public class SceneView extends SurfaceView implements Choreographer.FrameCallback {
    private static final String TAG = SceneView.class.getSimpleName();
    @Nullable
    private AnimationEngine animationEngine;
    @Nullable
    private Color backgroundColor;
    private volatile boolean debugEnabled = false;
    private final MovingAverageMillisecondsTracker frameRenderTracker = new MovingAverageMillisecondsTracker();
    private final FrameTime frameTime = new FrameTime();
    private final MovingAverageMillisecondsTracker frameTotalTracker = new MovingAverageMillisecondsTracker();
    private final MovingAverageMillisecondsTracker frameUpdateTracker = new MovingAverageMillisecondsTracker();
    private boolean isInitialized = false;
    @Nullable
    private Renderer renderer = null;
    private Scene scene;

    public SceneView(Context context) {
        super(context);
        initialize();
    }

    public SceneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    public static void destroyAllResources() {
        Renderer.destroyAllResources();
    }

    private void doRender() {
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            if (this.debugEnabled) {
                this.frameRenderTracker.beginSample();
            }
            renderer2.render(this.debugEnabled);
            if (this.debugEnabled) {
                this.frameRenderTracker.endSample();
            }
        }
    }

    private void doUpdate(long j) {
        if (this.debugEnabled) {
            this.frameUpdateTracker.beginSample();
        }
        this.frameTime.update(j);
        updateAnimation(j);
        this.scene.dispatchUpdate(this.frameTime);
        if (this.debugEnabled) {
            this.frameUpdateTracker.endSample();
        }
    }

    private void initialize() {
        if (!this.isInitialized) {
            if (!AndroidPreconditions.isMinAndroidApiLevel()) {
                this.renderer = null;
            } else {
                Renderer renderer2 = new Renderer(this);
                this.renderer = renderer2;
                Color color = this.backgroundColor;
                if (color != null) {
                    renderer2.setClearColor(color.inverseTonemap());
                }
                Scene scene2 = new Scene(this);
                this.scene = scene2;
                this.renderer.setCameraProvider(scene2.getCamera());
                initializeAnimation();
            }
            this.isInitialized = true;
        }
    }

    private void initializeAnimation() {
        try {
            Class.forName("com.google.ar.sceneform.animation.AnimationLibraryLoader");
            this.animationEngine = AnimationEngine.getInstance();
            AnimationLibraryLoader.initialize();
        } catch (ClassNotFoundException unused) {
        }
    }

    public static long reclaimReleasedResources() {
        return Renderer.reclaimReleasedResources();
    }

    private void updateAnimation(long j) {
        AnimationEngine animationEngine2 = this.animationEngine;
        if (animationEngine2 != null) {
            animationEngine2.update(TimeUnit.NANOSECONDS.toMillis(j));
        }
    }

    public void destroy() {
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.dispose();
            this.renderer = null;
        }
    }

    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        if (this.debugEnabled) {
            this.frameTotalTracker.beginSample();
        }
        if (onBeginFrame(j)) {
            doUpdate(j);
            doRender();
        }
        if (this.debugEnabled) {
            this.frameTotalTracker.endSample();
            if ((System.currentTimeMillis() / 1000) % 60 == 0) {
                double average = this.frameRenderTracker.getAverage();
                StringBuilder sb = new StringBuilder(52);
                sb.append(" PERF COUNTER: frameRender: ");
                sb.append(average);
                double average2 = this.frameTotalTracker.getAverage();
                StringBuilder sb2 = new StringBuilder(51);
                sb2.append(" PERF COUNTER: frameTotal: ");
                sb2.append(average2);
                double average3 = this.frameUpdateTracker.getAverage();
                StringBuilder sb3 = new StringBuilder(52);
                sb3.append(" PERF COUNTER: frameUpdate: ");
                sb3.append(average3);
            }
        }
    }

    public void enableDebug(boolean z) {
        this.debugEnabled = z;
    }

    @Nullable
    public Renderer getRenderer() {
        return this.renderer;
    }

    public Scene getScene() {
        return this.scene;
    }

    public boolean isDebugEnabled() {
        return this.debugEnabled;
    }

    /* access modifiers changed from: protected */
    public boolean onBeginFrame(long j) {
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ((Renderer) Preconditions.checkNotNull(this.renderer)).setDesiredSize(i3 - i, i4 - i2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent)) {
            this.scene.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void pause() {
        Choreographer.getInstance().removeFrameCallback(this);
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.onPause();
        }
    }

    public void resume() {
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.onResume();
        }
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    public void setBackground(@Nullable Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            Color color = new Color(((ColorDrawable) drawable).getColor());
            this.backgroundColor = color;
            Renderer renderer2 = this.renderer;
            if (renderer2 != null) {
                renderer2.setClearColor(color.inverseTonemap());
                return;
            }
            return;
        }
        this.backgroundColor = null;
        Renderer renderer3 = this.renderer;
        if (renderer3 != null) {
            renderer3.setDefaultClearColor();
        }
        super.setBackground(drawable);
    }

    public void startMirroringToSurface(Surface surface, int i, int i2, int i3, int i4) {
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.startMirroring(surface, i, i2, i3, i4);
        }
    }

    public void stopMirroringToSurface(Surface surface) {
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.stopMirroring(surface);
        }
    }
}
