package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;

/* renamed from: com.xiaomi.push.ey */
public enum C4678ey {
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
    public final String f8040a;

    private C4678ey(String str) {
        this.f8040a = str;
    }

    /* renamed from: a */
    public static int m13770a(String str) {
        int i = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (C4678ey eyVar : values()) {
            if (eyVar.f8040a.equals(str)) {
                i = C4665en.m13674a((Enum) eyVar);
            }
        }
        return i;
    }
}
