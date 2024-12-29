package okhttp3.internal.connection;

import java.io.IOException;
import p056k5.C3300c;

public final class RouteException extends RuntimeException {
    private IOException firstException;
    private IOException lastException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    public void addConnectException(IOException iOException) {
        C3300c.m8916a(this.firstException, iOException);
        this.lastException = iOException;
    }

    public IOException getFirstConnectException() {
        return this.firstException;
    }

    public IOException getLastConnectException() {
        return this.lastException;
    }
}
