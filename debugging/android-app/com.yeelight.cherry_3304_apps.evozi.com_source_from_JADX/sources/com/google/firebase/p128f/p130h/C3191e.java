package com.google.firebase.p128f.p130h;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.p128f.C3178b;
import com.google.firebase.p128f.C3179c;
import com.google.firebase.p128f.C3180d;
import com.google.firebase.p128f.C3181e;
import com.google.firebase.p128f.C3182f;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* renamed from: com.google.firebase.f.h.e */
final class C3191e implements C3180d, C3182f {

    /* renamed from: a */
    private C3191e f6158a = null;

    /* renamed from: b */
    private boolean f6159b = true;

    /* renamed from: c */
    private final JsonWriter f6160c;

    /* renamed from: d */
    private final Map<Class<?>, C3179c<?>> f6161d;

    /* renamed from: e */
    private final Map<Class<?>, C3181e<?>> f6162e;

    /* renamed from: f */
    private final C3179c<Object> f6163f;

    /* renamed from: g */
    private final boolean f6164g;

    C3191e(@NonNull Writer writer, @NonNull Map<Class<?>, C3179c<?>> map, @NonNull Map<Class<?>, C3181e<?>> map2, C3179c<Object> cVar, boolean z) {
        this.f6160c = new JsonWriter(writer);
        this.f6161d = map;
        this.f6162e = map2;
        this.f6163f = cVar;
        this.f6164g = z;
    }

    /* renamed from: q */
    private boolean m9951q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: t */
    private C3191e m9952t(@NonNull String str, @Nullable Object obj) {
        m9954v();
        this.f6160c.name(str);
        if (obj == null) {
            this.f6160c.nullValue();
            return this;
        }
        mo17768i(obj, false);
        return this;
    }

    /* renamed from: u */
    private C3191e m9953u(@NonNull String str, @Nullable Object obj) {
        if (obj == null) {
            return this;
        }
        m9954v();
        this.f6160c.name(str);
        mo17768i(obj, false);
        return this;
    }

    /* renamed from: v */
    private void m9954v() {
        if (this.f6159b) {
            C3191e eVar = this.f6158a;
            if (eVar != null) {
                eVar.m9954v();
                this.f6158a.f6159b = false;
                this.f6158a = null;
                this.f6160c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @NonNull
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C3180d mo17752a(@NonNull String str, boolean z) {
        mo17773n(str, z);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C3180d mo17753b(@NonNull String str, long j) {
        mo17771l(str, j);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public /* bridge */ /* synthetic */ C3180d mo17754c(@NonNull String str, int i) {
        mo17770k(str, i);
        return this;
    }

    @NonNull
    /* renamed from: d */
    public /* bridge */ /* synthetic */ C3182f mo17757d(@Nullable String str) {
        mo17769j(str);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public /* bridge */ /* synthetic */ C3182f mo17758e(boolean z) {
        mo17774o(z);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C3180d mo17755f(@NonNull String str, @Nullable Object obj) {
        mo17772m(str, obj);
        return this;
    }

    @NonNull
    /* renamed from: g */
    public C3191e mo17766g(int i) {
        m9954v();
        this.f6160c.value((long) i);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public C3191e mo17767h(long j) {
        m9954v();
        this.f6160c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public C3191e mo17768i(@Nullable Object obj, boolean z) {
        int i = 0;
        if (z && m9951q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new C3178b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f6160c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f6160c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                mo17775p((byte[]) obj);
                return this;
            }
            this.f6160c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f6160c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo17767h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f6160c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f6160c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    mo17768i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    mo17768i(i3, false);
                }
            }
            this.f6160c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f6160c.beginArray();
            for (Object i4 : (Collection) obj) {
                mo17768i(i4, false);
            }
            this.f6160c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f6160c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo17772m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C3178b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f6160c.endObject();
            return this;
        } else {
            C3179c cVar = this.f6161d.get(obj.getClass());
            if (cVar != null) {
                mo17777s(cVar, obj, z);
                return this;
            }
            C3181e eVar = this.f6162e.get(obj.getClass());
            if (eVar != null) {
                eVar.mo17756a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                mo17769j(((Enum) obj).name());
                return this;
            } else {
                mo17777s(this.f6163f, obj, z);
                return this;
            }
        }
    }

    @NonNull
    /* renamed from: j */
    public C3191e mo17769j(@Nullable String str) {
        m9954v();
        this.f6160c.value(str);
        return this;
    }

    @NonNull
    /* renamed from: k */
    public C3191e mo17770k(@NonNull String str, int i) {
        m9954v();
        this.f6160c.name(str);
        mo17766g(i);
        return this;
    }

    @NonNull
    /* renamed from: l */
    public C3191e mo17771l(@NonNull String str, long j) {
        m9954v();
        this.f6160c.name(str);
        mo17767h(j);
        return this;
    }

    @NonNull
    /* renamed from: m */
    public C3191e mo17772m(@NonNull String str, @Nullable Object obj) {
        if (this.f6164g) {
            m9953u(str, obj);
            return this;
        }
        m9952t(str, obj);
        return this;
    }

    @NonNull
    /* renamed from: n */
    public C3191e mo17773n(@NonNull String str, boolean z) {
        m9954v();
        this.f6160c.name(str);
        mo17774o(z);
        return this;
    }

    @NonNull
    /* renamed from: o */
    public C3191e mo17774o(boolean z) {
        m9954v();
        this.f6160c.value(z);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public C3191e mo17775p(@Nullable byte[] bArr) {
        m9954v();
        if (bArr == null) {
            this.f6160c.nullValue();
        } else {
            this.f6160c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo17776r() {
        m9954v();
        this.f6160c.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C3191e mo17777s(C3179c<Object> cVar, Object obj, boolean z) {
        if (!z) {
            this.f6160c.beginObject();
        }
        cVar.mo10134a(obj, this);
        if (!z) {
            this.f6160c.endObject();
        }
        return this;
    }
}
