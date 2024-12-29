package com.google.firebase.p128f.p130h;

import androidx.annotation.NonNull;
import com.google.firebase.p128f.C3177a;
import com.google.firebase.p128f.C3178b;
import com.google.firebase.p128f.C3179c;
import com.google.firebase.p128f.C3180d;
import com.google.firebase.p128f.C3181e;
import com.google.firebase.p128f.C3182f;
import com.google.firebase.p128f.p129g.C3183a;
import com.google.firebase.p128f.p129g.C3184b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.firebase.f.h.d */
public final class C3188d implements C3184b<C3188d> {

    /* renamed from: e */
    private static final C3179c<Object> f6148e = C3185a.m9928b();

    /* renamed from: f */
    private static final C3181e<String> f6149f = C3186b.m9930b();

    /* renamed from: g */
    private static final C3181e<Boolean> f6150g = C3187c.m9932b();

    /* renamed from: h */
    private static final C3190b f6151h = new C3190b((C3189a) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<Class<?>, C3179c<?>> f6152a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<Class<?>, C3181e<?>> f6153b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3179c<Object> f6154c = f6148e;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f6155d = false;

    /* renamed from: com.google.firebase.f.h.d$a */
    class C3189a implements C3177a {
        C3189a() {
        }

        /* renamed from: a */
        public void mo17750a(@NonNull Object obj, @NonNull Writer writer) {
            C3191e eVar = new C3191e(writer, C3188d.this.f6152a, C3188d.this.f6153b, C3188d.this.f6154c, C3188d.this.f6155d);
            eVar.mo17768i(obj, false);
            eVar.mo17776r();
        }

        /* renamed from: b */
        public String mo17751b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo17750a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: com.google.firebase.f.h.d$b */
    private static final class C3190b implements C3181e<Date> {

        /* renamed from: a */
        private static final DateFormat f6157a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f6157a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C3190b() {
        }

        /* synthetic */ C3190b(C3189a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo17756a(@NonNull Date date, @NonNull C3182f fVar) {
            fVar.mo17757d(f6157a.format(date));
        }
    }

    public C3188d() {
        mo17764m(String.class, f6149f);
        mo17764m(Boolean.class, f6150g);
        mo17764m(Date.class, f6151h);
    }

    /* renamed from: i */
    static /* synthetic */ void m9938i(Object obj, C3180d dVar) {
        throw new C3178b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C3184b mo17759a(@NonNull Class cls, @NonNull C3179c cVar) {
        mo17763l(cls, cVar);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public C3177a mo17760f() {
        return new C3189a();
    }

    @NonNull
    /* renamed from: g */
    public C3188d mo17761g(@NonNull C3183a aVar) {
        aVar.mo10133a(this);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public C3188d mo17762h(boolean z) {
        this.f6155d = z;
        return this;
    }

    @NonNull
    /* renamed from: l */
    public <T> C3188d mo17763l(@NonNull Class<T> cls, @NonNull C3179c<? super T> cVar) {
        this.f6152a.put(cls, cVar);
        this.f6153b.remove(cls);
        return this;
    }

    @NonNull
    /* renamed from: m */
    public <T> C3188d mo17764m(@NonNull Class<T> cls, @NonNull C3181e<? super T> eVar) {
        this.f6153b.put(cls, eVar);
        this.f6152a.remove(cls);
        return this;
    }
}
