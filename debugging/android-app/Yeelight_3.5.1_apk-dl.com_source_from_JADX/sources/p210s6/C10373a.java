package p210s6;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.header.C10047h;
import org.fourthline.cling.model.message.header.C10054o;
import org.fourthline.cling.model.message.header.C10055p;
import org.fourthline.cling.model.message.header.C10064y;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.C10076b0;
import org.fourthline.cling.model.types.NotificationSubtype;
import p214t6.C10409i;
import p226w6.C11959d;

/* renamed from: s6.a */
public class C10373a extends C10030d {

    /* renamed from: h */
    private final List<C11959d> f19449h = new ArrayList();

    /* renamed from: i */
    private final C10409i f19450i;

    public C10373a(C10030d dVar, C10409i iVar) {
        super(dVar);
        this.f19450i = iVar;
    }

    /* renamed from: A */
    public List<C11959d> mo41963A() {
        return this.f19449h;
    }

    /* renamed from: B */
    public String mo41964B() {
        C10064y yVar = (C10064y) mo40403j().mo40443q(UpnpHeader.Type.SID, C10064y.class);
        if (yVar != null) {
            return (String) yVar.mo40449b();
        }
        return null;
    }

    /* renamed from: C */
    public boolean mo41965C() {
        C10054o oVar = (C10054o) mo40403j().mo40443q(UpnpHeader.Type.NT, C10054o.class);
        C10055p pVar = (C10055p) mo40403j().mo40443q(UpnpHeader.Type.NTS, C10055p.class);
        return (oVar == null || oVar.mo40449b() == null || pVar == null || !((NotificationSubtype) pVar.mo40449b()).equals(NotificationSubtype.PROPCHANGE)) ? false : true;
    }

    public String toString() {
        return super.toString() + " SEQUENCE: " + mo41966y().mo40572c();
    }

    /* renamed from: y */
    public C10076b0 mo41966y() {
        C10047h hVar = (C10047h) mo40403j().mo40443q(UpnpHeader.Type.SEQ, C10047h.class);
        if (hVar != null) {
            return (C10076b0) hVar.mo40449b();
        }
        return null;
    }

    /* renamed from: z */
    public C10409i mo41967z() {
        return this.f19450i;
    }
}
