package com.yeelight.yeelib.models;

import androidx.core.internal.view.SupportMenu;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.models.a */
public class C8308a {

    /* renamed from: e */
    private static final String f14266e = "a";

    /* renamed from: a */
    protected List<C8319k> f14267a = new ArrayList();

    /* renamed from: b */
    private int f14268b;

    /* renamed from: c */
    protected int f14269c;

    /* renamed from: d */
    protected FlowCompleteAction f14270d;

    public C8308a() {
    }

    public C8308a(FlowCompleteAction flowCompleteAction) {
        this.f14270d = flowCompleteAction;
    }

    /* renamed from: b */
    public static C8308a m19688b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("buildWithNotificationFormat flow with string: ");
        sb.append(str);
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, 3);
        int intValue = Integer.valueOf(split[0]).intValue();
        FlowCompleteAction flowCompleteAction = FlowCompleteAction.values()[Integer.valueOf(split[1]).intValue()];
        String str2 = split[2];
        C8308a aVar = new C8308a(flowCompleteAction);
        aVar.mo35342l(intValue);
        Matcher matcher = Pattern.compile("-?\\d+,-?\\d+,-?\\d+,-?\\d+,*").matcher(str2);
        while (matcher.find()) {
            aVar.mo35334a(C8319k.m19747a(matcher.group()));
        }
        return aVar;
    }

    /* renamed from: c */
    public static C8308a m19689c(JSONArray jSONArray) {
        try {
            int i = jSONArray.getInt(1);
            FlowCompleteAction flowCompleteAction = FlowCompleteAction.values()[jSONArray.getInt(2)];
            String string = jSONArray.getString(3);
            C8308a aVar = new C8308a(flowCompleteAction);
            aVar.mo35342l(i);
            Matcher matcher = Pattern.compile("-?\\d+,-?\\d+,-?\\d+,-?\\d+,*").matcher(string);
            while (matcher.find()) {
                aVar.mo35334a(C8319k.m19747a(matcher.group()));
            }
            return aVar;
        } catch (JSONException e) {
            e.printStackTrace();
            String str = f14266e;
            AppUtils.m8300u(str, "invalid flow string: " + jSONArray.toString());
            return null;
        }
    }

    /* renamed from: e */
    public static C8308a m19690e() {
        C8308a aVar = new C8308a(FlowCompleteAction.STAY);
        aVar.mo35342l(0);
        FlowItemMode flowItemMode = FlowItemMode.FLOW_MODE_COLOR;
        C8319k kVar = new C8319k(PathInterpolatorCompat.MAX_NUM_POINTS, flowItemMode, SupportMenu.CATEGORY_MASK, 100);
        C8319k kVar2 = new C8319k(PathInterpolatorCompat.MAX_NUM_POINTS, flowItemMode, -16711936, 100);
        C8319k kVar3 = new C8319k(PathInterpolatorCompat.MAX_NUM_POINTS, flowItemMode, -16776961, 100);
        C8319k kVar4 = new C8319k(PathInterpolatorCompat.MAX_NUM_POINTS, flowItemMode, -7722014, 100);
        aVar.mo35334a(kVar);
        aVar.mo35334a(kVar2);
        aVar.mo35334a(kVar3);
        aVar.mo35334a(kVar4);
        return aVar;
    }

    /* renamed from: a */
    public void mo35334a(C8319k kVar) {
        this.f14267a.add(kVar);
    }

    /* renamed from: d */
    public int mo35335d() {
        int i;
        int i2 = 0;
        if (mo35338h() != null) {
            i = 0;
            for (C8319k next : mo35338h()) {
                if (next.mo35376d().equals(FlowItemMode.FLOW_MODE_COLOR)) {
                    i2++;
                } else if (next.mo35376d().equals(FlowItemMode.FLOW_MODE_CT)) {
                    i++;
                } else {
                    next.mo35376d().equals(FlowItemMode.FLOW_MODE_SLEEP);
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
    public FlowCompleteAction mo35336f() {
        return this.f14270d;
    }

    /* renamed from: g */
    public String mo35337g() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mo35338h().size(); i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(mo35338h().get(i).mo35381i());
        }
        return sb.toString();
    }

    /* renamed from: h */
    public List<C8319k> mo35338h() {
        return this.f14267a;
    }

    /* renamed from: i */
    public int mo35339i() {
        return this.f14268b;
    }

    /* renamed from: j */
    public int mo35340j() {
        return this.f14269c;
    }

    /* renamed from: k */
    public void mo35341k(FlowCompleteAction flowCompleteAction) {
        this.f14270d = flowCompleteAction;
    }

    /* renamed from: l */
    public void mo35342l(int i) {
        this.f14268b = i;
    }

    /* renamed from: m */
    public void mo35343m(int i) {
        this.f14269c = i;
    }

    /* renamed from: n */
    public JSONArray mo35344n() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("cf");
        jSONArray.put(mo35339i());
        jSONArray.put(mo35336f().ordinal());
        jSONArray.put(mo35337g());
        return jSONArray;
    }
}
