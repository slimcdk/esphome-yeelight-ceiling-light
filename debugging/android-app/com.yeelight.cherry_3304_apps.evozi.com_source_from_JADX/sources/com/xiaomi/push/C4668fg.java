package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;

/* renamed from: com.xiaomi.push.fg */
public enum C4668fg {
    COMMAND_REGISTER(MiPushClient.COMMAND_REGISTER),
    COMMAND_UNREGISTER(MiPushClient.COMMAND_UNREGISTER),
    COMMAND_SET_ALIAS(MiPushClient.COMMAND_SET_ALIAS),
    COMMAND_UNSET_ALIAS(MiPushClient.COMMAND_UNSET_ALIAS),
    COMMAND_SET_ACCOUNT(MiPushClient.COMMAND_SET_ACCOUNT),
    COMMAND_UNSET_ACCOUNT(MiPushClient.COMMAND_UNSET_ACCOUNT),
    COMMAND_SUBSCRIBE_TOPIC(MiPushClient.COMMAND_SUBSCRIBE_TOPIC),
    COMMAND_UNSUBSCRIBE_TOPIC(MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC),
    COMMAND_SET_ACCEPT_TIME(MiPushClient.COMMAND_SET_ACCEPT_TIME),
    COMMAND_CHK_VDEVID("check-vdeviceid");
    

    /* renamed from: a */
    public final String f8633a;

    private C4668fg(String str) {
        this.f8633a = str;
    }

    /* renamed from: a */
    public static int m14180a(String str) {
        int i = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (C4668fg fgVar : values()) {
            if (fgVar.f8633a.equals(str)) {
                i = C4660fa.m14136a((Enum) fgVar);
            }
        }
        return i;
    }
}
