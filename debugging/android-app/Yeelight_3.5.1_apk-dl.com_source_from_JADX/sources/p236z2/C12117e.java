package p236z2;

import okio.ByteString;

/* renamed from: z2.e */
public final class C12117e {

    /* renamed from: d */
    public static final ByteString f22239d = ByteString.encodeUtf8(":status");

    /* renamed from: e */
    public static final ByteString f22240e = ByteString.encodeUtf8(":method");

    /* renamed from: f */
    public static final ByteString f22241f = ByteString.encodeUtf8(":path");

    /* renamed from: g */
    public static final ByteString f22242g = ByteString.encodeUtf8(":scheme");

    /* renamed from: h */
    public static final ByteString f22243h = ByteString.encodeUtf8(":authority");

    /* renamed from: i */
    public static final ByteString f22244i = ByteString.encodeUtf8(":host");

    /* renamed from: j */
    public static final ByteString f22245j = ByteString.encodeUtf8(":version");

    /* renamed from: a */
    public final ByteString f22246a;

    /* renamed from: b */
    public final ByteString f22247b;

    /* renamed from: c */
    final int f22248c;

    public C12117e(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public C12117e(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public C12117e(ByteString byteString, ByteString byteString2) {
        this.f22246a = byteString;
        this.f22247b = byteString2;
        this.f22248c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12117e)) {
            return false;
        }
        C12117e eVar = (C12117e) obj;
        return this.f22246a.equals(eVar.f22246a) && this.f22247b.equals(eVar.f22247b);
    }

    public int hashCode() {
        return ((527 + this.f22246a.hashCode()) * 31) + this.f22247b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f22246a.utf8(), this.f22247b.utf8()});
    }
}
