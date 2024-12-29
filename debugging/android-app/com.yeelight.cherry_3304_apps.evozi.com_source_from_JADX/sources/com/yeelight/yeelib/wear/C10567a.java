package com.yeelight.yeelib.wear;

import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.wearable.C2526n;
import com.google.android.gms.wearable.C2527o;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.yeelight.yeelib.wear.a */
public class C10567a {

    /* renamed from: c */
    private static C10567a f20197c;

    /* renamed from: a */
    private C1399f f20198a;

    /* renamed from: b */
    private boolean f20199b = false;

    /* renamed from: c */
    public static C10567a m25859c() {
        if (f20197c == null) {
            f20197c = new C10567a();
        }
        return f20197c;
    }

    /* renamed from: a */
    public void mo33401a() {
        C1399f fVar = this.f20198a;
        if (fVar != null && fVar.mo10829h() && this.f20199b) {
            List<C4200i> t0 = C4257w.m11947l0().mo23688t0();
            int size = t0.size();
            String[] strArr = new String[size];
            for (int i = 0; i < t0.size(); i++) {
                strArr[i] = t0.get(i).mo23436z1();
            }
            C2526n b = C2526n.m8126b("/device_list");
            "build device list , length : " + size;
            b.mo13458c().mo13251s("device_list", strArr);
            C2527o.f5020a.mo13198a(this.f20198a, b.mo13457a());
        }
    }

    /* renamed from: b */
    public byte[] mo33402b() {
        C1399f fVar = this.f20198a;
        if (fVar == null || !fVar.mo10829h() || !this.f20199b) {
            return null;
        }
        List<C4200i> t0 = C4257w.m11947l0().mo23688t0();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < t0.size(); i++) {
            jSONArray.put(t0.get(i).mo23436z1());
        }
        return jSONArray.toString().getBytes();
    }

    /* renamed from: d */
    public void mo33403d(C1399f fVar) {
        this.f20198a = fVar;
    }

    /* renamed from: e */
    public void mo33404e(boolean z) {
        this.f20199b = z;
    }
}
