package p179k4;

import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.wearable.C1903b;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import java.util.List;
import org.json.JSONArray;
import p069n0.C3370o;

/* renamed from: k4.a */
public class C9295a {

    /* renamed from: c */
    private static C9295a f17217c;

    /* renamed from: a */
    private C0736d f17218a;

    /* renamed from: b */
    private boolean f17219b = false;

    /* renamed from: c */
    public static C9295a m22761c() {
        if (f17217c == null) {
            f17217c = new C9295a();
        }
        return f17217c;
    }

    /* renamed from: a */
    public void mo37826a() {
        C0736d dVar = this.f17218a;
        if (dVar != null && dVar.mo11866j() && this.f17219b) {
            List<C3012e> w0 = YeelightDeviceManager.m7800o0().mo23321w0();
            int size = w0.size();
            String[] strArr = new String[size];
            for (int i = 0; i < w0.size(); i++) {
                strArr[i] = w0.get(i).mo23251z1();
            }
            C3370o b = C3370o.m9209b("/device_list");
            StringBuilder sb = new StringBuilder();
            sb.append("build device list , length : ");
            sb.append(size);
            b.mo24142c().mo24133s("device_list", strArr);
            C1903b.f2983a.mo14795a(this.f17218a, b.mo24141a());
        }
    }

    /* renamed from: b */
    public byte[] mo37827b() {
        C0736d dVar = this.f17218a;
        if (dVar == null || !dVar.mo11866j() || !this.f17219b) {
            return null;
        }
        List<C3012e> w0 = YeelightDeviceManager.m7800o0().mo23321w0();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < w0.size(); i++) {
            jSONArray.put(w0.get(i).mo23251z1());
        }
        return jSONArray.toString().getBytes();
    }

    /* renamed from: d */
    public void mo37828d(C0736d dVar) {
        this.f17218a = dVar;
    }

    /* renamed from: e */
    public void mo37829e(boolean z) {
        this.f17219b = z;
    }
}
