package org.fourthline.cling.model.types;

import p163g7.C9087a;

/* renamed from: org.fourthline.cling.model.types.b */
public class C10075b extends C10073a<byte[]> {
    /* renamed from: g */
    public Class<byte[]> mo40580g() {
        return byte[].class;
    }

    /* renamed from: i */
    public String mo40556a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(C9087a.m21784h(bArr), "UTF-8");
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }

    /* renamed from: j */
    public byte[] mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return C9087a.m21780d(str);
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }
}
