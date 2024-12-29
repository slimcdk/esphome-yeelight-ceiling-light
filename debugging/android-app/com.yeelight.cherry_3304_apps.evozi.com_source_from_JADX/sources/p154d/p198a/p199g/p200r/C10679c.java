package p154d.p198a.p199g.p200r;

import androidx.core.internal.view.SupportMenu;

/* renamed from: d.a.g.r.c */
public enum C10679c {
    Unknown("Unknown", SupportMenu.USER_MASK),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);
    

    /* renamed from: a */
    private final int f20474a;

    private C10679c(String str, int i) {
        this.f20474a = i;
    }

    /* renamed from: b */
    public static C10679c m26375b(int i) {
        for (C10679c cVar : values()) {
            if (cVar.f20474a == i) {
                return cVar;
            }
        }
        return Unknown;
    }

    /* renamed from: a */
    public int mo33822a() {
        return this.f20474a;
    }

    public String toString() {
        return name() + " index " + mo33822a();
    }
}
