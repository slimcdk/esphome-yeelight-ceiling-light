package com.xiaomi.mistatistic.sdk.controller.asyncjobs;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.BaseService;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.controller.C4122f;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import com.xiaomi.mistatistic.sdk.controller.C4139l;
import com.xiaomi.mistatistic.sdk.data.StatEventPojo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.asyncjobs.b */
public class C4106b implements C4115d.C4118a {

    /* renamed from: a */
    private static int f7018a;

    /* renamed from: b */
    private long f7019b;

    /* renamed from: c */
    private C4107a f7020c;

    /* renamed from: d */
    private HashMap<String, JSONObject> f7021d = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, JSONObject> f7022e = new HashMap<>();

    /* renamed from: f */
    private ArrayList<String> f7023f = new ArrayList<>();

    /* renamed from: g */
    private JSONObject f7024g = null;

    /* renamed from: h */
    private long f7025h = System.currentTimeMillis();

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.asyncjobs.b$a */
    public interface C4107a {
        /* renamed from: a */
        void mo23033a(String str, long j, long j2, int i);
    }

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.asyncjobs.b$b */
    public class C4108b {

        /* renamed from: a */
        int f7026a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public JSONArray f7028c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f7029d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f7030e;

        public C4108b(JSONArray jSONArray, long j, long j2, int i) {
            this.f7028c = jSONArray;
            this.f7029d = j;
            this.f7030e = j2;
            this.f7026a = i;
        }
    }

    public C4106b(long j, C4107a aVar) {
        this.f7019b = j;
        this.f7020c = aVar;
    }

    /* renamed from: a */
    private void m11082a(StatEventPojo statEventPojo) {
        JSONObject jSONObject = this.f7021d.get("mistat_session");
        if (jSONObject == null) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(BaseService.CATEGORY, "mistat_session");
            jSONObject2.put("values", jSONArray);
            this.f7021d.put("mistat_session", jSONObject2);
            this.f7024g.getJSONArray("content").put(jSONObject2);
            jSONObject = jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject();
        String[] split = statEventPojo.value.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        long parseLong = Long.parseLong(split[0]);
        long parseLong2 = Long.parseLong(split[1]);
        jSONObject3.put("start", parseLong);
        jSONObject3.put("end", parseLong2);
        jSONObject3.put("env", statEventPojo.extra);
        jSONObject.getJSONArray("values").put(jSONObject3);
    }

    /* renamed from: b */
    private void m11083b() {
        this.f7024g = null;
        this.f7021d.clear();
        this.f7023f.clear();
        this.f7022e.clear();
    }

    /* renamed from: b */
    private void m11084b(StatEventPojo statEventPojo) {
        JSONObject jSONObject = this.f7021d.get("mistat_pv");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            jSONObject.put(BaseService.CATEGORY, "mistat_pv");
            jSONObject.put("values", jSONArray);
            jSONObject.put("source", jSONArray2);
            this.f7021d.put("mistat_pv", jSONObject);
            this.f7024g.getJSONArray("content").put(jSONObject);
        }
        String[] split = statEventPojo.value.trim().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        String[] strArr = new String[split.length];
        if (split != null && split.length > 0) {
            for (int i = 0; i < split.length; i++) {
                int indexOf = this.f7023f.indexOf(split[i]);
                if (indexOf >= 0) {
                    strArr[i] = String.valueOf(indexOf + 1);
                } else {
                    strArr[i] = String.valueOf(this.f7023f.size() + 1);
                    this.f7023f.add(split[i]);
                }
            }
        }
        jSONObject.getJSONArray("values").put(TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, strArr));
        jSONObject.put("index", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, this.f7023f));
        if (TextUtils.isEmpty(statEventPojo.extra)) {
            jSONObject.getJSONArray("source").put("");
        } else {
            jSONObject.getJSONArray("source").put(statEventPojo.extra);
        }
    }

    /* renamed from: c */
    private void m11085c(StatEventPojo statEventPojo) {
        JSONObject jSONObject = this.f7021d.get("mistat_pt");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(BaseService.CATEGORY, "mistat_pt");
            jSONObject.put("values", jSONArray);
            this.f7021d.put("mistat_pt", jSONObject);
            this.f7024g.getJSONArray("content").put(jSONObject);
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("values");
        for (int i = 0; i < jSONArray2.length(); i++) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
            if (TextUtils.equals(jSONObject2.getString(BaseService.KEY), statEventPojo.key)) {
                jSONObject2.put("value", jSONObject2.getString("value") + Constants.ACCEPT_TIME_SEPARATOR_SP + statEventPojo.value);
                return;
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(BaseService.KEY, statEventPojo.key);
        jSONObject3.put("value", statEventPojo.value);
        jSONObject.getJSONArray("values").put(jSONObject3);
    }

    /* renamed from: d */
    private void m11086d(StatEventPojo statEventPojo) {
        JSONObject jSONObject = this.f7021d.get(statEventPojo.category);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(BaseService.CATEGORY, statEventPojo.category);
            jSONObject.put("values", jSONArray);
            this.f7021d.put(statEventPojo.category, jSONObject);
            this.f7024g.getJSONArray("content").put(jSONObject);
        }
        if ("event".equals(statEventPojo.type) && TextUtils.isEmpty(statEventPojo.extra)) {
            JSONObject jSONObject2 = this.f7022e.get(statEventPojo.key);
            if (jSONObject2 != null) {
                jSONObject2.put("value", jSONObject2.getLong("value") + Long.parseLong(statEventPojo.value));
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(BaseService.KEY, statEventPojo.key);
            jSONObject3.put("type", statEventPojo.type);
            jSONObject3.put("value", Long.parseLong(statEventPojo.value));
            jSONObject.getJSONArray("values").put(jSONObject3);
            this.f7022e.put(statEventPojo.key, jSONObject3);
        } else if ("mistat_extra".equals(statEventPojo.category)) {
            jSONObject.getJSONArray("values").put(statEventPojo.value);
        } else {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(BaseService.KEY, statEventPojo.key);
            jSONObject4.put("type", statEventPojo.type);
            if ("count".equals(statEventPojo.type) || "numeric".equals(statEventPojo.type)) {
                jSONObject4.put("value", Long.parseLong(statEventPojo.value));
            } else {
                jSONObject4.put("value", statEventPojo.value);
            }
            if (!TextUtils.isEmpty(statEventPojo.extra)) {
                jSONObject4.put("params", new JSONObject(statEventPojo.extra));
            }
            jSONObject.getJSONArray("values").put(jSONObject4);
        }
    }

    /* renamed from: a */
    public C4108b mo23032a(long j) {
        long j2;
        JSONArray jSONArray = new JSONArray();
        C4122f fVar = new C4122f();
        fVar.mo23050b();
        m11083b();
        this.f7025h = System.currentTimeMillis();
        List<StatEventPojo> a = fVar.mo23044a(j);
        long j3 = 0;
        if (a != null) {
            try {
                if (a.size() > 0) {
                    int i = 0;
                    C4130h.m11172a(String.format("Packing, get %d events from local DB", new Object[]{Integer.valueOf(a.size())}));
                    long j4 = 0;
                    j2 = 0;
                    while (i < a.size()) {
                        try {
                            StatEventPojo statEventPojo = a.get(i);
                            C4130h.m11172a("Packing: " + statEventPojo.toString());
                            if (j4 == 0) {
                                j4 = statEventPojo.timeStamp;
                                this.f7025h = j4;
                            }
                            j2 = statEventPojo.timeStamp;
                            if (this.f7019b > 0 && this.f7025h - statEventPojo.timeStamp > this.f7019b && this.f7024g != null) {
                                m11083b();
                                this.f7025h = statEventPojo.timeStamp;
                            }
                            if (this.f7024g == null) {
                                JSONObject jSONObject = new JSONObject();
                                this.f7024g = jSONObject;
                                jSONObject.put("endTS", statEventPojo.timeStamp);
                                this.f7024g.put("content", new JSONArray());
                                jSONArray.put(this.f7024g);
                            }
                            if ("mistat_session".equals(statEventPojo.category)) {
                                m11082a(statEventPojo);
                            } else if ("mistat_pv".equals(statEventPojo.category)) {
                                m11084b(statEventPojo);
                            } else if ("mistat_pt".equals(statEventPojo.category)) {
                                m11085c(statEventPojo);
                            } else {
                                m11086d(statEventPojo);
                            }
                            this.f7024g.put("startTS", statEventPojo.timeStamp);
                            i++;
                        } catch (SQLiteException e) {
                            e = e;
                            j3 = j4;
                            C4130h.m11176a("packing exception:", (Throwable) e);
                            return new C4108b(jSONArray, j2, j3, 0);
                        }
                    }
                    C4130h.m11172a("Packing complete, total " + a.size() + " records were packed and to be uploaded");
                    j3 = j4;
                    return new C4108b(jSONArray, j2, j3, 0);
                }
            } catch (SQLiteException e2) {
                e = e2;
                j2 = 0;
                C4130h.m11176a("packing exception:", (Throwable) e);
                return new C4108b(jSONArray, j2, j3, 0);
            }
        }
        C4130h.m11172a("No data available to be packed");
        jSONArray = null;
        j2 = 0;
        return new C4108b(jSONArray, j2, j3, 0);
    }

    /* renamed from: a */
    public void mo22986a() {
        try {
            C4108b a = mo23032a(Long.MAX_VALUE);
            if (a.f7028c != null) {
                this.f7020c.mo23033a(a.f7028c.toString(), a.f7029d, a.f7030e, a.f7026a);
            } else {
                this.f7020c.mo23033a("", a.f7029d, a.f7030e, a.f7026a);
            }
            if (a.f7026a >= 500) {
                C4130h.m11172a(String.format("Packing %d events over MAX_PACKING_EVENT %d", new Object[]{Integer.valueOf(a.f7026a), 500}));
                if (f7018a < 50) {
                    new C4139l().mo23077a();
                    f7018a++;
                    return;
                }
                C4130h.m11183d("Packing, exceeded MAX_UPLOAD_TIMES 50");
                return;
            }
            f7018a = 0;
        } catch (Exception e) {
            C4130h.m11176a("remote data packing job execute exception:", (Throwable) e);
            this.f7020c.mo23033a("", 0, 0, 0);
        }
    }
}
