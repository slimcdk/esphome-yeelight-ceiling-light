package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.push.C4798iu;

/* renamed from: com.xiaomi.mipush.sdk.t */
public class C4495t {
    /* renamed from: a */
    public static <T extends C4798iu<T, ?>> void m12812a(Context context, Config config) {
        if (config != null) {
            Intent intent = new Intent();
            intent.setAction("action_cr_config");
            intent.putExtra("action_cr_event_switch", config.isEventUploadSwitchOpen());
            intent.putExtra("action_cr_event_frequency", config.getEventUploadFrequency());
            intent.putExtra("action_cr_perf_switch", config.isPerfUploadSwitchOpen());
            intent.putExtra("action_cr_perf_frequency", config.getPerfUploadFrequency());
            intent.putExtra("action_cr_event_en", config.isEventEncrypted());
            intent.putExtra("action_cr_max_file_size", config.getMaxFileLength());
            C4465ao.m12646a(context).mo28657a(intent);
        }
    }
}
