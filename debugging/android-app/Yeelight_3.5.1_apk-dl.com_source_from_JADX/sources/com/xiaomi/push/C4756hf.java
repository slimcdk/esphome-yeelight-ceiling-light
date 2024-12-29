package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4935bz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.push.hf */
public class C4756hf {
    /* renamed from: a */
    private static HashMap<String, ArrayList<C4764hn>> m14167a(Context context, List<C4764hn> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<C4764hn>> hashMap = new HashMap<>();
        for (C4764hn next : list) {
            m14170a(context, next);
            ArrayList arrayList = hashMap.get(next.mo29304c());
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(next.mo29304c(), arrayList);
            }
            arrayList.add(next);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m14168a(Context context, C4758hh hhVar, HashMap<String, ArrayList<C4764hn>> hashMap) {
        for (Map.Entry next : hashMap.entrySet()) {
            try {
                ArrayList arrayList = (ArrayList) next.getValue();
                if (arrayList != null) {
                    if (arrayList.size() != 0) {
                        hhVar.mo29281a(arrayList, ((C4764hn) arrayList.get(0)).mo29310e(), (String) next.getKey());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m14169a(Context context, C4758hh hhVar, List<C4764hn> list) {
        HashMap<String, ArrayList<C4764hn>> a = m14167a(context, list);
        if (a == null || a.size() == 0) {
            C4408b.m12464a("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
            return;
        }
        m14168a(context, hhVar, a);
    }

    /* renamed from: a */
    private static void m14170a(Context context, C4764hn hnVar) {
        if (hnVar.f8496a) {
            hnVar.mo29295a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(hnVar.mo29308d())) {
            hnVar.mo29312f(C4935bz.m15494a());
        }
        hnVar.mo29299b(System.currentTimeMillis());
        if (TextUtils.isEmpty(hnVar.mo29310e())) {
            hnVar.mo29309e(context.getPackageName());
        }
        if (TextUtils.isEmpty(hnVar.mo29304c())) {
            hnVar.mo29309e(hnVar.mo29310e());
        }
    }
}
