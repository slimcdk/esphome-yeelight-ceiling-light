package p164h.p165b.p166a.p240h.p243r.p247n;

/* renamed from: h.b.a.h.r.n.n */
public class C11307n extends C11296f0<Integer> {

    /* renamed from: c */
    public static final Integer f22436c = 3;

    public C11307n() {
        mo35846e(f22436c);
    }

    public C11307n(Integer num) {
        mo35846e(num);
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((Integer) mo35845b()).toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(str));
            if (valueOf.intValue() < 0 || valueOf.intValue() > 120) {
                valueOf = f22436c;
            }
            mo35846e(valueOf);
        } catch (Exception unused) {
            throw new C11304k("Can't parse MX seconds integer from: " + str);
        }
    }
}
