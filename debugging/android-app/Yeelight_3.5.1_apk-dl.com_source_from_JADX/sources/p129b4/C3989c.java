package p129b4;

import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.C2469e;
import com.google.gson.JsonSyntaxException;
import com.yeelight.yeelib.retrofit.ContentType;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.C3505a0;
import okhttp3.C3518c0;
import okhttp3.C3548v;
import p051j4.C9189e;
import p134c4.C4006a;
import p134c4.C4007b;
import p177j7.C9216a;
import p177j7.C9217b;
import retrofit2.C3666j;

/* renamed from: b4.c */
public class C3989c {

    /* renamed from: c */
    public static final String f6735c = "c";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C2469e f6736d = new C2469e();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3991b f6737a;

    /* renamed from: b */
    private C9216a<C3518c0> f6738b;

    /* renamed from: b4.c$a */
    class C3990a implements C9217b<C3518c0> {

        /* renamed from: a */
        final /* synthetic */ Class f6739a;

        /* renamed from: b */
        final /* synthetic */ C4007b f6740b;

        C3990a(Class cls, C4007b bVar) {
            this.f6739a = cls;
            this.f6740b = bVar;
        }

        /* renamed from: a */
        public void mo26575a(@NonNull C9216a<C3518c0> aVar, @NonNull C3666j<C3518c0> jVar) {
            String str;
            String str2;
            C4007b bVar;
            Object obj;
            try {
                if (jVar.mo26042d()) {
                    try {
                        C3518c0 a = jVar.mo26040a();
                        if (a != null) {
                            String str3 = new String(a.mo24410c());
                            if (TextUtils.equals(this.f6739a.getSimpleName(), Void.class.getSimpleName())) {
                                this.f6740b.mo23338a(null);
                            } else {
                                if (TextUtils.equals(this.f6739a.getSimpleName(), String.class.getSimpleName())) {
                                    bVar = this.f6740b;
                                    obj = str3;
                                } else {
                                    bVar = this.f6740b;
                                    obj = C3989c.f6736d.mo19225h(str3, this.f6739a);
                                }
                                bVar.mo23338a(obj);
                            }
                            a.close();
                            return;
                        }
                        this.f6740b.onFailure(10001, "data null");
                    } catch (UnsupportedEncodingException e) {
                        String str4 = "Parse failure:UnsupportedEncodingException:" + e.getMessage();
                        this.f6740b.onFailure(10000, str4);
                        str = C3989c.f6735c;
                        str2 = C3989c.this.f6737a.f6742a + " return:\n" + str4;
                        C9189e.m22139b(str, str2);
                    } catch (JsonSyntaxException e2) {
                        String str5 = "Parse failure:JsonSyntaxException:" + e2.getMessage();
                        this.f6740b.onFailure(10000, str5);
                        str = C3989c.f6735c;
                        str2 = C3989c.this.f6737a.f6742a + " return:\n" + str5;
                        C9189e.m22139b(str, str2);
                    } catch (Exception e3) {
                        this.f6740b.onFailure(10000, "Request error:" + e3.getMessage());
                        str = C3989c.f6735c;
                        str2 = C3989c.this.f6737a.f6742a + " return:\n" + e3.getMessage();
                        C9189e.m22139b(str, str2);
                    }
                } else {
                    this.f6740b.onFailure(jVar.mo26041b(), jVar.mo26043e());
                    C9189e.m22138a(C3989c.f6735c, C3989c.this.f6737a.f6742a + " return:\n" + jVar.mo26043e());
                }
            } catch (Exception e4) {
                C9189e.m22139b(C3989c.f6735c, C3989c.this.f6737a.f6742a + " return:\n" + e4.getMessage());
            }
        }

        /* renamed from: b */
        public void mo26576b(@NonNull C9216a<C3518c0> aVar, @NonNull Throwable th) {
            try {
                if (!aVar.mo25984H()) {
                    this.f6740b.onFailure(10001, th.getMessage());
                    String str = C3989c.f6735c;
                    C9189e.m22138a(str, C3989c.this.f6737a.f6742a + " return:\n" + th.getMessage());
                }
            } catch (Exception e) {
                String str2 = C3989c.f6735c;
                C9189e.m22139b(str2, C3989c.this.f6737a.f6742a + " return:\n" + e.getMessage());
            }
        }
    }

    /* renamed from: b4.c$b */
    public static final class C3991b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f6742a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Map<String, String> f6743b = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Map<String, String> f6744c = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public ContentType f6745d = ContentType.DEFAULT;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f6746e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public File f6747f;

        /* renamed from: i */
        private void m11597i(Map<String, String> map) {
            for (String next : map.keySet()) {
                if (map.get(next) == null) {
                    map.put(next, "");
                }
            }
        }

        /* renamed from: g */
        public C3991b mo26577g(String str) {
            this.f6746e = str;
            return this;
        }

        /* renamed from: h */
        public C3989c mo26578h() {
            return new C3989c(this, (C3990a) null);
        }

        /* renamed from: j */
        public C3991b mo26579j(ContentType contentType) {
            this.f6745d = contentType;
            return this;
        }

        /* renamed from: k */
        public C3991b mo26580k(Map<String, String> map) {
            if (map != null) {
                this.f6744c.clear();
                this.f6744c.putAll(map);
                m11597i(this.f6744c);
            }
            return this;
        }

        /* renamed from: l */
        public C3991b mo26581l(Map<String, String> map) {
            if (map != null) {
                this.f6743b.clear();
                this.f6743b.putAll(map);
                m11597i(this.f6743b);
            }
            return this;
        }

        /* renamed from: m */
        public C3991b mo26582m(String str) {
            this.f6742a = str;
            return this;
        }
    }

    /* renamed from: b4.c$c */
    static class C3992c extends AsyncTask<Void, Long, Void> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public File f6748a;

        /* renamed from: b */
        private C9216a<C3518c0> f6749b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C4007b f6750c;

        /* renamed from: b4.c$c$a */
        class C3993a implements C9217b<C3518c0> {
            C3993a() {
            }

            /* renamed from: a */
            public void mo26575a(@NonNull C9216a<C3518c0> aVar, @NonNull C3666j<C3518c0> jVar) {
                String str;
                String e;
                C4007b a;
                String str2;
                try {
                    if (jVar.mo26042d()) {
                        try {
                            C3518c0 a2 = jVar.mo26040a();
                            if (a2 == null) {
                                a = C3992c.this.f6750c;
                                str2 = "file null";
                            } else if (C3989c.m11584k(a2, C3992c.this.f6748a)) {
                                C3992c.this.f6750c.mo23338a(C3992c.this.f6748a);
                                return;
                            } else {
                                a = C3992c.this.f6750c;
                                str2 = "write error";
                            }
                            a.onFailure(10001, str2);
                        } catch (Exception e2) {
                            C3992c.this.f6750c.onFailure(10001, e2.getMessage());
                            str = C3989c.f6735c;
                            e = e2.getMessage();
                        }
                    } else {
                        C3992c.this.f6750c.onFailure(jVar.mo26041b(), jVar.mo26043e());
                        str = C3989c.f6735c;
                        e = jVar.mo26043e();
                        C9189e.m22138a(str, e);
                    }
                } catch (Exception e3) {
                    C9189e.m22139b(C3989c.f6735c, e3.getMessage());
                }
            }

            /* renamed from: b */
            public void mo26576b(@NonNull C9216a<C3518c0> aVar, @NonNull Throwable th) {
                try {
                    C3992c.this.f6750c.onFailure(10001, th.getMessage());
                    C9189e.m22138a(C3989c.f6735c, th.getMessage());
                } catch (Exception e) {
                    C9189e.m22139b(C3989c.f6735c, e.getMessage());
                }
            }
        }

        private C3992c(File file, C9216a<C3518c0> aVar, C4007b bVar) {
            this.f6748a = file;
            this.f6749b = aVar;
            this.f6750c = bVar;
        }

        /* synthetic */ C3992c(File file, C9216a aVar, C4007b bVar, C3990a aVar2) {
            this(file, aVar, bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Void doInBackground(Void... voidArr) {
            C9216a<C3518c0> aVar = this.f6749b;
            if (aVar == null) {
                return null;
            }
            aVar.mo25988c0(new C3993a());
            return null;
        }
    }

    private C3989c(C3991b bVar) {
        this.f6737a = bVar;
    }

    /* synthetic */ C3989c(C3991b bVar, C3990a aVar) {
        this(bVar);
    }

    /* renamed from: e */
    private <T> void m11581e(C9216a<C3518c0> aVar, Class<T> cls, C4007b<T> bVar) {
        if (aVar != null && bVar != null) {
            aVar.mo25988c0(new C3990a(cls, bVar));
        }
    }

    /* renamed from: g */
    private C3505a0 m11582g(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return C3505a0.m9570c(C3548v.m9872d("application/json"), str);
            }
            return null;
        } catch (Exception e) {
            String str2 = f6735c;
            C9189e.m22139b(str2, "getRequestBody msg = " + e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    private C3505a0 m11583h(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return C3505a0.m9570c(C3548v.m9872d("text/plain"), str);
            }
            return null;
        } catch (Exception e) {
            String str2 = f6735c;
            C9189e.m22139b(str2, "getRequestBody msg = " + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058 A[SYNTHETIC, Splitter:B:26:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d A[Catch:{ IOException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064 A[Catch:{ IOException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069 A[Catch:{ IOException -> 0x006d }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11584k(okhttp3.C3518c0 r10, java.io.File r11) {
        /*
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            r2 = 0
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
            long r3 = r10.mo24148d()     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
            r5 = 0
            java.io.InputStream r10 = r10.mo24409a()     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0051, all -> 0x004d }
            r7.<init>(r11)     // Catch:{ IOException -> 0x0051, all -> 0x004d }
        L_0x0015:
            int r11 = r10.read(r0)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            r1 = -1
            if (r11 != r1) goto L_0x0027
            r7.flush()     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            r11 = 1
            r10.close()     // Catch:{ IOException -> 0x006d }
            r7.close()     // Catch:{ IOException -> 0x006d }
            return r11
        L_0x0027:
            r7.write(r0, r2, r11)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            long r8 = (long) r11     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            long r5 = r5 + r8
            java.lang.String r11 = f6735c     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            r1.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            java.lang.String r8 = "file download: "
            r1.append(r8)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            r1.append(r5)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            java.lang.String r8 = " of "
            r1.append(r8)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            r1.append(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            p051j4.C9189e.m22138a(r11, r1)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            goto L_0x0015
        L_0x004b:
            r11 = move-exception
            goto L_0x004f
        L_0x004d:
            r11 = move-exception
            r7 = r1
        L_0x004f:
            r1 = r10
            goto L_0x0056
        L_0x0051:
            r7 = r1
        L_0x0052:
            r1 = r10
            goto L_0x0062
        L_0x0054:
            r11 = move-exception
            r7 = r1
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x006d }
        L_0x005b:
            if (r7 == 0) goto L_0x0060
            r7.close()     // Catch:{ IOException -> 0x006d }
        L_0x0060:
            throw r11     // Catch:{ IOException -> 0x006d }
        L_0x0061:
            r7 = r1
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ IOException -> 0x006d }
        L_0x0067:
            if (r7 == 0) goto L_0x006d
            r7.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p129b4.C3989c.m11584k(okhttp3.c0, java.io.File):boolean");
    }

    /* renamed from: d */
    public <T> void mo26571d(Class<T> cls, C4007b<T> bVar) {
        C4006a a = C3994d.m11609b().mo26585a();
        if (a != null) {
            this.f6738b = TextUtils.isEmpty(this.f6737a.f6746e) ? a.mo26596c(this.f6737a.f6744c, this.f6737a.f6742a, this.f6737a.f6743b) : a.mo26600g(this.f6737a.f6744c, m11583h(this.f6737a.f6746e), this.f6737a.f6742a, this.f6737a.f6743b);
            m11581e(this.f6738b, cls, bVar);
        }
    }

    /* renamed from: f */
    public <T> void mo26572f(Class<T> cls, C4007b<T> bVar) {
        C4006a a = C3994d.m11609b().mo26585a();
        if (a == null) {
            return;
        }
        if (this.f6737a.f6747f == null) {
            C9216a<C3518c0> e = a.mo26598e(this.f6737a.f6744c, this.f6737a.f6742a, this.f6737a.f6743b);
            this.f6738b = e;
            m11581e(e, cls, bVar);
            return;
        }
        this.f6738b = a.mo26594a(this.f6737a.f6744c, this.f6737a.f6742a, this.f6737a.f6743b);
        new C3992c(this.f6737a.f6747f, this.f6738b, bVar, (C3990a) null).execute(new Void[0]);
    }

    /* renamed from: i */
    public <T> void mo26573i(Class<T> cls, C4007b<T> bVar) {
        C9216a<C3518c0> aVar;
        C3505a0 a0Var;
        Map map;
        if (this.f6737a.f6743b == null || this.f6737a.f6743b.size() <= 0 || TextUtils.isEmpty(this.f6737a.f6746e)) {
            C4006a a = C3994d.m11609b().mo26585a();
            if (a != null) {
                if (!TextUtils.isEmpty(this.f6737a.f6746e)) {
                    if (ContentType.JSON == this.f6737a.f6745d) {
                        map = this.f6737a.f6744c;
                        a0Var = m11582g(this.f6737a.f6746e);
                    } else {
                        map = this.f6737a.f6744c;
                        a0Var = m11583h(this.f6737a.f6746e);
                    }
                    aVar = a.mo26599f(map, a0Var, this.f6737a.f6742a);
                } else {
                    aVar = a.mo26595b(this.f6737a.f6744c, this.f6737a.f6742a, this.f6737a.f6743b);
                }
                this.f6738b = aVar;
                m11581e(this.f6738b, cls, bVar);
                return;
            }
            return;
        }
        bVar.onFailure(10001, "param error");
    }

    /* renamed from: j */
    public <T> void mo26574j(Class<T> cls, C4007b<T> bVar) {
        C4006a a = C3994d.m11609b().mo26585a();
        if (a != null) {
            C9216a<C3518c0> d = a.mo26597d(this.f6737a.f6744c, m11583h(this.f6737a.f6746e), this.f6737a.f6742a, this.f6737a.f6743b);
            this.f6738b = d;
            m11581e(d, cls, bVar);
        }
    }
}
