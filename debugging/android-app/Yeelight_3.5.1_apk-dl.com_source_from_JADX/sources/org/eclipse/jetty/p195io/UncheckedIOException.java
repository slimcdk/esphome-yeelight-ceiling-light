package org.eclipse.jetty.p195io;

/* renamed from: org.eclipse.jetty.io.UncheckedIOException */
public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException() {
    }

    public UncheckedIOException(String str) {
        super(str);
    }

    public UncheckedIOException(String str, Throwable th) {
        super(str, th);
    }

    public UncheckedIOException(Throwable th) {
        super(th);
    }
}
