package p164h.p211a.p212a.p227g;

import java.util.Arrays;

/* renamed from: h.a.a.g.g */
public class C11093g {

    /* renamed from: a */
    private String[] f21900a;

    /* renamed from: b */
    private String f21901b;

    /* renamed from: a */
    public String[] mo35243a() {
        return this.f21900a;
    }

    /* renamed from: b */
    public String mo35244b() {
        return this.f21901b;
    }

    /* renamed from: c */
    public void mo35245c(String str) {
        this.f21900a = new String[]{str};
    }

    /* renamed from: d */
    public void mo35246d(String str) {
        this.f21901b = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f21900a;
        sb.append(strArr == null ? "[]" : Arrays.asList(strArr).toString());
        sb.append("=>");
        sb.append(this.f21901b);
        return sb.toString();
    }
}
