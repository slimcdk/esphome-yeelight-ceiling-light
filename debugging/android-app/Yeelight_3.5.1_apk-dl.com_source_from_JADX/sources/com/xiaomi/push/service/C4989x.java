package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4995w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.x */
public class C4989x {

    /* renamed from: a */
    private static ArrayList<Pair<String, byte[]>> f9759a = new ArrayList<>();

    /* renamed from: a */
    private static final Map<String, byte[]> f9760a = new HashMap();

    /* renamed from: a */
    public static void m15698a(Context context, int i, String str) {
        Map<String, byte[]> map = f9760a;
        synchronized (map) {
            for (String next : map.keySet()) {
                C4408b.m12464a("notify registration error. " + next);
                m15699a(context, next, f9760a.get(next), i, str);
            }
            f9760a.clear();
        }
    }

    /* renamed from: a */
    public static void m15699a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, C4870ah.m15196a(str));
    }

    /* renamed from: a */
    public static void m15700a(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f9759a) {
                arrayList = f9759a;
                f9759a = new ArrayList<>();
            }
            boolean a = C4995w.m15745a();
            Iterator<Pair<String, byte[]>> it = arrayList.iterator();
            while (it.hasNext()) {
                Pair next = it.next();
                C4870ah.m15201a(xMPushService, (String) next.first, (byte[]) next.second);
                if (!a) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (C4724gh e) {
            C4408b.m12483d("meet error when process pending message. " + e);
            xMPushService.mo29929a(10, (Exception) e);
        }
    }

    /* renamed from: a */
    public static void m15701a(XMPushService xMPushService, boolean z) {
        try {
            Map<String, byte[]> map = f9760a;
            synchronized (map) {
                for (String next : map.keySet()) {
                    C4408b.m12464a("processing pending registration request. " + next);
                    C4870ah.m15201a(xMPushService, next, f9760a.get(next));
                    if (z && !C4995w.m15745a()) {
                        try {
                            Thread.sleep(200);
                        } catch (Exception unused) {
                        }
                    }
                }
                f9760a.clear();
            }
        } catch (C4724gh e) {
            C4408b.m12483d("fail to deal with pending register request. " + e);
            xMPushService.mo29929a(10, (Exception) e);
        }
    }

    /* renamed from: a */
    public static void m15702a(String str, byte[] bArr) {
        Map<String, byte[]> map = f9760a;
        synchronized (map) {
            C4408b.m12464a("pending registration request. " + str);
            map.put(str, bArr);
        }
    }

    /* renamed from: b */
    public static void m15703b(String str, byte[] bArr) {
        synchronized (f9759a) {
            f9759a.add(new Pair(str, bArr));
            if (f9759a.size() > 50) {
                f9759a.remove(0);
            }
        }
    }
}
