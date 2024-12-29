package okhttp3.internal.http2;

import com.xiaomi.mipush.sdk.Constants;
import okhttp3.C3544s;
import okio.ByteString;
import p056k5.C3300c;

/* renamed from: okhttp3.internal.http2.a */
public final class C9802a {

    /* renamed from: d */
    public static final ByteString f17693d = ByteString.encodeUtf8(Constants.COLON_SEPARATOR);

    /* renamed from: e */
    public static final ByteString f17694e = ByteString.encodeUtf8(":status");

    /* renamed from: f */
    public static final ByteString f17695f = ByteString.encodeUtf8(":method");

    /* renamed from: g */
    public static final ByteString f17696g = ByteString.encodeUtf8(":path");

    /* renamed from: h */
    public static final ByteString f17697h = ByteString.encodeUtf8(":scheme");

    /* renamed from: i */
    public static final ByteString f17698i = ByteString.encodeUtf8(":authority");

    /* renamed from: a */
    public final ByteString f17699a;

    /* renamed from: b */
    public final ByteString f17700b;

    /* renamed from: c */
    final int f17701c;

    /* renamed from: okhttp3.internal.http2.a$a */
    interface C9803a {
        /* renamed from: a */
        void mo38999a(C3544s sVar);
    }

    public C9802a(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public C9802a(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public C9802a(ByteString byteString, ByteString byteString2) {
        this.f17699a = byteString;
        this.f17700b = byteString2;
        this.f17701c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9802a)) {
            return false;
        }
        C9802a aVar = (C9802a) obj;
        return this.f17699a.equals(aVar.f17699a) && this.f17700b.equals(aVar.f17700b);
    }

    public int hashCode() {
        return ((527 + this.f17699a.hashCode()) * 31) + this.f17700b.hashCode();
    }

    public String toString() {
        return C3300c.m8932q("%s: %s", this.f17699a.utf8(), this.f17700b.utf8());
    }
}
