package p154d.p198a.p199g.p200r;

import androidx.core.internal.view.SupportMenu;

/* renamed from: d.a.g.r.f */
public enum C10682f {
    Unknown("Unknown", SupportMenu.USER_MASK),
    NoError("No Error", 0),
    FormErr("Format Error", 1),
    ServFail("Server Failure", 2),
    NXDomain("Non-Existent Domain", 3),
    NotImp("Not Implemented", 4),
    Refused("Query Refused", 5),
    YXDomain("Name Exists when it should not", 6),
    YXRRSet("RR Set Exists when it should not", 7),
    NXRRSet("RR Set that should exist does not", 8),
    NotAuth("Server Not Authoritative for zone", 9),
    NotZone("NotZone Name not contained in zone", 10);
    

    /* renamed from: a */
    private final int f20560a;

    private C10682f(String str, int i) {
        this.f20560a = i;
    }

    /* renamed from: b */
    public static C10682f m26382b(int i, int i2) {
        int i3 = (i & 15) | ((i2 >> 28) & 255);
        for (C10682f fVar : values()) {
            if (fVar.f20560a == i3) {
                return fVar;
            }
        }
        return Unknown;
    }

    /* renamed from: a */
    public int mo33829a() {
        return this.f20560a;
    }

    public String toString() {
        return name() + " index " + mo33829a();
    }
}
