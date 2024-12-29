package p154d.p198a;

import java.io.Closeable;
import java.net.InetAddress;
import java.util.Collection;
import p154d.p198a.p199g.C10656l;

/* renamed from: d.a.a */
public abstract class C10607a implements Closeable {

    /* renamed from: d.a.a$a */
    public interface C10608a {
        /* renamed from: a */
        void mo33456a(C10607a aVar, Collection<C10613d> collection);
    }

    /* renamed from: I */
    public static C10607a m25905I(InetAddress inetAddress) {
        return new C10656l(inetAddress, (String) null);
    }

    /* renamed from: F */
    public abstract void mo33450F(String str, C10615e eVar);

    /* renamed from: J */
    public abstract void mo33451J(C10613d dVar);

    /* renamed from: K */
    public abstract void mo33452K(String str, C10615e eVar);

    /* renamed from: L */
    public abstract void mo33453L(String str, String str2);

    /* renamed from: M */
    public abstract void mo33454M();

    /* renamed from: Q */
    public abstract void mo33455Q(C10613d dVar);
}
