package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4521az;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.C4815r;
import com.xiaomi.push.service.C4854ak;
import java.lang.Thread;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.xiaomi.mipush.sdk.v */
class C4078v implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final Object f6957a = new Object();

    /* renamed from: a */
    private static final String[] f6958a = {"com.xiaomi.channel.commonutils", "com.xiaomi.common.logger", "com.xiaomi.measite.smack", "com.xiaomi.metoknlp", "com.xiaomi.mipush.sdk", "com.xiaomi.network", "com.xiaomi.push", "com.xiaomi.slim", "com.xiaomi.smack", "com.xiaomi.stats", "com.xiaomi.tinyData", "com.xiaomi.xmpush.thrift", "com.xiaomi.clientreport"};

    /* renamed from: a */
    private Context f6959a;

    /* renamed from: a */
    private SharedPreferences f6960a;

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f6961a;

    public C4078v(Context context) {
        this(context, Thread.getDefaultUncaughtExceptionHandler());
    }

    public C4078v(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6959a = context;
        this.f6961a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private String m10986a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(3, stackTrace.length); i++) {
            sb.append(stackTrace[i].toString() + IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        String sb2 = sb.toString();
        return TextUtils.isEmpty(sb2) ? "" : C4532bf.m13431a(sb2);
    }

    /* renamed from: a */
    private void m10987a() {
        C4498ai.m13271a(this.f6959a).mo24725a((Runnable) new C4079w(this));
    }

    /* renamed from: a */
    private void m10989a(Throwable th) {
        String b = m10992b(th);
        if (!TextUtils.isEmpty(b)) {
            String a = m10986a(th);
            if (!TextUtils.isEmpty(a)) {
                C4075s.m10979a(this.f6959a).mo22973a(b, a);
                if (m10985a()) {
                    m10985a();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m10990a() {
        this.f6960a = this.f6959a.getSharedPreferences("mipush_extra", 4);
        if (C4521az.m13369e(this.f6959a)) {
            if (!C4854ak.m15568a(this.f6959a).mo25911a(C4744hr.Crash4GUploadSwitch.mo25291a(), true)) {
                return false;
            }
            return ((float) Math.abs((System.currentTimeMillis() / 1000) - this.f6960a.getLong("last_crash_upload_time_stamp", 0))) >= ((float) Math.max(3600, C4854ak.m15568a(this.f6959a).mo25906a(C4744hr.Crash4GUploadFrequency.mo25291a(), 3600))) * 0.9f;
        } else if (!C4521az.m13368d(this.f6959a)) {
            return true;
        } else {
            return Math.abs((System.currentTimeMillis() / 1000) - this.f6960a.getLong("last_crash_upload_time_stamp", 0)) >= ((long) Math.max(60, C4854ak.m15568a(this.f6959a).mo25906a(C4744hr.CrashWIFIUploadFrequency.mo25291a(), 1800)));
        }
    }

    /* renamed from: a */
    private boolean m10991a(boolean z, String str) {
        for (String contains : f6958a) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private String m10992b(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder(th.toString());
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            z = m10991a(z, stackTraceElement2);
            sb.append(stackTraceElement2);
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        return z ? sb.toString() : "";
    }

    /* renamed from: b */
    private void m10993b() {
        SharedPreferences sharedPreferences = this.f6959a.getSharedPreferences("mipush_extra", 4);
        this.f6960a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("last_crash_upload_time_stamp", System.currentTimeMillis() / 1000);
        C4815r.m15379a(edit);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        m10986a(th);
        synchronized (f6957a) {
            try {
                f6957a.wait(3000);
            } catch (InterruptedException e) {
                C3989b.m10678a((Throwable) e);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6961a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
