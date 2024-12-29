package com.google.firebase.crashlytics.p110c.p112g;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.p110c.C2857b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.c.g.y */
class C2958y {

    /* renamed from: b */
    private static final Charset f5752b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f5753a;

    /* renamed from: com.google.firebase.crashlytics.c.g.y$a */
    class C2959a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ C2883g0 f5754a;

        C2959a(C2883g0 g0Var) {
            this.f5754a = g0Var;
            put("userId", this.f5754a.mo17184b());
        }
    }

    public C2958y(File file) {
        this.f5753a = file;
    }

    /* renamed from: c */
    private static C2883g0 m9068c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        C2883g0 g0Var = new C2883g0();
        g0Var.mo17186e(m9071g(jSONObject, "userId"));
        return g0Var;
    }

    /* renamed from: d */
    private static String m9069d(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: f */
    private static String m9070f(C2883g0 g0Var) {
        return new C2959a(g0Var).toString();
    }

    /* renamed from: g */
    private static String m9071g(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public File mo17301a(String str) {
        File file = this.f5753a;
        return new File(file, str + "keys" + ".meta");
    }

    @NonNull
    /* renamed from: b */
    public File mo17302b(String str) {
        File file = this.f5753a;
        return new File(file, str + "user" + ".meta");
    }

    /* renamed from: e */
    public C2883g0 mo17303e(String str) {
        File b = mo17302b(str);
        if (!b.exists()) {
            return new C2883g0();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b);
            try {
                C2883g0 c = m9068c(C2884h.m8803J(fileInputStream2));
                C2884h.m8808e(fileInputStream2, "Failed to close user metadata file.");
                return c;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C2857b.m8687f().mo17133e("Error deserializing user metadata.", e);
                    C2884h.m8808e(fileInputStream, "Failed to close user metadata file.");
                    return new C2883g0();
                } catch (Throwable th) {
                    th = th;
                    C2884h.m8808e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C2884h.m8808e(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C2857b.m8687f().mo17133e("Error deserializing user metadata.", e);
            C2884h.m8808e(fileInputStream, "Failed to close user metadata file.");
            return new C2883g0();
        }
    }

    /* renamed from: h */
    public void mo17304h(String str, Map<String, String> map) {
        File a = mo17301a(str);
        BufferedWriter bufferedWriter = null;
        try {
            String d = m9069d(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), f5752b));
            try {
                bufferedWriter2.write(d);
                bufferedWriter2.flush();
                C2884h.m8808e(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C2857b.m8687f().mo17133e("Error serializing key/value metadata.", e);
                    C2884h.m8808e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    C2884h.m8808e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C2884h.m8808e(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C2857b.m8687f().mo17133e("Error serializing key/value metadata.", e);
            C2884h.m8808e(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* renamed from: i */
    public void mo17305i(String str, C2883g0 g0Var) {
        File b = mo17302b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String f = m9070f(g0Var);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), f5752b));
            try {
                bufferedWriter2.write(f);
                bufferedWriter2.flush();
                C2884h.m8808e(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C2857b.m8687f().mo17133e("Error serializing user metadata.", e);
                    C2884h.m8808e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    C2884h.m8808e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C2884h.m8808e(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C2857b.m8687f().mo17133e("Error serializing user metadata.", e);
            C2884h.m8808e(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}
