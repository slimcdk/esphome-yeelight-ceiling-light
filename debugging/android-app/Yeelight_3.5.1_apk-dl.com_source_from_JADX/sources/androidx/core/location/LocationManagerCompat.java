package androidx.core.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.p007os.CancellationSignal;
import androidx.core.p007os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static Field sContextField;
    @GuardedBy("sLocationListeners")
    static final WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> sLocationListeners = new WeakHashMap<>();

    @RequiresApi(19)
    static class Api19Impl {
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
        }

        @DoNotInline
        static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = Class.forName("android.location.LocationRequest");
                    }
                    if (sRequestLocationUpdatesLooperMethod == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, LocationListener.class, Looper.class});
                        sRequestLocationUpdatesLooperMethod = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        sRequestLocationUpdatesLooperMethod.invoke(locationManager, new Object[]{locationRequest, locationListenerCompat, looper});
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerTransport locationListenerTransport) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = Class.forName("android.location.LocationRequest");
                    }
                    if (sRequestLocationUpdatesLooperMethod == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, LocationListener.class, Looper.class});
                        sRequestLocationUpdatesLooperMethod = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        synchronized (LocationManagerCompat.sLocationListeners) {
                            sRequestLocationUpdatesLooperMethod.invoke(locationManager, new Object[]{locationRequest, locationListenerTransport, Looper.getMainLooper()});
                            LocationManagerCompat.registerLocationListenerTransport(locationManager, locationListenerTransport);
                        }
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        static boolean registerGnssStatusCallback(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(handler != null);
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssLazyLoader.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                PreRGnssStatusTransport preRGnssStatusTransport = (PreRGnssStatusTransport) simpleArrayMap.get(callback);
                if (preRGnssStatusTransport == null) {
                    preRGnssStatusTransport = new PreRGnssStatusTransport(callback);
                } else {
                    preRGnssStatusTransport.unregister();
                }
                preRGnssStatusTransport.register(executor);
                if (!locationManager.registerGnssStatusCallback(preRGnssStatusTransport, handler)) {
                    return false;
                }
                simpleArrayMap.put(callback, preRGnssStatusTransport);
                return true;
            }
        }

        @DoNotInline
        static void unregisterGnssStatusCallback(LocationManager locationManager, Object obj) {
            if (obj instanceof PreRGnssStatusTransport) {
                ((PreRGnssStatusTransport) obj).unregister();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static String getGnssHardwareModelName(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @DoNotInline
        static int getGnssYearOfHardware(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @DoNotInline
        static boolean isLocationEnabled(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @RequiresApi(30)
    private static class Api30Impl {
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        static void getCurrentLocation(LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull Consumer<Location> consumer) {
            android.os.CancellationSignal cancellationSignal2 = cancellationSignal != null ? (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject() : null;
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal2, executor, new C0252e(consumer));
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        public static boolean registerGnssStatusCallback(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssLazyLoader.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                GnssStatusTransport gnssStatusTransport = (GnssStatusTransport) simpleArrayMap.get(callback);
                if (gnssStatusTransport == null) {
                    gnssStatusTransport = new GnssStatusTransport(callback);
                }
                if (!locationManager.registerGnssStatusCallback(executor, gnssStatusTransport)) {
                    return false;
                }
                simpleArrayMap.put(callback, gnssStatusTransport);
                return true;
            }
        }

        @DoNotInline
        public static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = Class.forName("android.location.LocationRequest");
                    }
                    if (sRequestLocationUpdatesExecutorMethod == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, Executor.class, LocationListener.class});
                        sRequestLocationUpdatesExecutorMethod = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        sRequestLocationUpdatesExecutorMethod.invoke(locationManager, new Object[]{locationRequest, executor, locationListenerCompat});
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @RequiresApi(31)
    private static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static boolean hasProvider(LocationManager locationManager, @NonNull String str) {
            return locationManager.hasProvider(str);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        static void requestLocationUpdates(LocationManager locationManager, @NonNull String str, @NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    private static final class CancellableLocationListener implements LocationListener {
        private Consumer<Location> mConsumer;
        private final Executor mExecutor;
        private final LocationManager mLocationManager;
        private final Handler mTimeoutHandler = new Handler(Looper.getMainLooper());
        @Nullable
        Runnable mTimeoutRunnable;
        @GuardedBy("this")
        private boolean mTriggered;

        CancellableLocationListener(LocationManager locationManager, Executor executor, Consumer<Location> consumer) {
            this.mLocationManager = locationManager;
            this.mExecutor = executor;
            this.mConsumer = consumer;
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void cleanup() {
            this.mConsumer = null;
            this.mLocationManager.removeUpdates(this);
            Runnable runnable = this.mTimeoutRunnable;
            if (runnable != null) {
                this.mTimeoutHandler.removeCallbacks(runnable);
                this.mTimeoutRunnable = null;
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$startTimeout$0() {
            this.mTimeoutRunnable = null;
            onLocationChanged((Location) null);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void cancel() {
            synchronized (this) {
                if (!this.mTriggered) {
                    this.mTriggered = true;
                    cleanup();
                }
            }
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@Nullable Location location) {
            synchronized (this) {
                if (!this.mTriggered) {
                    this.mTriggered = true;
                    this.mExecutor.execute(new C0254g(this.mConsumer, location));
                    cleanup();
                }
            }
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@NonNull String str) {
            onLocationChanged((Location) null);
        }

        public void onProviderEnabled(@NonNull String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        @SuppressLint({"MissingPermission"})
        public void startTimeout(long j) {
            synchronized (this) {
                if (!this.mTriggered) {
                    C0253f fVar = new C0253f(this);
                    this.mTimeoutRunnable = fVar;
                    this.mTimeoutHandler.postDelayed(fVar, j);
                }
            }
        }
    }

    private static class GnssLazyLoader {
        @GuardedBy("sGnssStatusListeners")
        static final SimpleArrayMap<Object, Object> sGnssStatusListeners = new SimpleArrayMap<>();

        private GnssLazyLoader() {
        }
    }

    @RequiresApi(30)
    private static class GnssStatusTransport extends GnssStatus.Callback {
        final GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public void onFirstFix(int i) {
            this.mCallback.onFirstFix(i);
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        public void onStarted() {
            this.mCallback.onStarted();
        }

        public void onStopped() {
            this.mCallback.onStopped();
        }
    }

    private static class GpsStatusTransport implements GpsStatus.Listener {
        final GnssStatusCompat.Callback mCallback;
        @Nullable
        volatile Executor mExecutor;
        private final LocationManager mLocationManager;

        GpsStatusTransport(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mLocationManager = locationManager;
            this.mCallback = callback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$0(Executor executor) {
            if (this.mExecutor == executor) {
                this.mCallback.onStarted();
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$1(Executor executor) {
            if (this.mExecutor == executor) {
                this.mCallback.onStopped();
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$2(Executor executor, int i) {
            if (this.mExecutor == executor) {
                this.mCallback.onFirstFix(i);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$3(Executor executor, GnssStatusCompat gnssStatusCompat) {
            if (this.mExecutor == executor) {
                this.mCallback.onSatelliteStatusChanged(gnssStatusCompat);
            }
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i) {
            Runnable runnable;
            Runnable runnable2;
            GpsStatus gpsStatus;
            Executor executor = this.mExecutor;
            if (executor != null) {
                if (i == 1) {
                    runnable = new C0255h(this, executor);
                } else if (i != 2) {
                    if (i == 3) {
                        GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus((GpsStatus) null);
                        if (gpsStatus2 != null) {
                            runnable2 = new C0257j(this, executor, gpsStatus2.getTimeToFirstFix());
                        } else {
                            return;
                        }
                    } else if (i == 4 && (gpsStatus = this.mLocationManager.getGpsStatus((GpsStatus) null)) != null) {
                        runnable2 = new C0258k(this, executor, GnssStatusCompat.wrap(gpsStatus));
                    } else {
                        return;
                    }
                    executor.execute(runnable2);
                    return;
                } else {
                    runnable = new C0256i(this, executor);
                }
                executor.execute(runnable);
            }
        }

        public void register(Executor executor) {
            Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    private static final class InlineHandlerExecutor implements Executor {
        private final Handler mHandler;

        InlineHandlerExecutor(@NonNull Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        public void execute(@NonNull Runnable runnable) {
            if (Looper.myLooper() == this.mHandler.getLooper()) {
                runnable.run();
            } else if (!this.mHandler.post((Runnable) Preconditions.checkNotNull(runnable))) {
                throw new RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    private static class LocationListenerKey {
        final LocationListenerCompat mListener;
        final String mProvider;

        LocationListenerKey(String str, LocationListenerCompat locationListenerCompat) {
            this.mProvider = (String) ObjectsCompat.requireNonNull(str, "invalid null provider");
            this.mListener = (LocationListenerCompat) ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            LocationListenerKey locationListenerKey = (LocationListenerKey) obj;
            return this.mProvider.equals(locationListenerKey.mProvider) && this.mListener.equals(locationListenerKey.mListener);
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mProvider, this.mListener);
        }
    }

    private static class LocationListenerTransport implements LocationListener {
        final Executor mExecutor;
        @Nullable
        volatile LocationListenerKey mKey;

        LocationListenerTransport(@Nullable LocationListenerKey locationListenerKey, Executor executor) {
            this.mKey = locationListenerKey;
            this.mExecutor = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onFlushComplete$2(int i) {
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onFlushComplete(i);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onLocationChanged$0(Location location) {
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onLocationChanged(location);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onLocationChanged$1(List list) {
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onLocationChanged(list);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onProviderDisabled$5(String str) {
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onProviderDisabled(str);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onProviderEnabled$4(String str) {
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onProviderEnabled(str);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onStatusChanged$3(String str, int i, Bundle bundle) {
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onStatusChanged(str, i, bundle);
            }
        }

        public LocationListenerKey getKey() {
            return (LocationListenerKey) ObjectsCompat.requireNonNull(this.mKey);
        }

        public void onFlushComplete(int i) {
            if (this.mKey != null) {
                this.mExecutor.execute(new C0259l(this, i));
            }
        }

        public void onLocationChanged(@NonNull Location location) {
            if (this.mKey != null) {
                this.mExecutor.execute(new C0260m(this, location));
            }
        }

        public void onLocationChanged(@NonNull List<Location> list) {
            if (this.mKey != null) {
                this.mExecutor.execute(new C0264q(this, list));
            }
        }

        public void onProviderDisabled(@NonNull String str) {
            if (this.mKey != null) {
                this.mExecutor.execute(new C0262o(this, str));
            }
        }

        public void onProviderEnabled(@NonNull String str) {
            if (this.mKey != null) {
                this.mExecutor.execute(new C0261n(this, str));
            }
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (this.mKey != null) {
                this.mExecutor.execute(new C0263p(this, str, i, bundle));
            }
        }

        public void unregister() {
            this.mKey = null;
        }
    }

    @RequiresApi(24)
    private static class PreRGnssStatusTransport extends GnssStatus.Callback {
        final GnssStatusCompat.Callback mCallback;
        @Nullable
        volatile Executor mExecutor;

        PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onFirstFix$2(Executor executor, int i) {
            if (this.mExecutor == executor) {
                this.mCallback.onFirstFix(i);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onSatelliteStatusChanged$3(Executor executor, GnssStatus gnssStatus) {
            if (this.mExecutor == executor) {
                this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onStarted$0(Executor executor) {
            if (this.mExecutor == executor) {
                this.mCallback.onStarted();
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onStopped$1(Executor executor) {
            if (this.mExecutor == executor) {
                this.mCallback.onStopped();
            }
        }

        public void onFirstFix(int i) {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new C0267t(this, executor, i));
            }
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new C0268u(this, executor, gnssStatus));
            }
        }

        public void onStarted() {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new C0266s(this, executor));
            }
        }

        public void onStopped() {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new C0265r(this, executor));
            }
        }

        public void register(Executor executor) {
            boolean z = true;
            Preconditions.checkArgument(executor != null, "invalid null executor");
            if (this.mExecutor != null) {
                z = false;
            }
            Preconditions.checkState(z);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    private LocationManagerCompat() {
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(@NonNull LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull Consumer<Location> consumer) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.getCurrentLocation(locationManager, str, cancellationSignal, executor, consumer);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation == null || SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(lastKnownLocation) >= MAX_CURRENT_LOCATION_AGE_MS) {
            CancellableLocationListener cancellableLocationListener = new CancellableLocationListener(locationManager, executor, consumer);
            locationManager.requestLocationUpdates(str, 0, 0.0f, cancellableLocationListener, Looper.getMainLooper());
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new C0249b(cancellableLocationListener));
            }
            cancellableLocationListener.startTimeout(GET_CURRENT_LOCATION_TIMEOUT_MS);
            return;
        }
        executor.execute(new C0250c(consumer, lastKnownLocation));
    }

    @Nullable
    public static String getGnssHardwareModelName(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getGnssHardwareModelName(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getGnssYearOfHardware(locationManager);
        }
        return 0;
    }

    public static boolean hasProvider(@NonNull LocationManager locationManager, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.hasProvider(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean isLocationEnabled(@NonNull LocationManager locationManager) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Api28Impl.isLocationEnabled(locationManager);
        }
        if (i <= 19) {
            try {
                if (sContextField == null) {
                    Field declaredField = LocationManager.class.getDeclaredField("mContext");
                    sContextField = declaredField;
                    declaredField.setAccessible(true);
                }
                Context context = (Context) sContextField.get(locationManager);
                if (context != null) {
                    return i == 19 ? Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0 : !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
                }
            } catch (ClassCastException | IllegalAccessException | NoSuchFieldException | SecurityException unused) {
            }
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0093 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c5 A[Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00da A[Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e4 A[SYNTHETIC, Splitter:B:72:0x00e4] */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean registerGnssStatusCallback(android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, androidx.core.location.GnssStatusCompat.Callback r12) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x000b
            boolean r9 = androidx.core.location.LocationManagerCompat.Api30Impl.registerGnssStatusCallback(r9, r10, r11, r12)
            return r9
        L_0x000b:
            r1 = 24
            if (r0 < r1) goto L_0x0014
            boolean r9 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssStatusCallback(r9, r10, r11, r12)
            return r9
        L_0x0014:
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            androidx.core.util.Preconditions.checkArgument(r2)
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssLazyLoader.sGnssStatusListeners
            monitor-enter(r2)
            java.lang.Object r3 = r2.get(r12)     // Catch:{ all -> 0x0103 }
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r3 = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) r3     // Catch:{ all -> 0x0103 }
            if (r3 != 0) goto L_0x002f
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r3 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport     // Catch:{ all -> 0x0103 }
            r3.<init>(r9, r12)     // Catch:{ all -> 0x0103 }
            goto L_0x0032
        L_0x002f:
            r3.unregister()     // Catch:{ all -> 0x0103 }
        L_0x0032:
            r3.register(r11)     // Catch:{ all -> 0x0103 }
            java.util.concurrent.FutureTask r11 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0103 }
            androidx.core.location.d r4 = new androidx.core.location.d     // Catch:{ all -> 0x0103 }
            r4.<init>(r9, r3)     // Catch:{ all -> 0x0103 }
            r11.<init>(r4)     // Catch:{ all -> 0x0103 }
            android.os.Looper r9 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0103 }
            android.os.Looper r4 = r10.getLooper()     // Catch:{ all -> 0x0103 }
            if (r9 != r4) goto L_0x004d
            r11.run()     // Catch:{ all -> 0x0103 }
            goto L_0x0053
        L_0x004d:
            boolean r9 = r10.post(r11)     // Catch:{ all -> 0x0103 }
            if (r9 == 0) goto L_0x00ec
        L_0x0053:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f }
            r4 = 5
            long r4 = r9.toNanos(r4)     // Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f }
            long r6 = java.lang.System.nanoTime()     // Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f }
            long r6 = r6 + r4
            r9 = 0
        L_0x0061:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            java.lang.Object r4 = r11.get(r4, r8)     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            boolean r4 = r4.booleanValue()     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            if (r4 == 0) goto L_0x007f
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r4 = androidx.core.location.LocationManagerCompat.GnssLazyLoader.sGnssStatusListeners     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            r4.put(r12, r3)     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            if (r9 == 0) goto L_0x007d
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0103 }
            r9.interrupt()     // Catch:{ all -> 0x0103 }
        L_0x007d:
            monitor-exit(r2)     // Catch:{ all -> 0x0103 }
            return r0
        L_0x007f:
            if (r9 == 0) goto L_0x0088
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0103 }
            r9.interrupt()     // Catch:{ all -> 0x0103 }
        L_0x0088:
            monitor-exit(r2)     // Catch:{ all -> 0x0103 }
            return r1
        L_0x008a:
            r10 = move-exception
            r0 = r9
            goto L_0x00e2
        L_0x008d:
            r11 = move-exception
            r0 = r9
            goto L_0x00a4
        L_0x0090:
            r10 = move-exception
            r0 = r9
            goto L_0x00bd
        L_0x0093:
            long r4 = java.lang.System.nanoTime()     // Catch:{ ExecutionException -> 0x009d, TimeoutException -> 0x009b }
            long r4 = r6 - r4
            r9 = 1
            goto L_0x0061
        L_0x009b:
            r11 = move-exception
            goto L_0x00a4
        L_0x009d:
            r10 = move-exception
            goto L_0x00bd
        L_0x009f:
            r10 = move-exception
            r0 = 0
            goto L_0x00e2
        L_0x00a2:
            r11 = move-exception
            r0 = 0
        L_0x00a4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e1 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r12.<init>()     // Catch:{ all -> 0x00e1 }
            r12.append(r10)     // Catch:{ all -> 0x00e1 }
            java.lang.String r10 = " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread"
            r12.append(r10)     // Catch:{ all -> 0x00e1 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x00e1 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00bb:
            r10 = move-exception
            r0 = 0
        L_0x00bd:
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x00e1 }
            boolean r9 = r9 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x00e1 }
            if (r9 != 0) goto L_0x00da
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x00e1 }
            boolean r9 = r9 instanceof java.lang.Error     // Catch:{ all -> 0x00e1 }
            if (r9 == 0) goto L_0x00d4
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x00e1 }
            java.lang.Error r9 = (java.lang.Error) r9     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00d4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00da:
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x00e1 }
            java.lang.RuntimeException r9 = (java.lang.RuntimeException) r9     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r10 = move-exception
        L_0x00e2:
            if (r0 == 0) goto L_0x00eb
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0103 }
            r9.interrupt()     // Catch:{ all -> 0x0103 }
        L_0x00eb:
            throw r10     // Catch:{ all -> 0x0103 }
        L_0x00ec:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0103 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
            r11.<init>()     // Catch:{ all -> 0x0103 }
            r11.append(r10)     // Catch:{ all -> 0x0103 }
            java.lang.String r10 = " is shutting down"
            r11.append(r10)     // Catch:{ all -> 0x0103 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x0103 }
            r9.<init>(r10)     // Catch:{ all -> 0x0103 }
            throw r9     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0103 }
            goto L_0x0107
        L_0x0106:
            throw r9
        L_0x0107:
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.LocationManagerCompat.registerGnssStatusCallback(android.location.LocationManager, android.os.Handler, java.util.concurrent.Executor, androidx.core.location.GnssStatusCompat$Callback):boolean");
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback, @NonNull Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback) : registerGnssStatusCallback(locationManager, (Executor) new InlineHandlerExecutor(handler), callback);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, (Handler) null, executor, callback);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return registerGnssStatusCallback(locationManager, new Handler(myLooper), executor, callback);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @GuardedBy("sLocationListeners")
    static void registerLocationListenerTransport(LocationManager locationManager, LocationListenerTransport locationListenerTransport) {
        WeakReference put = sLocationListeners.put(locationListenerTransport.getKey(), new WeakReference(locationListenerTransport));
        LocationListenerTransport locationListenerTransport2 = put != null ? (LocationListenerTransport) put.get() : null;
        if (locationListenerTransport2 != null) {
            locationListenerTransport2.unregister();
            locationManager.removeUpdates(locationListenerTransport2);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void removeUpdates(@NonNull LocationManager locationManager, @NonNull LocationListenerCompat locationListenerCompat) {
        WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> weakHashMap = sLocationListeners;
        synchronized (weakHashMap) {
            ArrayList arrayList = null;
            for (WeakReference<LocationListenerTransport> weakReference : weakHashMap.values()) {
                LocationListenerTransport locationListenerTransport = (LocationListenerTransport) weakReference.get();
                if (locationListenerTransport != null) {
                    LocationListenerKey key = locationListenerTransport.getKey();
                    if (key.mListener == locationListenerCompat) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(key);
                        locationListenerTransport.unregister();
                        locationManager.removeUpdates(locationListenerTransport);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sLocationListeners.remove((LocationListenerKey) it.next());
                }
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull LocationListenerCompat locationListenerCompat, @NonNull Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), ExecutorCompat.create(new Handler(looper)), locationListenerCompat);
        } else if (i < 19 || !Api19Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, locationListenerCompat, looper)) {
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull Executor executor, @NonNull LocationListenerCompat locationListenerCompat) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
        } else if (i < 30 || !Api30Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, executor, locationListenerCompat)) {
            LocationListenerTransport locationListenerTransport = new LocationListenerTransport(new LocationListenerKey(str, locationListenerCompat), executor);
            if (i < 19 || !Api19Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, locationListenerTransport)) {
                synchronized (sLocationListeners) {
                    locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerTransport, Looper.getMainLooper());
                    registerLocationListenerTransport(locationManager, locationListenerTransport);
                }
            }
        }
    }

    public static void unregisterGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 24) {
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssLazyLoader.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                Object remove = simpleArrayMap.remove(callback);
                if (remove != null) {
                    Api24Impl.unregisterGnssStatusCallback(locationManager, remove);
                }
            }
            return;
        }
        SimpleArrayMap<Object, Object> simpleArrayMap2 = GnssLazyLoader.sGnssStatusListeners;
        synchronized (simpleArrayMap2) {
            GpsStatusTransport gpsStatusTransport = (GpsStatusTransport) simpleArrayMap2.remove(callback);
            if (gpsStatusTransport != null) {
                gpsStatusTransport.unregister();
                locationManager.removeGpsStatusListener(gpsStatusTransport);
            }
        }
    }
}
