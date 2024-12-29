package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.LoggerInterface;

/* renamed from: com.xiaomi.push.di */
public class C4620di implements LoggerInterface {

    /* renamed from: a */
    private LoggerInterface f7810a = null;

    /* renamed from: b */
    private LoggerInterface f7811b = null;

    public C4620di(LoggerInterface loggerInterface, LoggerInterface loggerInterface2) {
        this.f7810a = loggerInterface;
        this.f7811b = loggerInterface2;
    }

    public void log(String str) {
        LoggerInterface loggerInterface = this.f7810a;
        if (loggerInterface != null) {
            loggerInterface.log(str);
        }
        LoggerInterface loggerInterface2 = this.f7811b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str);
        }
    }

    public void log(String str, Throwable th) {
        LoggerInterface loggerInterface = this.f7810a;
        if (loggerInterface != null) {
            loggerInterface.log(str, th);
        }
        LoggerInterface loggerInterface2 = this.f7811b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str, th);
        }
    }

    public void setTag(String str) {
    }
}
