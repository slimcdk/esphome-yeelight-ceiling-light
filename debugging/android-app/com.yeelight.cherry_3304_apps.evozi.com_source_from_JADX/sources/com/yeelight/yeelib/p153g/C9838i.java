package com.yeelight.yeelib.p153g;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.i */
public class C9838i extends C9830b {

    /* renamed from: p */
    private int f17809p = -1;

    /* renamed from: com.yeelight.yeelib.g.i$a */
    public enum C9839a {
        MODE_BRIGHT_ONLY,
        MODE_CT,
        MODE_COLOR,
        MODE_SUSPEND
    }

    public C9838i() {
        this.f17902l = new C9837h();
    }

    public C9838i(String str, int i, int i2) {
        super(str, i, i2);
    }

    /* renamed from: a0 */
    public static C9838i m23956a0(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(ScanBarcodeActivity.TITLE);
            int i = jSONObject.getInt("mode");
            int i2 = jSONObject.getInt("sid");
            C9837h o = C9837h.m23954o(new JSONArray(jSONObject.getString("colorflow")));
            if (o == null) {
                return null;
            }
            C9838i iVar = new C9838i(string, i2, i);
            iVar.mo31860I(o);
            if (jSONObject.has("description")) {
                iVar.mo31864M(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                iVar.mo31819X(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                iVar.mo31867P(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("subtype")) {
                iVar.mo31762e0(jSONObject.getInt("subtype"));
            }
            return iVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b0 */
    public static C9838i m23957b0(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("source_extra_data");
            string.replace("\\", "");
            JSONObject jSONObject2 = new JSONObject(string);
            int i = jSONObject2.getInt("mode");
            String string2 = jSONObject2.getString("colorflow");
            String string3 = jSONObject.getString(ScanBarcodeActivity.TITLE);
            int i2 = jSONObject.getInt("source_id");
            int i3 = jSONObject.getInt("subtype");
            C9837h o = C9837h.m23954o(new JSONArray(string2));
            if (o == null) {
                return null;
            }
            C9838i iVar = new C9838i(string3, i2, i);
            iVar.mo31860I(o);
            iVar.mo31762e0(i3);
            return iVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        return super.mo31743a();
    }

    /* renamed from: c0 */
    public C9839a mo31760c0() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f17902l.mo31723h() != null) {
            i2 = 0;
            i = 0;
            for (C9844m next : this.f17902l.mo31723h()) {
                if (next.mo31789d().equals(C9845n.FLOW_MODE_COLOR)) {
                    i3++;
                } else if (next.mo31789d().equals(C9845n.FLOW_MODE_CT)) {
                    i2++;
                } else if (!next.mo31789d().equals(C9845n.FLOW_MODE_SLEEP) && next.mo31789d().equals(C9845n.FLOW_MODE_BRIGHT)) {
                    i++;
                }
            }
        } else {
            i2 = 0;
            i = 0;
        }
        return i3 > 0 ? C9839a.MODE_COLOR : i2 > 0 ? C9839a.MODE_CT : i > 0 ? C9839a.MODE_BRIGHT_ONLY : C9839a.MODE_SUSPEND;
    }

    /* renamed from: d0 */
    public int mo31761d0() {
        return this.f17809p;
    }

    /* renamed from: e0 */
    public void mo31762e0(int i) {
        this.f17809p = i;
    }
}
