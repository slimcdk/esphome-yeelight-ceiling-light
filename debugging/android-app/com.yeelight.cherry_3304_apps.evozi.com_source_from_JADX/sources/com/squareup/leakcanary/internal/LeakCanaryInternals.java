package com.squareup.leakcanary.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Process;
import com.squareup.leakcanary.C3940R;
import com.squareup.leakcanary.CanaryLog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class LeakCanaryInternals {

    /* renamed from: LG */
    public static final String f6723LG = "LGE";
    public static final String MOTOROLA = "motorola";
    public static final String NVIDIA = "NVIDIA";
    public static final String SAMSUNG = "samsung";
    private static final Executor fileIoExecutor = newSingleThreadExecutor("File-IO");

    private LeakCanaryInternals() {
        throw new AssertionError();
    }

    public static String classSimpleName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static void executeOnFileIoThread(Runnable runnable) {
        fileIoExecutor.execute(runnable);
    }

    public static boolean isInServiceProcess(Context context, Class<? extends Service> cls) {
        PackageManager packageManager = context.getPackageManager();
        try {
            String str = packageManager.getPackageInfo(context.getPackageName(), 4).applicationInfo.processName;
            try {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 0);
                if (serviceInfo.processName.equals(str)) {
                    CanaryLog.m10641d("Did not expect service %s to run in main process %s", cls, str);
                    return false;
                }
                int myPid = Process.myPid();
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == myPid) {
                            runningAppProcessInfo = next;
                            break;
                        }
                    }
                }
                if (runningAppProcessInfo != null) {
                    return runningAppProcessInfo.processName.equals(serviceInfo.processName);
                }
                CanaryLog.m10641d("Could not find running process for %d", Integer.valueOf(myPid));
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (Exception e) {
            CanaryLog.m10642d(e, "Could not get package info for %s", context.getPackageName());
            return false;
        }
    }

    public static Executor newSingleThreadExecutor(String str) {
        return Executors.newSingleThreadExecutor(new LeakCanarySingleThreadFactory(str));
    }

    public static void setEnabled(Context context, final Class<?> cls, final boolean z) {
        final Context applicationContext = context.getApplicationContext();
        executeOnFileIoThread(new Runnable() {
            public void run() {
                LeakCanaryInternals.setEnabledBlocking(applicationContext, cls, z);
            }
        });
    }

    public static void setEnabledBlocking(Context context, Class<?> cls, boolean z) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), z ? 1 : 2, 1);
    }

    @TargetApi(11)
    public static void showNotification(Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        Notification notification;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT < 11) {
            notification = new Notification();
            notification.icon = C3940R.C3941drawable.leak_canary_notification;
            notification.when = System.currentTimeMillis();
            notification.flags = 16 | notification.flags;
            try {
                Notification.class.getMethod("setLatestEventInfo", new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class}).invoke(notification, new Object[]{context, charSequence, charSequence2, pendingIntent});
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            Notification.Builder contentIntent = new Notification.Builder(context).setSmallIcon(C3940R.C3941drawable.leak_canary_notification).setWhen(System.currentTimeMillis()).setContentTitle(charSequence).setContentText(charSequence2).setAutoCancel(true).setContentIntent(pendingIntent);
            notification = Build.VERSION.SDK_INT < 16 ? contentIntent.getNotification() : contentIntent.build();
        }
        notificationManager.notify(-558907665, notification);
    }
}
