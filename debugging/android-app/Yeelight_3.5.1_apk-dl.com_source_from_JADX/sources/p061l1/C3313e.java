package p061l1;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p049j1.C3265b;
import p049j1.C3268c;
import p049j1.C3269d;
import p049j1.C3270e;
import p049j1.C3271f;

/* renamed from: l1.e */
final class C3313e implements C3269d, C3271f {

    /* renamed from: a */
    private C3313e f5352a = null;

    /* renamed from: b */
    private boolean f5353b = true;

    /* renamed from: c */
    private final JsonWriter f5354c;

    /* renamed from: d */
    private final Map<Class<?>, C3268c<?>> f5355d;

    /* renamed from: e */
    private final Map<Class<?>, C3270e<?>> f5356e;

    /* renamed from: f */
    private final C3268c<Object> f5357f;

    /* renamed from: g */
    private final boolean f5358g;

    C3313e(@NonNull Writer writer, @NonNull Map<Class<?>, C3268c<?>> map, @NonNull Map<Class<?>, C3270e<?>> map2, C3268c<Object> cVar, boolean z) {
        this.f5354c = new JsonWriter(writer);
        this.f5355d = map;
        this.f5356e = map2;
        this.f5357f = cVar;
        this.f5358g = z;
    }

    /* renamed from: q */
    private boolean m8984q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: t */
    private C3313e m8985t(@NonNull String str, @Nullable Object obj) {
        m8987v();
        this.f5354c.name(str);
        if (obj != null) {
            return mo24021i(obj, false);
        }
        this.f5354c.nullValue();
        return this;
    }

    /* renamed from: u */
    private C3313e m8986u(@NonNull String str, @Nullable Object obj) {
        if (obj == null) {
            return this;
        }
        m8987v();
        this.f5354c.name(str);
        return mo24021i(obj, false);
    }

    /* renamed from: v */
    private void m8987v() {
        if (this.f5353b) {
            C3313e eVar = this.f5352a;
            if (eVar != null) {
                eVar.m8987v();
                this.f5352a.f5353b = false;
                this.f5352a = null;
                this.f5354c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @NonNull
    /* renamed from: a */
    public C3269d mo19009a(@NonNull C3265b bVar, @Nullable Object obj) {
        return mo24025m(bVar.mo23829b(), obj);
    }

    @NonNull
    /* renamed from: d */
    public C3269d mo19011d(@NonNull C3265b bVar, long j) {
        return mo24024l(bVar.mo23829b(), j);
    }

    @NonNull
    /* renamed from: e */
    public C3269d mo19012e(@NonNull C3265b bVar, int i) {
        return mo24023k(bVar.mo23829b(), i);
    }

    @NonNull
    /* renamed from: f */
    public C3269d mo19013f(@NonNull C3265b bVar, boolean z) {
        return mo24026n(bVar.mo23829b(), z);
    }

    @NonNull
    /* renamed from: g */
    public C3313e mo24019g(int i) {
        m8987v();
        this.f5354c.value((long) i);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public C3313e mo24020h(long j) {
        m8987v();
        this.f5354c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public C3313e mo24021i(@Nullable Object obj, boolean z) {
        int i = 0;
        if (z && m8984q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f5354c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f5354c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo24028p((byte[]) obj);
            }
            this.f5354c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f5354c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo24020h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f5354c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f5354c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    mo24021i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    mo24021i(i3, false);
                }
            }
            this.f5354c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f5354c.beginArray();
            for (Object i4 : (Collection) obj) {
                mo24021i(i4, false);
            }
            this.f5354c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f5354c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo24025m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f5354c.endObject();
            return this;
        } else {
            C3268c cVar = this.f5355d.get(obj.getClass());
            if (cVar != null) {
                return mo24030s(cVar, obj, z);
            }
            C3270e eVar = this.f5356e.get(obj.getClass());
            if (eVar != null) {
                eVar.mo23836a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo24030s(this.f5357f, obj, z);
            } else {
                mo19029b(((Enum) obj).name());
                return this;
            }
        }
    }

    @NonNull
    /* renamed from: j */
    public C3313e mo19029b(@Nullable String str) {
        m8987v();
        this.f5354c.value(str);
        return this;
    }

    @NonNull
    /* renamed from: k */
    public C3313e mo24023k(@NonNull String str, int i) {
        m8987v();
        this.f5354c.name(str);
        return mo24019g(i);
    }

    @NonNull
    /* renamed from: l */
    public C3313e mo24024l(@NonNull String str, long j) {
        m8987v();
        this.f5354c.name(str);
        return mo24020h(j);
    }

    @NonNull
    /* renamed from: m */
    public C3313e mo24025m(@NonNull String str, @Nullable Object obj) {
        return this.f5358g ? m8986u(str, obj) : m8985t(str, obj);
    }

    @NonNull
    /* renamed from: n */
    public C3313e mo24026n(@NonNull String str, boolean z) {
        m8987v();
        this.f5354c.name(str);
        return mo19030c(z);
    }

    @NonNull
    /* renamed from: o */
    public C3313e mo19030c(boolean z) {
        m8987v();
        this.f5354c.value(z);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public C3313e mo24028p(@Nullable byte[] bArr) {
        m8987v();
        if (bArr == null) {
            this.f5354c.nullValue();
        } else {
            this.f5354c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo24029r() {
        m8987v();
        this.f5354c.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C3313e mo24030s(C3268c<Object> cVar, Object obj, boolean z) {
        if (!z) {
            this.f5354c.beginObject();
        }
        cVar.mo11147a(obj, this);
        if (!z) {
            this.f5354c.endObject();
        }
        return this;
    }
}
