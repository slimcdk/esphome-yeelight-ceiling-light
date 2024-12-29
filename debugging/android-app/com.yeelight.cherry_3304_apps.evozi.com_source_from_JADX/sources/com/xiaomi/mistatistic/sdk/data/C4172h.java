package com.xiaomi.mistatistic.sdk.data;

import android.text.TextUtils;
import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.mistatistic.sdk.BaseService;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.data.h */
public class C4172h extends AbstractEvent {

    /* renamed from: a */
    private String f7155a;

    /* renamed from: b */
    private String f7156b;

    /* renamed from: c */
    private String f7157c;

    public C4172h(String str, String str2, String str3) {
        this.f7155a = str;
        this.f7156b = str2;
        this.f7157c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4172h)) {
            return false;
        }
        C4172h hVar = (C4172h) obj;
        return TextUtils.equals(this.f7155a, hVar.f7155a) && TextUtils.equals(this.f7156b, hVar.f7156b) && TextUtils.equals(this.f7157c, hVar.f7157c);
    }

    public String getCategory() {
        return this.f7155a;
    }

    public StatEventPojo toPojo() {
        StatEventPojo statEventPojo = new StatEventPojo();
        statEventPojo.category = this.f7155a;
        statEventPojo.key = this.f7156b;
        statEventPojo.timeStamp = this.mTS;
        statEventPojo.value = this.f7157c;
        statEventPojo.type = DddTag.PL_PROPERTY;
        return statEventPojo;
    }

    public JSONObject valueToJSon() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseService.CATEGORY, this.f7155a);
        jSONObject.put(BaseService.KEY, this.f7156b);
        jSONObject.put("type", DddTag.PL_PROPERTY);
        jSONObject.put("value", this.f7157c);
        return jSONObject;
    }
}
