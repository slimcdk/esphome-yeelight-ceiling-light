package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.C3509b0;
import okhttp3.C3518c0;
import okhttp3.C3544s;
import okhttp3.C3546t;
import okhttp3.C3548v;
import okhttp3.C3549w;
import okhttp3.C9796e;
import retrofit2.C3644g;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Url;

/* renamed from: retrofit2.l */
final class C3670l<R, T> {

    /* renamed from: m */
    static final Pattern f6147m = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: n */
    static final Pattern f6148n = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a */
    private final C9796e.C9797a f6149a;

    /* renamed from: b */
    private final C10318b<R, T> f6150b;

    /* renamed from: c */
    private final C3546t f6151c;

    /* renamed from: d */
    private final C10319c<C3518c0, R> f6152d;

    /* renamed from: e */
    private final String f6153e;

    /* renamed from: f */
    private final String f6154f;

    /* renamed from: g */
    private final C3544s f6155g;

    /* renamed from: h */
    private final C3548v f6156h;

    /* renamed from: i */
    private final boolean f6157i;

    /* renamed from: j */
    private final boolean f6158j;

    /* renamed from: k */
    private final boolean f6159k;

    /* renamed from: l */
    private final C3644g<?>[] f6160l;

    /* renamed from: retrofit2.l$a */
    static final class C3671a<T, R> {

        /* renamed from: a */
        final C3667k f6161a;

        /* renamed from: b */
        final Method f6162b;

        /* renamed from: c */
        final Annotation[] f6163c;

        /* renamed from: d */
        final Annotation[][] f6164d;

        /* renamed from: e */
        final Type[] f6165e;

        /* renamed from: f */
        Type f6166f;

        /* renamed from: g */
        boolean f6167g;

        /* renamed from: h */
        boolean f6168h;

        /* renamed from: i */
        boolean f6169i;

        /* renamed from: j */
        boolean f6170j;

        /* renamed from: k */
        boolean f6171k;

        /* renamed from: l */
        boolean f6172l;

        /* renamed from: m */
        String f6173m;

        /* renamed from: n */
        boolean f6174n;

        /* renamed from: o */
        boolean f6175o;

        /* renamed from: p */
        boolean f6176p;

        /* renamed from: q */
        String f6177q;

        /* renamed from: r */
        C3544s f6178r;

        /* renamed from: s */
        C3548v f6179s;

        /* renamed from: t */
        Set<String> f6180t;

        /* renamed from: u */
        C3644g<?>[] f6181u;

        /* renamed from: v */
        C10319c<C3518c0, T> f6182v;

        /* renamed from: w */
        C10318b<T, R> f6183w;

        C3671a(C3667k kVar, Method method) {
            this.f6161a = kVar;
            this.f6162b = method;
            this.f6163c = method.getAnnotations();
            this.f6165e = method.getGenericParameterTypes();
            this.f6164d = method.getParameterAnnotations();
        }

        /* renamed from: b */
        private C10318b<T, R> m10481b() {
            Type genericReturnType = this.f6162b.getGenericReturnType();
            if (C3672m.m10504k(genericReturnType)) {
                throw m10483d("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f6161a.mo26046b(genericReturnType, this.f6162b.getAnnotations());
                } catch (RuntimeException e) {
                    throw m10484e(e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw m10483d("Service methods cannot return void.", new Object[0]);
            }
        }

        /* renamed from: c */
        private C10319c<C3518c0, T> m10482c() {
            try {
                return this.f6161a.mo26054k(this.f6166f, this.f6162b.getAnnotations());
            } catch (RuntimeException e) {
                throw m10484e(e, "Unable to create converter for %s", this.f6166f);
            }
        }

        /* renamed from: d */
        private RuntimeException m10483d(String str, Object... objArr) {
            return m10484e((Throwable) null, str, objArr);
        }

        /* renamed from: e */
        private RuntimeException m10484e(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            return new IllegalArgumentException(format + "\n    for method " + this.f6162b.getDeclaringClass().getSimpleName() + "." + this.f6162b.getName(), th);
        }

        /* renamed from: f */
        private RuntimeException m10485f(int i, String str, Object... objArr) {
            return m10483d(str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: g */
        private RuntimeException m10486g(Throwable th, int i, String str, Object... objArr) {
            return m10484e(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: h */
        private C3544s m10487h(String[] strArr) {
            C3544s.C3545a aVar = new C3544s.C3545a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw m10483d("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    C3548v d = C3548v.m9872d(trim);
                    if (d != null) {
                        this.f6179s = d;
                    } else {
                        throw m10483d("Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo24553a(substring, trim);
                }
            }
            return aVar.mo24556d();
        }

        /* renamed from: i */
        private void m10488i(String str, String str2, boolean z) {
            String str3 = this.f6173m;
            if (str3 == null) {
                this.f6173m = str;
                this.f6174n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C3670l.f6147m.matcher(substring).find()) {
                            throw m10483d("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f6177q = str2;
                    this.f6180t = C3670l.m10477c(str2);
                    return;
                }
                return;
            }
            throw m10483d("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: j */
        private void m10489j(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof DELETE) {
                value = ((DELETE) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof GET) {
                value = ((GET) annotation).value();
                str = "GET";
            } else if (annotation instanceof HEAD) {
                m10488i("HEAD", ((HEAD) annotation).value(), false);
                if (!Void.class.equals(this.f6166f)) {
                    throw m10483d("HEAD method must use Void as response type.", new Object[0]);
                }
                return;
            } else {
                if (annotation instanceof PATCH) {
                    value2 = ((PATCH) annotation).value();
                    str2 = "PATCH";
                } else if (annotation instanceof POST) {
                    value2 = ((POST) annotation).value();
                    str2 = "POST";
                } else if (annotation instanceof PUT) {
                    value2 = ((PUT) annotation).value();
                    str2 = "PUT";
                } else if (annotation instanceof OPTIONS) {
                    value = ((OPTIONS) annotation).value();
                    str = "OPTIONS";
                } else if (annotation instanceof HTTP) {
                    HTTP http = (HTTP) annotation;
                    m10488i(http.method(), http.path(), http.hasBody());
                    return;
                } else if (annotation instanceof Headers) {
                    String[] value3 = ((Headers) annotation).value();
                    if (value3.length != 0) {
                        this.f6178r = m10487h(value3);
                        return;
                    }
                    throw m10483d("@Headers annotation is empty.", new Object[0]);
                } else if (annotation instanceof Multipart) {
                    if (!this.f6175o) {
                        this.f6176p = true;
                        return;
                    }
                    throw m10483d("Only one encoding annotation is allowed.", new Object[0]);
                } else if (!(annotation instanceof FormUrlEncoded)) {
                    return;
                } else {
                    if (!this.f6176p) {
                        this.f6175o = true;
                        return;
                    }
                    throw m10483d("Only one encoding annotation is allowed.", new Object[0]);
                }
                m10488i(str2, value2, true);
                return;
            }
            m10488i(str, value, false);
        }

        /* renamed from: k */
        private C3644g<?> m10490k(int i, Type type, Annotation[] annotationArr) {
            C3644g<?> gVar = null;
            for (Annotation l : annotationArr) {
                C3644g<?> l2 = m10491l(i, type, annotationArr, l);
                if (l2 != null) {
                    if (gVar == null) {
                        gVar = l2;
                    } else {
                        throw m10485f(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (gVar != null) {
                return gVar;
            }
            throw m10485f(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: l */
        private C3644g<?> m10491l(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<C3549w.C3551b> cls2 = C3549w.C3551b.class;
            if (annotation instanceof Url) {
                if (this.f6172l) {
                    throw m10485f(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f6170j) {
                    throw m10485f(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f6171k) {
                    throw m10485f(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f6177q == null) {
                    this.f6172l = true;
                    if (type == C3546t.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C3644g.C3659o();
                    }
                    throw m10485f(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m10485f(i, "@Url cannot be used with @%s URL", this.f6173m);
                }
            } else if (annotation instanceof Path) {
                if (this.f6171k) {
                    throw m10485f(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f6172l) {
                    throw m10485f(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f6177q != null) {
                    this.f6170j = true;
                    Path path = (Path) annotation;
                    String value = path.value();
                    m10492m(i, value);
                    return new C3644g.C3654j(value, this.f6161a.mo26055l(type, annotationArr), path.encoded());
                } else {
                    throw m10485f(i, "@Path can only be used with relative url on @%s", this.f6173m);
                }
            } else if (annotation instanceof Query) {
                Query query = (Query) annotation;
                String value2 = query.value();
                boolean encoded = query.encoded();
                Class<?> i2 = C3672m.m10502i(type);
                this.f6171k = true;
                if (Iterable.class.isAssignableFrom(i2)) {
                    if (type instanceof ParameterizedType) {
                        return new C3644g.C3655k(value2, this.f6161a.mo26055l(C3672m.m10501h(0, (ParameterizedType) type), annotationArr), encoded).mo25995c();
                    }
                    throw m10485f(i, i2.getSimpleName() + " must include generic type (e.g., " + i2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i2.isArray()) {
                    return new C3644g.C3655k(value2, this.f6161a.mo26055l(type, annotationArr), encoded);
                } else {
                    return new C3644g.C3655k(value2, this.f6161a.mo26055l(C3670l.m10476b(i2.getComponentType()), annotationArr), encoded).mo25994b();
                }
            } else if (annotation instanceof QueryName) {
                boolean encoded2 = ((QueryName) annotation).encoded();
                Class<?> i3 = C3672m.m10502i(type);
                this.f6171k = true;
                if (Iterable.class.isAssignableFrom(i3)) {
                    if (type instanceof ParameterizedType) {
                        return new C3644g.C3657m(this.f6161a.mo26055l(C3672m.m10501h(0, (ParameterizedType) type), annotationArr), encoded2).mo25995c();
                    }
                    throw m10485f(i, i3.getSimpleName() + " must include generic type (e.g., " + i3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i3.isArray()) {
                    return new C3644g.C3657m(this.f6161a.mo26055l(type, annotationArr), encoded2);
                } else {
                    return new C3644g.C3657m(this.f6161a.mo26055l(C3670l.m10476b(i3.getComponentType()), annotationArr), encoded2).mo25994b();
                }
            } else if (annotation instanceof QueryMap) {
                Class<?> i4 = C3672m.m10502i(type);
                if (Map.class.isAssignableFrom(i4)) {
                    Type j = C3672m.m10503j(type, i4, Map.class);
                    if (j instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) j;
                        Type h = C3672m.m10501h(0, parameterizedType);
                        if (cls == h) {
                            return new C3644g.C3656l(this.f6161a.mo26055l(C3672m.m10501h(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
                        }
                        throw m10485f(i, "@QueryMap keys must be of type String: " + h, new Object[0]);
                    }
                    throw m10485f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m10485f(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof Header) {
                String value3 = ((Header) annotation).value();
                Class<?> i5 = C3672m.m10502i(type);
                if (Iterable.class.isAssignableFrom(i5)) {
                    if (type instanceof ParameterizedType) {
                        return new C3644g.C3650f(value3, this.f6161a.mo26055l(C3672m.m10501h(0, (ParameterizedType) type), annotationArr)).mo25995c();
                    }
                    throw m10485f(i, i5.getSimpleName() + " must include generic type (e.g., " + i5.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i5.isArray()) {
                    return new C3644g.C3650f(value3, this.f6161a.mo26055l(type, annotationArr));
                } else {
                    return new C3644g.C3650f(value3, this.f6161a.mo26055l(C3670l.m10476b(i5.getComponentType()), annotationArr)).mo25994b();
                }
            } else if (annotation instanceof HeaderMap) {
                Class<?> i6 = C3672m.m10502i(type);
                if (Map.class.isAssignableFrom(i6)) {
                    Type j2 = C3672m.m10503j(type, i6, Map.class);
                    if (j2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) j2;
                        Type h2 = C3672m.m10501h(0, parameterizedType2);
                        if (cls == h2) {
                            return new C3644g.C3651g(this.f6161a.mo26055l(C3672m.m10501h(1, parameterizedType2), annotationArr));
                        }
                        throw m10485f(i, "@HeaderMap keys must be of type String: " + h2, new Object[0]);
                    }
                    throw m10485f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m10485f(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof Field) {
                if (this.f6175o) {
                    Field field = (Field) annotation;
                    String value4 = field.value();
                    boolean encoded3 = field.encoded();
                    this.f6167g = true;
                    Class<?> i7 = C3672m.m10502i(type);
                    if (Iterable.class.isAssignableFrom(i7)) {
                        if (type instanceof ParameterizedType) {
                            return new C3644g.C3648d(value4, this.f6161a.mo26055l(C3672m.m10501h(0, (ParameterizedType) type), annotationArr), encoded3).mo25995c();
                        }
                        throw m10485f(i, i7.getSimpleName() + " must include generic type (e.g., " + i7.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!i7.isArray()) {
                        return new C3644g.C3648d(value4, this.f6161a.mo26055l(type, annotationArr), encoded3);
                    } else {
                        return new C3644g.C3648d(value4, this.f6161a.mo26055l(C3670l.m10476b(i7.getComponentType()), annotationArr), encoded3).mo25994b();
                    }
                } else {
                    throw m10485f(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof FieldMap) {
                if (this.f6175o) {
                    Class<?> i8 = C3672m.m10502i(type);
                    if (Map.class.isAssignableFrom(i8)) {
                        Type j3 = C3672m.m10503j(type, i8, Map.class);
                        if (j3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) j3;
                            Type h3 = C3672m.m10501h(0, parameterizedType3);
                            if (cls == h3) {
                                C10319c l = this.f6161a.mo26055l(C3672m.m10501h(1, parameterizedType3), annotationArr);
                                this.f6167g = true;
                                return new C3644g.C3649e(l, ((FieldMap) annotation).encoded());
                            }
                            throw m10485f(i, "@FieldMap keys must be of type String: " + h3, new Object[0]);
                        }
                        throw m10485f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m10485f(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m10485f(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof Part) {
                if (this.f6176p) {
                    Part part = (Part) annotation;
                    this.f6168h = true;
                    String value5 = part.value();
                    Class<?> i9 = C3672m.m10502i(type);
                    if (!value5.isEmpty()) {
                        C3544s g = C3544s.m9803g("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", part.encoding());
                        if (Iterable.class.isAssignableFrom(i9)) {
                            if (type instanceof ParameterizedType) {
                                Type h4 = C3672m.m10501h(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(C3672m.m10502i(h4))) {
                                    return new C3644g.C3652h(g, this.f6161a.mo26053j(h4, annotationArr, this.f6163c)).mo25995c();
                                }
                                throw m10485f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw m10485f(i, i9.getSimpleName() + " must include generic type (e.g., " + i9.getSimpleName() + "<String>)", new Object[0]);
                        } else if (i9.isArray()) {
                            Class<?> b = C3670l.m10476b(i9.getComponentType());
                            if (!cls2.isAssignableFrom(b)) {
                                return new C3644g.C3652h(g, this.f6161a.mo26053j(b, annotationArr, this.f6163c)).mo25994b();
                            }
                            throw m10485f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(i9)) {
                            return new C3644g.C3652h(g, this.f6161a.mo26053j(type, annotationArr, this.f6163c));
                        } else {
                            throw m10485f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(i9)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw m10485f(i, i9.getSimpleName() + " must include generic type (e.g., " + i9.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(C3672m.m10502i(C3672m.m10501h(0, (ParameterizedType) type)))) {
                            return C3644g.C3658n.f6113a.mo25995c();
                        } else {
                            throw m10485f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (i9.isArray()) {
                        if (cls2.isAssignableFrom(i9.getComponentType())) {
                            return C3644g.C3658n.f6113a.mo25994b();
                        }
                        throw m10485f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(i9)) {
                        return C3644g.C3658n.f6113a;
                    } else {
                        throw m10485f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw m10485f(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof PartMap) {
                if (this.f6176p) {
                    this.f6168h = true;
                    Class<?> i10 = C3672m.m10502i(type);
                    if (Map.class.isAssignableFrom(i10)) {
                        Type j4 = C3672m.m10503j(type, i10, Map.class);
                        if (j4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) j4;
                            Type h5 = C3672m.m10501h(0, parameterizedType4);
                            if (cls == h5) {
                                Type h6 = C3672m.m10501h(1, parameterizedType4);
                                if (!cls2.isAssignableFrom(C3672m.m10502i(h6))) {
                                    return new C3644g.C3653i(this.f6161a.mo26053j(h6, annotationArr, this.f6163c), ((PartMap) annotation).encoding());
                                }
                                throw m10485f(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw m10485f(i, "@PartMap keys must be of type String: " + h5, new Object[0]);
                        }
                        throw m10485f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m10485f(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m10485f(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof Body)) {
                return null;
            } else {
                if (this.f6175o || this.f6176p) {
                    throw m10485f(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f6169i) {
                    try {
                        C10319c j5 = this.f6161a.mo26053j(type, annotationArr, this.f6163c);
                        this.f6169i = true;
                        return new C3644g.C3647c(j5);
                    } catch (RuntimeException e) {
                        throw m10486g(e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw m10485f(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* renamed from: m */
        private void m10492m(int i, String str) {
            if (!C3670l.f6148n.matcher(str).matches()) {
                throw m10485f(i, "@Path parameter name must match %s. Found: %s", C3670l.f6147m.pattern(), str);
            } else if (!this.f6180t.contains(str)) {
                throw m10485f(i, "URL \"%s\" does not contain \"{%s}\".", this.f6177q, str);
            }
        }

        /* renamed from: a */
        public C3670l mo26065a() {
            C10318b<T, R> b = m10481b();
            this.f6183w = b;
            Type responseType = b.responseType();
            this.f6166f = responseType;
            if (responseType == C3666j.class || responseType == C3509b0.class) {
                throw m10483d("'" + C3672m.m10502i(this.f6166f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
            }
            this.f6182v = m10482c();
            for (Annotation j : this.f6163c) {
                m10489j(j);
            }
            if (this.f6173m != null) {
                if (!this.f6174n) {
                    if (this.f6176p) {
                        throw m10483d("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f6175o) {
                        throw m10483d("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f6164d.length;
                this.f6181u = new C3644g[length];
                int i = 0;
                while (i < length) {
                    Type type = this.f6165e[i];
                    if (!C3672m.m10504k(type)) {
                        Annotation[] annotationArr = this.f6164d[i];
                        if (annotationArr != null) {
                            this.f6181u[i] = m10490k(i, type, annotationArr);
                            i++;
                        } else {
                            throw m10485f(i, "No Retrofit annotation found.", new Object[0]);
                        }
                    } else {
                        throw m10485f(i, "Parameter type must not include a type variable or wildcard: %s", type);
                    }
                }
                if (this.f6177q != null || this.f6172l) {
                    boolean z = this.f6175o;
                    if (!z && !this.f6176p && !this.f6174n && this.f6169i) {
                        throw m10483d("Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z && !this.f6167g) {
                        throw m10483d("Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f6176p || this.f6168h) {
                        return new C3670l(this);
                    } else {
                        throw m10483d("Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw m10483d("Missing either @%s URL or @Url parameter.", this.f6173m);
                }
            } else {
                throw m10483d("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    C3670l(C3671a<R, T> aVar) {
        this.f6149a = aVar.f6161a.mo26047c();
        this.f6150b = aVar.f6183w;
        this.f6151c = aVar.f6161a.mo26045a();
        this.f6152d = aVar.f6182v;
        this.f6153e = aVar.f6173m;
        this.f6154f = aVar.f6177q;
        this.f6155g = aVar.f6178r;
        this.f6156h = aVar.f6179s;
        this.f6157i = aVar.f6174n;
        this.f6158j = aVar.f6175o;
        this.f6159k = aVar.f6176p;
        this.f6160l = aVar.f6181u;
    }

    /* renamed from: b */
    static Class<?> m10476b(Class<?> cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* renamed from: c */
    static Set<String> m10477c(String str) {
        Matcher matcher = f6147m.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [j7.a, j7.a<R>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo26062a(p177j7.C9216a<R> r2) {
        /*
            r1 = this;
            retrofit2.b<R, T> r0 = r1.f6150b
            java.lang.Object r2 = r0.mo41861a(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C3670l.mo26062a(j7.a):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9796e mo26063d(@Nullable Object... objArr) {
        C3664i iVar = new C3664i(this.f6153e, this.f6151c, this.f6154f, this.f6155g, this.f6156h, this.f6157i, this.f6158j, this.f6159k);
        C3644g<?>[] gVarArr = this.f6160l;
        int length = objArr != null ? objArr.length : 0;
        if (length == gVarArr.length) {
            for (int i = 0; i < length; i++) {
                gVarArr[i].mo25993a(iVar, objArr[i]);
            }
            return this.f6149a.mo24610a(iVar.mo26037g());
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + gVarArr.length + ")");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public R mo26064e(C3518c0 c0Var) {
        return this.f6152d.convert(c0Var);
    }
}
