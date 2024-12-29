package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.dl */
public class C4623dl implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private Context f7823a;

    /* renamed from: a */
    private String f7824a = "";

    /* renamed from: b */
    private String f7825b;

    public C4623dl(Context context, String str) {
        this.f7823a = context;
        this.f7824a = str;
    }

    /* renamed from: a */
    private void m13325a(String str) {
        C4768hr hrVar = new C4768hr();
        hrVar.mo29327a(str);
        hrVar.mo29325a(System.currentTimeMillis());
        hrVar.mo29326a(C4762hl.ActivityActiveTimeStamp);
        C4632dt.m13344a(this.f7823a, hrVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (!TextUtils.isEmpty(this.f7824a) && !TextUtils.isEmpty(localClassName)) {
            this.f7825b = "";
            if (TextUtils.isEmpty("") || TextUtils.equals(this.f7825b, localClassName)) {
                m13325a(this.f7823a.getPackageName() + "|" + localClassName + Constants.COLON_SEPARATOR + this.f7824a + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(System.currentTimeMillis() / 1000));
                this.f7824a = "";
                this.f7825b = "";
                return;
            }
            this.f7824a = "";
        }
    }

    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f7825b)) {
            this.f7825b = activity.getLocalClassName();
        }
        this.f7824a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
