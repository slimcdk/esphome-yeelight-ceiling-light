package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.net.UnknownHostException;
import java.util.Objects;

/* renamed from: com.xiaomi.push.ff */
final class C4686ff {

    /* renamed from: com.xiaomi.push.ff$a */
    static class C4687a {

        /* renamed from: a */
        C4679ez f8141a;

        /* renamed from: a */
        String f8142a;

        C4687a() {
        }
    }

    /* renamed from: a */
    static C4687a m13822a(Exception exc) {
        m13822a(exc);
        boolean z = exc instanceof C4724gh;
        Throwable th = exc;
        if (z) {
            C4724gh ghVar = (C4724gh) exc;
            th = exc;
            if (ghVar.mo29210a() != null) {
                th = ghVar.mo29210a();
            }
        }
        C4687a aVar = new C4687a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        String str = th.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        int a = C4714fy.m13982a(th);
        if (a != 0) {
            aVar.f8141a = C4679ez.m13771a(C4679ez.GSLB_REQUEST_SUCCESS.mo29089a() + a);
        }
        if (aVar.f8141a == null) {
            aVar.f8141a = C4679ez.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f8141a == C4679ez.GSLB_TCP_ERR_OTHER) {
            aVar.f8142a = str;
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m13823a(Exception exc) {
        Objects.requireNonNull(exc);
    }

    /* renamed from: b */
    static C4687a m13824b(Exception exc) {
        C4679ez ezVar;
        Throwable cause;
        m13822a(exc);
        boolean z = exc instanceof C4724gh;
        Throwable th = exc;
        if (z) {
            C4724gh ghVar = (C4724gh) exc;
            th = exc;
            if (ghVar.mo29210a() != null) {
                th = ghVar.mo29210a();
            }
        }
        C4687a aVar = new C4687a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        int a = C4714fy.m13982a(th);
        String str = th.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a != 0) {
            C4679ez a2 = C4679ez.m13771a(C4679ez.CONN_SUCCESS.mo29089a() + a);
            aVar.f8141a = a2;
            if (a2 == C4679ez.CONN_BOSH_ERR && (cause = th.getCause()) != null && (cause instanceof UnknownHostException)) {
                ezVar = C4679ez.CONN_BOSH_UNKNOWNHOST;
            }
            C4679ez ezVar2 = aVar.f8141a;
            if (ezVar2 == C4679ez.CONN_TCP_ERR_OTHER || ezVar2 == C4679ez.CONN_XMPP_ERR || ezVar2 == C4679ez.CONN_BOSH_ERR) {
                aVar.f8142a = str;
            }
            return aVar;
        }
        ezVar = C4679ez.CONN_XMPP_ERR;
        aVar.f8141a = ezVar;
        C4679ez ezVar22 = aVar.f8141a;
        aVar.f8142a = str;
        return aVar;
    }

    /* renamed from: c */
    static C4687a m13825c(Exception exc) {
        C4679ez ezVar;
        m13822a(exc);
        boolean z = exc instanceof C4724gh;
        Throwable th = exc;
        if (z) {
            C4724gh ghVar = (C4724gh) exc;
            th = exc;
            if (ghVar.mo29210a() != null) {
                th = ghVar.mo29210a();
            }
        }
        C4687a aVar = new C4687a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        int a = C4714fy.m13982a(th);
        String str = th.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a == 105) {
            ezVar = C4679ez.BIND_TCP_READ_TIMEOUT;
        } else if (a == 199) {
            ezVar = C4679ez.BIND_TCP_ERR;
        } else if (a != 499) {
            ezVar = a != 109 ? a != 110 ? C4679ez.BIND_XMPP_ERR : C4679ez.BIND_TCP_BROKEN_PIPE : C4679ez.BIND_TCP_CONNRESET;
        } else {
            aVar.f8141a = C4679ez.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                ezVar = C4679ez.BIND_BOSH_ITEM_NOT_FOUND;
            }
            C4679ez ezVar2 = aVar.f8141a;
            if (ezVar2 == C4679ez.BIND_TCP_ERR || ezVar2 == C4679ez.BIND_XMPP_ERR || ezVar2 == C4679ez.BIND_BOSH_ERR) {
                aVar.f8142a = str;
            }
            return aVar;
        }
        aVar.f8141a = ezVar;
        C4679ez ezVar22 = aVar.f8141a;
        aVar.f8142a = str;
        return aVar;
    }

    /* renamed from: d */
    static C4687a m13826d(Exception exc) {
        C4679ez ezVar;
        m13822a(exc);
        boolean z = exc instanceof C4724gh;
        Throwable th = exc;
        if (z) {
            C4724gh ghVar = (C4724gh) exc;
            th = exc;
            if (ghVar.mo29210a() != null) {
                th = ghVar.mo29210a();
            }
        }
        C4687a aVar = new C4687a();
        String message = th.getMessage();
        int a = C4714fy.m13982a(th);
        String str = th.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a == 105) {
            ezVar = C4679ez.CHANNEL_TCP_READTIMEOUT;
        } else if (a == 199) {
            ezVar = C4679ez.CHANNEL_TCP_ERR;
        } else if (a != 499) {
            ezVar = a != 109 ? a != 110 ? C4679ez.CHANNEL_XMPPEXCEPTION : C4679ez.CHANNEL_TCP_BROKEN_PIPE : C4679ez.CHANNEL_TCP_CONNRESET;
        } else {
            aVar.f8141a = C4679ez.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                ezVar = C4679ez.CHANNEL_BOSH_ITEMNOTFIND;
            }
            C4679ez ezVar2 = aVar.f8141a;
            if (ezVar2 == C4679ez.CHANNEL_TCP_ERR || ezVar2 == C4679ez.CHANNEL_XMPPEXCEPTION || ezVar2 == C4679ez.CHANNEL_BOSH_EXCEPTION) {
                aVar.f8142a = str;
            }
            return aVar;
        }
        aVar.f8141a = ezVar;
        C4679ez ezVar22 = aVar.f8141a;
        aVar.f8142a = str;
        return aVar;
    }
}
