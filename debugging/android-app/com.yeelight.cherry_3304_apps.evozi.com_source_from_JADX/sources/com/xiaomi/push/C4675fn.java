package com.xiaomi.push;

import android.os.Build;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.service.C4877ay;
import com.xiaomi.push.service.C4884be;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* renamed from: com.xiaomi.push.fn */
public class C4675fn {

    /* renamed from: a */
    private int f8735a;

    /* renamed from: a */
    private C4678fq f8736a;

    /* renamed from: a */
    private OutputStream f8737a;

    /* renamed from: a */
    ByteBuffer f8738a = ByteBuffer.allocate(2048);

    /* renamed from: a */
    private Adler32 f8739a = new Adler32();

    /* renamed from: a */
    private byte[] f8740a;

    /* renamed from: b */
    private int f8741b;

    /* renamed from: b */
    private ByteBuffer f8742b = ByteBuffer.allocate(4);

    C4675fn(OutputStream outputStream, C4678fq fqVar) {
        this.f8737a = new BufferedOutputStream(outputStream);
        this.f8736a = fqVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f8735a = timeZone.getRawOffset() / 3600000;
        this.f8741b = timeZone.useDaylightTime() ? 1 : 0;
    }

    /* renamed from: a */
    public int mo25130a(C4673fl flVar) {
        int c = flVar.mo25122c();
        if (c > 32768) {
            C3989b.m10669a("Blob size=" + c + " should be less than " + 32768 + " Drop blob chid=" + flVar.mo25112a() + " id=" + flVar.mo25124e());
            return 0;
        }
        this.f8738a.clear();
        int i = c + 8 + 4;
        if (i > this.f8738a.capacity() || this.f8738a.capacity() > 4096) {
            this.f8738a = ByteBuffer.allocate(i);
        }
        this.f8738a.putShort(-15618);
        this.f8738a.putShort(5);
        this.f8738a.putInt(c);
        int position = this.f8738a.position();
        this.f8738a = flVar.mo25113a(this.f8738a);
        if (!"CONN".equals(flVar.mo25112a())) {
            if (this.f8740a == null) {
                this.f8740a = this.f8736a.mo25134a();
            }
            C4877ay.m15655a(this.f8740a, this.f8738a.array(), true, position, c);
        }
        this.f8739a.reset();
        this.f8739a.update(this.f8738a.array(), 0, this.f8738a.position());
        this.f8742b.putInt(0, (int) this.f8739a.getValue());
        this.f8737a.write(this.f8738a.array(), 0, this.f8738a.position());
        this.f8737a.write(this.f8742b.array(), 0, 4);
        this.f8737a.flush();
        int position2 = this.f8738a.position() + 4;
        C3989b.m10680c("[Slim] Wrote {cmd=" + flVar.mo25112a() + ";chid=" + flVar.mo25112a() + ";len=" + position2 + "}");
        return position2;
    }

    /* renamed from: a */
    public void mo25131a() {
        C4632ek.C4637e eVar = new C4632ek.C4637e();
        eVar.mo24993a(106);
        eVar.mo24995a(Build.MODEL);
        eVar.mo24997b(C4937t.m15865a());
        eVar.mo25000c(C4884be.mo25947a());
        eVar.mo24996b(39);
        eVar.mo25002d(this.f8736a.mo25150b());
        eVar.mo25004e(this.f8736a.mo25134a());
        eVar.mo25005f(Locale.getDefault().toString());
        eVar.mo24999c(Build.VERSION.SDK_INT);
        byte[] a = this.f8736a.mo25134a().mo25160a();
        if (a != null) {
            eVar.mo24994a(C4632ek.C4634b.m13892a(a));
        }
        C4673fl flVar = new C4673fl();
        flVar.mo25114a(0);
        flVar.mo25117a("CONN", (String) null);
        flVar.mo25115a(0, "xiaomi.com", (String) null);
        flVar.mo25119a(eVar.mo24930a(), (String) null);
        mo25130a(flVar);
        C3989b.m10669a("[slim] open conn: andver=" + Build.VERSION.SDK_INT + " sdk=" + 39 + " hash=" + C4884be.mo25947a() + " tz=" + this.f8735a + Constants.COLON_SEPARATOR + this.f8741b + " Model=" + Build.MODEL + " os=" + Build.VERSION.INCREMENTAL);
    }

    /* renamed from: b */
    public void mo25132b() {
        C4673fl flVar = new C4673fl();
        flVar.mo25117a("CLOSE", (String) null);
        mo25130a(flVar);
        this.f8737a.close();
    }
}
