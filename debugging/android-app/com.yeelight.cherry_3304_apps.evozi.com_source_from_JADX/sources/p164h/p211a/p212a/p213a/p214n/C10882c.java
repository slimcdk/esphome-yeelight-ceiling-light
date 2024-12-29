package p164h.p211a.p212a.p213a.p214n;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.common.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.util.Map;
import p164h.p211a.p212a.p213a.C10871k;
import p164h.p211a.p212a.p228h.C11138r;

/* renamed from: h.a.a.a.n.c */
public class C10882c implements C10880a {

    /* renamed from: a */
    C10883d f21053a;

    /* renamed from: b */
    Map f21054b;

    public C10882c(C10883d dVar, Map map) {
        this.f21053a = dVar;
        this.f21054b = map;
    }

    /* renamed from: b */
    private static String m27339b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Integer.toHexString((bArr[i] & 240) >>> 4));
            sb.append(Integer.toHexString(bArr[i] & ParameterInitDefType.CubemapSamplerInit));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo34378a(C10871k kVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Digest");
        sb.append(" ");
        sb.append("username");
        sb.append('=');
        sb.append('\"');
        sb.append(this.f21053a.mo34382b());
        sb.append('\"');
        sb.append(", ");
        sb.append("realm");
        sb.append('=');
        sb.append('\"');
        sb.append(String.valueOf(this.f21054b.get("realm")));
        sb.append('\"');
        sb.append(", ");
        sb.append("nonce");
        sb.append('=');
        sb.append('\"');
        sb.append(String.valueOf(this.f21054b.get("nonce")));
        sb.append('\"');
        sb.append(", ");
        sb.append("uri");
        sb.append('=');
        sb.append('\"');
        sb.append(kVar.mo34338u());
        sb.append('\"');
        sb.append(", ");
        sb.append("algorithm");
        sb.append('=');
        sb.append(String.valueOf(this.f21054b.get("algorithm")));
        String c = mo34379c(kVar, this.f21053a, this.f21054b);
        sb.append(", ");
        sb.append("response");
        sb.append('=');
        sb.append('\"');
        sb.append(mo34380d(c, kVar, this.f21053a, this.f21054b));
        sb.append('\"');
        sb.append(", ");
        sb.append("qop");
        sb.append('=');
        sb.append(String.valueOf(this.f21054b.get("qop")));
        sb.append(", ");
        sb.append("nc");
        sb.append('=');
        sb.append("00000001");
        sb.append(", ");
        sb.append("cnonce");
        sb.append('=');
        sb.append('\"');
        sb.append(c);
        sb.append('\"');
        kVar.mo34309R("Authorization", new String(sb.toString().getBytes("ISO-8859-1")));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo34379c(C10871k kVar, C10883d dVar, Map map) {
        try {
            return m27339b(MessageDigest.getInstance(Coder.KEY_MD5).digest(String.valueOf(System.currentTimeMillis()).getBytes("ISO-8859-1")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo34380d(String str, C10871k kVar, C10883d dVar, Map map) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(dVar.mo34382b().getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(String.valueOf(map.get("realm")).getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(dVar.mo34381a().getBytes("ISO-8859-1"));
            byte[] digest = instance.digest();
            instance.reset();
            instance.update(kVar.mo34328l().getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(kVar.mo34338u().getBytes("ISO-8859-1"));
            byte[] digest2 = instance.digest();
            instance.update(C11138r.m28934h(digest, 16).getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(String.valueOf(map.get("nonce")).getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update("00000001".getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(str.getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(String.valueOf(map.get("qop")).getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(C11138r.m28934h(digest2, 16).getBytes("ISO-8859-1"));
            return m27339b(instance.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
