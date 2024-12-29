package org.fourthline.cling.model.message.header;

/* renamed from: org.fourthline.cling.model.message.header.m */
public class C10052m extends UpnpHeader<Integer> {

    /* renamed from: c */
    public static final Integer f18546c = 3;

    public C10052m() {
        mo40451e(f18546c);
    }

    public C10052m(Integer num) {
        mo40451e(num);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((Integer) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(str));
            if (valueOf.intValue() < 0 || valueOf.intValue() > 120) {
                valueOf = f18546c;
            }
            mo40451e(valueOf);
        } catch (Exception unused) {
            throw new InvalidHeaderException("Can't parse MX seconds integer from: " + str);
        }
    }
}
