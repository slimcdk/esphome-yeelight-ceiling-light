package com.google.firebase.installations;

import com.google.android.gms.tasks.C1872a;
import com.google.firebase.installations.local.C2440b;

/* renamed from: com.google.firebase.installations.c */
class C2434c implements C2435d {

    /* renamed from: a */
    final C1872a<String> f4108a;

    public C2434c(C1872a<String> aVar) {
        this.f4108a = aVar;
    }

    /* renamed from: a */
    public boolean mo19058a(Exception exc) {
        return false;
    }

    /* renamed from: b */
    public boolean mo19059b(C2440b bVar) {
        if (!bVar.mo19088l() && !bVar.mo19087k() && !bVar.mo19085i()) {
            return false;
        }
        this.f4108a.mo14740e(bVar.mo19068d());
        return true;
    }
}
