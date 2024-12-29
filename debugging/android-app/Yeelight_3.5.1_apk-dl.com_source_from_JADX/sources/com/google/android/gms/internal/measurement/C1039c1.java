package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p032f0.C3155a;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
public final class C1039c1 extends C1214n0 implements C1071e1 {
    C1039c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeLong(j);
        mo13004f(23, c);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeString(str2);
        C1246p0.m2432e(c, bundle);
        mo13004f(9, c);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeLong(j);
        mo13004f(24, c);
    }

    public final void generateEventId(C1119h1 h1Var) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, h1Var);
        mo13004f(22, c);
    }

    public final void getCachedAppInstanceId(C1119h1 h1Var) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, h1Var);
        mo13004f(19, c);
    }

    public final void getConditionalUserProperties(String str, String str2, C1119h1 h1Var) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeString(str2);
        C1246p0.m2433f(c, h1Var);
        mo13004f(10, c);
    }

    public final void getCurrentScreenClass(C1119h1 h1Var) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, h1Var);
        mo13004f(17, c);
    }

    public final void getCurrentScreenName(C1119h1 h1Var) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, h1Var);
        mo13004f(16, c);
    }

    public final void getGmpAppId(C1119h1 h1Var) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, h1Var);
        mo13004f(21, c);
    }

    public final void getMaxUserProperties(String str, C1119h1 h1Var) {
        Parcel c = mo13002c();
        c.writeString(str);
        C1246p0.m2433f(c, h1Var);
        mo13004f(6, c);
    }

    public final void getUserProperties(String str, String str2, boolean z, C1119h1 h1Var) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeString(str2);
        C1246p0.m2431d(c, z);
        C1246p0.m2433f(c, h1Var);
        mo13004f(5, c);
    }

    public final void initialize(C3155a aVar, zzcl zzcl, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        C1246p0.m2432e(c, zzcl);
        c.writeLong(j);
        mo13004f(1, c);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeString(str2);
        C1246p0.m2432e(c, bundle);
        C1246p0.m2431d(c, z);
        C1246p0.m2431d(c, z2);
        c.writeLong(j);
        mo13004f(2, c);
    }

    public final void logHealthData(int i, String str, C3155a aVar, C3155a aVar2, C3155a aVar3) {
        Parcel c = mo13002c();
        c.writeInt(5);
        c.writeString(str);
        C1246p0.m2433f(c, aVar);
        C1246p0.m2433f(c, aVar2);
        C1246p0.m2433f(c, aVar3);
        mo13004f(33, c);
    }

    public final void onActivityCreated(C3155a aVar, Bundle bundle, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        C1246p0.m2432e(c, bundle);
        c.writeLong(j);
        mo13004f(27, c);
    }

    public final void onActivityDestroyed(C3155a aVar, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        c.writeLong(j);
        mo13004f(28, c);
    }

    public final void onActivityPaused(C3155a aVar, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        c.writeLong(j);
        mo13004f(29, c);
    }

    public final void onActivityResumed(C3155a aVar, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        c.writeLong(j);
        mo13004f(30, c);
    }

    public final void onActivitySaveInstanceState(C3155a aVar, C1119h1 h1Var, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        C1246p0.m2433f(c, h1Var);
        c.writeLong(j);
        mo13004f(31, c);
    }

    public final void onActivityStarted(C3155a aVar, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        c.writeLong(j);
        mo13004f(25, c);
    }

    public final void onActivityStopped(C3155a aVar, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        c.writeLong(j);
        mo13004f(26, c);
    }

    public final void registerOnMeasurementEventListener(C1167k1 k1Var) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, k1Var);
        mo13004f(35, c);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, bundle);
        c.writeLong(j);
        mo13004f(8, c);
    }

    public final void setCurrentScreen(C3155a aVar, String str, String str2, long j) {
        Parcel c = mo13002c();
        C1246p0.m2433f(c, aVar);
        c.writeString(str);
        c.writeString(str2);
        c.writeLong(j);
        mo13004f(15, c);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel c = mo13002c();
        C1246p0.m2431d(c, z);
        mo13004f(39, c);
    }
}
