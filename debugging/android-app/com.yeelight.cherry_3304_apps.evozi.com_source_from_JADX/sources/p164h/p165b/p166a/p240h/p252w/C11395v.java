package p164h.p165b.p166a.p240h.p252w;

/* renamed from: h.b.a.h.w.v */
public class C11395v {

    /* renamed from: a */
    private String f22657a;

    /* renamed from: b */
    private boolean f22658b;

    /* renamed from: c */
    private String f22659c;

    public C11395v(String str, String str2, boolean z) {
        this.f22657a = str;
        this.f22659c = str2;
        this.f22658b = z;
    }

    /* renamed from: b */
    public static C11395v m29868b(String str) {
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
            return new C11395v(str2, str, z);
        }
        throw new C11391r("Can't parse Bytes Range: " + str);
    }

    /* renamed from: a */
    public String mo36131a() {
        String str;
        String str2 = "";
        if (this.f22657a != null) {
            str2 = str2 + this.f22657a + "=";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        if (this.f22658b) {
            str = "\"" + this.f22659c + "\"";
        } else {
            str = this.f22659c;
        }
        sb.append(str);
        return sb.toString();
    }
}
