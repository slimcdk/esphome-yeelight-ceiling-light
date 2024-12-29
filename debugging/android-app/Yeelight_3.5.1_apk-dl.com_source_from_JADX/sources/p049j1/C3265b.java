package p049j1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j1.b */
public final class C3265b {

    /* renamed from: a */
    private final String f5258a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f5259b;

    /* renamed from: j1.b$b */
    public static final class C3267b {

        /* renamed from: a */
        private final String f5260a;

        /* renamed from: b */
        private Map<Class<?>, Object> f5261b = null;

        C3267b(String str) {
            this.f5260a = str;
        }

        @NonNull
        /* renamed from: a */
        public C3265b mo23834a() {
            return new C3265b(this.f5260a, this.f5261b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f5261b)));
        }

        @NonNull
        /* renamed from: b */
        public <T extends Annotation> C3267b mo23835b(@NonNull T t) {
            if (this.f5261b == null) {
                this.f5261b = new HashMap();
            }
            this.f5261b.put(t.annotationType(), t);
            return this;
        }
    }

    private C3265b(String str, Map<Class<?>, Object> map) {
        this.f5258a = str;
        this.f5259b = map;
    }

    @NonNull
    /* renamed from: a */
    public static C3267b m8753a(@NonNull String str) {
        return new C3267b(str);
    }

    @NonNull
    /* renamed from: d */
    public static C3265b m8754d(@NonNull String str) {
        return new C3265b(str, Collections.emptyMap());
    }

    @NonNull
    /* renamed from: b */
    public String mo23829b() {
        return this.f5258a;
    }

    @Nullable
    /* renamed from: c */
    public <T extends Annotation> T mo23830c(@NonNull Class<T> cls) {
        return (Annotation) this.f5259b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3265b)) {
            return false;
        }
        C3265b bVar = (C3265b) obj;
        return this.f5258a.equals(bVar.f5258a) && this.f5259b.equals(bVar.f5259b);
    }

    public int hashCode() {
        return (this.f5258a.hashCode() * 31) + this.f5259b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f5258a + ", properties=" + this.f5259b.values() + "}";
    }
}
