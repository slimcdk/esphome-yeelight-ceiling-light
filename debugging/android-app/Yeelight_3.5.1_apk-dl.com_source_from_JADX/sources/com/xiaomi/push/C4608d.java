package com.xiaomi.push;

import java.io.IOException;

/* renamed from: com.xiaomi.push.d */
public class C4608d extends IOException {
    public C4608d(String str) {
        super(str);
    }

    /* renamed from: a */
    static C4608d m13270a() {
        return new C4608d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C4608d m13271b() {
        return new C4608d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C4608d m13272c() {
        return new C4608d("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C4608d m13273d() {
        return new C4608d("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static C4608d m13274e() {
        return new C4608d("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static C4608d m13275f() {
        return new C4608d("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static C4608d m13276g() {
        return new C4608d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    static C4608d m13277h() {
        return new C4608d("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
