package p011c.p012a.p039c.p040a;

/* renamed from: c.a.c.a.a */
public enum C0641a {
    FATAL(16),
    ERROR(8),
    WARN(4),
    INFO(2),
    DEBUG(1),
    TRACE(0),
    OFF(-1);

    private C0641a(int i) {
    }

    public String toString() {
        return name();
    }
}
