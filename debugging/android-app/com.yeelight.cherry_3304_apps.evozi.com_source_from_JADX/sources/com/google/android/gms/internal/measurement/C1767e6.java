package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.measurement.e6 */
public final class C1767e6 {
    @Nullable

    /* renamed from: b */
    private static final Method f3327b = m5023c();
    @Nullable

    /* renamed from: c */
    private static final Method f3328c = m5024d();

    /* renamed from: a */
    private final JobScheduler f3329a;

    private C1767e6(JobScheduler jobScheduler) {
        this.f3329a = jobScheduler;
    }

    /* renamed from: a */
    private final int m5021a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f3327b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f3329a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.f3329a.schedule(jobInfo);
    }

    /* renamed from: b */
    public static int m5022b(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return (f3327b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new C1767e6(jobScheduler).m5021a(jobInfo, str, m5025e(), str2);
    }

    @Nullable
    /* renamed from: c */
    private static Method m5023c() {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            boolean isLoggable = Log.isLoggable("JobSchedulerCompat", 6);
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    private static Method m5024d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
            } catch (NoSuchMethodException unused) {
                boolean isLoggable = Log.isLoggable("JobSchedulerCompat", 6);
            }
        }
        return null;
    }

    /* renamed from: e */
    private static int m5025e() {
        Method method = f3328c;
        if (method != null) {
            try {
                return ((Integer) method.invoke((Object) null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                boolean isLoggable = Log.isLoggable("JobSchedulerCompat", 6);
            }
        }
        return 0;
    }
}
