package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long mDurationMillis;
    final long mIntervalMillis;
    final long mMaxUpdateDelayMillis;
    final int mMaxUpdates;
    final float mMinUpdateDistanceMeters;
    final long mMinUpdateIntervalMillis;
    final int mQuality;

    @RequiresApi(19)
    private static class Api19Impl {
        private static Method sCreateFromDeprecatedProviderMethod;
        private static Class<?> sLocationRequestClass;
        private static Method sSetExpireInMethod;
        private static Method sSetFastestIntervalMethod;
        private static Method sSetNumUpdatesMethod;
        private static Method sSetQualityMethod;

        private Api19Impl() {
        }

        public static Object toLocationRequest(LocationRequestCompat locationRequestCompat, String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = Class.forName("android.location.LocationRequest");
                    }
                    if (sCreateFromDeprecatedProviderMethod == null) {
                        Method declaredMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE});
                        sCreateFromDeprecatedProviderMethod = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    Object invoke = sCreateFromDeprecatedProviderMethod.invoke((Object) null, new Object[]{str, Long.valueOf(locationRequestCompat.getIntervalMillis()), Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE});
                    if (invoke == null) {
                        return null;
                    }
                    if (sSetQualityMethod == null) {
                        Method declaredMethod2 = sLocationRequestClass.getDeclaredMethod("setQuality", new Class[]{Integer.TYPE});
                        sSetQualityMethod = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    }
                    sSetQualityMethod.invoke(invoke, new Object[]{Integer.valueOf(locationRequestCompat.getQuality())});
                    if (sSetFastestIntervalMethod == null) {
                        Method declaredMethod3 = sLocationRequestClass.getDeclaredMethod("setFastestInterval", new Class[]{Long.TYPE});
                        sSetFastestIntervalMethod = declaredMethod3;
                        declaredMethod3.setAccessible(true);
                    }
                    sSetFastestIntervalMethod.invoke(invoke, new Object[]{Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis())});
                    if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                        if (sSetNumUpdatesMethod == null) {
                            Method declaredMethod4 = sLocationRequestClass.getDeclaredMethod("setNumUpdates", new Class[]{Integer.TYPE});
                            sSetNumUpdatesMethod = declaredMethod4;
                            declaredMethod4.setAccessible(true);
                        }
                        sSetNumUpdatesMethod.invoke(invoke, new Object[]{Integer.valueOf(locationRequestCompat.getMaxUpdates())});
                    }
                    if (locationRequestCompat.getDurationMillis() < LocationRequestCompat.PASSIVE_INTERVAL) {
                        if (sSetExpireInMethod == null) {
                            Method declaredMethod5 = sLocationRequestClass.getDeclaredMethod("setExpireIn", new Class[]{Long.TYPE});
                            sSetExpireInMethod = declaredMethod5;
                            declaredMethod5.setAccessible(true);
                        }
                        sSetExpireInMethod.invoke(invoke, new Object[]{Long.valueOf(locationRequestCompat.getDurationMillis())});
                    }
                    return invoke;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            return null;
        }
    }

    @RequiresApi(31)
    private static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        public static LocationRequest toLocationRequest(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long j) {
            setIntervalMillis(j);
            this.mQuality = 102;
            this.mDurationMillis = LocationRequestCompat.PASSIVE_INTERVAL;
            this.mMaxUpdates = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.mMinUpdateIntervalMillis = -1;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat) {
            this.mIntervalMillis = locationRequestCompat.mIntervalMillis;
            this.mQuality = locationRequestCompat.mQuality;
            this.mDurationMillis = locationRequestCompat.mDurationMillis;
            this.mMaxUpdates = locationRequestCompat.mMaxUpdates;
            this.mMinUpdateIntervalMillis = locationRequestCompat.mMinUpdateIntervalMillis;
            this.mMinUpdateDistanceMeters = locationRequestCompat.mMinUpdateDistanceMeters;
            this.mMaxUpdateDelayMillis = locationRequestCompat.mMaxUpdateDelayMillis;
        }

        @NonNull
        public LocationRequestCompat build() {
            Preconditions.checkState((this.mIntervalMillis == LocationRequestCompat.PASSIVE_INTERVAL && this.mMinUpdateIntervalMillis == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.mIntervalMillis;
            return new LocationRequestCompat(j, this.mQuality, this.mDurationMillis, this.mMaxUpdates, Math.min(this.mMinUpdateIntervalMillis, j), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@IntRange(from = 1) long j) {
            this.mDurationMillis = Preconditions.checkArgumentInRange(j, 1, (long) LocationRequestCompat.PASSIVE_INTERVAL, "durationMillis");
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@IntRange(from = 0) long j) {
            this.mIntervalMillis = Preconditions.checkArgumentInRange(j, 0, (long) LocationRequestCompat.PASSIVE_INTERVAL, "intervalMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0) long j) {
            this.mMaxUpdateDelayMillis = j;
            this.mMaxUpdateDelayMillis = Preconditions.checkArgumentInRange(j, 0, (long) LocationRequestCompat.PASSIVE_INTERVAL, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@IntRange(from = 1, mo660to = 2147483647L) int i) {
            this.mMaxUpdates = Preconditions.checkArgumentInRange(i, 1, (int) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, "maxUpdates");
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0d, mo642to = 3.4028234663852886E38d) float f) {
            this.mMinUpdateDistanceMeters = f;
            this.mMinUpdateDistanceMeters = Preconditions.checkArgumentInRange(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0) long j) {
            this.mMinUpdateIntervalMillis = Preconditions.checkArgumentInRange(j, 0, (long) LocationRequestCompat.PASSIVE_INTERVAL, "minUpdateIntervalMillis");
            return this;
        }

        @NonNull
        public Builder setQuality(int i) {
            Preconditions.checkArgument(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.mQuality = i;
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    LocationRequestCompat(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.mIntervalMillis = j;
        this.mQuality = i;
        this.mMinUpdateIntervalMillis = j3;
        this.mDurationMillis = j2;
        this.mMaxUpdates = i2;
        this.mMinUpdateDistanceMeters = f;
        this.mMaxUpdateDelayMillis = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        return this.mQuality == locationRequestCompat.mQuality && this.mIntervalMillis == locationRequestCompat.mIntervalMillis && this.mMinUpdateIntervalMillis == locationRequestCompat.mMinUpdateIntervalMillis && this.mDurationMillis == locationRequestCompat.mDurationMillis && this.mMaxUpdates == locationRequestCompat.mMaxUpdates && Float.compare(locationRequestCompat.mMinUpdateDistanceMeters, this.mMinUpdateDistanceMeters) == 0 && this.mMaxUpdateDelayMillis == locationRequestCompat.mMaxUpdateDelayMillis;
    }

    @IntRange(from = 1)
    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    @IntRange(from = 0)
    public long getIntervalMillis() {
        return this.mIntervalMillis;
    }

    @IntRange(from = 0)
    public long getMaxUpdateDelayMillis() {
        return this.mMaxUpdateDelayMillis;
    }

    @IntRange(from = 1, mo660to = 2147483647L)
    public int getMaxUpdates() {
        return this.mMaxUpdates;
    }

    @FloatRange(from = 0.0d, mo642to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.mMinUpdateDistanceMeters;
    }

    @IntRange(from = 0)
    public long getMinUpdateIntervalMillis() {
        long j = this.mMinUpdateIntervalMillis;
        return j == -1 ? this.mIntervalMillis : j;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public int hashCode() {
        long j = this.mIntervalMillis;
        long j2 = this.mMinUpdateIntervalMillis;
        return (((this.mQuality * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @RequiresApi(31)
    @NonNull
    public LocationRequest toLocationRequest() {
        return Api31Impl.toLocationRequest(this);
    }

    @RequiresApi(19)
    @SuppressLint({"NewApi"})
    @Nullable
    public LocationRequest toLocationRequest(@NonNull String str) {
        return Build.VERSION.SDK_INT >= 31 ? toLocationRequest() : (LocationRequest) Api19Impl.toLocationRequest(this, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request["
            r0.append(r1)
            long r1 = r6.mIntervalMillis
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0037
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r6.mIntervalMillis
            androidx.core.util.TimeUtils.formatDuration((long) r1, (java.lang.StringBuilder) r0)
            int r1 = r6.mQuality
            r2 = 100
            if (r1 == r2) goto L_0x0034
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0031
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L_0x002e
            goto L_0x003c
        L_0x002e:
            java.lang.String r1 = " LOW_POWER"
            goto L_0x0039
        L_0x0031:
            java.lang.String r1 = " BALANCED"
            goto L_0x0039
        L_0x0034:
            java.lang.String r1 = " HIGH_ACCURACY"
            goto L_0x0039
        L_0x0037:
            java.lang.String r1 = "PASSIVE"
        L_0x0039:
            r0.append(r1)
        L_0x003c:
            long r1 = r6.mDurationMillis
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x004c
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r6.mDurationMillis
            androidx.core.util.TimeUtils.formatDuration((long) r1, (java.lang.StringBuilder) r0)
        L_0x004c:
            int r1 = r6.mMaxUpdates
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L_0x005d
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r6.mMaxUpdates
            r0.append(r1)
        L_0x005d:
            long r1 = r6.mMinUpdateIntervalMillis
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0075
            long r3 = r6.mIntervalMillis
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0075
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r6.mMinUpdateIntervalMillis
            androidx.core.util.TimeUtils.formatDuration((long) r1, (java.lang.StringBuilder) r0)
        L_0x0075:
            float r1 = r6.mMinUpdateDistanceMeters
            double r1 = (double) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0088
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r6.mMinUpdateDistanceMeters
            r0.append(r1)
        L_0x0088:
            long r1 = r6.mMaxUpdateDelayMillis
            r3 = 2
            long r1 = r1 / r3
            long r3 = r6.mIntervalMillis
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x009d
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r6.mMaxUpdateDelayMillis
            androidx.core.util.TimeUtils.formatDuration((long) r1, (java.lang.StringBuilder) r0)
        L_0x009d:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.LocationRequestCompat.toString():java.lang.String");
    }
}
