package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.n */
public class C3285n {

    /* renamed from: a */
    private static final byte f6355a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f6356b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m10183b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m10184c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    /* renamed from: a */
    public String mo17902a() {
        byte[] c = m10184c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f6356b & c[0]) | f6355a);
        return m10183b(c);
    }
}
