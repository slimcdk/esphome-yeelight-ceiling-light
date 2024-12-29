package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.w4 */
public class C2046w4 extends IOException {
    public C2046w4(String str) {
        super(str);
    }

    /* renamed from: a */
    static C2046w4 m6265a() {
        return new C2046w4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C2046w4 m6266b() {
        return new C2046w4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C2046w4 m6267c() {
        return new C2046w4("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static C2031v4 m6268d() {
        return new C2031v4("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    static C2046w4 m6269e() {
        return new C2046w4("Failed to parse the message.");
    }

    /* renamed from: f */
    static C2046w4 m6270f() {
        return new C2046w4("Protocol message had invalid UTF-8.");
    }
}
