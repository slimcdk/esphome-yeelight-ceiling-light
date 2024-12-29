package com.google.firebase.crashlytics.p110c.p118m;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p118m.C3001b;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3007b;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3010d;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.c.m.a */
public class C3000a {

    /* renamed from: a */
    private final C3001b.C3004c f5834a;

    public C3000a(C3001b.C3004c cVar) {
        this.f5834a = cVar;
    }

    /* renamed from: a */
    public boolean mo17394a() {
        File[] b = this.f5834a.mo17236b();
        File[] a = this.f5834a.mo17235a();
        if (b == null || b.length <= 0) {
            return a != null && a.length > 0;
        }
        return true;
    }

    /* renamed from: b */
    public void mo17395b(C3008c cVar) {
        cVar.remove();
    }

    /* renamed from: c */
    public void mo17396c(List<C3008c> list) {
        for (C3008c b : list) {
            mo17395b(b);
        }
    }

    /* renamed from: d */
    public List<C3008c> mo17397d() {
        C2857b.m8687f().mo17130b("Checking for crash reports...");
        File[] b = this.f5834a.mo17236b();
        File[] a = this.f5834a.mo17235a();
        LinkedList linkedList = new LinkedList();
        if (b != null) {
            for (File file : b) {
                C2857b.m8687f().mo17130b("Found crash report " + file.getPath());
                linkedList.add(new C3010d(file));
            }
        }
        if (a != null) {
            for (File bVar : a) {
                linkedList.add(new C3007b(bVar));
            }
        }
        if (linkedList.isEmpty()) {
            C2857b.m8687f().mo17130b("No reports found.");
        }
        return linkedList;
    }
}
