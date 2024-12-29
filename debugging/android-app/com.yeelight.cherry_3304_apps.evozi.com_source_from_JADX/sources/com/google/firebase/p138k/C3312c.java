package com.google.firebase.p138k;

import com.google.firebase.components.C2825d;
import com.google.firebase.components.C2828e;
import com.google.firebase.components.C2843n;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.google.firebase.k.c */
public class C3312c implements C3317h {

    /* renamed from: a */
    private final String f6417a;

    /* renamed from: b */
    private final C3313d f6418b;

    C3312c(Set<C3315f> set, C3313d dVar) {
        this.f6417a = m10304d(set);
        this.f6418b = dVar;
    }

    /* renamed from: b */
    public static C2825d<C3317h> m10302b() {
        C2825d.C2827b<C3317h> a = C2825d.m8587a(C3317h.class);
        a.mo17084b(C2843n.m8647h(C3315f.class));
        a.mo17088f(C3311b.m10300b());
        return a.mo17086d();
    }

    /* renamed from: c */
    static /* synthetic */ C3317h m10303c(C2828e eVar) {
        return new C3312c(eVar.mo17075d(C3315f.class), C3313d.m10306a());
    }

    /* renamed from: d */
    private static String m10304d(Set<C3315f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C3315f> it = set.iterator();
        while (it.hasNext()) {
            C3315f next = it.next();
            sb.append(next.mo17966b());
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(next.mo17967c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo17971a() {
        if (this.f6418b.mo17972b().isEmpty()) {
            return this.f6417a;
        }
        return this.f6417a + ' ' + m10304d(this.f6418b.mo17972b());
    }
}
