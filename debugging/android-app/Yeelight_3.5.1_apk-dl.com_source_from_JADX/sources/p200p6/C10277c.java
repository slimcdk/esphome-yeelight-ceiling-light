package p200p6;

import java.beans.PropertyChangeSupport;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.C10019g;
import org.fourthline.cling.model.C10020h;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.types.C10076b0;
import p214t6.C10407g;
import p214t6.C10409i;
import p226w6.C11959d;

/* renamed from: p6.c */
public abstract class C10277c extends C10275a<C10409i> {
    protected C10277c(C10409i iVar, int i) {
        super(iVar, i);
        new PropertyChangeSupport(this);
    }

    /* renamed from: N */
    public synchronized void mo41781N(CancelReason cancelReason, UpnpResponse upnpResponse) {
        mo38938O(cancelReason, upnpResponse);
    }

    /* renamed from: O */
    public abstract void mo38938O(CancelReason cancelReason, UpnpResponse upnpResponse);

    /* renamed from: P */
    public synchronized void mo41782P() {
        mo38936a();
    }

    /* renamed from: Q */
    public abstract void mo38939Q(int i);

    /* renamed from: R */
    public synchronized void mo41783R(UpnpResponse upnpResponse) {
        mo38940S(upnpResponse);
    }

    /* renamed from: S */
    public abstract void mo38940S(UpnpResponse upnpResponse);

    /* renamed from: T */
    public synchronized List<URL> mo41784T(List<C10020h> list, C10019g gVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C10020h eVar : list) {
            arrayList.add(new C10017e(eVar, gVar.mo40359i(mo41766J())).mo40348c());
        }
        return arrayList;
    }

    /* renamed from: U */
    public synchronized URL mo41785U() {
        return ((C10407g) ((C10409i) mo41766J()).mo40531d()).mo42094N(((C10409i) mo41766J()).mo42102p());
    }

    /* renamed from: V */
    public abstract void mo38941V(UnsupportedDataException unsupportedDataException);

    /* renamed from: W */
    public synchronized void mo41786W(C10076b0 b0Var, Collection<C11959d> collection) {
        C10076b0 b0Var2 = this.f19355e;
        if (b0Var2 != null) {
            if (b0Var2.mo40572c().equals(Long.valueOf(this.f19355e.mo40570a().getMaxValue())) && b0Var.mo40572c().longValue() == 1) {
                System.err.println("TODO: HANDLE ROLLOVER");
                return;
            } else if (this.f19355e.mo40572c().longValue() < b0Var.mo40572c().longValue()) {
                int longValue = (int) (b0Var.mo40572c().longValue() - (this.f19355e.mo40572c().longValue() + 1));
                if (longValue != 0) {
                    mo38939Q(longValue);
                }
            } else {
                return;
            }
        }
        this.f19355e = b0Var;
        for (C11959d next : collection) {
            this.f19356f.put(next.mo42508d().mo40543b(), next);
        }
        mo38937e();
    }

    public String toString() {
        return "(SID: " + mo41767K() + ") " + mo41766J();
    }
}
