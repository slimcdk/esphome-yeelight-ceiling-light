package com.google.p017ar.core;

import android.content.Context;
import android.os.Build;
import com.google.p017ar.core.annotations.UsedByNative;
import com.google.p017ar.core.exceptions.AnchorNotSupportedForHostingException;
import com.google.p017ar.core.exceptions.CameraNotAvailableException;
import com.google.p017ar.core.exceptions.CloudAnchorsNotConfiguredException;
import com.google.p017ar.core.exceptions.DataInvalidFormatException;
import com.google.p017ar.core.exceptions.DataUnsupportedVersionException;
import com.google.p017ar.core.exceptions.DeadlineExceededException;
import com.google.p017ar.core.exceptions.FatalException;
import com.google.p017ar.core.exceptions.ImageInsufficientQualityException;
import com.google.p017ar.core.exceptions.MissingGlContextException;
import com.google.p017ar.core.exceptions.NotTrackingException;
import com.google.p017ar.core.exceptions.NotYetAvailableException;
import com.google.p017ar.core.exceptions.ResourceExhaustedException;
import com.google.p017ar.core.exceptions.SessionNotPausedException;
import com.google.p017ar.core.exceptions.SessionPausedException;
import com.google.p017ar.core.exceptions.TextureNotSetException;
import com.google.p017ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p017ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p017ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p017ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.p017ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.google.p017ar.core.exceptions.UnsupportedConfigurationException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ar.core.Session */
public class Session {
    private static final String TAG = "ARCore-Session";
    final C2013a0 faceCache;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    /* renamed from: com.google.ar.core.Session$Feature */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000);
        
        final int nativeCode;

        private Feature(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Session$a */
    enum C2008a {
        SUCCESS(0, (int) null),
        ERROR_INVALID_ARGUMENT(-1, IllegalArgumentException.class),
        ERROR_FATAL(-2, FatalException.class),
        ERROR_SESSION_PAUSED(-3, SessionPausedException.class),
        ERROR_SESSION_NOT_PAUSED(-4, SessionNotPausedException.class),
        ERROR_NOT_TRACKING(-5, NotTrackingException.class),
        ERROR_TEXTURE_NOT_SET(-6, TextureNotSetException.class),
        ERROR_MISSING_GL_CONTEXT(-7, MissingGlContextException.class),
        ERROR_UNSUPPORTED_CONFIGURATION(-8, UnsupportedConfigurationException.class),
        ERROR_CAMERA_PERMISSION_NOT_GRANTED(-9, SecurityException.class, "Camera permission is not granted"),
        ERROR_DEADLINE_EXCEEDED(-10, DeadlineExceededException.class),
        ERROR_RESOURCE_EXHAUSTED(-11, ResourceExhaustedException.class),
        ERROR_NOT_YET_AVAILABLE(-12, NotYetAvailableException.class),
        ERROR_CAMERA_NOT_AVAILABLE(-13, CameraNotAvailableException.class),
        ERROR_ANCHOR_NOT_SUPPORTED_FOR_HOSTING(-16, AnchorNotSupportedForHostingException.class),
        ERROR_IMAGE_INSUFFICIENT_QUALITY(-17, ImageInsufficientQualityException.class),
        ERROR_DATA_INVALID_FORMAT(-18, DataInvalidFormatException.class),
        ERROR_DATA_UNSUPPORTED_VERSION(-19, DataUnsupportedVersionException.class),
        ERROR_ILLEGAL_STATE(-20, IllegalStateException.class),
        ERROR_CLOUD_ANCHORS_NOT_CONFIGURED(-14, CloudAnchorsNotConfiguredException.class),
        ERROR_INTERNET_PERMISSION_NOT_GRANTED(-15, SecurityException.class, "Internet permission is not granted"),
        UNAVAILABLE_ARCORE_NOT_INSTALLED(-100, UnavailableArcoreNotInstalledException.class),
        UNAVAILABLE_DEVICE_NOT_COMPATIBLE(-101, UnavailableDeviceNotCompatibleException.class),
        UNAVAILABLE_APK_TOO_OLD(-103, UnavailableApkTooOldException.class),
        UNAVAILABLE_SDK_TOO_OLD(-104, UnavailableSdkTooOldException.class),
        UNAVAILABLE_USER_DECLINED_INSTALLATION(-105, UnavailableUserDeclinedInstallationException.class);
        

        /* renamed from: j */
        final int f3145j;

        /* renamed from: k */
        final Class<? extends Exception> f3146k;

        /* renamed from: l */
        final String f3147l;

        private C2008a(int i, Class<? extends Exception> cls) {
            this(r7, r8, i, cls, (String) null);
        }

        private C2008a(int i, Class<? extends Exception> cls, String str) {
            this.f3145j = i;
            this.f3146k = cls;
            this.f3147l = str;
        }
    }

    /* renamed from: com.google.ar.core.Session$b */
    enum C2009b {
        END_OF_LIST(0);
        

        /* renamed from: b */
        final int f3150b;

        private C2009b(int i) {
            this.f3150b = 0;
        }
    }

    /* renamed from: com.google.ar.core.Session$c */
    enum C2010c {
        BASE_TRACKABLE(1095893248, Trackable.class),
        UNKNOWN_TO_JAVA(-1, (int) null),
        PLANE(1095893249, Plane.class),
        POINT(1095893250, Point.class),
        AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
        FACE(1095893253, AugmentedFace.class);
        

        /* renamed from: b */
        final int f3158b;

        /* renamed from: h */
        private final Class<?> f3159h;

        private C2010c(int i, Class<? extends Trackable> cls) {
            this.f3158b = i;
            this.f3159h = cls;
        }

        /* renamed from: a */
        public static C2010c m5109a(Class<? extends Trackable> cls) {
            for (C2010c cVar : values()) {
                Class<?> cls2 = cVar.f3159h;
                if (cls2 != null && cls2.equals(cls)) {
                    return cVar;
                }
            }
            return UNKNOWN_TO_JAVA;
        }

        /* renamed from: a */
        public abstract Trackable mo16616a(long j, Session session);
    }

    protected Session() {
        this.faceCache = new C2013a0();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0;
    }

    Session(long j) {
        this.faceCache = new C2013a0();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
    }

    public Session(Context context) {
        this.faceCache = new C2013a0();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        this.nativeWrapperHandle = nativeCreateSessionAndWrapper(context);
        loadDynamicSymbolsAfterSessionCreate();
    }

    public Session(Context context, Set<Feature> set) {
        this.faceCache = new C2013a0();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[(set.size() + 1)];
        int i = 0;
        for (Feature feature : set) {
            iArr[i] = feature.nativeCode;
            i++;
        }
        iArr[i] = C2009b.END_OF_LIST.f3150b;
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) {
        System.loadLibrary("arcore_sdk_jni");
        Session session = new Session();
        session.nativeWrapperHandle = nativeCreateSessionAndWrapperForSharedCamera(context);
        session.sharedCamera = new SharedCamera(session);
        loadDynamicSymbolsAfterSessionCreate();
        return session;
    }

    static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    static void loadDynamicSymbolsAfterSessionCreate() {
        if (Build.VERSION.SDK_INT >= 24) {
            ArImage.nativeLoadSymbols();
            ImageMetadata.nativeLoadSymbols();
        }
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    private static native long nativeCreateSessionAndWrapper(Context context);

    private static native long nativeCreateSessionAndWrapperForSharedCamera(Context context);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    static native long nativeCreateSessionWrapperFromHandle(long j);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native void nativeResume(long j);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeUpdate(long j, long j2);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            sharedCamera2.pause();
        }
    }

    @UsedByNative("session_jni.cc")
    static void throwExceptionFromArStatus(int i) {
        for (C2008a aVar : C2008a.values()) {
            if (aVar.f3145j == i) {
                Class<? extends Exception> cls = aVar.f3146k;
                if (cls == null) {
                    return;
                }
                if (aVar.f3147l != null) {
                    throw ((Exception) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{aVar.f3147l}));
                }
                throw ((Exception) cls.getConstructor(new Class[0]).newInstance(new Object[0]));
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unexpected error code: ");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    /* access modifiers changed from: package-private */
    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long anchor : jArr) {
            arrayList.add(new Anchor(anchor, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long cameraConfig : jArr) {
            arrayList.add(new CameraConfig(this, cameraConfig));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long createTrackable : jArr) {
            Trackable createTrackable2 = createTrackable(createTrackable);
            if (createTrackable2 != null) {
                arrayList.add((Trackable) cls.cast(createTrackable2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    /* access modifiers changed from: package-private */
    public Trackable createTrackable(long j) {
        C2010c cVar;
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        C2010c[] values = C2010c.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = values[i];
            if (cVar.f3158b == internalGetType) {
                break;
            }
            i++;
        }
        if (cVar != null) {
            return cVar.mo16616a(j, this);
        }
        TrackableBase.internalReleaseNativeHandle(j);
        return null;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0;
        }
        super.finalize();
    }

    public Collection<Anchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        C2010c a = C2010c.m5109a(cls);
        return a == C2010c.UNKNOWN_TO_JAVA ? Collections.emptyList() : convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, a.f3158b));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            return sharedCamera2;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @Deprecated
    public List<CameraConfig> getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            ArrayList arrayList = new ArrayList(nativeGetSupportedCameraConfigsWithFilter.length);
            for (long cameraConfig : nativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, cameraConfig));
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    /* access modifiers changed from: package-private */
    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    /* access modifiers changed from: package-private */
    public native long[] nativeAcquireAllTrackables(long j, int i);

    /* access modifiers changed from: package-private */
    public native void nativeDestroySessionWrapper(long j);

    /* access modifiers changed from: package-private */
    public native long nativeGetSessionNativeHandle(long j);

    /* access modifiers changed from: package-private */
    public native long nativeReleaseSessionOwnership(long j);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }
}
