package p204q6;

import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;

/* renamed from: q6.e */
public class C10289e extends C10031e implements C10287c {
    public C10289e(UpnpResponse upnpResponse) {
        super(upnpResponse);
    }

    public C10289e(C10031e eVar) {
        super(eVar);
    }

    /* renamed from: d */
    public String mo41806d() {
        return null;
    }

    /* renamed from: u */
    public boolean mo41808u() {
        int d = ((UpnpResponse) mo40404k()).mo40422d();
        return ((UpnpResponse) mo40404k()).mo40424f() && d != UpnpResponse.Status.METHOD_NOT_SUPPORTED.getStatusCode() && (d != UpnpResponse.Status.INTERNAL_SERVER_ERROR.getStatusCode() || !mo40407n());
    }

    /* renamed from: v */
    public boolean mo41809v() {
        return mo40407n() && ((UpnpResponse) mo40404k()).mo40422d() == UpnpResponse.Status.INTERNAL_SERVER_ERROR.getStatusCode();
    }
}
