package p073n5;

import javax.annotation.Nullable;
import okhttp3.C3518c0;
import okhttp3.C3548v;
import okio.C9838e;

/* renamed from: n5.h */
public final class C3381h extends C3518c0 {
    @Nullable

    /* renamed from: a */
    private final String f5494a;

    /* renamed from: b */
    private final long f5495b;

    /* renamed from: c */
    private final C9838e f5496c;

    public C3381h(@Nullable String str, long j, C9838e eVar) {
        this.f5494a = str;
        this.f5495b = j;
        this.f5496c = eVar;
    }

    /* renamed from: d */
    public long mo24148d() {
        return this.f5495b;
    }

    /* renamed from: f */
    public C3548v mo24149f() {
        String str = this.f5494a;
        if (str != null) {
            return C3548v.m9872d(str);
        }
        return null;
    }

    /* renamed from: k */
    public C9838e mo24150k() {
        return this.f5496c;
    }
}
