package com.google.firebase.crashlytics.p110c.p118m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2876d;
import com.google.firebase.crashlytics.p110c.p112g.C2948r;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c;
import com.google.firebase.crashlytics.p110c.p118m.p120d.C3013b;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3029b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.c.m.b */
public class C3001b {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final short[] f5835h = {10, 20, 30, 60, 120, 300};

    /* renamed from: a */
    private final C3013b f5836a;
    @Nullable

    /* renamed from: b */
    private final String f5837b;

    /* renamed from: c */
    private final String f5838c;

    /* renamed from: d */
    private final C2948r f5839d;

    /* renamed from: e */
    private final C3000a f5840e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3002a f5841f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Thread f5842g;

    /* renamed from: com.google.firebase.crashlytics.c.m.b$a */
    public interface C3002a {
        /* renamed from: a */
        boolean mo17239a();
    }

    /* renamed from: com.google.firebase.crashlytics.c.m.b$b */
    public interface C3003b {
        /* renamed from: a */
        C3001b mo17261a(@NonNull C3029b bVar);
    }

    /* renamed from: com.google.firebase.crashlytics.c.m.b$c */
    public interface C3004c {
        /* renamed from: a */
        File[] mo17235a();

        /* renamed from: b */
        File[] mo17236b();
    }

    /* renamed from: com.google.firebase.crashlytics.c.m.b$d */
    private class C3005d extends C2876d {

        /* renamed from: a */
        private final List<C3008c> f5843a;

        /* renamed from: b */
        private final boolean f5844b;

        /* renamed from: c */
        private final float f5845c;

        C3005d(List<C3008c> list, boolean z, float f) {
            this.f5843a = list;
            this.f5844b = z;
            this.f5845c = f;
        }

        /* renamed from: c */
        private void m9311c(List<C3008c> list, boolean z) {
            C2857b f = C2857b.m8687f();
            f.mo17130b("Starting report processing in " + this.f5845c + " second(s)...");
            float f2 = this.f5845c;
            if (f2 > 0.0f) {
                try {
                    Thread.sleep((long) (f2 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (!C3001b.this.f5841f.mo17239a()) {
                int i = 0;
                while (list.size() > 0 && !C3001b.this.f5841f.mo17239a()) {
                    C2857b f3 = C2857b.m8687f();
                    f3.mo17130b("Attempting to send " + list.size() + " report(s)");
                    ArrayList arrayList = new ArrayList();
                    for (C3008c next : list) {
                        if (!C3001b.this.mo17398d(next, z)) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.size() > 0) {
                        int i2 = i + 1;
                        long j = (long) C3001b.f5835h[Math.min(i, C3001b.f5835h.length - 1)];
                        C2857b f4 = C2857b.m8687f();
                        f4.mo17130b("Report submission: scheduling delayed retry in " + j + " seconds");
                        Thread.sleep(j * 1000);
                        i = i2;
                    }
                    list = arrayList;
                }
            }
        }

        /* renamed from: b */
        public void mo17164b() {
            try {
                m9311c(this.f5843a, this.f5844b);
            } catch (Exception e) {
                C2857b.m8687f().mo17133e("An unexpected error occurred while attempting to upload crash reports.", e);
            }
            Thread unused = C3001b.this.f5842g = null;
        }
    }

    public C3001b(@Nullable String str, String str2, C2948r rVar, C3000a aVar, C3013b bVar, C3002a aVar2) {
        if (bVar != null) {
            this.f5836a = bVar;
            this.f5837b = str;
            this.f5838c = str2;
            this.f5839d = rVar;
            this.f5840e = aVar;
            this.f5841f = aVar2;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060 A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17398d(com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            com.google.firebase.crashlytics.c.m.c.a r1 = new com.google.firebase.crashlytics.c.m.c.a     // Catch:{ Exception -> 0x0067 }
            java.lang.String r2 = r5.f5837b     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r5.f5838c     // Catch:{ Exception -> 0x0067 }
            r1.<init>(r2, r3, r6)     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.c.g.r r2 = r5.f5839d     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.c.g.r r3 = com.google.firebase.crashlytics.p110c.p112g.C2948r.ALL     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            if (r2 != r3) goto L_0x001b
            com.google.firebase.crashlytics.c.b r7 = com.google.firebase.crashlytics.p110c.C2857b.m8687f()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = "Send to Reports Endpoint disabled. Removing Reports Endpoint report."
        L_0x0017:
            r7.mo17130b(r1)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0030
        L_0x001b:
            com.google.firebase.crashlytics.c.g.r r2 = r5.f5839d     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.c.g.r r3 = com.google.firebase.crashlytics.p110c.p112g.C2948r.JAVA_ONLY     // Catch:{ Exception -> 0x0067 }
            if (r2 != r3) goto L_0x0032
            com.google.firebase.crashlytics.c.m.c.c$a r2 = r6.getType()     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.c.m.c.c$a r3 = com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c.C3009a.JAVA     // Catch:{ Exception -> 0x0067 }
            if (r2 != r3) goto L_0x0032
            com.google.firebase.crashlytics.c.b r7 = com.google.firebase.crashlytics.p110c.C2857b.m8687f()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = "Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report."
            goto L_0x0017
        L_0x0030:
            r7 = 1
            goto L_0x005e
        L_0x0032:
            com.google.firebase.crashlytics.c.m.d.b r2 = r5.f5836a     // Catch:{ Exception -> 0x0067 }
            boolean r7 = r2.mo17407b(r1, r7)     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.c.b r1 = com.google.firebase.crashlytics.p110c.C2857b.m8687f()     // Catch:{ Exception -> 0x0067 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
            r2.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = "Crashlytics Reports Endpoint upload "
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            if (r7 == 0) goto L_0x004b
            java.lang.String r3 = "complete: "
            goto L_0x004d
        L_0x004b:
            java.lang.String r3 = "FAILED: "
        L_0x004d:
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r6.mo17401b()     // Catch:{ Exception -> 0x0067 }
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0067 }
            r1.mo17134g(r2)     // Catch:{ Exception -> 0x0067 }
        L_0x005e:
            if (r7 == 0) goto L_0x0080
            com.google.firebase.crashlytics.c.m.a r7 = r5.f5840e     // Catch:{ Exception -> 0x0067 }
            r7.mo17395b(r6)     // Catch:{ Exception -> 0x0067 }
            r0 = 1
            goto L_0x0080
        L_0x0067:
            r7 = move-exception
            com.google.firebase.crashlytics.c.b r1 = com.google.firebase.crashlytics.p110c.C2857b.m8687f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error occurred sending report "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.mo17133e(r6, r7)
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p110c.p118m.C3001b.mo17398d(com.google.firebase.crashlytics.c.m.c.c, boolean):boolean");
    }

    /* renamed from: e */
    public synchronized void mo17399e(List<C3008c> list, boolean z, float f) {
        if (this.f5842g != null) {
            C2857b.m8687f().mo17130b("Report upload has already been started.");
            return;
        }
        Thread thread = new Thread(new C3005d(list, z, f), "Crashlytics Report Uploader");
        this.f5842g = thread;
        thread.start();
    }
}
