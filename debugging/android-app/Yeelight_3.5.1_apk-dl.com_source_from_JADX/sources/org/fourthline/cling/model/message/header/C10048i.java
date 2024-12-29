package org.fourthline.cling.model.message.header;

import com.xiaomi.mipush.sdk.Constants;
import org.fourthline.cling.model.types.C10092m;

/* renamed from: org.fourthline.cling.model.message.header.i */
public class C10048i extends UpnpHeader<C10092m> {

    /* renamed from: c */
    int f18541c = 1900;

    /* renamed from: d */
    String f18542d = "239.255.255.250";

    public C10048i() {
        mo40451e(new C10092m("239.255.255.250", 1900));
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10092m) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (str.contains(Constants.COLON_SEPARATOR)) {
            try {
                this.f18541c = Integer.valueOf(str.substring(str.indexOf(Constants.COLON_SEPARATOR) + 1)).intValue();
                String substring = str.substring(0, str.indexOf(Constants.COLON_SEPARATOR));
                this.f18542d = substring;
                mo40451e(new C10092m(substring, this.f18541c));
            } catch (NumberFormatException e) {
                throw new InvalidHeaderException("Invalid HOST header value, can't parse port: " + str + " - " + e.getMessage());
            }
        } else {
            this.f18542d = str;
            mo40451e(new C10092m(str, this.f18541c));
        }
    }
}
