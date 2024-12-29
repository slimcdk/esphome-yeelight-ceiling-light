package p207s3;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.StringRes;
import com.miot.api.CommonHandler;
import com.miot.api.Constants;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.cherry.p141ui.activity.FanclControlViewActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6163d;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p215u3.C10510v;
import p232y3.C12041e;
import p237z3.C12145e;

/* renamed from: s3.c */
public abstract class C10337c extends C10344f {

    /* renamed from: C */
    protected C10341d f19421C;

    /* renamed from: Q */
    protected int f19422Q = 0;

    /* renamed from: R */
    private List<C6093d> f19423R;

    /* renamed from: S */
    private Map<Integer, C10340c> f19424S;

    /* renamed from: s3.c$a */
    class C10338a implements CommonHandler<String> {
        C10338a() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C10337c.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("queryBoundRemoteList, onSucceed ret = ");
            sb.append(str);
            C10337c.this.mo23221d0().mo31612r0(C10337c.this.mo41895i2(str));
        }

        public void onFailed(int i, String str) {
            String str2 = C10337c.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("queryBoundRemoteList, onFailed ret = ");
            sb.append(str);
            sb.append(", i = ");
            sb.append(i);
        }
    }

    /* renamed from: s3.c$b */
    class C10339b implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f19426a;

        C10339b(int i) {
            this.f19426a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            int i;
            StringBuilder sb = new StringBuilder();
            sb.append("unbindRemote, onSucceed ret = ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString(Constants.EXTRA_PUSH_MESSAGE).equals("ok") && jSONObject.getString("result").contains("ok") && ((i = this.f19426a) == 21 || i == 296 || i == 295 || i == 294)) {
                    C10337c.this.mo23221d0().mo31529B0((C10343e) null);
                }
                C10337c.this.mo23221d0().mo31592h0(4096);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unbindRemote, onFailed ret = ");
            sb.append(str);
            sb.append(", i = ");
            sb.append(i);
        }
    }

    /* renamed from: s3.c$c */
    public class C10340c {

        /* renamed from: a */
        private int f19428a;

        /* renamed from: b */
        private int f19429b;

        /* renamed from: c */
        private int f19430c;

        /* renamed from: d */
        private int f19431d;

        /* renamed from: e */
        private boolean f19432e;

        public C10340c(int i, int i2, @StringRes int i3) {
            this.f19428a = i;
            this.f19429b = i2;
            this.f19430c = i3;
        }

        public C10340c(int i, int i2, int i3, int i4) {
            this.f19428a = i;
            this.f19429b = i2;
            this.f19430c = i3;
            this.f19431d = i4;
        }

        public C10340c(int i, int i2, int i3, boolean z) {
            this.f19428a = i;
            this.f19429b = i2;
            this.f19430c = i3;
            this.f19432e = z;
        }

        /* renamed from: a */
        public int mo41910a() {
            return this.f19428a;
        }

        /* renamed from: b */
        public int mo41911b() {
            return this.f19431d;
        }

        /* renamed from: c */
        public int mo41912c() {
            return this.f19430c;
        }

        /* renamed from: d */
        public int mo41913d() {
            return this.f19429b;
        }

        /* renamed from: e */
        public boolean mo41914e() {
            return this.f19432e;
        }

        /* renamed from: f */
        public void mo41915f(int i) {
            if (this.f19431d != i) {
                this.f19431d = i;
                C10337c.this.mo41904v2().mo31592h0(4096);
            }
        }
    }

    /* renamed from: s3.c$d */
    public static class C10341d extends DeviceStatusBase {

        /* renamed from: K */
        private int f19434K;

        public C10341d(String str) {
            super(str);
        }

        /* renamed from: Z0 */
        public int mo41916Z0() {
            return this.f19434K;
        }

        /* renamed from: a1 */
        public void mo41917a1(int i) {
        }

        /* renamed from: b1 */
        public void mo41918b1(int i) {
            if (this.f19434K != i) {
                mo31592h0(4096);
                this.f19434K = i;
            }
        }
    }

    public C10337c(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        this.f19421C = new C10341d(str3);
    }

    /* renamed from: w2 */
    private void m26038w2() {
        List<C6093d> list = this.f19423R;
        if (list != null) {
            for (C6093d W0 : list) {
                mo23213W0(W0);
            }
        }
        this.f19423R = C10510v.m26788k0(this.f4736a, this);
    }

    /* renamed from: A2 */
    public void mo41890A2(int i) {
        this.f19422Q = i;
    }

    /* renamed from: B0 */
    public void mo23178B0(C12145e eVar) {
        super.mo23178B0(eVar);
        mo41904v2().mo31594i0(eVar, true);
    }

    /* renamed from: B2 */
    public abstract void mo41891B2(int i);

    /* renamed from: C */
    public C12041e mo23179C() {
        return (C12041e) (this.f19422Q == 0 ? mo23221d0() : mo41904v2()).mo31611r(2);
    }

    /* renamed from: C2 */
    public void mo41892C2(Map<Integer, C10340c> map) {
        this.f19424S = map;
    }

    /* renamed from: D2 */
    public abstract void mo41893D2(C10340c cVar, int i);

    /* renamed from: E2 */
    public abstract void mo41894E2(int i);

    /* renamed from: W0 */
    public void mo23213W0(C12145e eVar) {
        super.mo23213W0(eVar);
        mo41904v2().mo31569V0(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public ArrayList<C6163d> mo41895i2(String str) {
        C6163d dVar;
        StringBuilder sb = new StringBuilder();
        sb.append("parseRemoteDevicelist result:");
        sb.append(str);
        ArrayList<C6163d> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                String string = jSONObject.getString("mac");
                String string2 = jSONObject.getString("beaconkey");
                int i2 = jSONObject.getInt(ScanBarcodeActivity.PID);
                int i3 = jSONObject.getInt("evtid");
                String m2 = mo41927m2(string);
                if (i2 == 339 || i2 == 950 || i2 == 959 || i2 == 1678) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("parseRemoteDevicelist mac :");
                    sb2.append(m2);
                    dVar = new C6163d(string, m2, string2, i2, i3);
                } else if (i3 == 8193) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("parseMiBandDevicelist mac :");
                    sb3.append(m2);
                    C10343e eVar = new C10343e(m2);
                    eVar.mo41922d(i2);
                    mo23221d0().mo31529B0(eVar);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("parseRemoteDevicelist mac :");
                    sb4.append(m2);
                    dVar = new C6163d(string, m2, string2, i2, i3);
                }
                arrayList.add(dVar);
            }
            mo41925j2(arrayList);
            return arrayList;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j0 */
    public void mo23228j0() {
        super.mo23228j0();
        m26038w2();
    }

    /* renamed from: k2 */
    public boolean mo41896k2() {
        String str = "/device/rpc/" + mo31698M1();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo31698M1());
            jSONObject.put("id", 1);
            jSONObject.put("method", "ble_dbg_tbl_dump");
            jSONObject2.put("table", "evtRuleTbl");
            jSONObject.put("params", jSONObject2);
            StringBuilder sb = new StringBuilder();
            sb.append("queryBoundRemoteList cmd :");
            sb.append(jSONObject2.toString());
            sb.append(", path = ");
            sb.append(str);
            sb.append(" , jAction = ");
            sb.append(jSONObject.toString());
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C10338a());
                return true;
            } catch (MiotException e) {
                e.printStackTrace();
                return false;
            }
        } catch (JSONException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("queryBoundRemoteList params exception:");
            sb2.append(e2.toString());
            return false;
        }
    }

    /* renamed from: o2 */
    public boolean mo41897o2(String str, int i, int i2) {
        String str2 = "/device/rpc/" + mo31698M1();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo31698M1());
            jSONObject.put("id", 1);
            jSONObject.put("method", "miIO.bleEvtRuleDel");
            jSONObject2.put("mac", str);
            jSONObject2.put(ScanBarcodeActivity.PID, i);
            jSONObject2.put("eid", i2);
            jSONObject.put("params", jSONObject2);
            StringBuilder sb = new StringBuilder();
            sb.append("unbindRemote cmd :");
            sb.append(jSONObject2.toString());
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str2, jSONObject, new C10339b(i));
                return true;
            } catch (MiotException e) {
                e.printStackTrace();
                return false;
            }
        } catch (JSONException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unbindRemote params exception:");
            sb2.append(e2.toString());
            return false;
        }
    }

    /* renamed from: p2 */
    public abstract void mo41898p2();

    /* renamed from: q2 */
    public abstract void mo41899q2(boolean z);

    /* renamed from: r2 */
    public int mo41900r2() {
        return this.f19422Q;
    }

    /* renamed from: s2 */
    public abstract C10340c mo41901s2();

    /* renamed from: t2 */
    public List<C6093d> mo41902t2() {
        return this.f19423R;
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        if (!C8272e.m19511b().mo35204d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23145k0()) {
            Class<FanclControlViewActivity> cls = null;
            Class<FanclControlViewActivity> cls2 = FanclControlViewActivity.class;
            try {
                int i = FanclControlViewActivity.f10419n;
                cls = cls2;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null && mo23145k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f4753r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: u2 */
    public Map<Integer, C10340c> mo41903u2() {
        return this.f19424S;
    }

    /* renamed from: v2 */
    public C10341d mo41904v2() {
        return this.f19421C;
    }

    /* renamed from: x2 */
    public boolean mo41905x2() {
        C12041e eVar = (C12041e) mo41904v2().mo31611r(2);
        if (eVar != null) {
            return eVar.mo42679c();
        }
        return false;
    }

    /* renamed from: y2 */
    public boolean mo41906y2() {
        return this.f19421C.mo31584d0();
    }

    /* renamed from: z2 */
    public abstract void mo41907z2();
}
