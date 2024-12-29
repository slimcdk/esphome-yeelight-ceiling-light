package org.fourthline.cling.model.types;

import p163g7.C9089b;

/* renamed from: org.fourthline.cling.model.types.c */
public class C10077c extends C10073a<byte[]> {
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
            return C9089b.m21793a(bArr);
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
            return C9089b.m21798f(str);
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }
}
