package p164h.p165b.p166a.p240h.p243r.p247n;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import p164h.p165b.p166a.p240h.C11219i;

/* renamed from: h.b.a.h.r.n.v */
public class C11315v extends C11296f0<C11219i> {
    public C11315v() {
        mo35846e(new C11219i());
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((C11219i) mo35845b()).mo35668a();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        String[] split;
        String str2;
        C11219i iVar = new C11219i();
        iVar.mo35678i("UNKNOWN");
        iVar.mo35679j("UNKNOWN");
        iVar.mo35680k("UNKNOWN");
        iVar.mo35681l("UNKNOWN");
        if (str.contains("UPnP/1.1")) {
            iVar.mo35676h(1);
        } else if (!str.contains("UPnP/1.")) {
            throw new C11304k("Missing 'UPnP/1.' in server information: " + str);
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
                iVar.mo35678i("UNKNOWN");
                iVar.mo35679j("UNKNOWN");
                iVar.mo35680k("UNKNOWN");
                iVar.mo35681l("UNKNOWN");
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
        iVar.mo35678i(split[0].trim());
        if (split.length > 1) {
            iVar.mo35679j(split[1].trim());
        }
        iVar.mo35680k(split4[0].trim());
        if (split4.length > 1) {
            iVar.mo35681l(split4[1].trim());
        }
        mo35846e(iVar);
    }
}
