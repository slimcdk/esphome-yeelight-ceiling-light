package p164h.p165b.p166a.p240h.p252w;

import p164h.p257c.p259b.p260f.C11509b;

/* renamed from: h.b.a.h.w.c */
public class C11360c extends C11356a<byte[]> {
    /* renamed from: g */
    public Class<byte[]> mo36046g() {
        return byte[].class;
    }

    /* renamed from: i */
    public String mo36041a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return C11509b.m30219a(bArr);
        } catch (Exception e) {
            throw new C11391r(e.getMessage(), e);
        }
    }

    /* renamed from: j */
    public byte[] mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return C11509b.m30224f(str);
        } catch (Exception e) {
            throw new C11391r(e.getMessage(), e);
        }
    }
}
