package org.fourthline.cling.model.types;

/* renamed from: org.fourthline.cling.model.types.q */
public class C10096q {

    /* renamed from: a */
    private String f18623a;

    /* renamed from: b */
    private boolean f18624b;

    /* renamed from: c */
    private String f18625c;

    public C10096q(String str, String str2, boolean z) {
        this.f18623a = str;
        this.f18625c = str2;
        this.f18624b = z;
    }

    /* renamed from: b */
    public static C10096q m25160b(String str) {
        if (str.length() != 0) {
            String str2 = null;
            String[] split = str.split("=");
            boolean z = false;
            if (split.length > 1) {
                str2 = split[0];
                str = split[1];
                if (str.startsWith("\"") && str.endsWith("\"")) {
                    str = str.substring(1, str.length() - 1);
                    z = true;
                }
            }
            return new C10096q(str2, str, z);
        }
        throw new InvalidValueException("Can't parse Bytes Range: " + str);
    }

    /* renamed from: a */
    public String mo40637a() {
        String str;
        String str2 = "";
        if (this.f18623a != null) {
            str2 = str2 + this.f18623a + "=";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        if (this.f18624b) {
            str = "\"" + this.f18625c + "\"";
        } else {
            str = this.f18625c;
        }
        sb.append(str);
        return sb.toString();
    }
}
