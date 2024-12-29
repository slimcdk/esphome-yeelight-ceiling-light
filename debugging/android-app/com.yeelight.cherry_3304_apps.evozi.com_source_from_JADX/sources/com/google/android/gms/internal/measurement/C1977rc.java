package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p011c.p012a.p019b.p028b.p031b.C0561a;

/* renamed from: com.google.android.gms.internal.measurement.rc */
public interface C1977rc extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C1992sc scVar);

    void getAppInstanceId(C1992sc scVar);

    void getCachedAppInstanceId(C1992sc scVar);

    void getConditionalUserProperties(String str, String str2, C1992sc scVar);

    void getCurrentScreenClass(C1992sc scVar);

    void getCurrentScreenName(C1992sc scVar);

    void getGmpAppId(C1992sc scVar);

    void getMaxUserProperties(String str, C1992sc scVar);

    void getTestFlag(C1992sc scVar, int i);

    void getUserProperties(String str, String str2, boolean z, C1992sc scVar);

    void initForTests(Map map);

    void initialize(C0561a aVar, zzaa zzaa, long j);

    void isDataCollectionEnabled(C1992sc scVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C1992sc scVar, long j);

    void logHealthData(int i, String str, C0561a aVar, C0561a aVar2, C0561a aVar3);

    void onActivityCreated(C0561a aVar, Bundle bundle, long j);

    void onActivityDestroyed(C0561a aVar, long j);

    void onActivityPaused(C0561a aVar, long j);

    void onActivityResumed(C0561a aVar, long j);

    void onActivitySaveInstanceState(C0561a aVar, C1992sc scVar, long j);

    void onActivityStarted(C0561a aVar, long j);

    void onActivityStopped(C0561a aVar, long j);

    void performAction(Bundle bundle, C1992sc scVar, long j);

    void registerOnMeasurementEventListener(C2069xc xcVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(C0561a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C2069xc xcVar);

    void setInstanceIdProvider(C2086yc ycVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C0561a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C2069xc xcVar);
}
