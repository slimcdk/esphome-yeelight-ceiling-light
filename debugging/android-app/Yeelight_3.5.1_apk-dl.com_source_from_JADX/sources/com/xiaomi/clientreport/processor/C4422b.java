package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.data.C4410a;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.C4565bt;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.xiaomi.clientreport.processor.b */
public class C4422b implements IPerfProcessor {

    /* renamed from: a */
    protected Context f7389a;

    /* renamed from: a */
    private HashMap<String, HashMap<String, C4410a>> f7390a;

    public C4422b(Context context) {
        this.f7389a = context;
    }

    /* renamed from: a */
    public static String mo28492a(C4410a aVar) {
        return String.valueOf(aVar.production) + "#" + aVar.clientInterfaceId;
    }

    /* renamed from: b */
    private String m12527b(C4410a aVar) {
        String str;
        int i = aVar.production;
        String str2 = aVar.clientInterfaceId;
        if (i <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i) + "#" + str2;
        }
        File externalFilesDir = this.f7389a.getExternalFilesDir("perf");
        if (externalFilesDir == null) {
            C4408b.m12483d("cannot get folder when to write perf");
            return null;
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        return new File(externalFilesDir, str).getAbsolutePath();
    }

    /* renamed from: c */
    private String m12528c(C4410a aVar) {
        String b = m12527b(aVar);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        for (int i = 0; i < 20; i++) {
            String str = b + i;
            if (C4565bt.m13063a(this.f7389a, str)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo28490a() {
        C4565bt.m13064a(this.f7389a, "perf", "perfUploading");
        File[] a = C4565bt.m13063a(this.f7389a, "perfUploading");
        if (a != null && a.length > 0) {
            for (File file : a) {
                if (file != null) {
                    List<String> a2 = C4425e.m12541a(this.f7389a, file.getAbsolutePath());
                    file.delete();
                    mo28496a(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public void m12530a(C4410a aVar) {
        if ((aVar instanceof PerfClientReport) && this.f7390a != null) {
            PerfClientReport perfClientReport = (PerfClientReport) aVar;
            String a = mo28492a((C4410a) perfClientReport);
            String a2 = C4425e.m12539a(perfClientReport);
            HashMap hashMap = this.f7390a.get(a);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            PerfClientReport perfClientReport2 = (PerfClientReport) hashMap.get(a2);
            if (perfClientReport2 != null) {
                perfClientReport.perfCounts += perfClientReport2.perfCounts;
                perfClientReport.perfLatencies += perfClientReport2.perfLatencies;
            }
            hashMap.put(a2, perfClientReport);
            this.f7390a.put(a, hashMap);
        }
    }

    /* renamed from: a */
    public void mo28496a(List<String> list) {
        C4565bt.m13065a(this.f7389a, list);
    }

    /* renamed from: a */
    public void mo28497a(C4410a[] aVarArr) {
        String c = m12528c(aVarArr[0]);
        if (!TextUtils.isEmpty(c)) {
            C4425e.m12543a(c, aVarArr);
        }
    }

    /* renamed from: b */
    public void mo28495b() {
        HashMap<String, HashMap<String, C4410a>> hashMap = this.f7390a;
        if (hashMap != null) {
            if (hashMap.size() > 0) {
                for (String str : this.f7390a.keySet()) {
                    HashMap hashMap2 = this.f7390a.get(str);
                    if (hashMap2 != null && hashMap2.size() > 0) {
                        C4410a[] aVarArr = new C4410a[hashMap2.size()];
                        hashMap2.values().toArray(aVarArr);
                        mo28497a(aVarArr);
                    }
                }
            }
            this.f7390a.clear();
        }
    }

    public void setPerfMap(HashMap<String, HashMap<String, C4410a>> hashMap) {
        this.f7390a = hashMap;
    }
}
