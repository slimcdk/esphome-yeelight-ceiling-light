package p210s6;

import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.header.C10064y;
import org.fourthline.cling.model.message.header.C10065z;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* renamed from: s6.c */
public class C10375c extends C10031e {
    public C10375c(C10031e eVar) {
        super(eVar);
    }

    /* renamed from: u */
    public int mo41972u() {
        return ((Integer) ((C10065z) mo40403j().mo40443q(UpnpHeader.Type.TIMEOUT, C10065z.class)).mo40449b()).intValue();
    }

    /* renamed from: v */
    public String mo41973v() {
        return (String) ((C10064y) mo40403j().mo40443q(UpnpHeader.Type.SID, C10064y.class)).mo40449b();
    }

    /* renamed from: w */
    public boolean mo41974w() {
        return (mo40403j().mo40443q(UpnpHeader.Type.SID, C10064y.class) == null || mo40403j().mo40443q(UpnpHeader.Type.TIMEOUT, C10065z.class) == null) ? false : true;
    }
}
