package com.google.p107ar.sceneform;

import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.p107ar.sceneform.collision.Collider;
import com.google.p107ar.sceneform.collision.CollisionSystem;
import com.google.p107ar.sceneform.collision.Ray;
import com.google.p107ar.sceneform.rendering.Color;
import com.google.p107ar.sceneform.rendering.LightProbe;
import com.google.p107ar.sceneform.rendering.Renderer;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;
import com.google.p107ar.sceneform.utilities.EnvironmentalHdrParameters;
import com.google.p107ar.sceneform.utilities.LoadHelper;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.Scene */
public class Scene extends NodeParent {
    private static final float DEFAULT_EXPOSURE = 180.0f;
    public static final EnvironmentalHdrParameters DEFAULT_HDR_PARAMETERS = EnvironmentalHdrParameters.makeDefault();
    private static final String DEFAULT_LIGHTPROBE_ASSET_NAME = "small_empty_house_2k";
    private static final String DEFAULT_LIGHTPROBE_RESOURCE_NAME = "sceneform_default_light_probe";
    private static final String TAG = "Scene";
    private final Camera camera;
    final CollisionSystem collisionSystem = new CollisionSystem();
    private boolean isUnderTesting = false;
    @Nullable
    private LightProbe lightProbe;
    private boolean lightProbeSet = false;
    private final ArrayList<OnUpdateListener> onUpdateListeners = new ArrayList<>();
    @Nullable
    private final Sun sunlightNode;
    private final TouchEventSystem touchEventSystem = new TouchEventSystem();
    @Nullable
    private final SceneView view;

    /* renamed from: com.google.ar.sceneform.Scene$OnPeekTouchListener */
    public interface OnPeekTouchListener {
        void onPeekTouch(HitTestResult hitTestResult, MotionEvent motionEvent);
    }

    /* renamed from: com.google.ar.sceneform.Scene$OnTouchListener */
    public interface OnTouchListener {
        boolean onSceneTouch(HitTestResult hitTestResult, MotionEvent motionEvent);
    }

    /* renamed from: com.google.ar.sceneform.Scene$OnUpdateListener */
    public interface OnUpdateListener {
        void onUpdate(FrameTime frameTime);
    }

    @VisibleForTesting(otherwise = 2)
    Scene() {
        Sun sun = null;
        this.view = null;
        this.lightProbe = null;
        this.camera = new Camera(true);
        this.sunlightNode = AndroidPreconditions.isMinAndroidApiLevel() ? new Sun() : sun;
        this.isUnderTesting = true;
    }

    public Scene(SceneView sceneView) {
        Preconditions.checkNotNull(sceneView, "Parameter \"view\" was null.");
        this.view = sceneView;
        this.camera = new Camera(this);
        if (!AndroidPreconditions.isMinAndroidApiLevel()) {
            this.sunlightNode = null;
            return;
        }
        this.sunlightNode = new Sun(this);
        setupLightProbe(sceneView);
    }

    static final /* synthetic */ HitTestResult lambda$hitTestAll$1$Scene() {
        return new HitTestResult();
    }

    static final /* synthetic */ Void lambda$setupLightProbe$5$Scene(Throwable th) {
        return null;
    }

    private void setupLightProbe(SceneView sceneView) {
        Preconditions.checkNotNull(sceneView, "Parameter \"view\" was null.");
        int rawResourceNameToIdentifier = LoadHelper.rawResourceNameToIdentifier(sceneView.getContext(), DEFAULT_LIGHTPROBE_RESOURCE_NAME);
        if (rawResourceNameToIdentifier != 0) {
            try {
                LightProbe.builder().setSource(sceneView.getContext(), rawResourceNameToIdentifier).setAssetName(DEFAULT_LIGHTPROBE_ASSET_NAME).build().thenAccept(new C2692n(this)).exceptionally(C2691m.f5197a);
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getLocalizedMessage());
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create the default Light Probe: ".concat(valueOf) : new String("Failed to create the default Light Probe: "));
            }
        }
    }

    public void addOnPeekTouchListener(OnPeekTouchListener onPeekTouchListener) {
        this.touchEventSystem.addOnPeekTouchListener(onPeekTouchListener);
    }

    public void addOnUpdateListener(OnUpdateListener onUpdateListener) {
        Preconditions.checkNotNull(onUpdateListener, "Parameter 'onUpdateListener' was null.");
        if (!this.onUpdateListeners.contains(onUpdateListener)) {
            this.onUpdateListeners.add(onUpdateListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchUpdate(FrameTime frameTime) {
        ArrayList<OnUpdateListener> arrayList = this.onUpdateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            OnUpdateListener onUpdateListener = arrayList.get(i);
            i++;
            onUpdateListener.onUpdate(frameTime);
        }
        callOnHierarchy(new C2689k(frameTime));
    }

    public Camera getCamera() {
        return this.camera;
    }

    public LightProbe getLightProbe() {
        LightProbe lightProbe2 = this.lightProbe;
        if (lightProbe2 != null) {
            return lightProbe2;
        }
        throw new IllegalStateException("Scene's lightProbe must not be null.");
    }

    @Nullable
    public Node getSunlight() {
        return this.sunlightNode;
    }

    public SceneView getView() {
        SceneView sceneView = this.view;
        if (sceneView != null) {
            return sceneView;
        }
        throw new IllegalStateException("Scene's view must not be null.");
    }

    public HitTestResult hitTest(MotionEvent motionEvent) {
        Preconditions.checkNotNull(motionEvent, "Parameter \"motionEvent\" was null.");
        Camera camera2 = this.camera;
        return camera2 == null ? new HitTestResult() : hitTest(camera2.motionEventToRay(motionEvent));
    }

    public HitTestResult hitTest(Ray ray) {
        Preconditions.checkNotNull(ray, "Parameter \"ray\" was null.");
        HitTestResult hitTestResult = new HitTestResult();
        Collider raycast = this.collisionSystem.raycast(ray, hitTestResult);
        if (raycast != null) {
            hitTestResult.setNode((Node) raycast.getTransformProvider());
        }
        return hitTestResult;
    }

    public ArrayList<HitTestResult> hitTestAll(MotionEvent motionEvent) {
        Preconditions.checkNotNull(motionEvent, "Parameter \"motionEvent\" was null.");
        Camera camera2 = this.camera;
        return camera2 == null ? new ArrayList<>() : hitTestAll(camera2.motionEventToRay(motionEvent));
    }

    public ArrayList<HitTestResult> hitTestAll(Ray ray) {
        Preconditions.checkNotNull(ray, "Parameter \"ray\" was null.");
        ArrayList<HitTestResult> arrayList = new ArrayList<>();
        this.collisionSystem.raycastAll(ray, arrayList, C2688j.f5194a, C2687i.f5193a);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public boolean isUnderTesting() {
        return this.isUnderTesting;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setupLightProbe$4$Scene(LightProbe lightProbe2) {
        if (!this.lightProbeSet) {
            setLightProbe(lightProbe2);
        }
    }

    public void onAddChild(Node node) {
        super.onAddChild(node);
        node.setSceneRecursively(this);
    }

    public void onRemoveChild(Node node) {
        super.onRemoveChild(node);
        node.setSceneRecursively((Scene) null);
    }

    /* access modifiers changed from: package-private */
    public void onTouchEvent(MotionEvent motionEvent) {
        Preconditions.checkNotNull(motionEvent, "Parameter \"motionEvent\" was null.");
        this.touchEventSystem.onTouchEvent(hitTest(motionEvent), motionEvent);
    }

    @Nullable
    public Node overlapTest(Node node) {
        Collider intersects;
        Preconditions.checkNotNull(node, "Parameter \"node\" was null.");
        Collider collider = node.getCollider();
        if (collider == null || (intersects = this.collisionSystem.intersects(collider)) == null) {
            return null;
        }
        return (Node) intersects.getTransformProvider();
    }

    public ArrayList<Node> overlapTestAll(Node node) {
        Preconditions.checkNotNull(node, "Parameter \"node\" was null.");
        ArrayList<Node> arrayList = new ArrayList<>();
        Collider collider = node.getCollider();
        if (collider == null) {
            return arrayList;
        }
        this.collisionSystem.intersectsAll(collider, new C2690l(arrayList));
        return arrayList;
    }

    public void removeOnPeekTouchListener(OnPeekTouchListener onPeekTouchListener) {
        this.touchEventSystem.removeOnPeekTouchListener(onPeekTouchListener);
    }

    public void removeOnUpdateListener(OnUpdateListener onUpdateListener) {
        Preconditions.checkNotNull(onUpdateListener, "Parameter 'onUpdateListener' was null.");
        this.onUpdateListeners.remove(onUpdateListener);
    }

    public void setLightEstimate(Color color, float f) {
        LightProbe lightProbe2 = this.lightProbe;
        if (lightProbe2 != null) {
            lightProbe2.setLightEstimate(color, f);
            setLightProbe(this.lightProbe);
        }
        Sun sun = this.sunlightNode;
        if (sun != null) {
            sun.setLightEstimate(color, f);
        }
    }

    public void setLightProbe(LightProbe lightProbe2) {
        Preconditions.checkNotNull(lightProbe2, "Parameter \"lightProbe\" was null.");
        this.lightProbe = lightProbe2;
        this.lightProbeSet = true;
        SceneView sceneView = this.view;
        if (sceneView != null) {
            ((Renderer) Preconditions.checkNotNull(sceneView.getRenderer())).setLightProbe(lightProbe2);
            return;
        }
        throw new IllegalStateException("Scene's view must not be null.");
    }

    public void setOnTouchListener(@Nullable OnTouchListener onTouchListener) {
        this.touchEventSystem.setOnTouchListener(onTouchListener);
    }
}
