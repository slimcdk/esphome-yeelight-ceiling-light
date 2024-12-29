package p173i7;

import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4315w;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.Map;

/* renamed from: i7.o */
abstract class C9159o {

    /* renamed from: i7.o$a */
    static final class C9160a<T> extends C9159o {

        /* renamed from: a */
        private final C9138e<T, C4315w> f16946a;

        C9160a(C9138e<T, C4315w> eVar) {
            this.f16946a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                try {
                    nVar.mo37243i(this.f16946a.convert(obj));
                } catch (IOException unused) {
                    throw new RuntimeException("Unable to convert " + obj + " to RequestBody");
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: i7.o$b */
    static final class C9161b extends C9159o {

        /* renamed from: a */
        private final String f16947a;

        /* renamed from: b */
        private final boolean f16948b;

        C9161b(String str, boolean z) {
            this.f16947a = (String) C9177t.m22060a(str, "name == null");
            this.f16948b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                if (obj instanceof Iterable) {
                    for (Object next : (Iterable) obj) {
                        if (next != null) {
                            nVar.mo37237a(this.f16947a, next.toString(), this.f16948b);
                        }
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 != null) {
                            nVar.mo37237a(this.f16947a, obj2.toString(), this.f16948b);
                        }
                    }
                } else {
                    nVar.mo37237a(this.f16947a, obj.toString(), this.f16948b);
                }
            }
        }
    }

    /* renamed from: i7.o$c */
    static final class C9162c extends C9159o {

        /* renamed from: a */
        private final boolean f16949a;

        C9162c(boolean z) {
            this.f16949a = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            nVar.mo37237a(key.toString(), value.toString(), this.f16949a);
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
            }
        }
    }

    /* renamed from: i7.o$d */
    static final class C9163d extends C9159o {

        /* renamed from: a */
        private final String f16950a;

        C9163d(String str) {
            this.f16950a = (String) C9177t.m22060a(str, "name == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                if (obj instanceof Iterable) {
                    for (Object next : (Iterable) obj) {
                        if (next != null) {
                            nVar.mo37238b(this.f16950a, next.toString());
                        }
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 != null) {
                            nVar.mo37238b(this.f16950a, obj2.toString());
                        }
                    }
                } else {
                    nVar.mo37238b(this.f16950a, obj.toString());
                }
            }
        }
    }

    /* renamed from: i7.o$e */
    static final class C9164e<T> extends C9159o {

        /* renamed from: a */
        private final C4299p f16951a;

        /* renamed from: b */
        private final C9138e<T, C4315w> f16952b;

        C9164e(C4299p pVar, C9138e<T, C4315w> eVar) {
            this.f16951a = pVar;
            this.f16952b = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                try {
                    nVar.mo37239c(this.f16951a, this.f16952b.convert(obj));
                } catch (IOException unused) {
                    throw new RuntimeException("Unable to convert " + obj + " to RequestBody");
                }
            }
        }
    }

    /* renamed from: i7.o$f */
    static final class C9165f extends C9159o {

        /* renamed from: a */
        private final C9173s f16953a;

        /* renamed from: b */
        private final String f16954b;

        /* renamed from: c */
        private final Annotation[] f16955c;

        C9165f(C9173s sVar, String str, Annotation[] annotationArr) {
            this.f16953a = sVar;
            this.f16954b = str;
            this.f16955c = annotationArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            try {
                                nVar.mo37239c(C4299p.m11986f("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f16954b), this.f16953a.mo37258h(value.getClass(), this.f16955c).convert(value));
                            } catch (IOException unused) {
                                throw new RuntimeException("Unable to convert " + value + " to RequestBody");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
            }
        }
    }

    /* renamed from: i7.o$g */
    static final class C9166g extends C9159o {

        /* renamed from: a */
        private final String f16956a;

        /* renamed from: b */
        private final boolean f16957b;

        C9166g(String str, boolean z) {
            this.f16956a = (String) C9177t.m22060a(str, "name == null");
            this.f16957b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                nVar.mo37240d(this.f16956a, obj.toString(), this.f16957b);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f16956a + "\" value must not be null.");
        }
    }

    /* renamed from: i7.o$h */
    static final class C9167h extends C9159o {

        /* renamed from: a */
        private final String f16958a;

        /* renamed from: b */
        private final boolean f16959b;

        C9167h(String str, boolean z) {
            this.f16958a = (String) C9177t.m22060a(str, "name == null");
            this.f16959b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                if (obj instanceof Iterable) {
                    for (Object next : (Iterable) obj) {
                        if (next != null) {
                            nVar.mo37241e(this.f16958a, next.toString(), this.f16959b);
                        }
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 != null) {
                            nVar.mo37241e(this.f16958a, obj2.toString(), this.f16959b);
                        }
                    }
                } else {
                    nVar.mo37241e(this.f16958a, obj.toString(), this.f16959b);
                }
            }
        }
    }

    /* renamed from: i7.o$i */
    static final class C9168i extends C9159o {

        /* renamed from: a */
        private final boolean f16960a;

        C9168i(boolean z) {
            this.f16960a = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            if (obj != null) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            nVar.mo37241e(key.toString(), value.toString(), this.f16960a);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    /* renamed from: i7.o$j */
    static final class C9169j extends C9159o {
        C9169j() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37245a(C9157n nVar, Object obj) {
            nVar.mo37244j((String) obj);
        }
    }

    C9159o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo37245a(C9157n nVar, Object obj);
}
