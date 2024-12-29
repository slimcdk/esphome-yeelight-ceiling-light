package p210s6;

import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.header.C10037b;
import org.fourthline.cling.model.message.header.C10054o;
import org.fourthline.cling.model.message.header.C10064y;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p214t6.C10404d;

/* renamed from: s6.d */
public class C10376d extends C10030d {
    public C10376d(C10030d dVar, C10404d dVar2) {
        super(dVar);
    }

    /* renamed from: A */
    public boolean mo41975A() {
        return mo40403j().mo40443q(UpnpHeader.Type.NT, C10054o.class) != null;
    }

    /* renamed from: y */
    public String mo41976y() {
        C10064y yVar = (C10064y) mo40403j().mo40443q(UpnpHeader.Type.SID, C10064y.class);
        if (yVar != null) {
            return (String) yVar.mo40449b();
        }
        return null;
    }

    /* renamed from: z */
    public boolean mo41977z() {
        return mo40403j().mo40443q(UpnpHeader.Type.CALLBACK, C10037b.class) != null;
    }
}
