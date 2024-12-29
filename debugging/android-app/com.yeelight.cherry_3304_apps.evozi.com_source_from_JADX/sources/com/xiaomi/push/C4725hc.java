package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.net.UnknownHostException;

/* renamed from: com.xiaomi.push.hc */
final class C4725hc {

    /* renamed from: com.xiaomi.push.hc$a */
    static class C4726a {

        /* renamed from: a */
        C4669fh f8937a;

        /* renamed from: a */
        String f8938a;

        C4726a() {
        }
    }

    /* renamed from: a */
    static C4726a m14496a(Exception exc) {
        m14496a(exc);
        boolean z = exc instanceof C4694gd;
        Throwable th = exc;
        if (z) {
            C4694gd gdVar = (C4694gd) exc;
            th = exc;
            if (gdVar.mo25174a() != null) {
                th = gdVar.mo25174a();
            }
        }
        C4726a aVar = new C4726a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        String str = th.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        int a = C4683fu.m14319a(th);
        if (a != 0) {
            aVar.f8937a = C4669fh.m14181a(C4669fh.GSLB_REQUEST_SUCCESS.mo25070a() + a);
        }
        if (aVar.f8937a == null) {
            aVar.f8937a = C4669fh.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f8937a == C4669fh.GSLB_TCP_ERR_OTHER) {
            aVar.f8938a = str;
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m14497a(Exception exc) {
        if (exc == null) {
            throw null;
        }
    }

    /* renamed from: b */
    static C4726a m14498b(Exception exc) {
        C4669fh fhVar;
        Throwable cause;
        m14496a(exc);
        boolean z = exc instanceof C4694gd;
        Throwable th = exc;
        if (z) {
            C4694gd gdVar = (C4694gd) exc;
            th = exc;
            if (gdVar.mo25174a() != null) {
                th = gdVar.mo25174a();
            }
        }
        C4726a aVar = new C4726a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        int a = C4683fu.m14319a(th);
        String str = th.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a != 0) {
            C4669fh a2 = C4669fh.m14181a(C4669fh.CONN_SUCCESS.mo25070a() + a);
            aVar.f8937a = a2;
            if (a2 == C4669fh.CONN_BOSH_ERR && (cause = th.getCause()) != null && (cause instanceof UnknownHostException)) {
                fhVar = C4669fh.CONN_BOSH_UNKNOWNHOST;
            }
            C4669fh fhVar2 = aVar.f8937a;
            if (fhVar2 == C4669fh.CONN_TCP_ERR_OTHER || fhVar2 == C4669fh.CONN_XMPP_ERR || fhVar2 == C4669fh.CONN_BOSH_ERR) {
                aVar.f8938a = str;
            }
            return aVar;
        }
        fhVar = C4669fh.CONN_XMPP_ERR;
        aVar.f8937a = fhVar;
        C4669fh fhVar22 = aVar.f8937a;
        aVar.f8938a = str;
        return aVar;
    }

    /* renamed from: c */
    static C4726a m14499c(Exception exc) {
        C4669fh fhVar;
        m14496a(exc);
        boolean z = exc instanceof C4694gd;
        Throwable th = exc;
        if (z) {
            C4694gd gdVar = (C4694gd) exc;
            th = exc;
            if (gdVar.mo25174a() != null) {
                th = gdVar.mo25174a();
            }
        }
        C4726a aVar = new C4726a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        int a = C4683fu.m14319a(th);
        String str = th.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a == 105) {
            fhVar = C4669fh.BIND_TCP_READ_TIMEOUT;
        } else if (a == 199) {
            fhVar = C4669fh.BIND_TCP_ERR;
        } else if (a != 499) {
            fhVar = a != 109 ? a != 110 ? C4669fh.BIND_XMPP_ERR : C4669fh.BIND_TCP_BROKEN_PIPE : C4669fh.BIND_TCP_CONNRESET;
        } else {
            aVar.f8937a = C4669fh.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                fhVar = C4669fh.BIND_BOSH_ITEM_NOT_FOUND;
            }
            C4669fh fhVar2 = aVar.f8937a;
            if (fhVar2 == C4669fh.BIND_TCP_ERR || fhVar2 == C4669fh.BIND_XMPP_ERR || fhVar2 == C4669fh.BIND_BOSH_ERR) {
                aVar.f8938a = str;
            }
            return aVar;
        }
        aVar.f8937a = fhVar;
        C4669fh fhVar22 = aVar.f8937a;
        aVar.f8938a = str;
        return aVar;
    }

    /* renamed from: d */
    static C4726a m14500d(Exception exc) {
        C4669fh fhVar;
        m14496a(exc);
        boolean z = exc instanceof C4694gd;
        Throwable th = exc;
        if (z) {
            C4694gd gdVar = (C4694gd) exc;
            th = exc;
            if (gdVar.mo25174a() != null) {
                th = gdVar.mo25174a();
            }
        }
        C4726a aVar = new C4726a();
        String message = th.getMessage();
        int a = C4683fu.m14319a(th);
        String str = th.getClass().getSimpleName() + Constants.COLON_SEPARATOR + message;
        if (a == 105) {
            fhVar = C4669fh.CHANNEL_TCP_READTIMEOUT;
        } else if (a == 199) {
            fhVar = C4669fh.CHANNEL_TCP_ERR;
        } else if (a != 499) {
            fhVar = a != 109 ? a != 110 ? C4669fh.CHANNEL_XMPPEXCEPTION : C4669fh.CHANNEL_TCP_BROKEN_PIPE : C4669fh.CHANNEL_TCP_CONNRESET;
        } else {
            aVar.f8937a = C4669fh.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                fhVar = C4669fh.CHANNEL_BOSH_ITEMNOTFIND;
            }
            C4669fh fhVar2 = aVar.f8937a;
            if (fhVar2 == C4669fh.CHANNEL_TCP_ERR || fhVar2 == C4669fh.CHANNEL_XMPPEXCEPTION || fhVar2 == C4669fh.CHANNEL_BOSH_EXCEPTION) {
                aVar.f8938a = str;
            }
            return aVar;
        }
        aVar.f8937a = fhVar;
        C4669fh fhVar22 = aVar.f8937a;
        aVar.f8938a = str;
        return aVar;
    }
}
