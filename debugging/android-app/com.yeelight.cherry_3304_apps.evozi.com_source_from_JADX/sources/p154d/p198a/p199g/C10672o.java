package p154d.p198a.p199g;

import p154d.p198a.C10607a;
import p154d.p198a.C10612c;
import p154d.p198a.C10613d;

/* renamed from: d.a.g.o */
public class C10672o extends C10612c {

    /* renamed from: a */
    private final String f20436a;

    /* renamed from: b */
    private final String f20437b;

    /* renamed from: c */
    private final C10613d f20438c;

    public C10672o(C10656l lVar, String str, String str2, C10613d dVar) {
        super(lVar);
        this.f20436a = str;
        this.f20437b = str2;
        this.f20438c = dVar;
    }

    /* renamed from: b */
    public C10607a mo33460b() {
        return (C10607a) getSource();
    }

    /* renamed from: c */
    public C10613d mo33461c() {
        return this.f20438c;
    }

    /* renamed from: d */
    public String mo33463d() {
        return this.f20437b;
    }

    /* renamed from: e */
    public String mo33464e() {
        return this.f20436a;
    }

    /* renamed from: f */
    public C10672o clone() {
        return new C10672o((C10656l) mo33460b(), mo33464e(), mo33463d(), new C10673p(mo33461c()));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + C10672o.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("\n\tname: '");
        sb.append(mo33463d());
        sb.append("' type: '");
        sb.append(mo33464e());
        sb.append("' info: '");
        sb.append(mo33461c());
        sb.append("']");
        return sb.toString();
    }
}
