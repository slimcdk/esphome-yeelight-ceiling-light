package p156f.p157g0.p161i;

/* renamed from: f.g0.i.b */
public enum C10786b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: a */
    public final int f20729a;

    private C10786b(int i) {
        this.f20729a = i;
    }

    /* renamed from: a */
    public static C10786b m26756a(int i) {
        for (C10786b bVar : values()) {
            if (bVar.f20729a == i) {
                return bVar;
            }
        }
        return null;
    }
}
