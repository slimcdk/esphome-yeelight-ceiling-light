package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.do */
public class C4608do implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private Context f8420a;

    /* renamed from: a */
    private String f8421a = "";

    /* renamed from: b */
    private String f8422b;

    public C4608do(Context context, String str) {
        this.f8420a = context;
        this.f8421a = str;
    }

    /* renamed from: a */
    private void m13748a(String str) {
        C4747hu huVar = new C4747hu();
        huVar.mo25296a(str);
        huVar.mo25294a(System.currentTimeMillis());
        huVar.mo25295a(C4741ho.ActivityActiveTimeStamp);
        C4624ed.m13797a(this.f8420a, huVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (!TextUtils.isEmpty(this.f8421a) && !TextUtils.isEmpty(localClassName)) {
            this.f8422b = "";
            if (TextUtils.isEmpty("") || TextUtils.equals(this.f8422b, localClassName)) {
                m13748a(this.f8420a.getPackageName() + "|" + localClassName + Constants.COLON_SEPARATOR + this.f8421a + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(System.currentTimeMillis() / 1000));
                this.f8421a = "";
                this.f8422b = "";
                return;
            }
            this.f8421a = "";
        }
    }

    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f8422b)) {
            this.f8422b = activity.getLocalClassName();
        }
        this.f8421a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
