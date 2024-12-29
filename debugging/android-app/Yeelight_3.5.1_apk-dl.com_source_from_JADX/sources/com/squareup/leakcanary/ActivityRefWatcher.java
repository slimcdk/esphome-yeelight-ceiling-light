package com.squareup.leakcanary;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

@TargetApi(14)
public final class ActivityRefWatcher {
    private final Application application;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            ActivityRefWatcher.this.onActivityDestroyed(activity);
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    };
    private final RefWatcher refWatcher;

    public ActivityRefWatcher(Application application2, RefWatcher refWatcher2) {
        this.application = (Application) Preconditions.checkNotNull(application2, "application");
        this.refWatcher = (RefWatcher) Preconditions.checkNotNull(refWatcher2, "refWatcher");
    }

    public static void installOnIcsPlus(Application application2, RefWatcher refWatcher2) {
        if (Build.VERSION.SDK_INT >= 14) {
            new ActivityRefWatcher(application2, refWatcher2).watchActivities();
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityDestroyed(Activity activity) {
        this.refWatcher.watch(activity);
    }

    public void stopWatchingActivities() {
        this.application.unregisterActivityLifecycleCallbacks(this.lifecycleCallbacks);
    }

    public void watchActivities() {
        stopWatchingActivities();
        this.application.registerActivityLifecycleCallbacks(this.lifecycleCallbacks);
    }
}
