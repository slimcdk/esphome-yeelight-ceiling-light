package org.fourthline.cling.model.message.header;

import org.seamless.util.C10245c;

/* renamed from: org.fourthline.cling.model.message.header.d */
public class C10041d extends UpnpHeader<C10245c> {

    /* renamed from: c */
    public static final C10245c f18539c = C10245c.m25757g("text/xml");

    /* renamed from: d */
    public static final C10245c f18540d = C10245c.m25757g("text/xml;charset=\"utf-8\"");

    public C10041d() {
        mo40451e(f18539c);
    }

    public C10041d(C10245c cVar) {
        mo40451e(cVar);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10245c) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        mo40451e(C10245c.m25757g(str));
    }

    /* renamed from: f */
    public boolean mo40456f() {
        return mo40449b() != null && ((C10245c) mo40449b()).mo41566d().equals(f18539c.mo41566d());
    }

    /* renamed from: g */
    public boolean mo40457g() {
        return mo40456f() && ((C10245c) mo40449b()).mo41565c().equals(f18539c.mo41565c());
    }
}
