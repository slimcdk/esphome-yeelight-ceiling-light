package org.fourthline.cling.model.message.header;

import com.xiaomi.mipush.sdk.Constants;
import p163g7.C9089b;

/* renamed from: org.fourthline.cling.model.message.header.j */
public class C10049j extends UpnpHeader<byte[]> {
    public C10049j() {
    }

    public C10049j(byte[] bArr) {
        mo40451e(bArr);
    }

    /* renamed from: a */
    public String mo40448a() {
        return C9089b.m21794b((byte[]) mo40449b(), Constants.COLON_SEPARATOR);
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        byte[] g = C9089b.m21799g(str, Constants.COLON_SEPARATOR);
        mo40451e(g);
        if (g.length != 6) {
            throw new InvalidHeaderException("Invalid MAC address: " + str);
        }
    }

    public String toString() {
        return "(" + C10049j.class.getSimpleName() + ") '" + mo40448a() + "'";
    }
}
