package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import p011c.p012a.p019b.p028b.p031b.C0561a;

/* renamed from: com.google.android.gms.internal.measurement.tc */
public final class C2007tc extends C1698a implements C1977rc {
    C2007tc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeLong(j);
        mo11411f(23, c);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5922c(c, bundle);
        mo11411f(9, c);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeLong(j);
        mo11411f(24, c);
    }

    public final void generateEventId(C1992sc scVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, scVar);
        mo11411f(22, c);
    }

    public final void getAppInstanceId(C1992sc scVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, scVar);
        mo11411f(20, c);
    }

    public final void getCachedAppInstanceId(C1992sc scVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, scVar);
        mo11411f(19, c);
    }

    public final void getConditionalUserProperties(String str, String str2, C1992sc scVar) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5921b(c, scVar);
        mo11411f(10, c);
    }

    public final void getCurrentScreenClass(C1992sc scVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, scVar);
        mo11411f(17, c);
    }

    public final void getCurrentScreenName(C1992sc scVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, scVar);
        mo11411f(16, c);
    }

    public final void getGmpAppId(C1992sc scVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, scVar);
        mo11411f(21, c);
    }

    public final void getMaxUserProperties(String str, C1992sc scVar) {
        Parcel c = mo11409c();
        c.writeString(str);
        C1978s.m5921b(c, scVar);
        mo11411f(6, c);
    }

    public final void getTestFlag(C1992sc scVar, int i) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, scVar);
        c.writeInt(i);
        mo11411f(38, c);
    }

    public final void getUserProperties(String str, String str2, boolean z, C1992sc scVar) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5923d(c, z);
        C1978s.m5921b(c, scVar);
        mo11411f(5, c);
    }

    public final void initForTests(Map map) {
        Parcel c = mo11409c();
        c.writeMap(map);
        mo11411f(37, c);
    }

    public final void initialize(C0561a aVar, zzaa zzaa, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        C1978s.m5922c(c, zzaa);
        c.writeLong(j);
        mo11411f(1, c);
    }

    public final void isDataCollectionEnabled(C1992sc scVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, scVar);
        mo11411f(40, c);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5922c(c, bundle);
        C1978s.m5923d(c, z);
        C1978s.m5923d(c, z2);
        c.writeLong(j);
        mo11411f(2, c);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C1992sc scVar, long j) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5922c(c, bundle);
        C1978s.m5921b(c, scVar);
        c.writeLong(j);
        mo11411f(3, c);
    }

    public final void logHealthData(int i, String str, C0561a aVar, C0561a aVar2, C0561a aVar3) {
        Parcel c = mo11409c();
        c.writeInt(i);
        c.writeString(str);
        C1978s.m5921b(c, aVar);
        C1978s.m5921b(c, aVar2);
        C1978s.m5921b(c, aVar3);
        mo11411f(33, c);
    }

    public final void onActivityCreated(C0561a aVar, Bundle bundle, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        C1978s.m5922c(c, bundle);
        c.writeLong(j);
        mo11411f(27, c);
    }

    public final void onActivityDestroyed(C0561a aVar, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        c.writeLong(j);
        mo11411f(28, c);
    }

    public final void onActivityPaused(C0561a aVar, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        c.writeLong(j);
        mo11411f(29, c);
    }

    public final void onActivityResumed(C0561a aVar, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        c.writeLong(j);
        mo11411f(30, c);
    }

    public final void onActivitySaveInstanceState(C0561a aVar, C1992sc scVar, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        C1978s.m5921b(c, scVar);
        c.writeLong(j);
        mo11411f(31, c);
    }

    public final void onActivityStarted(C0561a aVar, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        c.writeLong(j);
        mo11411f(25, c);
    }

    public final void onActivityStopped(C0561a aVar, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        c.writeLong(j);
        mo11411f(26, c);
    }

    public final void performAction(Bundle bundle, C1992sc scVar, long j) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, bundle);
        C1978s.m5921b(c, scVar);
        c.writeLong(j);
        mo11411f(32, c);
    }

    public final void registerOnMeasurementEventListener(C2069xc xcVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, xcVar);
        mo11411f(35, c);
    }

    public final void resetAnalyticsData(long j) {
        Parcel c = mo11409c();
        c.writeLong(j);
        mo11411f(12, c);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, bundle);
        c.writeLong(j);
        mo11411f(8, c);
    }

    public final void setCurrentScreen(C0561a aVar, String str, String str2, long j) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, aVar);
        c.writeString(str);
        c.writeString(str2);
        c.writeLong(j);
        mo11411f(15, c);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel c = mo11409c();
        C1978s.m5923d(c, z);
        mo11411f(39, c);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, bundle);
        mo11411f(42, c);
    }

    public final void setEventInterceptor(C2069xc xcVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, xcVar);
        mo11411f(34, c);
    }

    public final void setInstanceIdProvider(C2086yc ycVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, ycVar);
        mo11411f(18, c);
    }

    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel c = mo11409c();
        C1978s.m5923d(c, z);
        c.writeLong(j);
        mo11411f(11, c);
    }

    public final void setMinimumSessionDuration(long j) {
        Parcel c = mo11409c();
        c.writeLong(j);
        mo11411f(13, c);
    }

    public final void setSessionTimeoutDuration(long j) {
        Parcel c = mo11409c();
        c.writeLong(j);
        mo11411f(14, c);
    }

    public final void setUserId(String str, long j) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeLong(j);
        mo11411f(7, c);
    }

    public final void setUserProperty(String str, String str2, C0561a aVar, boolean z, long j) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5921b(c, aVar);
        C1978s.m5923d(c, z);
        c.writeLong(j);
        mo11411f(4, c);
    }

    public final void unregisterOnMeasurementEventListener(C2069xc xcVar) {
        Parcel c = mo11409c();
        C1978s.m5921b(c, xcVar);
        mo11411f(36, c);
    }
}
