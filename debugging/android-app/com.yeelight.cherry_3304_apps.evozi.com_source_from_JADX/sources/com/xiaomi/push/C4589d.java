package com.xiaomi.push;

import java.io.IOException;

/* renamed from: com.xiaomi.push.d */
public class C4589d extends IOException {
    public C4589d(String str) {
        super(str);
    }

    /* renamed from: a */
    static C4589d m13680a() {
        return new C4589d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C4589d m13681b() {
        return new C4589d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C4589d m13682c() {
        return new C4589d("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C4589d m13683d() {
        return new C4589d("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static C4589d m13684e() {
        return new C4589d("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static C4589d m13685f() {
        return new C4589d("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static C4589d m13686g() {
        return new C4589d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    static C4589d m13687h() {
        return new C4589d("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
