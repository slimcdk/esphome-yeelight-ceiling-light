package com.xiaomi.push;

import android.os.Build;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.service.C4923bp;
import com.xiaomi.push.service.C4929bv;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* renamed from: com.xiaomi.push.fo */
public class C4698fo {

    /* renamed from: a */
    private int f8184a;

    /* renamed from: a */
    private C4706fs f8185a;

    /* renamed from: a */
    private OutputStream f8186a;

    /* renamed from: a */
    ByteBuffer f8187a = ByteBuffer.allocate(2048);

    /* renamed from: a */
    private Adler32 f8188a = new Adler32();

    /* renamed from: a */
    private byte[] f8189a;

    /* renamed from: b */
    private int f8190b;

    /* renamed from: b */
    private ByteBuffer f8191b = ByteBuffer.allocate(4);

    C4698fo(OutputStream outputStream, C4706fs fsVar) {
        this.f8186a = new BufferedOutputStream(outputStream);
        this.f8185a = fsVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f8184a = timeZone.getRawOffset() / 3600000;
        this.f8190b = timeZone.useDaylightTime() ? 1 : 0;
    }

    /* renamed from: a */
    public int mo29164a(C4695fl flVar) {
        int c = flVar.mo29156c();
        if (c > 32768) {
            C4408b.m12464a("Blob size=" + c + " should be less than " + 32768 + " Drop blob chid=" + flVar.mo29145a() + " id=" + flVar.mo29158e());
            return 0;
        }
        this.f8187a.clear();
        int i = c + 8 + 4;
        if (i > this.f8187a.capacity() || this.f8187a.capacity() > 4096) {
            this.f8187a = ByteBuffer.allocate(i);
        }
        this.f8187a.putShort(-15618);
        this.f8187a.putShort(5);
        this.f8187a.putInt(c);
        int position = this.f8187a.position();
        this.f8187a = flVar.mo29146a(this.f8187a);
        if (!"CONN".equals(flVar.mo29145a())) {
            if (this.f8189a == null) {
                this.f8189a = this.f8185a.mo29170a();
            }
            C4923bp.m15453a(this.f8189a, this.f8187a.array(), true, position, c);
        }
        this.f8188a.reset();
        this.f8188a.update(this.f8187a.array(), 0, this.f8187a.position());
        this.f8191b.putInt(0, (int) this.f8188a.getValue());
        this.f8186a.write(this.f8187a.array(), 0, this.f8187a.position());
        this.f8186a.write(this.f8191b.array(), 0, 4);
        this.f8186a.flush();
        int position2 = this.f8187a.position() + 4;
        C4408b.m12482c("[Slim] Wrote {cmd=" + flVar.mo29145a() + ";chid=" + flVar.mo29145a() + ";len=" + position2 + "}");
        return position2;
    }

    /* renamed from: a */
    public void mo29165a() {
        C4637dx.C4642e eVar = new C4637dx.C4642e();
        eVar.mo28981a(106);
        String str = Build.MODEL;
        eVar.mo28983a(str);
        eVar.mo28985b(C4994v.m15733a());
        eVar.mo28988c(C4929bv.mo30029a());
        eVar.mo28984b(48);
        eVar.mo28990d(this.f8185a.mo29188b());
        eVar.mo28992e(this.f8185a.mo29170a());
        eVar.mo28993f(Locale.getDefault().toString());
        int i = Build.VERSION.SDK_INT;
        eVar.mo28987c(i);
        byte[] a = this.f8185a.mo29170a().mo29197a();
        if (a != null) {
            eVar.mo28982a(C4637dx.C4639b.m13424a(a));
        }
        C4695fl flVar = new C4695fl();
        flVar.mo29147a(0);
        flVar.mo29150a("CONN", (String) null);
        flVar.mo29148a(0, "xiaomi.com", (String) null);
        flVar.mo29152a(eVar.mo28924a(), (String) null);
        mo29164a(flVar);
        C4408b.m12464a("[slim] open conn: andver=" + i + " sdk=" + 48 + " tz=" + this.f8184a + Constants.COLON_SEPARATOR + this.f8190b + " Model=" + str + " os=" + Build.VERSION.INCREMENTAL);
    }

    /* renamed from: b */
    public void mo29166b() {
        C4695fl flVar = new C4695fl();
        flVar.mo29150a("CLOSE", (String) null);
        mo29164a(flVar);
        this.f8186a.close();
    }
}
