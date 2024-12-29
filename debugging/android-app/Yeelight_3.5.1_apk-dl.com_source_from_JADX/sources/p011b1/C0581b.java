package p011b1;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p118y0.C3916f;

/* renamed from: b1.b */
class C0581b {

    /* renamed from: a */
    private final Map<String, String> f180a = new HashMap();

    /* renamed from: b */
    private final int f181b;

    /* renamed from: c */
    private final int f182c;

    public C0581b(int i, int i2) {
        this.f181b = i;
        this.f182c = i2;
    }

    /* renamed from: b */
    private String m82b(String str) {
        if (str != null) {
            return m83c(str, this.f182c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m83c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }

    @NonNull
    /* renamed from: a */
    public synchronized Map<String, String> mo10928a() {
        return Collections.unmodifiableMap(new HashMap(this.f180a));
    }

    /* renamed from: d */
    public synchronized boolean mo10929d(String str, String str2) {
        String b = m82b(str);
        if (this.f180a.size() >= this.f181b) {
            if (!this.f180a.containsKey(b)) {
                C3916f f = C3916f.m11190f();
                f.mo26407k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f181b);
                return false;
            }
        }
        String c = m83c(str2, this.f182c);
        if (CommonUtils.m5529A(this.f180a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.f180a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    /* renamed from: e */
    public synchronized void mo10930e(Map<String, String> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String b = m82b((String) next.getKey());
            if (this.f180a.size() >= this.f181b) {
                if (!this.f180a.containsKey(b)) {
                    i++;
                }
            }
            String str = (String) next.getValue();
            this.f180a.put(b, str == null ? "" : m83c(str, this.f182c));
        }
        if (i > 0) {
            C3916f f = C3916f.m11190f();
            f.mo26407k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f181b);
        }
    }
}
