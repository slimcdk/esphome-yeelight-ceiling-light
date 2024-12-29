package com.google.p107ar.sceneform.p108ux;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.p107ar.core.ArCoreApk;
import com.google.p107ar.core.Config;
import com.google.p107ar.core.Frame;
import com.google.p107ar.core.HitResult;
import com.google.p107ar.core.Plane;
import com.google.p107ar.core.Session;
import com.google.p107ar.core.Trackable;
import com.google.p107ar.core.TrackingState;
import com.google.p107ar.core.exceptions.CameraNotAvailableException;
import com.google.p107ar.core.exceptions.UnavailableException;
import com.google.p107ar.sceneform.ArSceneView;
import com.google.p107ar.sceneform.FrameTime;
import com.google.p107ar.sceneform.HitTestResult;
import com.google.p107ar.sceneform.Scene;
import com.google.p107ar.sceneform.rendering.ModelRenderable;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.ar.sceneform.ux.BaseArFragment */
public abstract class BaseArFragment extends Fragment implements Scene.OnPeekTouchListener, Scene.OnUpdateListener {
    private static final int RC_PERMISSIONS = 1010;
    private static final String TAG = BaseArFragment.class.getSimpleName();
    private ArSceneView arSceneView;
    private boolean canRequestDangerousPermissions = true;
    private FrameLayout frameLayout;
    private GestureDetector gestureDetector;
    private boolean installRequested;
    private boolean isStarted;
    private final ViewTreeObserver.OnWindowFocusChangeListener onFocusListener = new C2797c(this);
    @Nullable
    private OnTapArPlaneListener onTapArPlaneListener;
    private PlaneDiscoveryController planeDiscoveryController;
    private boolean sessionInitializationFailed = false;
    private TransformationSystem transformationSystem;

    /* renamed from: com.google.ar.sceneform.ux.BaseArFragment$OnTapArPlaneListener */
    public interface OnTapArPlaneListener {
        void onTapPlane(HitResult hitResult, Plane plane, MotionEvent motionEvent);
    }

    /* renamed from: com.google.ar.sceneform.ux.BaseArFragment$a */
    class C2788a extends GestureDetector.SimpleOnGestureListener {
        C2788a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            BaseArFragment.this.onSingleTap(motionEvent);
            return true;
        }
    }

    /* renamed from: com.google.ar.sceneform.ux.BaseArFragment$b */
    class C2789b implements DialogInterface.OnDismissListener {
        C2789b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!BaseArFragment.this.getCanRequestDangerousPermissions().booleanValue()) {
                BaseArFragment.this.requireActivity().finish();
            }
        }
    }

    /* renamed from: com.google.ar.sceneform.ux.BaseArFragment$c */
    class C2790c implements DialogInterface.OnClickListener {
        C2790c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", BaseArFragment.this.requireActivity().getPackageName(), (String) null));
            BaseArFragment.this.requireActivity().startActivity(intent);
            BaseArFragment.this.setCanRequestDangerousPermissions(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.ar.sceneform.ux.BaseArFragment$d */
    static /* synthetic */ class C2791d {

        /* renamed from: a */
        static final /* synthetic */ int[] f5391a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.ar.core.ArCoreApk$InstallStatus[] r0 = com.google.p107ar.core.ArCoreApk.InstallStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5391a = r0
                com.google.ar.core.ArCoreApk$InstallStatus r1 = com.google.p107ar.core.ArCoreApk.InstallStatus.INSTALL_REQUESTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5391a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ar.core.ArCoreApk$InstallStatus r1 = com.google.p107ar.core.ArCoreApk.InstallStatus.INSTALLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.p108ux.BaseArFragment.C2791d.<clinit>():void");
        }
    }

    private Session createSession() {
        Session createSessionWithFeatures = createSessionWithFeatures();
        return createSessionWithFeatures == null ? new Session((Context) requireActivity()) : createSessionWithFeatures;
    }

    @Nullable
    private View loadPlaneDiscoveryView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        return layoutInflater.inflate(C2792R.layout.sceneform_plane_discovery_layout, viewGroup, false);
    }

    /* access modifiers changed from: private */
    public void onSingleTap(MotionEvent motionEvent) {
        Frame arFrame = this.arSceneView.getArFrame();
        this.transformationSystem.selectNode((BaseTransformableNode) null);
        OnTapArPlaneListener onTapArPlaneListener2 = this.onTapArPlaneListener;
        if (arFrame != null && onTapArPlaneListener2 != null && motionEvent != null && arFrame.getCamera().getTrackingState() == TrackingState.TRACKING) {
            for (HitResult next : arFrame.hitTest(motionEvent)) {
                Trackable trackable = next.getTrackable();
                if (trackable instanceof Plane) {
                    Plane plane = (Plane) trackable;
                    if (plane.isPoseInPolygon(next.getHitPose())) {
                        onTapArPlaneListener2.onTapPlane(next, plane, motionEvent);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m8444r(FootprintSelectionVisualizer footprintSelectionVisualizer, ModelRenderable modelRenderable) {
        if (footprintSelectionVisualizer.getFootprintRenderable() == null) {
            footprintSelectionVisualizer.setFootprintRenderable(modelRenderable);
        }
    }

    private void start() {
        if (!this.isStarted && getActivity() != null) {
            this.isStarted = true;
            try {
                this.arSceneView.resume();
            } catch (CameraNotAvailableException unused) {
                this.sessionInitializationFailed = true;
            }
            if (!this.sessionInitializationFailed) {
                this.planeDiscoveryController.show();
            }
        }
    }

    private void stop() {
        if (this.isStarted) {
            this.isStarted = false;
            this.planeDiscoveryController.hide();
            this.arSceneView.pause();
        }
    }

    /* access modifiers changed from: package-private */
    public Session createSessionWithFeatures() {
        return new Session(requireActivity(), getSessionFeatures());
    }

    public abstract String[] getAdditionalPermissions();

    public ArSceneView getArSceneView() {
        return this.arSceneView;
    }

    /* access modifiers changed from: protected */
    public Boolean getCanRequestDangerousPermissions() {
        return Boolean.valueOf(this.canRequestDangerousPermissions);
    }

    public PlaneDiscoveryController getPlaneDiscoveryController() {
        return this.planeDiscoveryController;
    }

    /* access modifiers changed from: protected */
    public abstract Config getSessionConfiguration(Session session);

    /* access modifiers changed from: protected */
    public abstract Set<Session.Feature> getSessionFeatures();

    public TransformationSystem getTransformationSystem() {
        return this.transformationSystem;
    }

    /* access modifiers changed from: protected */
    public abstract void handleSessionException(UnavailableException unavailableException);

    /* access modifiers changed from: protected */
    public final void initializeSession() {
        UnavailableException unavailableException;
        if (!this.sessionInitializationFailed) {
            if (ContextCompat.checkSelfPermission(requireActivity(), "android.permission.CAMERA") == 0) {
                try {
                    if (!requestInstall()) {
                        Session createSession = createSession();
                        Config sessionConfiguration = getSessionConfiguration(createSession);
                        sessionConfiguration.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
                        createSession.configure(sessionConfiguration);
                        getArSceneView().setupSession(createSession);
                    }
                } catch (UnavailableException e) {
                    unavailableException = e;
                    this.sessionInitializationFailed = true;
                    handleSessionException(unavailableException);
                } catch (Exception e2) {
                    unavailableException = new UnavailableException();
                    unavailableException.initCause(e2);
                    this.sessionInitializationFailed = true;
                    handleSessionException(unavailableException);
                }
            } else {
                requestDangerousPermissions();
            }
        }
    }

    public abstract boolean isArRequired();

    /* access modifiers changed from: protected */
    public TransformationSystem makeTransformationSystem() {
        FootprintSelectionVisualizer footprintSelectionVisualizer = new FootprintSelectionVisualizer();
        TransformationSystem transformationSystem2 = new TransformationSystem(getResources().getDisplayMetrics(), footprintSelectionVisualizer);
        setupSelectionRenderable(footprintSelectionVisualizer);
        return transformationSystem2;
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout2 = (FrameLayout) layoutInflater.inflate(C2792R.layout.sceneform_ux_fragment_layout, viewGroup, false);
        this.frameLayout = frameLayout2;
        this.arSceneView = (ArSceneView) frameLayout2.findViewById(C2792R.C2794id.sceneform_ar_scene_view);
        View loadPlaneDiscoveryView = loadPlaneDiscoveryView(layoutInflater, viewGroup);
        if (loadPlaneDiscoveryView != null) {
            this.frameLayout.addView(loadPlaneDiscoveryView);
        }
        this.planeDiscoveryController = new PlaneDiscoveryController(loadPlaneDiscoveryView);
        if (Build.VERSION.SDK_INT < 24) {
            return this.frameLayout;
        }
        this.transformationSystem = makeTransformationSystem();
        this.gestureDetector = new GestureDetector(getContext(), new C2788a());
        this.arSceneView.getScene().addOnPeekTouchListener(this);
        this.arSceneView.getScene().addOnUpdateListener(this);
        if (isArRequired()) {
            requestDangerousPermissions();
        }
        this.arSceneView.getViewTreeObserver().addOnWindowFocusChangeListener(this.onFocusListener);
        return this.frameLayout;
    }

    public void onDestroy() {
        stop();
        this.arSceneView.destroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.arSceneView.getViewTreeObserver().removeOnWindowFocusChangeListener(this.onFocusListener);
    }

    public void onPause() {
        super.onPause();
        stop();
    }

    public void onPeekTouch(HitTestResult hitTestResult, MotionEvent motionEvent) {
        this.transformationSystem.onTouch(hitTestResult, motionEvent);
        if (hitTestResult.getNode() == null) {
            this.gestureDetector.onTouchEvent(motionEvent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (ContextCompat.checkSelfPermission(requireActivity(), "android.permission.CAMERA") != 0) {
            new AlertDialog.Builder(requireActivity(), 16974374).setTitle("Camera permission required").setMessage("Add camera permission via Settings?").setPositiveButton(17039370, new C2790c()).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setIcon(17301543).setOnDismissListener(new C2789b()).show();
        }
    }

    public void onResume() {
        super.onResume();
        if (isArRequired() && this.arSceneView.getSession() == null) {
            initializeSession();
        }
        start();
    }

    public void onUpdate(FrameTime frameTime) {
        Frame arFrame = this.arSceneView.getArFrame();
        if (arFrame != null) {
            for (Plane trackingState : arFrame.getUpdatedTrackables(Plane.class)) {
                if (trackingState.getTrackingState() == TrackingState.TRACKING) {
                    this.planeDiscoveryController.hide();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: onWindowFocusChanged */
    public void mo16371q(boolean z) {
        FragmentActivity activity = getActivity();
        if (z && activity != null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            activity.getWindow().addFlags(128);
        }
    }

    /* access modifiers changed from: protected */
    public void requestDangerousPermissions() {
        if (this.canRequestDangerousPermissions) {
            this.canRequestDangerousPermissions = false;
            ArrayList arrayList = new ArrayList();
            String[] additionalPermissions = getAdditionalPermissions();
            int length = additionalPermissions != null ? additionalPermissions.length : 0;
            for (int i = 0; i < length; i++) {
                if (ContextCompat.checkSelfPermission(requireActivity(), additionalPermissions[i]) != 0) {
                    arrayList.add(additionalPermissions[i]);
                }
            }
            if (ContextCompat.checkSelfPermission(requireActivity(), "android.permission.CAMERA") != 0) {
                arrayList.add("android.permission.CAMERA");
            }
            if (!arrayList.isEmpty()) {
                requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1010);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean requestInstall() {
        if (C2791d.f5391a[ArCoreApk.getInstance().requestInstall(requireActivity(), !this.installRequested).ordinal()] != 1) {
            return false;
        }
        this.installRequested = true;
        return true;
    }

    /* renamed from: s */
    public /* synthetic */ Void mo16374s(Throwable th) {
        Toast makeText = Toast.makeText(getContext(), "Unable to load footprint renderable", 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        return null;
    }

    /* access modifiers changed from: protected */
    public void setCanRequestDangerousPermissions(Boolean bool) {
        this.canRequestDangerousPermissions = bool.booleanValue();
    }

    public void setOnTapArPlaneListener(@Nullable OnTapArPlaneListener onTapArPlaneListener2) {
        this.onTapArPlaneListener = onTapArPlaneListener2;
    }

    /* access modifiers changed from: protected */
    public void setupSelectionRenderable(FootprintSelectionVisualizer footprintSelectionVisualizer) {
        ((ModelRenderable.Builder) ModelRenderable.builder().setSource((Context) getActivity(), C2792R.raw.sceneform_footprint)).build().thenAccept(new C2799e(footprintSelectionVisualizer)).exceptionally(new C2798d(this));
    }
}
