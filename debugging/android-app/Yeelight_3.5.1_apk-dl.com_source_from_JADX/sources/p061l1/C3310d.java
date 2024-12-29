package p061l1;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
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
import p049j1.C3264a;
import p049j1.C3268c;
import p049j1.C3269d;
import p049j1.C3270e;
import p049j1.C3271f;
import p054k1.C3293a;
import p054k1.C3294b;

/* renamed from: l1.d */
public final class C3310d implements C3294b<C3310d> {

    /* renamed from: e */
    private static final C3268c<Object> f5342e = C9519a.f17358a;

    /* renamed from: f */
    private static final C3270e<String> f5343f = C9521c.f17360a;

    /* renamed from: g */
    private static final C3270e<Boolean> f5344g = C9520b.f17359a;

    /* renamed from: h */
    private static final C3312b f5345h = new C3312b((C3311a) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<Class<?>, C3268c<?>> f5346a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<Class<?>, C3270e<?>> f5347b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3268c<Object> f5348c = f5342e;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f5349d = false;

    /* renamed from: l1.d$a */
    class C3311a implements C3264a {
        C3311a() {
        }

        /* renamed from: a */
        public void mo23827a(@NonNull Object obj, @NonNull Writer writer) {
            C3313e eVar = new C3313e(writer, C3310d.this.f5346a, C3310d.this.f5347b, C3310d.this.f5348c, C3310d.this.f5349d);
            eVar.mo24021i(obj, false);
            eVar.mo24029r();
        }

        /* renamed from: b */
        public String mo23828b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo23827a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: l1.d$b */
    private static final class C3312b implements C3270e<Date> {

        /* renamed from: a */
        private static final DateFormat f5351a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f5351a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C3312b() {
        }

        /* synthetic */ C3312b(C3311a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo23836a(@NonNull Date date, @NonNull C3271f fVar) {
            fVar.mo19029b(f5351a.format(date));
        }
    }

    public C3310d() {
        mo24017p(String.class, f5343f);
        mo24017p(Boolean.class, f5344g);
        mo24017p(Date.class, f5345h);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m8971l(Object obj, C3269d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    /* renamed from: i */
    public C3264a mo24013i() {
        return new C3311a();
    }

    @NonNull
    /* renamed from: j */
    public C3310d mo24014j(@NonNull C3293a aVar) {
        aVar.mo11146a(this);
        return this;
    }

    @NonNull
    /* renamed from: k */
    public C3310d mo24015k(boolean z) {
        this.f5349d = z;
        return this;
    }

    @NonNull
    /* renamed from: o */
    public <T> C3310d mo19025a(@NonNull Class<T> cls, @NonNull C3268c<? super T> cVar) {
        this.f5346a.put(cls, cVar);
        this.f5347b.remove(cls);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public <T> C3310d mo24017p(@NonNull Class<T> cls, @NonNull C3270e<? super T> eVar) {
        this.f5347b.put(cls, eVar);
        this.f5346a.remove(cls);
        return this;
    }
}
