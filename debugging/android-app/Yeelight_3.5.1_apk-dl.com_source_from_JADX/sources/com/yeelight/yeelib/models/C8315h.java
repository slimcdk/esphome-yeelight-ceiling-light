package com.yeelight.yeelib.models;

import com.yeelight.yeelib.utils.AppUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.models.h */
public class C8315h extends C8308a {

    /* renamed from: f */
    private static final String f14273f = "h";

    /* renamed from: o */
    public static C8315h m19722o(JSONArray jSONArray) {
        try {
            int i = jSONArray.getInt(1);
            FlowCompleteAction flowCompleteAction = FlowCompleteAction.values()[jSONArray.getInt(2)];
            String string = jSONArray.getString(3);
            C8315h hVar = new C8315h();
            hVar.mo35341k(flowCompleteAction);
            hVar.mo35342l(i);
            Matcher matcher = Pattern.compile("-?\\d+,-?\\d+,-?\\d+,-?\\d+,*").matcher(string);
            while (matcher.find()) {
                hVar.mo35334a(C8319k.m19747a(matcher.group()));
            }
            if (hVar.mo35338h().size() == 0) {
                return null;
            }
            hVar.mo35343m(i / hVar.mo35338h().size());
            if (i % hVar.mo35338h().size() != 0) {
                String str = f14273f;
                AppUtils.m8300u(str, "flow frame count = " + i + " , flow item size = " + hVar.mo35338h().size());
            }
            return hVar;
        } catch (JSONException e) {
            e.printStackTrace();
            String str2 = f14273f;
            AppUtils.m8300u(str2, "invalid flow string: " + jSONArray.toString());
            return null;
        }
    }

    /* renamed from: n */
    public JSONArray mo35344n() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("cf");
        jSONArray.put(mo35340j() * mo35338h().size());
        jSONArray.put(mo35336f().ordinal());
        jSONArray.put(mo35337g());
        return jSONArray;
    }
}
