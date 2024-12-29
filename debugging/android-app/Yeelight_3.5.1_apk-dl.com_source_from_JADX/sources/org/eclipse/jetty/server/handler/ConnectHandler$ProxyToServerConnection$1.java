package org.eclipse.jetty.server.handler;

import java.io.IOException;

class ConnectHandler$ProxyToServerConnection$1 extends IOException {
    final /* synthetic */ C9942c this$1;
    final /* synthetic */ InterruptedException val$x;

    ConnectHandler$ProxyToServerConnection$1(C9942c cVar, InterruptedException interruptedException) {
        this.val$x = interruptedException;
        initCause(interruptedException);
    }
}
