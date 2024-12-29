package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.service.C4860ap;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* renamed from: com.xiaomi.push.fm */
class C4674fm {

    /* renamed from: a */
    private C4676fo f8727a;

    /* renamed from: a */
    private C4678fq f8728a;

    /* renamed from: a */
    private InputStream f8729a;

    /* renamed from: a */
    private ByteBuffer f8730a = ByteBuffer.allocate(2048);

    /* renamed from: a */
    private Adler32 f8731a = new Adler32();

    /* renamed from: a */
    private volatile boolean f8732a;

    /* renamed from: a */
    private byte[] f8733a;

    /* renamed from: b */
    private ByteBuffer f8734b = ByteBuffer.allocate(4);

    C4674fm(InputStream inputStream, C4678fq fqVar) {
        this.f8729a = new BufferedInputStream(inputStream);
        this.f8728a = fqVar;
        this.f8727a = new C4676fo();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer mo25128a() {
        /*
            r8 = this;
            java.nio.ByteBuffer r0 = r8.f8730a
            r0.clear()
            java.nio.ByteBuffer r0 = r8.f8730a
            r1 = 8
            r8.m14250a(r0, r1)
            java.nio.ByteBuffer r0 = r8.f8730a
            r1 = 0
            short r0 = r0.getShort(r1)
            java.nio.ByteBuffer r2 = r8.f8730a
            r3 = 2
            short r2 = r2.getShort(r3)
            r3 = -15618(0xffffffffffffc2fe, float:NaN)
            if (r0 != r3) goto L_0x0102
            r0 = 5
            if (r2 != r0) goto L_0x0102
            java.nio.ByteBuffer r0 = r8.f8730a
            r2 = 4
            int r0 = r0.getInt(r2)
            java.nio.ByteBuffer r3 = r8.f8730a
            int r3 = r3.position()
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r0 > r4) goto L_0x00fa
            int r4 = r0 + 4
            java.nio.ByteBuffer r5 = r8.f8730a
            int r5 = r5.remaining()
            if (r4 <= r5) goto L_0x005c
            int r4 = r0 + 2048
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteBuffer r5 = r8.f8730a
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.f8730a
            int r6 = r6.arrayOffset()
            java.nio.ByteBuffer r7 = r8.f8730a
            int r7 = r7.position()
            int r6 = r6 + r7
            r4.put(r5, r1, r6)
        L_0x0059:
            r8.f8730a = r4
            goto L_0x0085
        L_0x005c:
            java.nio.ByteBuffer r4 = r8.f8730a
            int r4 = r4.capacity()
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 <= r5) goto L_0x0085
            r4 = 2048(0x800, float:2.87E-42)
            if (r0 >= r4) goto L_0x0085
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteBuffer r5 = r8.f8730a
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.f8730a
            int r6 = r6.arrayOffset()
            java.nio.ByteBuffer r7 = r8.f8730a
            int r7 = r7.position()
            int r6 = r6 + r7
            r4.put(r5, r1, r6)
            goto L_0x0059
        L_0x0085:
            java.nio.ByteBuffer r4 = r8.f8730a
            r8.m14250a(r4, r0)
            java.nio.ByteBuffer r4 = r8.f8734b
            r4.clear()
            java.nio.ByteBuffer r4 = r8.f8734b
            r8.m14250a(r4, r2)
            java.nio.ByteBuffer r2 = r8.f8734b
            r2.position(r1)
            java.nio.ByteBuffer r2 = r8.f8734b
            int r2 = r2.getInt()
            java.util.zip.Adler32 r4 = r8.f8731a
            r4.reset()
            java.util.zip.Adler32 r4 = r8.f8731a
            java.nio.ByteBuffer r5 = r8.f8730a
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.f8730a
            int r6 = r6.position()
            r4.update(r5, r1, r6)
            java.util.zip.Adler32 r1 = r8.f8731a
            long r4 = r1.getValue()
            int r1 = (int) r4
            if (r2 != r1) goto L_0x00cf
            byte[] r1 = r8.f8733a
            if (r1 == 0) goto L_0x00cc
            java.nio.ByteBuffer r2 = r8.f8730a
            byte[] r2 = r2.array()
            r4 = 1
            com.xiaomi.push.service.C4877ay.m15655a(r1, r2, r4, r3, r0)
        L_0x00cc:
            java.nio.ByteBuffer r0 = r8.f8730a
            return r0
        L_0x00cf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CRC = "
            r0.append(r1)
            java.util.zip.Adler32 r1 = r8.f8731a
            long r3 = r1.getValue()
            int r1 = (int) r3
            r0.append(r1)
            java.lang.String r1 = " and "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted Blob bad CRC"
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Blob size too large"
            r0.<init>(r1)
            throw r0
        L_0x0102:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Malformed Input"
            r0.<init>(r1)
            goto L_0x010b
        L_0x010a:
            throw r0
        L_0x010b:
            goto L_0x010a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4674fm.mo25128a():java.nio.ByteBuffer");
    }

    /* renamed from: a */
    private void m14250a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.f8729a.read(byteBuffer.array(), position, i);
            if (read != -1) {
                i -= read;
                position += read;
            } else {
                throw new EOFException();
            }
        } while (i > 0);
        byteBuffer.position(position);
    }

    /* renamed from: c */
    private void m14251c() {
        C4673fl a;
        StringBuilder sb;
        String sb2;
        boolean z = false;
        this.f8732a = false;
        C4673fl a2 = mo25128a();
        if ("CONN".equals(a2.mo25112a())) {
            C4632ek.C4638f a3 = C4632ek.C4638f.m13986a(a2.mo25112a());
            if (a3.mo24930a()) {
                this.f8728a.mo25148a(a3.mo24930a());
                z = true;
            }
            if (a3.mo25014c()) {
                C4632ek.C4634b a4 = a3.mo24930a();
                C4673fl flVar = new C4673fl();
                flVar.mo25117a("SYNC", "CONF");
                flVar.mo25119a(a4.mo24930a(), (String) null);
                this.f8728a.mo25136a(flVar);
            }
            C3989b.m10669a("[Slim] CONN: host = " + a3.mo24936b());
        }
        if (z) {
            this.f8733a = this.f8728a.mo25134a();
            while (!this.f8732a) {
                a = mo25128a();
                this.f8728a.mo25155c();
                short a5 = a.mo25112a();
                if (a5 != 1) {
                    if (a5 != 2) {
                        if (a5 != 3) {
                            sb2 = "[Slim] unknow blob type " + a.mo25112a();
                        } else {
                            try {
                                this.f8728a.mo25143b(this.f8727a.mo25133a(a.mo25112a(), this.f8728a));
                            } catch (Exception e) {
                                e = e;
                                sb = new StringBuilder();
                            }
                        }
                    } else if ("SECMSG".equals(a.mo25112a()) && ((a.mo25112a() == 2 || a.mo25112a() == 3) && TextUtils.isEmpty(a.mo25120b()))) {
                        try {
                            this.f8728a.mo25143b(this.f8727a.mo25133a(a.mo25116a(C4860ap.mo25920a().mo25921a(Integer.valueOf(a.mo25112a()).toString(), a.mo25126g()).f9999h), this.f8728a));
                        } catch (Exception e2) {
                            e = e2;
                            sb = new StringBuilder();
                        }
                    }
                    C3989b.m10669a(sb2);
                }
                this.f8728a.mo25136a(a);
            }
            return;
        }
        C3989b.m10669a("[Slim] Invalid CONN");
        throw new IOException("Invalid Connection");
        sb.append("[Slim] Parse packet from Blob chid=");
        sb.append(a.mo25112a());
        sb.append("; Id=");
        sb.append(a.mo25124e());
        sb.append(" failure:");
        sb.append(e.getMessage());
        sb2 = sb.toString();
        C3989b.m10669a(sb2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.C4673fl m14252a() {
        /*
            r6 = this;
            r0 = 0
            java.nio.ByteBuffer r1 = r6.mo25128a()     // Catch:{ IOException -> 0x0055 }
            int r2 = r1.position()     // Catch:{ IOException -> 0x0055 }
            r1.flip()     // Catch:{ IOException -> 0x0053 }
            r3 = 8
            r1.position(r3)     // Catch:{ IOException -> 0x0053 }
            if (r2 != r3) goto L_0x0019
            com.xiaomi.push.fp r1 = new com.xiaomi.push.fp     // Catch:{ IOException -> 0x0053 }
            r1.<init>()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0021
        L_0x0019:
            java.nio.ByteBuffer r1 = r1.slice()     // Catch:{ IOException -> 0x0053 }
            com.xiaomi.push.fl r1 = com.xiaomi.push.C4673fl.mo25113a((java.nio.ByteBuffer) r1)     // Catch:{ IOException -> 0x0053 }
        L_0x0021:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0053 }
            r3.<init>()     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = "[Slim] Read {cmd="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = r1.mo25112a()     // Catch:{ IOException -> 0x0053 }
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = ";chid="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            int r4 = r1.mo25112a()     // Catch:{ IOException -> 0x0053 }
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = ";len="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            r3.append(r2)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = "}"
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0053 }
            com.xiaomi.channel.commonutils.logger.C3989b.m10680c(r3)     // Catch:{ IOException -> 0x0053 }
            return r1
        L_0x0053:
            r1 = move-exception
            goto L_0x0057
        L_0x0055:
            r1 = move-exception
            r2 = 0
        L_0x0057:
            if (r2 != 0) goto L_0x005f
            java.nio.ByteBuffer r2 = r6.f8730a
            int r2 = r2.position()
        L_0x005f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[Slim] read Blob ["
            r3.append(r4)
            java.nio.ByteBuffer r4 = r6.f8730a
            byte[] r4 = r4.array()
            r5 = 128(0x80, float:1.794E-43)
            if (r2 <= r5) goto L_0x0075
            r2 = 128(0x80, float:1.794E-43)
        L_0x0075:
            java.lang.String r0 = com.xiaomi.push.C4495af.m13263a(r4, r0, r2)
            r3.append(r0)
            java.lang.String r0 = "] Err:"
            r3.append(r0)
            java.lang.String r0 = r1.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4674fm.m14252a():com.xiaomi.push.fl");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14253a() {
        try {
            m14251c();
        } catch (IOException e) {
            if (!this.f8732a) {
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo25129b() {
        this.f8732a = true;
    }
}
