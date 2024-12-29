package com.yeelight.yeelib.p153g;

import com.yeelight.yeelib.utils.C4308b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.yeelight.yeelib.g.h */
public class C9837h extends C9827a {

    /* renamed from: f */
    private static final String f17808f = "h";

    /* renamed from: o */
    public static C9837h m23954o(JSONArray jSONArray) {
        try {
            int i = jSONArray.getInt(1);
            C9843l lVar = C9843l.values()[jSONArray.getInt(2)];
            String string = jSONArray.getString(3);
            C9837h hVar = new C9837h();
            hVar.mo31726k(lVar);
            hVar.mo31727l(i);
            Matcher matcher = Pattern.compile("-?\\d+,-?\\d+,-?\\d+,-?\\d+,*").matcher(string);
            while (matcher.find()) {
                hVar.mo31719a(C9844m.m23985a(matcher.group()));
            }
            if (hVar.mo31723h().size() == 0) {
                return null;
            }
            hVar.mo31728m(i / hVar.mo31723h().size());
            if (i % hVar.mo31723h().size() != 0) {
                String str = f17808f;
                C4308b.m12139r(str, "flow frame count = " + i + " , flow item size = " + hVar.mo31723h().size());
            }
            return hVar;
        } catch (JSONException e) {
            e.printStackTrace();
            String str2 = f17808f;
            C4308b.m12139r(str2, "invalid flow string: " + jSONArray.toString());
            return null;
        }
    }

    /* renamed from: n */
    public JSONArray mo31729n() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("cf");
        jSONArray.put(mo31725j() * mo31723h().size());
        jSONArray.put(mo31721f().ordinal());
        jSONArray.put(mo31722g());
        return jSONArray;
    }
}
