package com.xiaomi.push;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* renamed from: com.xiaomi.push.fy */
public class C4714fy {
    /* renamed from: a */
    public static int m13982a(Throwable th) {
        boolean z = th instanceof C4724gh;
        if (z) {
            C4724gh ghVar = (C4724gh) th;
            if (ghVar.mo29210a() != null) {
                th = ghVar.mo29210a();
            }
        }
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        if (th instanceof SocketTimeoutException) {
            return 105;
        }
        if (th instanceof SocketException) {
            if (message.indexOf("Network is unreachable") != -1) {
                return 102;
            }
            if (message.indexOf("Connection refused") != -1) {
                return 103;
            }
            if (message.indexOf("Connection timed out") != -1) {
                return 105;
            }
            if (message.endsWith("EACCES (Permission denied)")) {
                return 101;
            }
            if (message.indexOf("Connection reset by peer") != -1) {
                return 109;
            }
            if (message.indexOf("Broken pipe") != -1) {
                return 110;
            }
            if (message.indexOf("No route to host") != -1) {
                return 104;
            }
            return message.endsWith("EINVAL (Invalid argument)") ? 106 : 199;
        } else if (th instanceof UnknownHostException) {
            return 107;
        } else {
            return z ? 399 : 0;
        }
    }
}
