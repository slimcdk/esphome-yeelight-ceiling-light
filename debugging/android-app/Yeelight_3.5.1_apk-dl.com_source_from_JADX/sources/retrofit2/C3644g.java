package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.C3505a0;
import okhttp3.C3544s;
import okhttp3.C3549w;

/* renamed from: retrofit2.g */
abstract class C3644g<T> {

    /* renamed from: retrofit2.g$a */
    class C3645a extends C3644g<Iterable<T>> {
        C3645a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo25993a(C3664i iVar, @Nullable Iterable<T> iterable) {
            if (iterable != null) {
                for (T a : iterable) {
                    C3644g.this.mo25993a(iVar, a);
                }
            }
        }
    }

    /* renamed from: retrofit2.g$b */
    class C3646b extends C3644g<Object> {
        C3646b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C3644g.this.mo25993a(iVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: retrofit2.g$c */
    static final class C3647c<T> extends C3644g<T> {

        /* renamed from: a */
        private final C10319c<T, C3505a0> f6090a;

        C3647c(C10319c<T, C3505a0> cVar) {
            this.f6090a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable T t) {
            if (t != null) {
                try {
                    iVar.mo26038j(this.f6090a.convert(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: retrofit2.g$d */
    static final class C3648d<T> extends C3644g<T> {

        /* renamed from: a */
        private final String f6091a;

        /* renamed from: b */
        private final C10319c<T, String> f6092b;

        /* renamed from: c */
        private final boolean f6093c;

        C3648d(String str, C10319c<T, String> cVar, boolean z) {
            this.f6091a = (String) C3672m.m10495b(str, "name == null");
            this.f6092b = cVar;
            this.f6093c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable T t) {
            String convert;
            if (t != null && (convert = this.f6092b.convert(t)) != null) {
                iVar.mo26031a(this.f6091a, convert, this.f6093c);
            }
        }
    }

    /* renamed from: retrofit2.g$e */
    static final class C3649e<T> extends C3644g<Map<String, T>> {

        /* renamed from: a */
        private final C10319c<T, String> f6094a;

        /* renamed from: b */
        private final boolean f6095b;

        C3649e(C10319c<T, String> cVar, boolean z) {
            this.f6094a = cVar;
            this.f6095b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo25993a(C3664i iVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.f6094a.convert(value);
                            if (convert != null) {
                                iVar.mo26031a(str, convert, this.f6095b);
                            } else {
                                throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.f6094a.getClass().getName() + " for key '" + str + "'.");
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

    /* renamed from: retrofit2.g$f */
    static final class C3650f<T> extends C3644g<T> {

        /* renamed from: a */
        private final String f6096a;

        /* renamed from: b */
        private final C10319c<T, String> f6097b;

        C3650f(String str, C10319c<T, String> cVar) {
            this.f6096a = (String) C3672m.m10495b(str, "name == null");
            this.f6097b = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable T t) {
            String convert;
            if (t != null && (convert = this.f6097b.convert(t)) != null) {
                iVar.mo26032b(this.f6096a, convert);
            }
        }
    }

    /* renamed from: retrofit2.g$g */
    static final class C3651g<T> extends C3644g<Map<String, T>> {

        /* renamed from: a */
        private final C10319c<T, String> f6098a;

        C3651g(C10319c<T, String> cVar) {
            this.f6098a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo25993a(C3664i iVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            iVar.mo26032b(str, this.f6098a.convert(value));
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

    /* renamed from: retrofit2.g$h */
    static final class C3652h<T> extends C3644g<T> {

        /* renamed from: a */
        private final C3544s f6099a;

        /* renamed from: b */
        private final C10319c<T, C3505a0> f6100b;

        C3652h(C3544s sVar, C10319c<T, C3505a0> cVar) {
            this.f6099a = sVar;
            this.f6100b = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable T t) {
            if (t != null) {
                try {
                    iVar.mo26033c(this.f6099a, this.f6100b.convert(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: retrofit2.g$i */
    static final class C3653i<T> extends C3644g<Map<String, T>> {

        /* renamed from: a */
        private final C10319c<T, C3505a0> f6101a;

        /* renamed from: b */
        private final String f6102b;

        C3653i(C10319c<T, C3505a0> cVar, String str) {
            this.f6101a = cVar;
            this.f6102b = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo25993a(C3664i iVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            iVar.mo26033c(C3544s.m9803g("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f6102b), this.f6101a.convert(value));
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

    /* renamed from: retrofit2.g$j */
    static final class C3654j<T> extends C3644g<T> {

        /* renamed from: a */
        private final String f6103a;

        /* renamed from: b */
        private final C10319c<T, String> f6104b;

        /* renamed from: c */
        private final boolean f6105c;

        C3654j(String str, C10319c<T, String> cVar, boolean z) {
            this.f6103a = (String) C3672m.m10495b(str, "name == null");
            this.f6104b = cVar;
            this.f6105c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable T t) {
            if (t != null) {
                iVar.mo26035e(this.f6103a, this.f6104b.convert(t), this.f6105c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f6103a + "\" value must not be null.");
        }
    }

    /* renamed from: retrofit2.g$k */
    static final class C3655k<T> extends C3644g<T> {

        /* renamed from: a */
        private final String f6106a;

        /* renamed from: b */
        private final C10319c<T, String> f6107b;

        /* renamed from: c */
        private final boolean f6108c;

        C3655k(String str, C10319c<T, String> cVar, boolean z) {
            this.f6106a = (String) C3672m.m10495b(str, "name == null");
            this.f6107b = cVar;
            this.f6108c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable T t) {
            String convert;
            if (t != null && (convert = this.f6107b.convert(t)) != null) {
                iVar.mo26036f(this.f6106a, convert, this.f6108c);
            }
        }
    }

    /* renamed from: retrofit2.g$l */
    static final class C3656l<T> extends C3644g<Map<String, T>> {

        /* renamed from: a */
        private final C10319c<T, String> f6109a;

        /* renamed from: b */
        private final boolean f6110b;

        C3656l(C10319c<T, String> cVar, boolean z) {
            this.f6109a = cVar;
            this.f6110b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo25993a(C3664i iVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.f6109a.convert(value);
                            if (convert != null) {
                                iVar.mo26036f(str, convert, this.f6110b);
                            } else {
                                throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.f6109a.getClass().getName() + " for key '" + str + "'.");
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

    /* renamed from: retrofit2.g$m */
    static final class C3657m<T> extends C3644g<T> {

        /* renamed from: a */
        private final C10319c<T, String> f6111a;

        /* renamed from: b */
        private final boolean f6112b;

        C3657m(C10319c<T, String> cVar, boolean z) {
            this.f6111a = cVar;
            this.f6112b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable T t) {
            if (t != null) {
                iVar.mo26036f(this.f6111a.convert(t), (String) null, this.f6112b);
            }
        }
    }

    /* renamed from: retrofit2.g$n */
    static final class C3658n extends C3644g<C3549w.C3551b> {

        /* renamed from: a */
        static final C3658n f6113a = new C3658n();

        private C3658n() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo25993a(C3664i iVar, @Nullable C3549w.C3551b bVar) {
            if (bVar != null) {
                iVar.mo26034d(bVar);
            }
        }
    }

    /* renamed from: retrofit2.g$o */
    static final class C3659o extends C3644g<Object> {
        C3659o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25993a(C3664i iVar, @Nullable Object obj) {
            C3672m.m10495b(obj, "@Url parameter is null.");
            iVar.mo26039k(obj);
        }
    }

    C3644g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25993a(C3664i iVar, @Nullable T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C3644g<Object> mo25994b() {
        return new C3646b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3644g<Iterable<T>> mo25995c() {
        return new C3645a();
    }
}
