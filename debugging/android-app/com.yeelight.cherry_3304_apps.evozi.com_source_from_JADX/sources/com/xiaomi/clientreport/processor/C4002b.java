package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.clientreport.data.C3990a;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.C4536bj;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.xiaomi.clientreport.processor.b */
public class C4002b implements IPerfProcessor {

    /* renamed from: a */
    protected Context f6822a;

    /* renamed from: a */
    private HashMap<String, HashMap<String, C3990a>> f6823a;

    public C4002b(Context context) {
        this.f6822a = context;
    }

    /* renamed from: a */
    public static String mo22747a(C3990a aVar) {
        return String.valueOf(aVar.production) + "#" + aVar.clientInterfaceId;
    }

    /* renamed from: b */
    private String m10724b(C3990a aVar) {
        String str;
        int i = aVar.production;
        String str2 = aVar.clientInterfaceId;
        if (i <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i) + "#" + str2;
        }
        File externalFilesDir = this.f6822a.getExternalFilesDir("perf");
        if (externalFilesDir == null) {
            C3989b.m10681d("cannot get folder when to write perf");
            return null;
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        return new File(externalFilesDir, str).getAbsolutePath();
    }

    /* renamed from: c */
    private String m10725c(C3990a aVar) {
        String b = m10724b(aVar);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        for (int i = 0; i < 20; i++) {
            String str = b + i;
            if (C4536bj.m13451a(this.f6822a, str)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo22745a() {
        C4536bj.m13452a(this.f6822a, "perf", "perfUploading");
        File[] a = C4536bj.m13451a(this.f6822a, "perfUploading");
        if (a != null && a.length > 0) {
            for (File file : a) {
                if (file != null) {
                    List<String> a2 = C4005e.m10738a(this.f6822a, file.getAbsolutePath());
                    file.delete();
                    mo22751a(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public void m10727a(C3990a aVar) {
        if ((aVar instanceof PerfClientReport) && this.f6823a != null) {
            PerfClientReport perfClientReport = (PerfClientReport) aVar;
            String a = mo22747a((C3990a) perfClientReport);
            String a2 = C4005e.m10736a(perfClientReport);
            HashMap hashMap = this.f6823a.get(a);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            PerfClientReport perfClientReport2 = (PerfClientReport) hashMap.get(a2);
            if (perfClientReport2 != null) {
                perfClientReport.perfCounts += perfClientReport2.perfCounts;
                perfClientReport.perfLatencies += perfClientReport2.perfLatencies;
            }
            hashMap.put(a2, perfClientReport);
            this.f6823a.put(a, hashMap);
        }
    }

    /* renamed from: a */
    public void mo22751a(List<String> list) {
        C4536bj.m13453a(this.f6822a, list);
    }

    /* renamed from: a */
    public void mo22752a(C3990a[] aVarArr) {
        String c = m10725c(aVarArr[0]);
        if (!TextUtils.isEmpty(c)) {
            C4005e.m10740a(c, aVarArr);
        }
    }

    /* renamed from: b */
    public void mo22750b() {
        HashMap<String, HashMap<String, C3990a>> hashMap = this.f6823a;
        if (hashMap != null) {
            if (hashMap.size() > 0) {
                for (String str : this.f6823a.keySet()) {
                    HashMap hashMap2 = this.f6823a.get(str);
                    if (hashMap2 != null && hashMap2.size() > 0) {
                        C3990a[] aVarArr = new C3990a[hashMap2.size()];
                        hashMap2.values().toArray(aVarArr);
                        mo22752a(aVarArr);
                    }
                }
            }
            this.f6823a.clear();
        }
    }

    public void setPerfMap(HashMap<String, HashMap<String, C3990a>> hashMap) {
        this.f6823a = hashMap;
    }
}
