package p011c.p012a.p019b.p028b.p032c.p036d;

import java.io.IOException;

/* renamed from: c.a.b.b.c.d.r */
public final class C0598r extends IOException {
    public C0598r(String str) {
        super(str);
    }

    /* renamed from: a */
    static C0598r m451a() {
        return new C0598r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C0598r m452b() {
        return new C0598r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C0598r m453c() {
        return new C0598r("CodedInputStream encountered a malformed varint.");
    }
}
