package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p032f0.C3155a;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
public interface C1071e1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C1119h1 h1Var);

    void getAppInstanceId(C1119h1 h1Var);

    void getCachedAppInstanceId(C1119h1 h1Var);

    void getConditionalUserProperties(String str, String str2, C1119h1 h1Var);

    void getCurrentScreenClass(C1119h1 h1Var);

    void getCurrentScreenName(C1119h1 h1Var);

    void getGmpAppId(C1119h1 h1Var);

    void getMaxUserProperties(String str, C1119h1 h1Var);

    void getTestFlag(C1119h1 h1Var, int i);

    void getUserProperties(String str, String str2, boolean z, C1119h1 h1Var);

    void initForTests(Map map);

    void initialize(C3155a aVar, zzcl zzcl, long j);

    void isDataCollectionEnabled(C1119h1 h1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C1119h1 h1Var, long j);

    void logHealthData(int i, String str, C3155a aVar, C3155a aVar2, C3155a aVar3);

    void onActivityCreated(C3155a aVar, Bundle bundle, long j);

    void onActivityDestroyed(C3155a aVar, long j);

    void onActivityPaused(C3155a aVar, long j);

    void onActivityResumed(C3155a aVar, long j);

    void onActivitySaveInstanceState(C3155a aVar, C1119h1 h1Var, long j);

    void onActivityStarted(C3155a aVar, long j);

    void onActivityStopped(C3155a aVar, long j);

    void performAction(Bundle bundle, C1119h1 h1Var, long j);

    void registerOnMeasurementEventListener(C1167k1 k1Var);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(C3155a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C1167k1 k1Var);

    void setInstanceIdProvider(C1199m1 m1Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C3155a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C1167k1 k1Var);
}
