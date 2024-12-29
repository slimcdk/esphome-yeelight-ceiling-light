package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.LoggerInterface;

/* renamed from: com.xiaomi.push.dl */
public class C4605dl implements LoggerInterface {

    /* renamed from: a */
    private LoggerInterface f8410a = null;

    /* renamed from: b */
    private LoggerInterface f8411b = null;

    public C4605dl(LoggerInterface loggerInterface, LoggerInterface loggerInterface2) {
        this.f8410a = loggerInterface;
        this.f8411b = loggerInterface2;
    }

    public void log(String str) {
        LoggerInterface loggerInterface = this.f8410a;
        if (loggerInterface != null) {
            loggerInterface.log(str);
        }
        LoggerInterface loggerInterface2 = this.f8411b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str);
        }
    }

    public void log(String str, Throwable th) {
        LoggerInterface loggerInterface = this.f8410a;
        if (loggerInterface != null) {
            loggerInterface.log(str, th);
        }
        LoggerInterface loggerInterface2 = this.f8411b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str, th);
        }
    }

    public void setTag(String str) {
    }
}
