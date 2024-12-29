package p217u5;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.common.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.util.Map;
import org.eclipse.jetty.client.C9877j;
import org.eclipse.jetty.util.C9996o;

/* renamed from: u5.c */
public class C10536c implements C10534a {

    /* renamed from: a */
    C10537d f19698a;

    /* renamed from: b */
    Map f19699b;

    public C10536c(C10537d dVar, Map map) {
        this.f19698a = dVar;
        this.f19699b = map;
    }

    /* renamed from: b */
    private static String m26889b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Integer.toHexString((bArr[i] & 240) >>> 4));
            sb.append(Integer.toHexString(bArr[i] & ParameterInitDefType.CubemapSamplerInit));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo42191a(C9877j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Digest");
        sb.append(" ");
        sb.append("username");
        sb.append('=');
        sb.append('\"');
        sb.append(this.f19698a.mo42195b());
        sb.append('\"');
        sb.append(", ");
        sb.append("realm");
        sb.append('=');
        sb.append('\"');
        sb.append(String.valueOf(this.f19699b.get("realm")));
        sb.append('\"');
        sb.append(", ");
        sb.append("nonce");
        sb.append('=');
        sb.append('\"');
        sb.append(String.valueOf(this.f19699b.get("nonce")));
        sb.append('\"');
        sb.append(", ");
        sb.append("uri");
        sb.append('=');
        sb.append('\"');
        sb.append(jVar.mo39639u());
        sb.append('\"');
        sb.append(", ");
        sb.append("algorithm");
        sb.append('=');
        sb.append(String.valueOf(this.f19699b.get("algorithm")));
        String c = mo42192c(jVar, this.f19698a, this.f19699b);
        sb.append(", ");
        sb.append("response");
        sb.append('=');
        sb.append('\"');
        sb.append(mo42193d(c, jVar, this.f19698a, this.f19699b));
        sb.append('\"');
        sb.append(", ");
        sb.append("qop");
        sb.append('=');
        sb.append(String.valueOf(this.f19699b.get("qop")));
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
        jVar.mo39610R("Authorization", new String(sb.toString().getBytes("ISO-8859-1")));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo42192c(C9877j jVar, C10537d dVar, Map map) {
        try {
            return m26889b(MessageDigest.getInstance(Coder.KEY_MD5).digest(String.valueOf(System.currentTimeMillis()).getBytes("ISO-8859-1")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo42193d(String str, C9877j jVar, C10537d dVar, Map map) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(dVar.mo42195b().getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(String.valueOf(map.get("realm")).getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(dVar.mo42194a().getBytes("ISO-8859-1"));
            byte[] digest = instance.digest();
            instance.reset();
            instance.update(jVar.mo39629l().getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(jVar.mo39639u().getBytes("ISO-8859-1"));
            byte[] digest2 = instance.digest();
            instance.update(C9996o.m24722i(digest, 16).getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(String.valueOf(map.get("nonce")).getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update("00000001".getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(str.getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(String.valueOf(map.get("qop")).getBytes("ISO-8859-1"));
            instance.update((byte) 58);
            instance.update(C9996o.m24722i(digest2, 16).getBytes("ISO-8859-1"));
            return m26889b(instance.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
