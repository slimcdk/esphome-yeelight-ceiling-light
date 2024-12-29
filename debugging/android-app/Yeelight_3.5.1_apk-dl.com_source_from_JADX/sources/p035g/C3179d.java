package p035g;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import java.util.Arrays;
import java.util.Objects;
import p035g.C3198o;

/* renamed from: g.d */
final class C3179d extends C3198o {

    /* renamed from: a */
    private final String f5133a;

    /* renamed from: b */
    private final byte[] f5134b;

    /* renamed from: c */
    private final Priority f5135c;

    /* renamed from: g.d$b */
    static final class C3181b extends C3198o.C3199a {

        /* renamed from: a */
        private String f5136a;

        /* renamed from: b */
        private byte[] f5137b;

        /* renamed from: c */
        private Priority f5138c;

        C3181b() {
        }

        /* renamed from: a */
        public C3198o mo23736a() {
            String str = "";
            if (this.f5136a == null) {
                str = str + " backendName";
            }
            if (this.f5138c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C3179d(this.f5136a, this.f5137b, this.f5138c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C3198o.C3199a mo23737b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f5136a = str;
            return this;
        }

        /* renamed from: c */
        public C3198o.C3199a mo23738c(@Nullable byte[] bArr) {
            this.f5137b = bArr;
            return this;
        }

        /* renamed from: d */
        public C3198o.C3199a mo23739d(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.f5138c = priority;
            return this;
        }
    }

    private C3179d(String str, @Nullable byte[] bArr, Priority priority) {
        this.f5133a = str;
        this.f5134b = bArr;
        this.f5135c = priority;
    }

    /* renamed from: b */
    public String mo23731b() {
        return this.f5133a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo23732c() {
        return this.f5134b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public Priority mo23733d() {
        return this.f5135c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3198o)) {
            return false;
        }
        C3198o oVar = (C3198o) obj;
        if (this.f5133a.equals(oVar.mo23731b())) {
            return Arrays.equals(this.f5134b, oVar instanceof C3179d ? ((C3179d) oVar).f5134b : oVar.mo23732c()) && this.f5135c.equals(oVar.mo23733d());
        }
    }

    public int hashCode() {
        return ((((this.f5133a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5134b)) * 1000003) ^ this.f5135c.hashCode();
    }
}
