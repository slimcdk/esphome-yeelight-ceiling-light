package p081p1;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: p1.e */
public class C3596e {

    /* renamed from: a */
    private static final byte f5996a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f5997b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m10187b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m10188c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    /* renamed from: a */
    public String mo25895a() {
        byte[] c = m10188c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f5997b & c[0]) | f5996a);
        return m10187b(c);
    }
}
