package p011b1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p033f1.C3160f;
import p118y0.C3916f;

/* renamed from: b1.d */
class C0585d {

    /* renamed from: b */
    private static final Charset f186b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C3160f f187a;

    /* renamed from: b1.d$a */
    class C0586a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f188a;

        C0586a(String str) {
            this.f188a = str;
            put("userId", str);
        }
    }

    public C0585d(C3160f fVar) {
        this.f187a = fVar;
    }

    /* renamed from: d */
    private static Map<String, String> m99d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m104k(jSONObject, next));
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: e */
    private String m100e(String str) {
        return m104k(new JSONObject(str), "userId");
    }

    /* renamed from: f */
    private static String m101f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: i */
    private static void m102i(File file) {
        if (file.exists() && file.delete()) {
            C3916f f = C3916f.m11190f();
            f.mo26403g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: j */
    private static String m103j(String str) {
        return new C0586a(str).toString();
    }

    /* renamed from: k */
    private static String m104k(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public File mo10937a(String str) {
        return this.f187a.mo23668o(str, "internal-keys");
    }

    @NonNull
    /* renamed from: b */
    public File mo10938b(String str) {
        return this.f187a.mo23668o(str, "keys");
    }

    @NonNull
    /* renamed from: c */
    public File mo10939c(String str) {
        return this.f187a.mo23668o(str, "user-data");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<String, String> mo10940g(String str, boolean z) {
        Exception e;
        FileInputStream fileInputStream;
        File a = z ? mo10937a(str) : mo10938b(str);
        if (!a.exists() || a.length() == 0) {
            m102i(a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a);
            try {
                Map<String, String> d = m99d(CommonUtils.m5531C(fileInputStream));
                CommonUtils.m5536e(fileInputStream, "Failed to close user metadata file.");
                return d;
            } catch (Exception e2) {
                e = e2;
                try {
                    C3916f.m11190f().mo26408l("Error deserializing user metadata.", e);
                    m102i(a);
                    CommonUtils.m5536e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.m5536e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            C3916f.m11190f().mo26408l("Error deserializing user metadata.", e);
            m102i(a);
            CommonUtils.m5536e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.m5536e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    @Nullable
    /* renamed from: h */
    public String mo10941h(String str) {
        FileInputStream fileInputStream;
        File c = mo10939c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            C3916f.m11190f().mo26399b("No userId set for session " + str);
            m102i(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                String e = m100e(CommonUtils.m5531C(fileInputStream));
                C3916f.m11190f().mo26399b("Loaded userId " + e + " for session " + str);
                CommonUtils.m5536e(fileInputStream, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                try {
                    C3916f.m11190f().mo26408l("Error deserializing user metadata.", e);
                    m102i(c);
                    CommonUtils.m5536e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.m5536e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C3916f.m11190f().mo26408l("Error deserializing user metadata.", e);
            m102i(c);
            CommonUtils.m5536e(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.m5536e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: l */
    public void mo10942l(String str, Map<String, String> map, boolean z) {
        File a = z ? mo10937a(str) : mo10938b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String f = m101f(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), f186b));
            try {
                bufferedWriter2.write(f);
                bufferedWriter2.flush();
                CommonUtils.m5536e(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C3916f.m11190f().mo26408l("Error serializing key/value metadata.", e);
                    m102i(a);
                    CommonUtils.m5536e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.m5536e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.m5536e(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C3916f.m11190f().mo26408l("Error serializing key/value metadata.", e);
            m102i(a);
            CommonUtils.m5536e(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* renamed from: m */
    public void mo10943m(String str, String str2) {
        File c = mo10939c(str);
        BufferedWriter bufferedWriter = null;
        try {
            String j = m103j(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), f186b));
            try {
                bufferedWriter2.write(j);
                bufferedWriter2.flush();
                CommonUtils.m5536e(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C3916f.m11190f().mo26408l("Error serializing user metadata.", e);
                    CommonUtils.m5536e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.m5536e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.m5536e(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C3916f.m11190f().mo26408l("Error serializing user metadata.", e);
            CommonUtils.m5536e(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}
