package com.yeelight.yeelib.p187h;

import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yeelight.yeelib.p187h.p189h.C9873a;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10543g;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0684t;
import p156f.C4322b0;
import p156f.C4336d0;
import p156f.C4392v;
import p173j.C11574d;
import p173j.C4446b;
import p173j.C4476l;

/* renamed from: com.yeelight.yeelib.h.e */
public class C9863e {

    /* renamed from: c */
    public static final String f17919c = "e";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C0664f f17920d = new C0664f();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9865b f17921a;

    /* renamed from: b */
    private C4446b<C4336d0> f17922b;

    /* renamed from: com.yeelight.yeelib.h.e$a */
    class C9864a implements C11574d<C4336d0> {

        /* renamed from: a */
        final /* synthetic */ Class f17923a;

        /* renamed from: b */
        final /* synthetic */ C9874b f17924b;

        C9864a(Class cls, C9874b bVar) {
            this.f17923a = cls;
            this.f17924b = bVar;
        }

        /* renamed from: a */
        public void mo31921a(@NonNull C4446b<C4336d0> bVar, @NonNull Throwable th) {
            try {
                if (!bVar.mo24526K()) {
                    this.f17924b.onFailure(10001, th.getMessage());
                    String str = C9863e.f17919c;
                    C10543g.m25740a(str, C9863e.this.f17921a.f17926a + " return:\n" + th.getMessage());
                }
            } catch (Exception e) {
                String str2 = C9863e.f17919c;
                C10543g.m25741b(str2, C9863e.this.f17921a.f17926a + " return:\n" + e.getMessage());
            }
        }

        /* renamed from: b */
        public void mo31922b(@NonNull C4446b<C4336d0> bVar, @NonNull C4476l<C4336d0> lVar) {
            String str;
            String str2;
            C9874b bVar2;
            Object obj;
            try {
                if (lVar.mo24564d()) {
                    try {
                        C4336d0 a = lVar.mo24562a();
                        if (a != null) {
                            String str3 = new String(a.mo23900b());
                            if (TextUtils.equals(this.f17923a.getSimpleName(), Void.class.getSimpleName())) {
                                this.f17924b.mo23475a(null);
                            } else {
                                if (TextUtils.equals(this.f17923a.getSimpleName(), String.class.getSimpleName())) {
                                    bVar2 = this.f17924b;
                                    obj = str3;
                                } else {
                                    bVar2 = this.f17924b;
                                    obj = C9863e.f17920d.mo8704i(str3, this.f17923a);
                                }
                                bVar2.mo23475a(obj);
                            }
                            a.close();
                            return;
                        }
                        this.f17924b.onFailure(10001, "data null");
                    } catch (UnsupportedEncodingException e) {
                        String str4 = "Parse failure:UnsupportedEncodingException:" + e.getMessage();
                        this.f17924b.onFailure(10000, str4);
                        str = C9863e.f17919c;
                        str2 = C9863e.this.f17921a.f17926a + " return:\n" + str4;
                        C10543g.m25741b(str, str2);
                    } catch (C0684t e2) {
                        String str5 = "Parse failure:JsonSyntaxException:" + e2.getMessage();
                        this.f17924b.onFailure(10000, str5);
                        str = C9863e.f17919c;
                        str2 = C9863e.this.f17921a.f17926a + " return:\n" + str5;
                        C10543g.m25741b(str, str2);
                    } catch (Exception e3) {
                        this.f17924b.onFailure(10000, "Request error:" + e3.getMessage());
                        str = C9863e.f17919c;
                        str2 = C9863e.this.f17921a.f17926a + " return:\n" + e3.getMessage();
                        C10543g.m25741b(str, str2);
                    }
                } else {
                    this.f17924b.onFailure(lVar.mo24563b(), lVar.mo24565e());
                    C10543g.m25740a(C9863e.f17919c, C9863e.this.f17921a.f17926a + " return:\n" + lVar.mo24565e());
                }
            } catch (Exception e4) {
                C10543g.m25741b(C9863e.f17919c, C9863e.this.f17921a.f17926a + " return:\n" + e4.getMessage());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.h.e$b */
    public static final class C9865b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f17926a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Map<String, String> f17927b = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Map<String, String> f17928c = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C9859a f17929d = C9859a.DEFAULT;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f17930e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public File f17931f;

        /* renamed from: i */
        private void m24163i(Map<String, String> map) {
            for (String next : map.keySet()) {
                if (map.get(next) == null) {
                    map.put(next, "");
                }
            }
        }

        /* renamed from: g */
        public C9865b mo31923g(String str) {
            this.f17930e = str;
            return this;
        }

        /* renamed from: h */
        public C9863e mo31924h() {
            return new C9863e(this, (C9864a) null);
        }

        /* renamed from: j */
        public C9865b mo31925j(C9859a aVar) {
            this.f17929d = aVar;
            return this;
        }

        /* renamed from: k */
        public C9865b mo31926k(Map<String, String> map) {
            if (map != null) {
                this.f17928c.clear();
                this.f17928c.putAll(map);
                m24163i(this.f17928c);
            }
            return this;
        }

        /* renamed from: l */
        public C9865b mo31927l(Map<String, String> map) {
            if (map != null) {
                this.f17927b.clear();
                this.f17927b.putAll(map);
                m24163i(this.f17927b);
            }
            return this;
        }

        /* renamed from: m */
        public C9865b mo31928m(String str) {
            this.f17926a = str;
            return this;
        }
    }

    /* renamed from: com.yeelight.yeelib.h.e$c */
    static class C9866c extends AsyncTask<Void, Long, Void> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public File f17932a;

        /* renamed from: b */
        private C4446b<C4336d0> f17933b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C9874b f17934c;

        /* renamed from: com.yeelight.yeelib.h.e$c$a */
        class C9867a implements C11574d<C4336d0> {
            C9867a() {
            }

            /* renamed from: a */
            public void mo31921a(@NonNull C4446b<C4336d0> bVar, @NonNull Throwable th) {
                try {
                    C9866c.this.f17934c.onFailure(10001, th.getMessage());
                    C10543g.m25740a(C9863e.f17919c, th.getMessage());
                } catch (Exception e) {
                    C10543g.m25741b(C9863e.f17919c, e.getMessage());
                }
            }

            /* renamed from: b */
            public void mo31922b(@NonNull C4446b<C4336d0> bVar, @NonNull C4476l<C4336d0> lVar) {
                String str;
                String e;
                C9874b a;
                String str2;
                try {
                    if (lVar.mo24564d()) {
                        try {
                            C4336d0 a2 = lVar.mo24562a();
                            if (a2 == null) {
                                a = C9866c.this.f17934c;
                                str2 = "file null";
                            } else if (C9863e.m24150k(a2, C9866c.this.f17932a)) {
                                C9866c.this.f17934c.mo23475a(C9866c.this.f17932a);
                                return;
                            } else {
                                a = C9866c.this.f17934c;
                                str2 = "write error";
                            }
                            a.onFailure(10001, str2);
                        } catch (Exception e2) {
                            C9866c.this.f17934c.onFailure(10001, e2.getMessage());
                            str = C9863e.f17919c;
                            e = e2.getMessage();
                        }
                    } else {
                        C9866c.this.f17934c.onFailure(lVar.mo24563b(), lVar.mo24565e());
                        str = C9863e.f17919c;
                        e = lVar.mo24565e();
                        C10543g.m25740a(str, e);
                    }
                } catch (Exception e3) {
                    C10543g.m25741b(C9863e.f17919c, e3.getMessage());
                }
            }
        }

        private C9866c(File file, C4446b<C4336d0> bVar, C9874b bVar2) {
            this.f17932a = file;
            this.f17933b = bVar;
            this.f17934c = bVar2;
        }

        /* synthetic */ C9866c(File file, C4446b bVar, C9874b bVar2, C9864a aVar) {
            this(file, bVar, bVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Void doInBackground(Void... voidArr) {
            C4446b<C4336d0> bVar = this.f17933b;
            if (bVar == null) {
                return null;
            }
            bVar.mo24528n(new C9867a());
            return null;
        }
    }

    private C9863e(C9865b bVar) {
        this.f17921a = bVar;
    }

    /* synthetic */ C9863e(C9865b bVar, C9864a aVar) {
        this(bVar);
    }

    /* renamed from: e */
    private <T> void m24147e(C4446b<C4336d0> bVar, Class<T> cls, C9874b<T> bVar2) {
        if (bVar != null && bVar2 != null) {
            bVar.mo24528n(new C9864a(cls, bVar2));
        }
    }

    /* renamed from: g */
    private C4322b0 m24148g(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return C4322b0.m12219d(C4392v.m12671d("application/json"), str);
            }
            return null;
        } catch (Exception e) {
            String str2 = f17919c;
            C10543g.m25741b(str2, "getRequestBody msg = " + e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    private C4322b0 m24149h(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return C4322b0.m12219d(C4392v.m12671d("text/plain"), str);
            }
            return null;
        } catch (Exception e) {
            String str2 = f17919c;
            C10543g.m25741b(str2, "getRequestBody msg = " + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A[SYNTHETIC, Splitter:B:28:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f A[Catch:{ IOException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066 A[Catch:{ IOException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b A[Catch:{ IOException -> 0x006f }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24150k(p156f.C4336d0 r10, java.io.File r11) {
        /*
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            r2 = 0
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0063, all -> 0x0056 }
            long r3 = r10.mo23838h()     // Catch:{ IOException -> 0x0063, all -> 0x0056 }
            r5 = 0
            java.io.InputStream r10 = r10.mo23899a()     // Catch:{ IOException -> 0x0063, all -> 0x0056 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0053, all -> 0x004f }
            r7.<init>(r11)     // Catch:{ IOException -> 0x0053, all -> 0x004f }
        L_0x0015:
            int r11 = r10.read(r0)     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            r1 = -1
            if (r11 != r1) goto L_0x0029
            r7.flush()     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            r11 = 1
            if (r10 == 0) goto L_0x0025
            r10.close()     // Catch:{ IOException -> 0x006f }
        L_0x0025:
            r7.close()     // Catch:{ IOException -> 0x006f }
            return r11
        L_0x0029:
            r7.write(r0, r2, r11)     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            long r8 = (long) r11     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            long r5 = r5 + r8
            java.lang.String r11 = f17919c     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            r1.<init>()     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            java.lang.String r8 = "file download: "
            r1.append(r8)     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            r1.append(r5)     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            java.lang.String r8 = " of "
            r1.append(r8)     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            r1.append(r3)     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            com.yeelight.yeelib.utils.C10543g.m25740a(r11, r1)     // Catch:{ IOException -> 0x0054, all -> 0x004d }
            goto L_0x0015
        L_0x004d:
            r11 = move-exception
            goto L_0x0051
        L_0x004f:
            r11 = move-exception
            r7 = r1
        L_0x0051:
            r1 = r10
            goto L_0x0058
        L_0x0053:
            r7 = r1
        L_0x0054:
            r1 = r10
            goto L_0x0064
        L_0x0056:
            r11 = move-exception
            r7 = r1
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x005d:
            if (r7 == 0) goto L_0x0062
            r7.close()     // Catch:{ IOException -> 0x006f }
        L_0x0062:
            throw r11     // Catch:{ IOException -> 0x006f }
        L_0x0063:
            r7 = r1
        L_0x0064:
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x0069:
            if (r7 == 0) goto L_0x006f
            r7.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p187h.C9863e.m24150k(f.d0, java.io.File):boolean");
    }

    /* renamed from: d */
    public <T> void mo31917d(Class<T> cls, C9874b<T> bVar) {
        C9873a a = C9868f.m24175b().mo31931a();
        if (a != null) {
            this.f17922b = TextUtils.isEmpty(this.f17921a.f17930e) ? a.mo31935c(this.f17921a.f17928c, this.f17921a.f17926a, this.f17921a.f17927b) : a.mo31939g(this.f17921a.f17928c, m24149h(this.f17921a.f17930e), this.f17921a.f17926a, this.f17921a.f17927b);
            m24147e(this.f17922b, cls, bVar);
        }
    }

    /* renamed from: f */
    public <T> void mo31918f(Class<T> cls, C9874b<T> bVar) {
        C9873a a = C9868f.m24175b().mo31931a();
        if (a == null) {
            return;
        }
        if (this.f17921a.f17931f == null) {
            C4446b<C4336d0> e = a.mo31937e(this.f17921a.f17928c, this.f17921a.f17926a, this.f17921a.f17927b);
            this.f17922b = e;
            m24147e(e, cls, bVar);
            return;
        }
        this.f17922b = a.mo31933a(this.f17921a.f17928c, this.f17921a.f17926a, this.f17921a.f17927b);
        new C9866c(this.f17921a.f17931f, this.f17922b, bVar, (C9864a) null).execute(new Void[0]);
    }

    /* renamed from: i */
    public <T> void mo31919i(Class<T> cls, C9874b<T> bVar) {
        C4446b<C4336d0> bVar2;
        C4322b0 b0Var;
        Map map;
        if (this.f17921a.f17927b == null || this.f17921a.f17927b.size() <= 0 || TextUtils.isEmpty(this.f17921a.f17930e)) {
            C9873a a = C9868f.m24175b().mo31931a();
            if (a != null) {
                if (!TextUtils.isEmpty(this.f17921a.f17930e)) {
                    if (C9859a.JSON == this.f17921a.f17929d) {
                        map = this.f17921a.f17928c;
                        b0Var = m24148g(this.f17921a.f17930e);
                    } else {
                        map = this.f17921a.f17928c;
                        b0Var = m24149h(this.f17921a.f17930e);
                    }
                    bVar2 = a.mo31938f(map, b0Var, this.f17921a.f17926a);
                } else {
                    bVar2 = a.mo31934b(this.f17921a.f17928c, this.f17921a.f17926a, this.f17921a.f17927b);
                }
                this.f17922b = bVar2;
                m24147e(this.f17922b, cls, bVar);
                return;
            }
            return;
        }
        bVar.onFailure(10001, "param error");
    }

    /* renamed from: j */
    public <T> void mo31920j(Class<T> cls, C9874b<T> bVar) {
        C9873a a = C9868f.m24175b().mo31931a();
        if (a != null) {
            C4446b<C4336d0> d = a.mo31936d(this.f17921a.f17928c, m24149h(this.f17921a.f17930e), this.f17921a.f17926a, this.f17921a.f17927b);
            this.f17922b = d;
            m24147e(d, cls, bVar);
        }
    }
}
