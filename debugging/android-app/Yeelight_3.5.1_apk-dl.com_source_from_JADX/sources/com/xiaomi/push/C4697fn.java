package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.service.C4906bg;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* renamed from: com.xiaomi.push.fn */
class C4697fn {

    /* renamed from: a */
    private Context f8175a;

    /* renamed from: a */
    private C4704fq f8176a;

    /* renamed from: a */
    private C4706fs f8177a;

    /* renamed from: a */
    private InputStream f8178a;

    /* renamed from: a */
    private ByteBuffer f8179a = ByteBuffer.allocate(2048);

    /* renamed from: a */
    private Adler32 f8180a = new Adler32();

    /* renamed from: a */
    private volatile boolean f8181a;

    /* renamed from: a */
    private byte[] f8182a;

    /* renamed from: b */
    private ByteBuffer f8183b = ByteBuffer.allocate(4);

    C4697fn(InputStream inputStream, C4706fs fsVar, Context context) {
        this.f8178a = new BufferedInputStream(inputStream);
        this.f8177a = fsVar;
        this.f8176a = new C4704fq();
        this.f8175a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer mo29162a() {
        /*
            r8 = this;
            java.nio.ByteBuffer r0 = r8.f8179a
            r0.clear()
            java.nio.ByteBuffer r0 = r8.f8179a
            r1 = 8
            r8.m13889a(r0, r1)
            java.nio.ByteBuffer r0 = r8.f8179a
            r1 = 0
            short r0 = r0.getShort(r1)
            java.nio.ByteBuffer r2 = r8.f8179a
            r3 = 2
            short r2 = r2.getShort(r3)
            r3 = -15618(0xffffffffffffc2fe, float:NaN)
            if (r0 != r3) goto L_0x0102
            r0 = 5
            if (r2 != r0) goto L_0x0102
            java.nio.ByteBuffer r0 = r8.f8179a
            r2 = 4
            int r0 = r0.getInt(r2)
            java.nio.ByteBuffer r3 = r8.f8179a
            int r3 = r3.position()
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r0 > r4) goto L_0x00fa
            int r4 = r0 + 4
            java.nio.ByteBuffer r5 = r8.f8179a
            int r5 = r5.remaining()
            if (r4 <= r5) goto L_0x005c
            int r4 = r0 + 2048
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteBuffer r5 = r8.f8179a
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.f8179a
            int r6 = r6.arrayOffset()
            java.nio.ByteBuffer r7 = r8.f8179a
            int r7 = r7.position()
            int r6 = r6 + r7
            r4.put(r5, r1, r6)
        L_0x0059:
            r8.f8179a = r4
            goto L_0x0085
        L_0x005c:
            java.nio.ByteBuffer r4 = r8.f8179a
            int r4 = r4.capacity()
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 <= r5) goto L_0x0085
            r4 = 2048(0x800, float:2.87E-42)
            if (r0 >= r4) goto L_0x0085
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteBuffer r5 = r8.f8179a
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.f8179a
            int r6 = r6.arrayOffset()
            java.nio.ByteBuffer r7 = r8.f8179a
            int r7 = r7.position()
            int r6 = r6 + r7
            r4.put(r5, r1, r6)
            goto L_0x0059
        L_0x0085:
            java.nio.ByteBuffer r4 = r8.f8179a
            r8.m13889a(r4, r0)
            java.nio.ByteBuffer r4 = r8.f8183b
            r4.clear()
            java.nio.ByteBuffer r4 = r8.f8183b
            r8.m13889a(r4, r2)
            java.nio.ByteBuffer r2 = r8.f8183b
            r2.position(r1)
            java.nio.ByteBuffer r2 = r8.f8183b
            int r2 = r2.getInt()
            java.util.zip.Adler32 r4 = r8.f8180a
            r4.reset()
            java.util.zip.Adler32 r4 = r8.f8180a
            java.nio.ByteBuffer r5 = r8.f8179a
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.f8179a
            int r6 = r6.position()
            r4.update(r5, r1, r6)
            java.util.zip.Adler32 r1 = r8.f8180a
            long r4 = r1.getValue()
            int r1 = (int) r4
            if (r2 != r1) goto L_0x00cf
            byte[] r1 = r8.f8182a
            if (r1 == 0) goto L_0x00cc
            java.nio.ByteBuffer r2 = r8.f8179a
            byte[] r2 = r2.array()
            r4 = 1
            com.xiaomi.push.service.C4923bp.m15453a(r1, r2, r4, r3, r0)
        L_0x00cc:
            java.nio.ByteBuffer r0 = r8.f8179a
            return r0
        L_0x00cf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CRC = "
            r0.append(r1)
            java.util.zip.Adler32 r1 = r8.f8180a
            long r3 = r1.getValue()
            int r1 = (int) r3
            r0.append(r1)
            java.lang.String r1 = " and "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4697fn.mo29162a():java.nio.ByteBuffer");
    }

    /* renamed from: a */
    private void m13889a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.f8178a.read(byteBuffer.array(), position, i);
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
    private void m13890c() {
        C4695fl a;
        StringBuilder sb;
        String sb2;
        boolean z = false;
        this.f8181a = false;
        C4695fl a2 = mo29162a();
        if ("CONN".equals(a2.mo29145a())) {
            C4637dx.C4643f a3 = C4637dx.C4643f.m13518a(a2.mo29145a());
            if (a3.mo28924a()) {
                this.f8177a.mo29186a(a3.mo28924a());
                z = true;
            }
            if (a3.mo29002c()) {
                C4637dx.C4639b a4 = a3.mo28924a();
                C4695fl flVar = new C4695fl();
                flVar.mo29150a("SYNC", "CONF");
                flVar.mo29152a(a4.mo28924a(), (String) null);
                this.f8177a.mo29172a(flVar);
            }
            C4408b.m12464a("[Slim] CONN: host = " + a3.mo28930b());
        }
        if (z) {
            this.f8182a = this.f8177a.mo29170a();
            while (!this.f8181a) {
                a = mo29162a();
                this.f8177a.mo29193c();
                short a5 = a.mo29145a();
                if (a5 != 1) {
                    if (a5 != 2) {
                        if (a5 != 3) {
                            sb2 = "[Slim] unknow blob type " + a.mo29145a();
                        } else {
                            try {
                                this.f8177a.mo29179b(this.f8176a.mo29169a(a.mo29145a(), this.f8177a));
                            } catch (Exception e) {
                                e = e;
                                sb = new StringBuilder();
                            }
                        }
                    } else if ("SECMSG".equals(a.mo29145a()) && ((a.mo29145a() == 2 || a.mo29145a() == 3) && TextUtils.isEmpty(a.mo29153b()))) {
                        try {
                            this.f8177a.mo29179b(this.f8176a.mo29169a(a.mo29149a(C4906bg.mo30005a().mo30006a(Integer.valueOf(a.mo29145a()).toString(), a.mo29160g()).f9548h), this.f8177a));
                        } catch (Exception e2) {
                            e = e2;
                            sb = new StringBuilder();
                        }
                    } else if (a.mo29145a() == 10) {
                        a.mo29154b(10);
                        a.f8170a.f9471a = C4995w.m15746a(this.f8175a);
                        a.f8170a.f9474b = C4551bj.m13003e(this.f8175a);
                        a.f8170a.f9470a = System.currentTimeMillis();
                        C4408b.m12482c("rcv blob from chid 10");
                    }
                    C4408b.m12464a(sb2);
                }
                this.f8177a.mo29172a(a);
            }
            return;
        }
        C4408b.m12464a("[Slim] Invalid CONN");
        throw new IOException("Invalid Connection");
        sb.append("[Slim] Parse packet from Blob chid=");
        sb.append(a.mo29145a());
        sb.append("; Id=");
        sb.append(a.mo29158e());
        sb.append(" failure:");
        sb.append(e.getMessage());
        sb2 = sb.toString();
        C4408b.m12464a(sb2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.C4695fl m13891a() {
        /*
            r6 = this;
            r0 = 0
            java.nio.ByteBuffer r1 = r6.mo29162a()     // Catch:{ IOException -> 0x0055 }
            int r2 = r1.position()     // Catch:{ IOException -> 0x0055 }
            r1.flip()     // Catch:{ IOException -> 0x0053 }
            r3 = 8
            r1.position(r3)     // Catch:{ IOException -> 0x0053 }
            if (r2 != r3) goto L_0x0019
            com.xiaomi.push.fr r1 = new com.xiaomi.push.fr     // Catch:{ IOException -> 0x0053 }
            r1.<init>()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0021
        L_0x0019:
            java.nio.ByteBuffer r1 = r1.slice()     // Catch:{ IOException -> 0x0053 }
            com.xiaomi.push.fl r1 = com.xiaomi.push.C4695fl.mo29146a((java.nio.ByteBuffer) r1)     // Catch:{ IOException -> 0x0053 }
        L_0x0021:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0053 }
            r3.<init>()     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = "[Slim] Read {cmd="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = r1.mo29145a()     // Catch:{ IOException -> 0x0053 }
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = ";chid="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            int r4 = r1.mo29145a()     // Catch:{ IOException -> 0x0053 }
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = ";len="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            r3.append(r2)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = "}"
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0053 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12482c(r3)     // Catch:{ IOException -> 0x0053 }
            return r1
        L_0x0053:
            r1 = move-exception
            goto L_0x0057
        L_0x0055:
            r1 = move-exception
            r2 = 0
        L_0x0057:
            if (r2 != 0) goto L_0x005f
            java.nio.ByteBuffer r2 = r6.f8179a
            int r2 = r2.position()
        L_0x005f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[Slim] read Blob ["
            r3.append(r4)
            java.nio.ByteBuffer r4 = r6.f8179a
            byte[] r4 = r4.array()
            r5 = 128(0x80, float:1.794E-43)
            if (r2 <= r5) goto L_0x0075
            r2 = 128(0x80, float:1.794E-43)
        L_0x0075:
            java.lang.String r0 = com.xiaomi.push.C4513ai.m12850a(r4, r0, r2)
            r3.append(r0)
            java.lang.String r0 = "] Err:"
            r3.append(r0)
            java.lang.String r0 = r1.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4697fn.m13891a():com.xiaomi.push.fl");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13892a() {
        try {
            m13890c();
        } catch (IOException e) {
            if (!this.f8181a) {
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29163b() {
        this.f8181a = true;
    }
}
