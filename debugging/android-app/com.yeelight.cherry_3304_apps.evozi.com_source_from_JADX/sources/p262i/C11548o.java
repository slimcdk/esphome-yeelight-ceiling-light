package p262i;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.Map;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1147y;

/* renamed from: i.o */
abstract class C11548o {

    /* renamed from: i.o$a */
    static final class C11549a<T> extends C11548o {

        /* renamed from: a */
        private final C11527e<T, C1147y> f22934a;

        C11549a(C11527e<T, C1147y> eVar) {
            this.f22934a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                try {
                    nVar.mo36467i(this.f22934a.convert(obj));
                } catch (IOException unused) {
                    throw new RuntimeException("Unable to convert " + obj + " to RequestBody");
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: i.o$b */
    static final class C11550b extends C11548o {

        /* renamed from: a */
        private final String f22935a;

        /* renamed from: b */
        private final boolean f22936b;

        C11550b(String str, boolean z) {
            C11566t.m30352a(str, "name == null");
            this.f22935a = str;
            this.f22936b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                if (obj instanceof Iterable) {
                    for (Object next : (Iterable) obj) {
                        if (next != null) {
                            nVar.mo36461a(this.f22935a, next.toString(), this.f22936b);
                        }
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 != null) {
                            nVar.mo36461a(this.f22935a, obj2.toString(), this.f22936b);
                        }
                    }
                } else {
                    nVar.mo36461a(this.f22935a, obj.toString(), this.f22936b);
                }
            }
        }
    }

    /* renamed from: i.o$c */
    static final class C11551c extends C11548o {

        /* renamed from: a */
        private final boolean f22937a;

        C11551c(boolean z) {
            this.f22937a = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            nVar.mo36461a(key.toString(), value.toString(), this.f22937a);
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
            }
        }
    }

    /* renamed from: i.o$d */
    static final class C11552d extends C11548o {

        /* renamed from: a */
        private final String f22938a;

        C11552d(String str) {
            C11566t.m30352a(str, "name == null");
            this.f22938a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                if (obj instanceof Iterable) {
                    for (Object next : (Iterable) obj) {
                        if (next != null) {
                            nVar.mo36462b(this.f22938a, next.toString());
                        }
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 != null) {
                            nVar.mo36462b(this.f22938a, obj2.toString());
                        }
                    }
                } else {
                    nVar.mo36462b(this.f22938a, obj.toString());
                }
            }
        }
    }

    /* renamed from: i.o$e */
    static final class C11553e<T> extends C11548o {

        /* renamed from: a */
        private final C1130q f22939a;

        /* renamed from: b */
        private final C11527e<T, C1147y> f22940b;

        C11553e(C1130q qVar, C11527e<T, C1147y> eVar) {
            this.f22939a = qVar;
            this.f22940b = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                try {
                    nVar.mo36463c(this.f22939a, this.f22940b.convert(obj));
                } catch (IOException unused) {
                    throw new RuntimeException("Unable to convert " + obj + " to RequestBody");
                }
            }
        }
    }

    /* renamed from: i.o$f */
    static final class C11554f extends C11548o {

        /* renamed from: a */
        private final C11562s f22941a;

        /* renamed from: b */
        private final String f22942b;

        /* renamed from: c */
        private final Annotation[] f22943c;

        C11554f(C11562s sVar, String str, Annotation[] annotationArr) {
            this.f22941a = sVar;
            this.f22942b = str;
            this.f22943c = annotationArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            try {
                                nVar.mo36463c(C1130q.m2706f("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f22942b), this.f22941a.mo36482h(value.getClass(), this.f22943c).convert(value));
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

    /* renamed from: i.o$g */
    static final class C11555g extends C11548o {

        /* renamed from: a */
        private final String f22944a;

        /* renamed from: b */
        private final boolean f22945b;

        C11555g(String str, boolean z) {
            C11566t.m30352a(str, "name == null");
            this.f22944a = str;
            this.f22945b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                nVar.mo36464d(this.f22944a, obj.toString(), this.f22945b);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f22944a + "\" value must not be null.");
        }
    }

    /* renamed from: i.o$h */
    static final class C11556h extends C11548o {

        /* renamed from: a */
        private final String f22946a;

        /* renamed from: b */
        private final boolean f22947b;

        C11556h(String str, boolean z) {
            C11566t.m30352a(str, "name == null");
            this.f22946a = str;
            this.f22947b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                if (obj instanceof Iterable) {
                    for (Object next : (Iterable) obj) {
                        if (next != null) {
                            nVar.mo36465e(this.f22946a, next.toString(), this.f22947b);
                        }
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        Object obj2 = Array.get(obj, i);
                        if (obj2 != null) {
                            nVar.mo36465e(this.f22946a, obj2.toString(), this.f22947b);
                        }
                    }
                } else {
                    nVar.mo36465e(this.f22946a, obj.toString(), this.f22947b);
                }
            }
        }
    }

    /* renamed from: i.o$i */
    static final class C11557i extends C11548o {

        /* renamed from: a */
        private final boolean f22948a;

        C11557i(boolean z) {
            this.f22948a = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            if (obj != null) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            nVar.mo36465e(key.toString(), value.toString(), this.f22948a);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    /* renamed from: i.o$j */
    static final class C11558j extends C11548o {
        C11558j() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36469a(C11546n nVar, Object obj) {
            nVar.mo36468j((String) obj);
        }
    }

    C11548o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo36469a(C11546n nVar, Object obj);
}
