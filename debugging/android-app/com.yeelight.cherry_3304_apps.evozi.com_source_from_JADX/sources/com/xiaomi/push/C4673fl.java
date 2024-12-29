package com.xiaomi.push;

import android.text.TextUtils;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.service.C4877ay;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.fl */
public class C4673fl {

    /* renamed from: a */
    private static long f8720a = 0;

    /* renamed from: a */
    private static final byte[] f8721a = new byte[0];

    /* renamed from: b */
    private static String f8722b = (C4715gu.m14460a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER);

    /* renamed from: a */
    private C4632ek.C4633a f8723a;

    /* renamed from: a */
    String f8724a;

    /* renamed from: a */
    private short f8725a;

    /* renamed from: b */
    private byte[] f8726b;

    public C4673fl() {
        this.f8725a = 2;
        this.f8726b = f8721a;
        this.f8724a = null;
        this.f8723a = new C4632ek.C4633a();
    }

    C4673fl(C4632ek.C4633a aVar, short s, byte[] bArr) {
        this.f8725a = 2;
        this.f8726b = f8721a;
        this.f8724a = null;
        this.f8723a = aVar;
        this.f8725a = s;
        this.f8726b = bArr;
    }

    @Deprecated
    /* renamed from: a */
    public static C4673fl m14224a(C4701gj gjVar, String str) {
        int i;
        C4673fl flVar = new C4673fl();
        try {
            i = Integer.parseInt(gjVar.mo25215k());
        } catch (Exception e) {
            C3989b.m10669a("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        flVar.mo25114a(i);
        flVar.mo25116a(gjVar.mo25214j());
        flVar.mo25123c(gjVar.mo25219m());
        flVar.mo25121b(gjVar.mo25221n());
        flVar.mo25117a("XMLMSG", (String) null);
        try {
            flVar.mo25119a(gjVar.mo25186a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                flVar.mo25118a(3);
            } else {
                flVar.mo25118a(2);
                flVar.mo25117a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e2) {
            C3989b.m10669a("Blob setPayload err： " + e2.getMessage());
        }
        return flVar;
    }

    /* renamed from: a */
    static C4673fl mo25113a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            C4632ek.C4633a aVar = new C4632ek.C4633a();
            aVar.mo24933a(slice.array(), slice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new C4673fl(aVar, s, bArr);
        } catch (Exception e) {
            C3989b.m10669a("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    /* renamed from: d */
    public static synchronized String m14226d() {
        String sb;
        synchronized (C4673fl.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f8722b);
            long j = f8720a;
            f8720a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public int mo25112a() {
        return this.f8723a.mo24954c();
    }

    /* renamed from: a */
    public String m14228a() {
        return this.f8723a.mo24954c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer m14229a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(mo25122c());
        }
        byteBuffer.putShort(this.f8725a);
        byteBuffer.putShort((short) this.f8723a.mo24930a());
        byteBuffer.putInt(this.f8726b.length);
        int position = byteBuffer.position();
        this.f8723a.mo24933a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f8723a.mo24930a());
        byteBuffer.position(position + this.f8723a.mo24930a());
        byteBuffer.put(this.f8726b);
        return byteBuffer;
    }

    /* renamed from: a */
    public short m14230a() {
        return this.f8725a;
    }

    /* renamed from: a */
    public void mo25114a(int i) {
        this.f8723a.mo24949a(i);
    }

    /* renamed from: a */
    public void mo25115a(long j, String str, String str2) {
        if (j != 0) {
            this.f8723a.mo24950a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f8723a.mo24951a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f8723a.mo24953b(str2);
        }
    }

    /* renamed from: a */
    public void mo25116a(String str) {
        this.f8723a.mo24961e(str);
    }

    /* renamed from: a */
    public void mo25117a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f8723a.mo24956c(str);
            this.f8723a.mo24930a();
            if (!TextUtils.isEmpty(str2)) {
                this.f8723a.mo24959d(str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("command should not be empty");
    }

    /* renamed from: a */
    public void mo25118a(short s) {
        this.f8725a = s;
    }

    /* renamed from: a */
    public void mo25119a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8723a.mo24955c(1);
            this.f8726b = C4877ay.m15654a(C4877ay.m15652a(str, mo25124e()), bArr);
            return;
        }
        this.f8723a.mo24955c(0);
        this.f8726b = bArr;
    }

    /* renamed from: a */
    public boolean m14237a() {
        return this.f8723a.mo24967j();
    }

    /* renamed from: a */
    public byte[] m14238a() {
        return this.f8726b;
    }

    /* renamed from: a */
    public byte[] m14239a(String str) {
        if (this.f8723a.mo24960e() == 1) {
            return C4877ay.m15654a(C4877ay.m15652a(str, mo25124e()), this.f8726b);
        }
        if (this.f8723a.mo24960e() == 0) {
            return this.f8726b;
        }
        C3989b.m10669a("unknow cipher = " + this.f8723a.mo24960e());
        return this.f8726b;
    }

    /* renamed from: b */
    public int mo25120b() {
        return this.f8723a.mo24962f();
    }

    /* renamed from: b */
    public String m14241b() {
        return this.f8723a.mo24957d();
    }

    /* renamed from: b */
    public void mo25121b(String str) {
        this.f8724a = str;
    }

    /* renamed from: c */
    public int mo25122c() {
        return this.f8723a.mo24936b() + 8 + this.f8726b.length;
    }

    /* renamed from: c */
    public String m14244c() {
        return this.f8723a.mo24962f();
    }

    /* renamed from: c */
    public void mo25123c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("@");
            try {
                long parseLong = Long.parseLong(str.substring(0, indexOf));
                int indexOf2 = str.indexOf(MiotCloudImpl.COOKIE_PATH, indexOf);
                String substring = str.substring(indexOf + 1, indexOf2);
                String substring2 = str.substring(indexOf2 + 1);
                this.f8723a.mo24950a(parseLong);
                this.f8723a.mo24951a(substring);
                this.f8723a.mo24953b(substring2);
            } catch (Exception e) {
                C3989b.m10669a("Blob parse user err " + e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public String mo25124e() {
        String e = this.f8723a.mo24960e();
        if ("ID_NOT_AVAILABLE".equals(e)) {
            return null;
        }
        if (this.f8723a.mo24964g()) {
            return e;
        }
        String d = m14226d();
        this.f8723a.mo24961e(d);
        return d;
    }

    /* renamed from: f */
    public String mo25125f() {
        return this.f8724a;
    }

    /* renamed from: g */
    public String mo25126g() {
        if (!this.f8723a.mo24936b()) {
            return null;
        }
        return Long.toString(this.f8723a.mo24930a()) + "@" + this.f8723a.mo24930a() + MiotCloudImpl.COOKIE_PATH + this.f8723a.mo24936b();
    }

    public String toString() {
        return "Blob [chid=" + mo25112a() + "; Id=" + mo25124e() + "; cmd=" + mo25112a() + "; type=" + mo25112a() + "; from=" + mo25126g() + " ]";
    }
}
