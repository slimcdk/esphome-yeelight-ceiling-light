package p154d.p198a.p199g.p200r;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: d.a.g.r.d */
public enum C10680d {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN("in", 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", 254),
    CLASS_ANY("any", 255);
    

    /* renamed from: i */
    private static Logger f20482i;

    /* renamed from: a */
    private final int f20484a;

    static {
        f20482i = Logger.getLogger(C10680d.class.getName());
    }

    private C10680d(String str, int i) {
        this.f20484a = i;
    }

    /* renamed from: a */
    public static C10680d m26377a(int i) {
        int i2 = i & 32767;
        for (C10680d dVar : values()) {
            if (dVar.f20484a == i2) {
                return dVar;
            }
        }
        f20482i.log(Level.WARNING, "Could not find record class for index: " + i);
        return CLASS_UNKNOWN;
    }

    /* renamed from: b */
    public int mo33824b() {
        return this.f20484a;
    }

    /* renamed from: c */
    public boolean mo33825c(int i) {
        return (this == CLASS_UNKNOWN || (i & 32768) == 0) ? false : true;
    }

    public String toString() {
        return name() + " index " + mo33824b();
    }
}
