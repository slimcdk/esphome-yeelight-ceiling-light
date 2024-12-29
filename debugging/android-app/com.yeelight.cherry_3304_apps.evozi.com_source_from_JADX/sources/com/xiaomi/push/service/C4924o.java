package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4694gd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.o */
public class C4924o {

    /* renamed from: a */
    private static ArrayList<Pair<String, byte[]>> f10176a = new ArrayList<>();

    /* renamed from: a */
    private static final Map<String, byte[]> f10177a = new HashMap();

    /* renamed from: a */
    public static void m15810a(Context context, int i, String str) {
        synchronized (f10177a) {
            for (String next : f10177a.keySet()) {
                m15811a(context, next, f10177a.get(next), i, str);
            }
            f10177a.clear();
        }
    }

    /* renamed from: a */
    public static void m15811a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, C4933w.m15856a(str));
    }

    /* renamed from: a */
    public static void m15812a(XMPushService xMPushService) {
        try {
            synchronized (f10177a) {
                for (String next : f10177a.keySet()) {
                    C4933w.m15861a(xMPushService, next, f10177a.get(next));
                }
                f10177a.clear();
            }
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            xMPushService.mo25869a(10, (Exception) e);
        }
    }

    /* renamed from: a */
    public static void m15813a(String str, byte[] bArr) {
        synchronized (f10177a) {
            f10177a.put(str, bArr);
        }
    }

    /* renamed from: b */
    public static void m15814b(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f10176a) {
                arrayList = f10176a;
                f10176a = new ArrayList<>();
            }
            Iterator<Pair<String, byte[]>> it = arrayList.iterator();
            while (it.hasNext()) {
                Pair next = it.next();
                C4933w.m15861a(xMPushService, (String) next.first, (byte[]) next.second);
            }
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            xMPushService.mo25869a(10, (Exception) e);
        }
    }

    /* renamed from: b */
    public static void m15815b(String str, byte[] bArr) {
        synchronized (f10176a) {
            f10176a.add(new Pair(str, bArr));
            if (f10176a.size() > 50) {
                f10176a.remove(0);
            }
        }
    }
}
