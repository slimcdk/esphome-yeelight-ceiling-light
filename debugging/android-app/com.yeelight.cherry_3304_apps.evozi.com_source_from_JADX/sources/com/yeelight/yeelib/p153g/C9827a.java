package com.yeelight.yeelib.p153g;

import androidx.core.internal.view.SupportMenu;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.g.a */
public class C9827a {

    /* renamed from: e */
    private static final String f17783e = "a";

    /* renamed from: a */
    protected List<C9844m> f17784a = new ArrayList();

    /* renamed from: b */
    private int f17785b;

    /* renamed from: c */
    protected int f17786c;

    /* renamed from: d */
    protected C9843l f17787d;

    public C9827a() {
    }

    public C9827a(C9843l lVar) {
        this.f17787d = lVar;
    }

    /* renamed from: b */
    public static C9827a m23894b(String str) {
        "buildWithNotificationFormat flow with string: " + str;
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, 3);
        int intValue = Integer.valueOf(split[0]).intValue();
        C9843l lVar = C9843l.values()[Integer.valueOf(split[1]).intValue()];
        String str2 = split[2];
        C9827a aVar = new C9827a(lVar);
        aVar.mo31727l(intValue);
        Matcher matcher = Pattern.compile("-?\\d+,-?\\d+,-?\\d+,-?\\d+,*").matcher(str2);
        while (matcher.find()) {
            aVar.mo31719a(C9844m.m23985a(matcher.group()));
        }
        return aVar;
    }

    /* renamed from: c */
    public static C9827a m23895c(JSONArray jSONArray) {
        try {
            int i = jSONArray.getInt(1);
            C9843l lVar = C9843l.values()[jSONArray.getInt(2)];
            String string = jSONArray.getString(3);
            C9827a aVar = new C9827a(lVar);
            aVar.mo31727l(i);
            Matcher matcher = Pattern.compile("-?\\d+,-?\\d+,-?\\d+,-?\\d+,*").matcher(string);
            while (matcher.find()) {
                aVar.mo31719a(C9844m.m23985a(matcher.group()));
            }
            return aVar;
        } catch (JSONException e) {
            e.printStackTrace();
            String str = f17783e;
            C4308b.m12139r(str, "invalid flow string: " + jSONArray.toString());
            return null;
        }
    }

    /* renamed from: e */
    public static C9827a m23896e() {
        C9827a aVar = new C9827a(C9843l.STAY);
        aVar.mo31727l(0);
        C9844m mVar = new C9844m(PathInterpolatorCompat.MAX_NUM_POINTS, C9845n.FLOW_MODE_COLOR, SupportMenu.CATEGORY_MASK, 100);
        C9844m mVar2 = new C9844m(PathInterpolatorCompat.MAX_NUM_POINTS, C9845n.FLOW_MODE_COLOR, -16711936, 100);
        C9844m mVar3 = new C9844m(PathInterpolatorCompat.MAX_NUM_POINTS, C9845n.FLOW_MODE_COLOR, -16776961, 100);
        C9844m mVar4 = new C9844m(PathInterpolatorCompat.MAX_NUM_POINTS, C9845n.FLOW_MODE_COLOR, -7722014, 100);
        aVar.mo31719a(mVar);
        aVar.mo31719a(mVar2);
        aVar.mo31719a(mVar3);
        aVar.mo31719a(mVar4);
        return aVar;
    }

    /* renamed from: a */
    public void mo31719a(C9844m mVar) {
        this.f17784a.add(mVar);
    }

    /* renamed from: d */
    public int mo31720d() {
        int i;
        int i2 = 0;
        if (mo31723h() != null) {
            i = 0;
            for (C9844m next : mo31723h()) {
                if (next.mo31789d().equals(C9845n.FLOW_MODE_COLOR)) {
                    i2++;
                } else if (next.mo31789d().equals(C9845n.FLOW_MODE_CT)) {
                    i++;
                } else {
                    boolean equals = next.mo31789d().equals(C9845n.FLOW_MODE_SLEEP);
                }
            }
        } else {
            i = 0;
        }
        if (i2 > 0) {
            return 5;
        }
        return i > 0 ? 7 : 8;
    }

    /* renamed from: f */
    public C9843l mo31721f() {
        return this.f17787d;
    }

    /* renamed from: g */
    public String mo31722g() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mo31723h().size(); i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(mo31723h().get(i).mo31794i());
        }
        return sb.toString();
    }

    /* renamed from: h */
    public List<C9844m> mo31723h() {
        return this.f17784a;
    }

    /* renamed from: i */
    public int mo31724i() {
        return this.f17785b;
    }

    /* renamed from: j */
    public int mo31725j() {
        return this.f17786c;
    }

    /* renamed from: k */
    public void mo31726k(C9843l lVar) {
        this.f17787d = lVar;
    }

    /* renamed from: l */
    public void mo31727l(int i) {
        this.f17785b = i;
    }

    /* renamed from: m */
    public void mo31728m(int i) {
        this.f17786c = i;
    }

    /* renamed from: n */
    public JSONArray mo31729n() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("cf");
        jSONArray.put(mo31724i());
        jSONArray.put(mo31721f().ordinal());
        jSONArray.put(mo31722g());
        return jSONArray;
    }
}
