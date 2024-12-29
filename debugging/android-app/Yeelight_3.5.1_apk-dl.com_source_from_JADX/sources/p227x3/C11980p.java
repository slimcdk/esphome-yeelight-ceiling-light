package p227x3;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x3.p */
public class C11980p {

    /* renamed from: a */
    private String f21876a;

    /* renamed from: b */
    private int f21877b;

    /* renamed from: c */
    private int f21878c;

    /* renamed from: d */
    private Object f21879d;

    /* renamed from: e */
    private String f21880e;

    public C11980p(String str, int i, int i2, Object obj) {
        this.f21876a = str;
        this.f21877b = i;
        this.f21878c = i2;
        this.f21879d = obj;
    }

    public C11980p(String str, int i, int i2, Object obj, String str2) {
        this.f21876a = str;
        this.f21877b = i;
        this.f21878c = i2;
        this.f21879d = obj;
        this.f21880e = str2;
    }

    public C11980p(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f21876a = jSONObject.getString("did");
                this.f21877b = jSONObject.getInt("siid");
                this.f21878c = jSONObject.getInt("piid");
                this.f21879d = jSONObject.get("value");
                if (jSONObject.has(this.f21880e)) {
                    this.f21880e = jSONObject.getString("desc");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String mo42550a() {
        return this.f21880e;
    }

    /* renamed from: b */
    public JSONObject mo42551b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", this.f21876a);
            jSONObject.put("siid", this.f21877b);
            jSONObject.put("piid", this.f21878c);
            jSONObject.put("value", this.f21879d);
            String str = this.f21880e;
            if (str != null) {
                jSONObject.put("desc", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    public int mo42552c() {
        return this.f21877b;
    }
}
