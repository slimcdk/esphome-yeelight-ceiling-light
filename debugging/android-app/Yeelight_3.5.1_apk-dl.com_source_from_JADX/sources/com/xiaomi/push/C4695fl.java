package com.xiaomi.push;

import android.text.TextUtils;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.service.C4880ao;
import com.xiaomi.push.service.C4902bd;
import com.xiaomi.push.service.C4923bp;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.fl */
public class C4695fl {

    /* renamed from: a */
    private static long f8165a = 0;

    /* renamed from: a */
    private static final byte[] f8166a = new byte[0];

    /* renamed from: b */
    private static String f8167b = (C4745gy.m14114a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER);

    /* renamed from: a */
    int f8168a;

    /* renamed from: a */
    private C4637dx.C4638a f8169a;

    /* renamed from: a */
    public C4880ao f8170a;

    /* renamed from: a */
    String f8171a;

    /* renamed from: a */
    private short f8172a;

    /* renamed from: b */
    private byte[] f8173b;

    public C4695fl() {
        this.f8172a = 2;
        this.f8173b = f8166a;
        this.f8171a = null;
        this.f8170a = null;
        this.f8169a = new C4637dx.C4638a();
        this.f8168a = 1;
    }

    C4695fl(C4637dx.C4638a aVar, short s, byte[] bArr) {
        this.f8172a = 2;
        this.f8173b = f8166a;
        this.f8171a = null;
        this.f8170a = null;
        this.f8169a = aVar;
        this.f8172a = s;
        this.f8173b = bArr;
        this.f8168a = 2;
    }

    @Deprecated
    /* renamed from: a */
    public static C4695fl m13861a(C4731gn gnVar, String str) {
        int i;
        C4695fl flVar = new C4695fl();
        try {
            i = Integer.parseInt(gnVar.mo29252k());
        } catch (Exception e) {
            C4408b.m12464a("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        flVar.mo29147a(i);
        flVar.mo29149a(gnVar.mo29251j());
        flVar.mo29157c(gnVar.mo29256m());
        flVar.mo29155b(gnVar.mo29258n());
        flVar.mo29150a("XMLMSG", (String) null);
        try {
            flVar.mo29152a(gnVar.mo29223a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                flVar.mo29151a(3);
            } else {
                flVar.mo29151a(2);
                flVar.mo29150a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e2) {
            C4408b.m12464a("Blob setPayload err： " + e2.getMessage());
        }
        return flVar;
    }

    /* renamed from: a */
    static C4695fl mo29146a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            C4637dx.C4638a aVar = new C4637dx.C4638a();
            aVar.mo29025a(slice.array(), slice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new C4695fl(aVar, s, bArr);
        } catch (Exception e) {
            C4408b.m12464a("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    /* renamed from: d */
    public static synchronized String m13863d() {
        String sb;
        synchronized (C4695fl.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f8167b);
            long j = f8165a;
            f8165a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public int mo29145a() {
        return this.f8169a.mo28942c();
    }

    /* renamed from: a */
    public String m13865a() {
        return this.f8169a.mo28942c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer m13866a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(mo29156c());
        }
        byteBuffer.putShort(this.f8172a);
        byteBuffer.putShort((short) this.f8169a.mo28924a());
        byteBuffer.putInt(this.f8173b.length);
        int position = byteBuffer.position();
        this.f8169a.mo29025a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f8169a.mo28924a());
        byteBuffer.position(position + this.f8169a.mo28924a());
        byteBuffer.put(this.f8173b);
        return byteBuffer;
    }

    /* renamed from: a */
    public short m13867a() {
        return this.f8172a;
    }

    /* renamed from: a */
    public void mo29147a(int i) {
        this.f8169a.mo28937a(i);
    }

    /* renamed from: a */
    public void mo29148a(long j, String str, String str2) {
        if (j != 0) {
            this.f8169a.mo28938a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f8169a.mo28939a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f8169a.mo28941b(str2);
        }
    }

    /* renamed from: a */
    public void mo29149a(String str) {
        this.f8169a.mo28949e(str);
    }

    /* renamed from: a */
    public void mo29150a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f8169a.mo28944c(str);
            this.f8169a.mo28924a();
            if (!TextUtils.isEmpty(str2)) {
                this.f8169a.mo28947d(str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("command should not be empty");
    }

    /* renamed from: a */
    public void mo29151a(short s) {
        this.f8172a = s;
    }

    /* renamed from: a */
    public void mo29152a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8169a.mo28943c(1);
            this.f8173b = C4923bp.m15452a(C4923bp.m15450a(str, mo29158e()), bArr);
            return;
        }
        this.f8169a.mo28943c(0);
        this.f8173b = bArr;
    }

    /* renamed from: a */
    public boolean m13874a() {
        return this.f8169a.mo28955j();
    }

    /* renamed from: a */
    public byte[] m13875a() {
        return C4696fm.m13887a(this, this.f8173b);
    }

    /* renamed from: a */
    public byte[] m13876a(String str) {
        if (this.f8169a.mo28948e() == 1) {
            return C4696fm.m13887a(this, C4923bp.m15452a(C4923bp.m15450a(str, mo29158e()), this.f8173b));
        }
        if (this.f8169a.mo28948e() == 0) {
            return C4696fm.m13887a(this, this.f8173b);
        }
        C4408b.m12464a("unknow cipher = " + this.f8169a.mo28948e());
        return C4696fm.m13887a(this, this.f8173b);
    }

    /* renamed from: b */
    public int mo29153b() {
        return this.f8169a.mo28950f();
    }

    /* renamed from: b */
    public String m13878b() {
        return this.f8169a.mo28945d();
    }

    /* renamed from: b */
    public void mo29154b(int i) {
        C4880ao aoVar = new C4880ao();
        this.f8170a = aoVar;
        aoVar.f9469a = i;
    }

    /* renamed from: b */
    public void mo29155b(String str) {
        this.f8171a = str;
    }

    /* renamed from: c */
    public int mo29156c() {
        return this.f8169a.mo28930b() + 8 + this.f8173b.length;
    }

    /* renamed from: c */
    public String m13882c() {
        return this.f8169a.mo28950f();
    }

    /* renamed from: c */
    public void mo29157c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("@");
            try {
                long parseLong = Long.parseLong(str.substring(0, indexOf));
                int indexOf2 = str.indexOf(MiotCloudImpl.COOKIE_PATH, indexOf);
                String substring = str.substring(indexOf + 1, indexOf2);
                String substring2 = str.substring(indexOf2 + 1);
                this.f8169a.mo28938a(parseLong);
                this.f8169a.mo28939a(substring);
                this.f8169a.mo28941b(substring2);
            } catch (Exception e) {
                C4408b.m12464a("Blob parse user err " + e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public String mo29158e() {
        String e = this.f8169a.mo28948e();
        if ("ID_NOT_AVAILABLE".equals(e)) {
            return null;
        }
        if (this.f8169a.mo28952g()) {
            return e;
        }
        String d = m13863d();
        this.f8169a.mo28949e(d);
        return d;
    }

    /* renamed from: f */
    public String mo29159f() {
        return this.f8171a;
    }

    /* renamed from: g */
    public String mo29160g() {
        if (!this.f8169a.mo28930b()) {
            return null;
        }
        return Long.toString(this.f8169a.mo28924a()) + "@" + this.f8169a.mo28924a() + MiotCloudImpl.COOKIE_PATH + this.f8169a.mo28930b();
    }

    public String toString() {
        return "Blob [chid=" + mo29145a() + "; Id=" + C4902bd.m15381a(mo29158e()) + "; cmd=" + mo29145a() + "; type=" + mo29145a() + "; from=" + mo29160g() + " ]";
    }
}
