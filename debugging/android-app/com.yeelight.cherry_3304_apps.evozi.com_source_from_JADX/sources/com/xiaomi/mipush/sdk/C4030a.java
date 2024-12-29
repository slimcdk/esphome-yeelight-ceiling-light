package com.xiaomi.mipush.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.C4660fa;
import com.xiaomi.push.C4662fb;
import java.util.HashSet;
import java.util.Set;

@TargetApi(14)
/* renamed from: com.xiaomi.mipush.sdk.a */
public class C4030a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private Set<String> f6851a = new HashSet();

    /* renamed from: a */
    private static void m10792a(Application application) {
        application.registerActivityLifecycleCallbacks(new C4030a());
    }

    /* renamed from: a */
    public static void m10793a(Context context) {
        m10792a((Application) context.getApplicationContext());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        C4662fb a;
        String packageName;
        String a2;
        int i;
        Intent intent = activity.getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("messageId");
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (!TextUtils.isEmpty(stringExtra) && intExtra > 0 && !this.f6851a.contains(stringExtra)) {
                this.f6851a.add(stringExtra);
                if (intExtra == 3000) {
                    a = C4662fb.m14151a(activity.getApplicationContext());
                    packageName = activity.getPackageName();
                    a2 = C4660fa.m14135a(intExtra);
                    i = 3008;
                } else if (intExtra == 1000) {
                    a = C4662fb.m14151a(activity.getApplicationContext());
                    packageName = activity.getPackageName();
                    a2 = C4660fa.m14135a(intExtra);
                    i = 1008;
                } else {
                    return;
                }
                a.mo25062a(packageName, a2, stringExtra, i, (String) null);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
