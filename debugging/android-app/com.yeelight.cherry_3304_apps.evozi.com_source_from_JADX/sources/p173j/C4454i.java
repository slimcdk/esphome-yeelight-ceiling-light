package p173j;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import javax.annotation.Nullable;
import p156f.C4322b0;
import p156f.C4388s;
import p156f.C4393w;

/* renamed from: j.i */
abstract class C4454i<T> {

    /* renamed from: j.i$a */
    class C4455a extends C4454i<Iterable<T>> {
        C4455a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24539a(C4474k kVar, @Nullable Iterable<T> iterable) {
            if (iterable != null) {
                for (T a : iterable) {
                    C4454i.this.mo24539a(kVar, a);
                }
            }
        }
    }

    /* renamed from: j.i$b */
    class C4456b extends C4454i<Object> {
        C4456b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C4454i.this.mo24539a(kVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: j.i$c */
    static final class C4457c<T> extends C4454i<T> {

        /* renamed from: a */
        private final C11575e<T, C4322b0> f8030a;

        C4457c(C11575e<T, C4322b0> eVar) {
            this.f8030a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable T t) {
            if (t != null) {
                try {
                    kVar.mo24560j(this.f8030a.convert(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: j.i$d */
    static final class C4458d<T> extends C4454i<T> {

        /* renamed from: a */
        private final String f8031a;

        /* renamed from: b */
        private final C11575e<T, String> f8032b;

        /* renamed from: c */
        private final boolean f8033c;

        C4458d(String str, C11575e<T, String> eVar, boolean z) {
            C4482o.m13230b(str, "name == null");
            this.f8031a = str;
            this.f8032b = eVar;
            this.f8033c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable T t) {
            String convert;
            if (t != null && (convert = this.f8032b.convert(t)) != null) {
                kVar.mo24553a(this.f8031a, convert, this.f8033c);
            }
        }
    }

    /* renamed from: j.i$e */
    static final class C4459e<T> extends C4454i<Map<String, T>> {

        /* renamed from: a */
        private final C11575e<T, String> f8034a;

        /* renamed from: b */
        private final boolean f8035b;

        C4459e(C11575e<T, String> eVar, boolean z) {
            this.f8034a = eVar;
            this.f8035b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24539a(C4474k kVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.f8034a.convert(value);
                            if (convert != null) {
                                kVar.mo24553a(str, convert, this.f8035b);
                            } else {
                                throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.f8034a.getClass().getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: j.i$f */
    static final class C4460f<T> extends C4454i<T> {

        /* renamed from: a */
        private final String f8036a;

        /* renamed from: b */
        private final C11575e<T, String> f8037b;

        C4460f(String str, C11575e<T, String> eVar) {
            C4482o.m13230b(str, "name == null");
            this.f8036a = str;
            this.f8037b = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable T t) {
            String convert;
            if (t != null && (convert = this.f8037b.convert(t)) != null) {
                kVar.mo24554b(this.f8036a, convert);
            }
        }
    }

    /* renamed from: j.i$g */
    static final class C4461g<T> extends C4454i<Map<String, T>> {

        /* renamed from: a */
        private final C11575e<T, String> f8038a;

        C4461g(C11575e<T, String> eVar) {
            this.f8038a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24539a(C4474k kVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            kVar.mo24554b(str, this.f8038a.convert(value));
                        } else {
                            throw new IllegalArgumentException("Header map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* renamed from: j.i$h */
    static final class C4462h<T> extends C4454i<T> {

        /* renamed from: a */
        private final C4388s f8039a;

        /* renamed from: b */
        private final C11575e<T, C4322b0> f8040b;

        C4462h(C4388s sVar, C11575e<T, C4322b0> eVar) {
            this.f8039a = sVar;
            this.f8040b = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable T t) {
            if (t != null) {
                try {
                    kVar.mo24555c(this.f8039a, this.f8040b.convert(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: j.i$i */
    static final class C4463i<T> extends C4454i<Map<String, T>> {

        /* renamed from: a */
        private final C11575e<T, C4322b0> f8041a;

        /* renamed from: b */
        private final String f8042b;

        C4463i(C11575e<T, C4322b0> eVar, String str) {
            this.f8041a = eVar;
            this.f8042b = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24539a(C4474k kVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            kVar.mo24555c(C4388s.m12602g("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f8042b), this.f8041a.convert(value));
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: j.i$j */
    static final class C4464j<T> extends C4454i<T> {

        /* renamed from: a */
        private final String f8043a;

        /* renamed from: b */
        private final C11575e<T, String> f8044b;

        /* renamed from: c */
        private final boolean f8045c;

        C4464j(String str, C11575e<T, String> eVar, boolean z) {
            C4482o.m13230b(str, "name == null");
            this.f8043a = str;
            this.f8044b = eVar;
            this.f8045c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable T t) {
            if (t != null) {
                kVar.mo24557e(this.f8043a, this.f8044b.convert(t), this.f8045c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f8043a + "\" value must not be null.");
        }
    }

    /* renamed from: j.i$k */
    static final class C4465k<T> extends C4454i<T> {

        /* renamed from: a */
        private final String f8046a;

        /* renamed from: b */
        private final C11575e<T, String> f8047b;

        /* renamed from: c */
        private final boolean f8048c;

        C4465k(String str, C11575e<T, String> eVar, boolean z) {
            C4482o.m13230b(str, "name == null");
            this.f8046a = str;
            this.f8047b = eVar;
            this.f8048c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable T t) {
            String convert;
            if (t != null && (convert = this.f8047b.convert(t)) != null) {
                kVar.mo24558f(this.f8046a, convert, this.f8048c);
            }
        }
    }

    /* renamed from: j.i$l */
    static final class C4466l<T> extends C4454i<Map<String, T>> {

        /* renamed from: a */
        private final C11575e<T, String> f8049a;

        /* renamed from: b */
        private final boolean f8050b;

        C4466l(C11575e<T, String> eVar, boolean z) {
            this.f8049a = eVar;
            this.f8050b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24539a(C4474k kVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.f8049a.convert(value);
                            if (convert != null) {
                                kVar.mo24558f(str, convert, this.f8050b);
                            } else {
                                throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.f8049a.getClass().getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Query map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* renamed from: j.i$m */
    static final class C4467m<T> extends C4454i<T> {

        /* renamed from: a */
        private final C11575e<T, String> f8051a;

        /* renamed from: b */
        private final boolean f8052b;

        C4467m(C11575e<T, String> eVar, boolean z) {
            this.f8051a = eVar;
            this.f8052b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable T t) {
            if (t != null) {
                kVar.mo24558f(this.f8051a.convert(t), (String) null, this.f8052b);
            }
        }
    }

    /* renamed from: j.i$n */
    static final class C4468n extends C4454i<C4393w.C4395b> {

        /* renamed from: a */
        static final C4468n f8053a = new C4468n();

        private C4468n() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24539a(C4474k kVar, @Nullable C4393w.C4395b bVar) {
            if (bVar != null) {
                kVar.mo24556d(bVar);
            }
        }
    }

    /* renamed from: j.i$o */
    static final class C4469o extends C4454i<Object> {
        C4469o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24539a(C4474k kVar, @Nullable Object obj) {
            C4482o.m13230b(obj, "@Url parameter is null.");
            kVar.mo24561k(obj);
        }
    }

    C4454i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo24539a(C4474k kVar, @Nullable T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4454i<Object> mo24540b() {
        return new C4456b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C4454i<Iterable<T>> mo24541c() {
        return new C4455a();
    }
}
