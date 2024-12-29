package p011c.p012a.p019b.p020a;

import androidx.annotation.Nullable;

/* renamed from: c.a.b.a.a */
final class C0458a<T> extends C0460c<T> {

    /* renamed from: a */
    private final Integer f47a;

    /* renamed from: b */
    private final T f48b;

    /* renamed from: c */
    private final C0461d f49c;

    C0458a(@Nullable Integer num, T t, C0461d dVar) {
        this.f47a = num;
        if (t != null) {
            this.f48b = t;
            if (dVar != null) {
                this.f49c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Nullable
    /* renamed from: a */
    public Integer mo8391a() {
        return this.f47a;
    }

    /* renamed from: b */
    public T mo8392b() {
        return this.f48b;
    }

    /* renamed from: c */
    public C0461d mo8393c() {
        return this.f49c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0460c)) {
            return false;
        }
        C0460c cVar = (C0460c) obj;
        Integer num = this.f47a;
        if (num != null ? num.equals(cVar.mo8391a()) : cVar.mo8391a() == null) {
            return this.f48b.equals(cVar.mo8392b()) && this.f49c.equals(cVar.mo8393c());
        }
    }

    public int hashCode() {
        Integer num = this.f47a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f48b.hashCode()) * 1000003) ^ this.f49c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f47a + ", payload=" + this.f48b + ", priority=" + this.f49c + "}";
    }
}
