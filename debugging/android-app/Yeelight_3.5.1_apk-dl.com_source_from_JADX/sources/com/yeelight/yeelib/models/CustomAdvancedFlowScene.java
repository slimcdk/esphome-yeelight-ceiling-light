package com.yeelight.yeelib.models;

import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomAdvancedFlowScene extends C8309b {

    /* renamed from: p */
    private int f14264p = -1;

    public enum LightMode {
        MODE_BRIGHT_ONLY,
        MODE_CT,
        MODE_COLOR,
        MODE_SUSPEND
    }

    public CustomAdvancedFlowScene() {
        this.f14330l = new C8315h();
    }

    public CustomAdvancedFlowScene(String str, int i, int i2) {
        super(str, i, i2);
    }

    /* renamed from: b0 */
    public static CustomAdvancedFlowScene m19683b0(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(ScanBarcodeActivity.TITLE);
            int i = jSONObject.getInt("mode");
            int i2 = jSONObject.getInt("sid");
            C8315h o = C8315h.m19722o(new JSONArray(jSONObject.getString("colorflow")));
            if (o == null) {
                return null;
            }
            CustomAdvancedFlowScene customAdvancedFlowScene = new CustomAdvancedFlowScene(string, i2, i);
            customAdvancedFlowScene.mo35425J(o);
            if (jSONObject.has("description")) {
                customAdvancedFlowScene.mo35429N(jSONObject.getString("description"));
            }
            if (jSONObject.has("image")) {
                customAdvancedFlowScene.mo35406Y(jSONObject.getString("image"));
            }
            if (jSONObject.has("dialog")) {
                customAdvancedFlowScene.mo35432Q(TimerCodec.ENABLE.equals(jSONObject.getString("dialog")));
            }
            if (jSONObject.has("subtype")) {
                customAdvancedFlowScene.mo35297e0(jSONObject.getInt("subtype"));
            }
            return customAdvancedFlowScene;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
        return super.mo35294a();
    }

    /* renamed from: c0 */
    public LightMode mo35295c0() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f14330l.mo35338h() != null) {
            i2 = 0;
            i = 0;
            for (C8319k next : this.f14330l.mo35338h()) {
                if (next.mo35376d().equals(FlowItemMode.FLOW_MODE_COLOR)) {
                    i3++;
                } else if (next.mo35376d().equals(FlowItemMode.FLOW_MODE_CT)) {
                    i2++;
                } else if (!next.mo35376d().equals(FlowItemMode.FLOW_MODE_SLEEP) && next.mo35376d().equals(FlowItemMode.FLOW_MODE_BRIGHT)) {
                    i++;
                }
            }
        } else {
            i2 = 0;
            i = 0;
        }
        return i3 > 0 ? LightMode.MODE_COLOR : i2 > 0 ? LightMode.MODE_CT : i > 0 ? LightMode.MODE_BRIGHT_ONLY : LightMode.MODE_SUSPEND;
    }

    /* renamed from: d0 */
    public int mo35296d0() {
        return this.f14264p;
    }

    /* renamed from: e0 */
    public void mo35297e0(int i) {
        this.f14264p = i;
    }
}
