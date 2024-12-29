package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.eb */
public class C4622eb extends C4624ed {
    public C4622eb(Context context, int i) {
        super(context, i);
    }

    /* renamed from: b */
    private String m13789b() {
        Bundle extras;
        StringBuilder sb = new StringBuilder();
        try {
            Intent registerReceiver = this.f8438a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (!(registerReceiver == null || (extras = registerReceiver.getExtras()) == null)) {
                Set<String> keySet = extras.keySet();
                JSONObject jSONObject = new JSONObject();
                if (keySet != null && keySet.size() > 0) {
                    for (String str : keySet) {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                jSONObject.put(str, String.valueOf(extras.get(str)));
                            } catch (Exception unused) {
                            }
                        }
                    }
                    sb.append(jSONObject);
                }
            }
        } catch (Exception unused2) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo22734a() {
        return 20;
    }

    /* renamed from: a */
    public C4741ho m13791a() {
        return C4741ho.Battery;
    }

    /* renamed from: a */
    public String m13792a() {
        return m13789b();
    }
}
