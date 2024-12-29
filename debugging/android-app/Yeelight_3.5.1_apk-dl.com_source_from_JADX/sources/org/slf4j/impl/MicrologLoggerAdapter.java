package org.slf4j.impl;

import com.google.code.microlog4android.Level;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.impl.repository.Slf4jLoggerRepository;
import p080p0.C3592a;

public class MicrologLoggerAdapter extends MarkerIgnoringBase {
    private static final long serialVersionUID = 3934653965724860568L;
    private final transient C3592a logger;

    public MicrologLoggerAdapter(String str) {
        this.logger = new C3592a(str, Slf4jLoggerRepository.INSTANCE);
        this.name = str;
    }

    public MicrologLoggerAdapter(C3592a aVar) {
        this.logger = aVar;
        this.name = aVar.mo25875k();
        aVar.mo25883s(Slf4jLoggerRepository.INSTANCE);
    }

    private boolean isLoggerEnabled(Level level) {
        return this.logger.mo25873i().toInt() <= level.toInt();
    }

    public void debug(String str) {
        this.logger.mo25868d(str);
    }

    public void debug(String str, Object obj) {
        throw new UnsupportedOperationException("debug(String, Object) is not implemented yet");
    }

    public void debug(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("debug(String, Object, Object) is not implemented yet");
    }

    public void debug(String str, Throwable th) {
        this.logger.mo25869e(str, th);
    }

    public void debug(String str, Object[] objArr) {
        throw new UnsupportedOperationException("debug(String, Object[]) is not implemented yet");
    }

    public void error(String str) {
        this.logger.mo25870f(str);
    }

    public void error(String str, Object obj) {
        throw new UnsupportedOperationException("error(String, Object) is not implemented yet");
    }

    public void error(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("error(String, Object, Object) is not implemented yet");
    }

    public void error(String str, Throwable th) {
        this.logger.mo25871g(str, th);
    }

    public void error(String str, Object[] objArr) {
        throw new UnsupportedOperationException("error(String, Object[]) is not implemented yet");
    }

    public C3592a getMicrologLogger() {
        return this.logger;
    }

    public String getName() {
        return this.logger.mo25875k();
    }

    public void info(String str) {
        this.logger.mo25877m(str);
    }

    public void info(String str, Object obj) {
        throw new UnsupportedOperationException("info(String, Object) is not implemented yet");
    }

    public void info(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("info(String, Object, Object) is not implemented yet");
    }

    public void info(String str, Throwable th) {
        this.logger.mo25878n(str, th);
    }

    public void info(String str, Object[] objArr) {
        throw new UnsupportedOperationException("info(String, Object[]) is not implemented yet");
    }

    public boolean isDebugEnabled() {
        return isLoggerEnabled(Level.DEBUG);
    }

    public boolean isErrorEnabled() {
        return true;
    }

    public boolean isInfoEnabled() {
        return isLoggerEnabled(Level.INFO);
    }

    public boolean isTraceEnabled() {
        return isLoggerEnabled(Level.TRACE);
    }

    public boolean isWarnEnabled() {
        return true;
    }

    public void trace(String str) {
        this.logger.mo25886u(str);
    }

    public void trace(String str, Object obj) {
        throw new UnsupportedOperationException("trace(String, Object) is not implemented yet");
    }

    public void trace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("trace(String, Object, Object) is not implemented yet");
    }

    public void trace(String str, Throwable th) {
        this.logger.mo25887v(str, th);
    }

    public void trace(String str, Object[] objArr) {
        throw new UnsupportedOperationException("trace(String, Object[]) is not implemented yet");
    }

    public void warn(String str) {
        this.logger.mo25888w(str);
    }

    public void warn(String str, Object obj) {
        throw new UnsupportedOperationException("warn(String, Object) is not implemented yet");
    }

    public void warn(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("warn(String, Object, Object) is not implemented yet");
    }

    public void warn(String str, Throwable th) {
        this.logger.mo25889x(str, th);
    }

    public void warn(String str, Object[] objArr) {
    }
}
