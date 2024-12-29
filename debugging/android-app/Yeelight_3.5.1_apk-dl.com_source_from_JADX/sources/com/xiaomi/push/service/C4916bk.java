package com.xiaomi.push.service;

/* renamed from: com.xiaomi.push.service.bk */
public abstract class C4916bk {

    /* renamed from: A */
    public static String f9565A = "ext_cloud_attr";

    /* renamed from: B */
    public static String f9566B = "ext_pkg_name";

    /* renamed from: C */
    public static String f9567C = "ext_notify_id";

    /* renamed from: D */
    public static String f9568D = "ext_clicked_button";

    /* renamed from: E */
    public static String f9569E = "ext_notify_type";

    /* renamed from: F */
    public static String f9570F = "ext_session";

    /* renamed from: G */
    public static String f9571G = "sig";

    /* renamed from: H */
    public static String f9572H = "ext_notify_title";

    /* renamed from: I */
    public static String f9573I = "ext_notify_description";

    /* renamed from: J */
    public static String f9574J = "ext_messenger";

    /* renamed from: K */
    public static String f9575K = "title";

    /* renamed from: L */
    public static String f9576L = "description";

    /* renamed from: M */
    public static String f9577M = "notifyId";

    /* renamed from: N */
    public static String f9578N = "dump";

    /* renamed from: a */
    public static String f9579a = "1";

    /* renamed from: b */
    public static String f9580b = "2";

    /* renamed from: c */
    public static String f9581c = "3";

    /* renamed from: d */
    public static String f9582d = "com.xiaomi.push.OPEN_CHANNEL";

    /* renamed from: e */
    public static String f9583e = "com.xiaomi.push.SEND_MESSAGE";

    /* renamed from: f */
    public static String f9584f = "com.xiaomi.push.SEND_IQ";

    /* renamed from: g */
    public static String f9585g = "com.xiaomi.push.BATCH_SEND_MESSAGE";

    /* renamed from: h */
    public static String f9586h = "com.xiaomi.push.SEND_PRES";

    /* renamed from: i */
    public static String f9587i = "com.xiaomi.push.CLOSE_CHANNEL";

    /* renamed from: j */
    public static String f9588j = "com.xiaomi.push.FORCE_RECONN";

    /* renamed from: k */
    public static String f9589k = "com.xiaomi.push.RESET_CONN";

    /* renamed from: l */
    public static String f9590l = "com.xiaomi.push.UPDATE_CHANNEL_INFO";

    /* renamed from: m */
    public static String f9591m = "com.xiaomi.push.SEND_STATS";

    /* renamed from: n */
    public static String f9592n = "com.xiaomi.push.HANDLE_FCM_MSG";

    /* renamed from: o */
    public static String f9593o = "com.xiaomi.push.CHANGE_HOST";

    /* renamed from: p */
    public static String f9594p = "com.xiaomi.push.PING_TIMER";

    /* renamed from: q */
    public static String f9595q = "ext_user_id";

    /* renamed from: r */
    public static String f9596r = "ext_user_server";

    /* renamed from: s */
    public static String f9597s = "ext_user_res";

    /* renamed from: t */
    public static String f9598t = "ext_chid";

    /* renamed from: u */
    public static String f9599u = "ext_sid";

    /* renamed from: v */
    public static String f9600v = "ext_token";

    /* renamed from: w */
    public static String f9601w = "ext_auth_method";

    /* renamed from: x */
    public static String f9602x = "ext_security";

    /* renamed from: y */
    public static String f9603y = "ext_kick";

    /* renamed from: z */
    public static String f9604z = "ext_client_attr";

    /* renamed from: a */
    public static String m15431a(int i) {
        switch (i) {
            case 0:
                return "ERROR_OK";
            case 1:
                return "ERROR_SERVICE_NOT_INSTALLED";
            case 2:
                return "ERROR_NETWORK_NOT_AVAILABLE";
            case 3:
                return "ERROR_NETWORK_FAILED";
            case 4:
                return "ERROR_ACCESS_DENIED";
            case 5:
                return "ERROR_AUTH_FAILED";
            case 6:
                return "ERROR_MULTI_LOGIN";
            case 7:
                return "ERROR_SERVER_ERROR";
            case 8:
                return "ERROR_RECEIVE_TIMEOUT";
            case 9:
                return "ERROR_READ_ERROR";
            case 10:
                return "ERROR_SEND_ERROR";
            case 11:
                return "ERROR_RESET";
            case 12:
                return "ERROR_NO_CLIENT";
            case 13:
                return "ERROR_SERVER_STREAM";
            case 14:
                return "ERROR_THREAD_BLOCK";
            case 15:
                return "ERROR_SERVICE_DESTROY";
            case 16:
                return "ERROR_SESSION_CHANGED";
            case 17:
                return "ERROR_READ_TIMEOUT";
            case 18:
                return "ERROR_CONNECTIING_TIMEOUT";
            case 19:
                return "ERROR_USER_BLOCKED";
            case 20:
                return "ERROR_REDIRECT";
            case 21:
                return "ERROR_BIND_TIMEOUT";
            case 22:
                return "ERROR_PING_TIMEOUT";
            default:
                return String.valueOf(i);
        }
    }
}
