package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4890bi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.push.hj */
public class C4736hj {
    /* renamed from: a */
    private static HashMap<String, ArrayList<C4743hq>> m14545a(Context context, List<C4743hq> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<C4743hq>> hashMap = new HashMap<>();
        for (C4743hq next : list) {
            m14548a(context, next);
            ArrayList arrayList = hashMap.get(next.mo25273c());
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(next.mo25273c(), arrayList);
            }
            arrayList.add(next);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m14546a(Context context, C4738hl hlVar, HashMap<String, ArrayList<C4743hq>> hashMap) {
        for (Map.Entry next : hashMap.entrySet()) {
            try {
                ArrayList arrayList = (ArrayList) next.getValue();
                if (arrayList != null) {
                    if (arrayList.size() != 0) {
                        hlVar.mo25252a(arrayList, ((C4743hq) arrayList.get(0)).mo25279e(), (String) next.getKey());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m14547a(Context context, C4738hl hlVar, List<C4743hq> list) {
        HashMap<String, ArrayList<C4743hq>> a = m14545a(context, list);
        if (a == null || a.size() == 0) {
            C3989b.m10669a("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
            return;
        }
        m14546a(context, hlVar, a);
    }

    /* renamed from: a */
    private static void m14548a(Context context, C4743hq hqVar) {
        if (hqVar.f9058a) {
            hqVar.mo25266a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(hqVar.mo25277d())) {
            hqVar.mo25281f(C4890bi.m15702a());
        }
        hqVar.mo25268b(System.currentTimeMillis());
        if (TextUtils.isEmpty(hqVar.mo25279e())) {
            hqVar.mo25278e(context.getPackageName());
        }
        if (TextUtils.isEmpty(hqVar.mo25273c())) {
            hqVar.mo25278e(hqVar.mo25279e());
        }
    }
}
