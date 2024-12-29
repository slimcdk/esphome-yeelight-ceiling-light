package p069n0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

@VisibleForTesting
/* renamed from: n0.h */
public class C3362h {

    /* renamed from: a */
    private final HashMap<String, Object> f5478a = new HashMap<>();

    /* renamed from: v */
    private static final void m9178v(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(str);
        sb.append(" expected ");
        sb.append(str2);
        sb.append(" but value was a ");
        sb.append(obj.getClass().getName());
        sb.append(".  The default value ");
        sb.append(obj2);
        sb.append(" was returned.");
    }

    @RecentlyNullable
    /* renamed from: a */
    public <T> T mo24113a(@RecentlyNonNull String str) {
        return this.f5478a.get(str);
    }

    @RecentlyNullable
    /* renamed from: b */
    public String mo24114b(@RecentlyNonNull String str) {
        Object obj = this.f5478a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            m9178v(str, obj, "String", "<null>", e);
            return null;
        }
    }

    @RecentlyNonNull
    /* renamed from: c */
    public Set<String> mo24115c() {
        return this.f5478a.keySet();
    }

    /* renamed from: d */
    public void mo24116d(@RecentlyNonNull C3362h hVar) {
        for (String next : hVar.mo24115c()) {
            this.f5478a.put(next, hVar.mo24113a(next));
        }
    }

    /* renamed from: e */
    public void mo24117e(@RecentlyNonNull String str, @RecentlyNonNull Asset asset) {
        this.f5478a.put(str, asset);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C3362h)) {
            return false;
        }
        C3362h hVar = (C3362h) obj;
        if (mo24136u() != hVar.mo24136u()) {
            return false;
        }
        for (String next : mo24115c()) {
            Object a = mo24113a(next);
            Object a2 = hVar.mo24113a(next);
            if (a instanceof Asset) {
                if (!(a2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) a;
                Asset asset2 = (Asset) a2;
                if (asset != null && asset2 != null) {
                    if (!(!TextUtils.isEmpty(asset.mo14781c0()) ? ((String) C0917i.m1419j(asset.mo14781c0())).equals(asset2.mo14781c0()) : Arrays.equals(asset.mo14784f0(), asset2.mo14784f0()))) {
                        return false;
                    }
                } else if (asset != asset2) {
                    return false;
                }
            } else if (a instanceof String[]) {
                if (!(a2 instanceof String[]) || !Arrays.equals((String[]) a, (String[]) a2)) {
                    return false;
                }
            } else if (a instanceof long[]) {
                if (!(a2 instanceof long[]) || !Arrays.equals((long[]) a, (long[]) a2)) {
                    return false;
                }
            } else if (a instanceof float[]) {
                if (!(a2 instanceof float[]) || !Arrays.equals((float[]) a, (float[]) a2)) {
                    return false;
                }
            } else if (a instanceof byte[]) {
                if (!(a2 instanceof byte[]) || !Arrays.equals((byte[]) a, (byte[]) a2)) {
                    return false;
                }
            } else if (a == null || a2 == null) {
                return a == a2;
            } else {
                if (!a.equals(a2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public void mo24119f(@RecentlyNonNull String str, boolean z) {
        this.f5478a.put(str, Boolean.valueOf(z));
    }

    /* renamed from: g */
    public void mo24120g(@RecentlyNonNull String str, byte b) {
        this.f5478a.put(str, Byte.valueOf(b));
    }

    /* renamed from: h */
    public void mo24121h(@RecentlyNonNull String str, @RecentlyNonNull byte[] bArr) {
        this.f5478a.put(str, bArr);
    }

    public int hashCode() {
        return this.f5478a.hashCode() * 29;
    }

    /* renamed from: i */
    public void mo24123i(@RecentlyNonNull String str, @RecentlyNonNull C3362h hVar) {
        this.f5478a.put(str, hVar);
    }

    /* renamed from: j */
    public void mo24124j(@RecentlyNonNull String str, @RecentlyNonNull ArrayList<C3362h> arrayList) {
        this.f5478a.put(str, arrayList);
    }

    /* renamed from: k */
    public void mo24125k(@RecentlyNonNull String str, double d) {
        this.f5478a.put(str, Double.valueOf(d));
    }

    /* renamed from: l */
    public void mo24126l(@RecentlyNonNull String str, float f) {
        this.f5478a.put(str, Float.valueOf(f));
    }

    /* renamed from: m */
    public void mo24127m(@RecentlyNonNull String str, @RecentlyNonNull float[] fArr) {
        this.f5478a.put(str, fArr);
    }

    /* renamed from: n */
    public void mo24128n(@RecentlyNonNull String str, int i) {
        this.f5478a.put(str, Integer.valueOf(i));
    }

    /* renamed from: o */
    public void mo24129o(@RecentlyNonNull String str, @RecentlyNonNull ArrayList<Integer> arrayList) {
        this.f5478a.put(str, arrayList);
    }

    /* renamed from: p */
    public void mo24130p(@RecentlyNonNull String str, long j) {
        this.f5478a.put(str, Long.valueOf(j));
    }

    /* renamed from: q */
    public void mo24131q(@RecentlyNonNull String str, @RecentlyNonNull long[] jArr) {
        this.f5478a.put(str, jArr);
    }

    /* renamed from: r */
    public void mo24132r(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this.f5478a.put(str, str2);
    }

    /* renamed from: s */
    public void mo24133s(@RecentlyNonNull String str, @RecentlyNonNull String[] strArr) {
        this.f5478a.put(str, strArr);
    }

    /* renamed from: t */
    public void mo24134t(@RecentlyNonNull String str, @RecentlyNonNull ArrayList<String> arrayList) {
        this.f5478a.put(str, arrayList);
    }

    @RecentlyNonNull
    public String toString() {
        return this.f5478a.toString();
    }

    /* renamed from: u */
    public int mo24136u() {
        return this.f5478a.size();
    }
}
