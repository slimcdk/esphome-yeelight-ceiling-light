package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Marker;
import p168h7.C9098b;
import p168h7.C9099c;

abstract class NamedLoggerBase implements C9098b, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    NamedLoggerBase() {
    }

    public abstract /* synthetic */ void debug(String str);

    public abstract /* synthetic */ void debug(String str, Object obj);

    public abstract /* synthetic */ void debug(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void debug(String str, Throwable th);

    public abstract /* synthetic */ void debug(String str, Object[] objArr);

    public abstract /* synthetic */ void debug(Marker marker, String str);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void debug(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object[] objArr);

    public abstract /* synthetic */ void error(String str);

    public abstract /* synthetic */ void error(String str, Object obj);

    public abstract /* synthetic */ void error(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void error(String str, Throwable th);

    public abstract /* synthetic */ void error(String str, Object[] objArr);

    public abstract /* synthetic */ void error(Marker marker, String str);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void error(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void error(Marker marker, String str, Object[] objArr);

    public String getName() {
        return this.name;
    }

    public abstract /* synthetic */ void info(String str);

    public abstract /* synthetic */ void info(String str, Object obj);

    public abstract /* synthetic */ void info(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void info(String str, Throwable th);

    public abstract /* synthetic */ void info(String str, Object[] objArr);

    public abstract /* synthetic */ void info(Marker marker, String str);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void info(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void info(Marker marker, String str, Object[] objArr);

    public abstract /* synthetic */ boolean isDebugEnabled();

    public abstract /* synthetic */ boolean isDebugEnabled(Marker marker);

    public abstract /* synthetic */ boolean isErrorEnabled();

    public abstract /* synthetic */ boolean isErrorEnabled(Marker marker);

    public abstract /* synthetic */ boolean isInfoEnabled();

    public abstract /* synthetic */ boolean isInfoEnabled(Marker marker);

    public abstract /* synthetic */ boolean isTraceEnabled();

    public abstract /* synthetic */ boolean isTraceEnabled(Marker marker);

    public abstract /* synthetic */ boolean isWarnEnabled();

    public abstract /* synthetic */ boolean isWarnEnabled(Marker marker);

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return C9099c.m21834e(getName());
    }

    public abstract /* synthetic */ void trace(String str);

    public abstract /* synthetic */ void trace(String str, Object obj);

    public abstract /* synthetic */ void trace(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void trace(String str, Throwable th);

    public abstract /* synthetic */ void trace(String str, Object[] objArr);

    public abstract /* synthetic */ void trace(Marker marker, String str);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void trace(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object[] objArr);

    public abstract /* synthetic */ void warn(String str);

    public abstract /* synthetic */ void warn(String str, Object obj);

    public abstract /* synthetic */ void warn(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void warn(String str, Throwable th);

    public abstract /* synthetic */ void warn(String str, Object[] objArr);

    public abstract /* synthetic */ void warn(Marker marker, String str);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj, Object obj2);

    public abstract /* synthetic */ void warn(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object[] objArr);
}
