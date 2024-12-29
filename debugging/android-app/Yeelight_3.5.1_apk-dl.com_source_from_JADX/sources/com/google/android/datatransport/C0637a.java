package com.google.android.datatransport;

import androidx.annotation.Nullable;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.a */
final class C0637a<T> extends C0638b<T> {

    /* renamed from: a */
    private final Integer f298a;

    /* renamed from: b */
    private final T f299b;

    /* renamed from: c */
    private final Priority f300c;

    C0637a(@Nullable Integer num, T t, Priority priority) {
        this.f298a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f299b = t;
        Objects.requireNonNull(priority, "Null priority");
        this.f300c = priority;
    }

    @Nullable
    /* renamed from: a */
    public Integer mo11090a() {
        return this.f298a;
    }

    /* renamed from: b */
    public T mo11091b() {
        return this.f299b;
    }

    /* renamed from: c */
    public Priority mo11092c() {
        return this.f300c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0638b)) {
            return false;
        }
        C0638b bVar = (C0638b) obj;
        Integer num = this.f298a;
        if (num != null ? num.equals(bVar.mo11090a()) : bVar.mo11090a() == null) {
            return this.f299b.equals(bVar.mo11091b()) && this.f300c.equals(bVar.mo11092c());
        }
    }

    public int hashCode() {
        Integer num = this.f298a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f299b.hashCode()) * 1000003) ^ this.f300c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f298a + ", payload=" + this.f299b + ", priority=" + this.f300c + "}";
    }
}
