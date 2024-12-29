package org.fourthline.cling.model.message.header;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import org.fourthline.cling.model.C10021i;

/* renamed from: org.fourthline.cling.model.message.header.u */
public class C10060u extends UpnpHeader<C10021i> {
    public C10060u() {
        mo40451e(new C10021i());
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10021i) mo40449b()).mo40373a();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        String[] split;
        String str2;
        C10021i iVar = new C10021i();
        iVar.mo40383i("UNKNOWN");
        iVar.mo40384j("UNKNOWN");
        iVar.mo40385k("UNKNOWN");
        iVar.mo40386l("UNKNOWN");
        if (str.contains("UPnP/1.1")) {
            iVar.mo40381h(1);
        } else if (!str.contains("UPnP/1.")) {
            throw new InvalidHeaderException("Missing 'UPnP/1.' in server information: " + str);
        }
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            try {
                if (str.charAt(i) == ' ') {
                    i2++;
                }
                i++;
            } catch (Exception unused) {
                iVar.mo40383i("UNKNOWN");
                iVar.mo40384j("UNKNOWN");
                iVar.mo40385k("UNKNOWN");
                iVar.mo40386l("UNKNOWN");
            }
        }
        if (str.contains(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            String[] split2 = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            split = split2[0].split(MiotCloudImpl.COOKIE_PATH);
            str2 = split2[2];
        } else if (i2 > 2) {
            String trim = str.substring(0, str.indexOf("UPnP/1.")).trim();
            str2 = str.substring(str.indexOf("UPnP/1.") + 8).trim();
            split = trim.split(MiotCloudImpl.COOKIE_PATH);
        } else {
            String[] split3 = str.split(" ");
            split = split3[0].split(MiotCloudImpl.COOKIE_PATH);
            str2 = split3[2];
        }
        String[] split4 = str2.split(MiotCloudImpl.COOKIE_PATH);
        iVar.mo40383i(split[0].trim());
        if (split.length > 1) {
            iVar.mo40384j(split[1].trim());
        }
        iVar.mo40385k(split4[0].trim());
        if (split4.length > 1) {
            iVar.mo40386l(split4[1].trim());
        }
        mo40451e(iVar);
    }
}
