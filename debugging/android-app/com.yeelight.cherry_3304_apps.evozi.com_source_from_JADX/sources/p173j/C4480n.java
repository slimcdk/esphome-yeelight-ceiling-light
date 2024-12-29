package p173j;

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
import p156f.C4332c0;
import p156f.C4336d0;
import p156f.C4338e;
import p156f.C4388s;
import p156f.C4390t;
import p156f.C4392v;
import p156f.C4393w;
import p173j.C4454i;
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

/* renamed from: j.n */
final class C4480n<R, T> {

    /* renamed from: m */
    static final Pattern f8088m = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: n */
    static final Pattern f8089n = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a */
    private final C4338e.C4339a f8090a;

    /* renamed from: b */
    private final C11573c<R, T> f8091b;

    /* renamed from: c */
    private final C4390t f8092c;

    /* renamed from: d */
    private final C11575e<C4336d0, R> f8093d;

    /* renamed from: e */
    private final String f8094e;

    /* renamed from: f */
    private final String f8095f;

    /* renamed from: g */
    private final C4388s f8096g;

    /* renamed from: h */
    private final C4392v f8097h;

    /* renamed from: i */
    private final boolean f8098i;

    /* renamed from: j */
    private final boolean f8099j;

    /* renamed from: k */
    private final boolean f8100k;

    /* renamed from: l */
    private final C4454i<?>[] f8101l;

    /* renamed from: j.n$a */
    static final class C4481a<T, R> {

        /* renamed from: a */
        final C4477m f8102a;

        /* renamed from: b */
        final Method f8103b;

        /* renamed from: c */
        final Annotation[] f8104c;

        /* renamed from: d */
        final Annotation[][] f8105d;

        /* renamed from: e */
        final Type[] f8106e;

        /* renamed from: f */
        Type f8107f;

        /* renamed from: g */
        boolean f8108g;

        /* renamed from: h */
        boolean f8109h;

        /* renamed from: i */
        boolean f8110i;

        /* renamed from: j */
        boolean f8111j;

        /* renamed from: k */
        boolean f8112k;

        /* renamed from: l */
        boolean f8113l;

        /* renamed from: m */
        String f8114m;

        /* renamed from: n */
        boolean f8115n;

        /* renamed from: o */
        boolean f8116o;

        /* renamed from: p */
        boolean f8117p;

        /* renamed from: q */
        String f8118q;

        /* renamed from: r */
        C4388s f8119r;

        /* renamed from: s */
        C4392v f8120s;

        /* renamed from: t */
        Set<String> f8121t;

        /* renamed from: u */
        C4454i<?>[] f8122u;

        /* renamed from: v */
        C11575e<C4336d0, T> f8123v;

        /* renamed from: w */
        C11573c<T, R> f8124w;

        C4481a(C4477m mVar, Method method) {
            this.f8102a = mVar;
            this.f8103b = method;
            this.f8104c = method.getAnnotations();
            this.f8106e = method.getGenericParameterTypes();
            this.f8105d = method.getParameterAnnotations();
        }

        /* renamed from: b */
        private C11573c<T, R> m13216b() {
            Type genericReturnType = this.f8103b.getGenericReturnType();
            if (C4482o.m13239k(genericReturnType)) {
                throw m13218d("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f8102a.mo24568b(genericReturnType, this.f8103b.getAnnotations());
                } catch (RuntimeException e) {
                    throw m13219e(e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw m13218d("Service methods cannot return void.", new Object[0]);
            }
        }

        /* renamed from: c */
        private C11575e<C4336d0, T> m13217c() {
            try {
                return this.f8102a.mo24576k(this.f8107f, this.f8103b.getAnnotations());
            } catch (RuntimeException e) {
                throw m13219e(e, "Unable to create converter for %s", this.f8107f);
            }
        }

        /* renamed from: d */
        private RuntimeException m13218d(String str, Object... objArr) {
            return m13219e((Throwable) null, str, objArr);
        }

        /* renamed from: e */
        private RuntimeException m13219e(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            return new IllegalArgumentException(format + "\n    for method " + this.f8103b.getDeclaringClass().getSimpleName() + "." + this.f8103b.getName(), th);
        }

        /* renamed from: f */
        private RuntimeException m13220f(int i, String str, Object... objArr) {
            return m13218d(str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: g */
        private RuntimeException m13221g(Throwable th, int i, String str, Object... objArr) {
            return m13219e(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: h */
        private C4388s m13222h(String[] strArr) {
            C4388s.C4389a aVar = new C4388s.C4389a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw m13218d("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    C4392v d = C4392v.m12671d(trim);
                    if (d != null) {
                        this.f8120s = d;
                    } else {
                        throw m13218d("Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo24094a(substring, trim);
                }
            }
            return aVar.mo24097d();
        }

        /* renamed from: i */
        private void m13223i(String str, String str2, boolean z) {
            String str3 = this.f8114m;
            if (str3 == null) {
                this.f8114m = str;
                this.f8115n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C4480n.f8088m.matcher(substring).find()) {
                            throw m13218d("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f8118q = str2;
                    this.f8121t = C4480n.m13212c(str2);
                    return;
                }
                return;
            }
            throw m13218d("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: j */
        private void m13224j(Annotation annotation) {
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
                m13223i("HEAD", ((HEAD) annotation).value(), false);
                if (!Void.class.equals(this.f8107f)) {
                    throw m13218d("HEAD method must use Void as response type.", new Object[0]);
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
                    m13223i(http.method(), http.path(), http.hasBody());
                    return;
                } else if (annotation instanceof Headers) {
                    String[] value3 = ((Headers) annotation).value();
                    if (value3.length != 0) {
                        this.f8119r = m13222h(value3);
                        return;
                    }
                    throw m13218d("@Headers annotation is empty.", new Object[0]);
                } else if (annotation instanceof Multipart) {
                    if (!this.f8116o) {
                        this.f8117p = true;
                        return;
                    }
                    throw m13218d("Only one encoding annotation is allowed.", new Object[0]);
                } else if (!(annotation instanceof FormUrlEncoded)) {
                    return;
                } else {
                    if (!this.f8117p) {
                        this.f8116o = true;
                        return;
                    }
                    throw m13218d("Only one encoding annotation is allowed.", new Object[0]);
                }
                m13223i(str2, value2, true);
                return;
            }
            m13223i(str, value, false);
        }

        /* renamed from: k */
        private C4454i<?> m13225k(int i, Type type, Annotation[] annotationArr) {
            C4454i<?> iVar = null;
            for (Annotation l : annotationArr) {
                C4454i<?> l2 = m13226l(i, type, annotationArr, l);
                if (l2 != null) {
                    if (iVar == null) {
                        iVar = l2;
                    } else {
                        throw m13220f(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (iVar != null) {
                return iVar;
            }
            throw m13220f(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: l */
        private C4454i<?> m13226l(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<C4393w.C4395b> cls2 = C4393w.C4395b.class;
            if (annotation instanceof Url) {
                if (this.f8113l) {
                    throw m13220f(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f8111j) {
                    throw m13220f(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f8112k) {
                    throw m13220f(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f8118q == null) {
                    this.f8113l = true;
                    if (type == C4390t.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C4454i.C4469o();
                    }
                    throw m13220f(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m13220f(i, "@Url cannot be used with @%s URL", this.f8114m);
                }
            } else if (annotation instanceof Path) {
                if (this.f8112k) {
                    throw m13220f(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f8113l) {
                    throw m13220f(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f8118q != null) {
                    this.f8111j = true;
                    Path path = (Path) annotation;
                    String value = path.value();
                    m13227m(i, value);
                    return new C4454i.C4464j(value, this.f8102a.mo24577l(type, annotationArr), path.encoded());
                } else {
                    throw m13220f(i, "@Path can only be used with relative url on @%s", this.f8114m);
                }
            } else if (annotation instanceof Query) {
                Query query = (Query) annotation;
                String value2 = query.value();
                boolean encoded = query.encoded();
                Class<?> i2 = C4482o.m13237i(type);
                this.f8112k = true;
                if (Iterable.class.isAssignableFrom(i2)) {
                    if (type instanceof ParameterizedType) {
                        return new C4454i.C4465k(value2, this.f8102a.mo24577l(C4482o.m13236h(0, (ParameterizedType) type), annotationArr), encoded).mo24541c();
                    }
                    throw m13220f(i, i2.getSimpleName() + " must include generic type (e.g., " + i2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i2.isArray()) {
                    return new C4454i.C4465k(value2, this.f8102a.mo24577l(type, annotationArr), encoded);
                } else {
                    return new C4454i.C4465k(value2, this.f8102a.mo24577l(C4480n.m13211b(i2.getComponentType()), annotationArr), encoded).mo24540b();
                }
            } else if (annotation instanceof QueryName) {
                boolean encoded2 = ((QueryName) annotation).encoded();
                Class<?> i3 = C4482o.m13237i(type);
                this.f8112k = true;
                if (Iterable.class.isAssignableFrom(i3)) {
                    if (type instanceof ParameterizedType) {
                        return new C4454i.C4467m(this.f8102a.mo24577l(C4482o.m13236h(0, (ParameterizedType) type), annotationArr), encoded2).mo24541c();
                    }
                    throw m13220f(i, i3.getSimpleName() + " must include generic type (e.g., " + i3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i3.isArray()) {
                    return new C4454i.C4467m(this.f8102a.mo24577l(type, annotationArr), encoded2);
                } else {
                    return new C4454i.C4467m(this.f8102a.mo24577l(C4480n.m13211b(i3.getComponentType()), annotationArr), encoded2).mo24540b();
                }
            } else if (annotation instanceof QueryMap) {
                Class<?> i4 = C4482o.m13237i(type);
                if (Map.class.isAssignableFrom(i4)) {
                    Type j = C4482o.m13238j(type, i4, Map.class);
                    if (j instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) j;
                        Type h = C4482o.m13236h(0, parameterizedType);
                        if (cls == h) {
                            return new C4454i.C4466l(this.f8102a.mo24577l(C4482o.m13236h(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
                        }
                        throw m13220f(i, "@QueryMap keys must be of type String: " + h, new Object[0]);
                    }
                    throw m13220f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m13220f(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof Header) {
                String value3 = ((Header) annotation).value();
                Class<?> i5 = C4482o.m13237i(type);
                if (Iterable.class.isAssignableFrom(i5)) {
                    if (type instanceof ParameterizedType) {
                        return new C4454i.C4460f(value3, this.f8102a.mo24577l(C4482o.m13236h(0, (ParameterizedType) type), annotationArr)).mo24541c();
                    }
                    throw m13220f(i, i5.getSimpleName() + " must include generic type (e.g., " + i5.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i5.isArray()) {
                    return new C4454i.C4460f(value3, this.f8102a.mo24577l(type, annotationArr));
                } else {
                    return new C4454i.C4460f(value3, this.f8102a.mo24577l(C4480n.m13211b(i5.getComponentType()), annotationArr)).mo24540b();
                }
            } else if (annotation instanceof HeaderMap) {
                Class<?> i6 = C4482o.m13237i(type);
                if (Map.class.isAssignableFrom(i6)) {
                    Type j2 = C4482o.m13238j(type, i6, Map.class);
                    if (j2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) j2;
                        Type h2 = C4482o.m13236h(0, parameterizedType2);
                        if (cls == h2) {
                            return new C4454i.C4461g(this.f8102a.mo24577l(C4482o.m13236h(1, parameterizedType2), annotationArr));
                        }
                        throw m13220f(i, "@HeaderMap keys must be of type String: " + h2, new Object[0]);
                    }
                    throw m13220f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m13220f(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof Field) {
                if (this.f8116o) {
                    Field field = (Field) annotation;
                    String value4 = field.value();
                    boolean encoded3 = field.encoded();
                    this.f8108g = true;
                    Class<?> i7 = C4482o.m13237i(type);
                    if (Iterable.class.isAssignableFrom(i7)) {
                        if (type instanceof ParameterizedType) {
                            return new C4454i.C4458d(value4, this.f8102a.mo24577l(C4482o.m13236h(0, (ParameterizedType) type), annotationArr), encoded3).mo24541c();
                        }
                        throw m13220f(i, i7.getSimpleName() + " must include generic type (e.g., " + i7.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!i7.isArray()) {
                        return new C4454i.C4458d(value4, this.f8102a.mo24577l(type, annotationArr), encoded3);
                    } else {
                        return new C4454i.C4458d(value4, this.f8102a.mo24577l(C4480n.m13211b(i7.getComponentType()), annotationArr), encoded3).mo24540b();
                    }
                } else {
                    throw m13220f(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof FieldMap) {
                if (this.f8116o) {
                    Class<?> i8 = C4482o.m13237i(type);
                    if (Map.class.isAssignableFrom(i8)) {
                        Type j3 = C4482o.m13238j(type, i8, Map.class);
                        if (j3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) j3;
                            Type h3 = C4482o.m13236h(0, parameterizedType3);
                            if (cls == h3) {
                                C11575e l = this.f8102a.mo24577l(C4482o.m13236h(1, parameterizedType3), annotationArr);
                                this.f8108g = true;
                                return new C4454i.C4459e(l, ((FieldMap) annotation).encoded());
                            }
                            throw m13220f(i, "@FieldMap keys must be of type String: " + h3, new Object[0]);
                        }
                        throw m13220f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m13220f(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m13220f(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof Part) {
                if (this.f8117p) {
                    Part part = (Part) annotation;
                    this.f8109h = true;
                    String value5 = part.value();
                    Class<?> i9 = C4482o.m13237i(type);
                    if (!value5.isEmpty()) {
                        C4388s g = C4388s.m12602g("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", part.encoding());
                        if (Iterable.class.isAssignableFrom(i9)) {
                            if (type instanceof ParameterizedType) {
                                Type h4 = C4482o.m13236h(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(C4482o.m13237i(h4))) {
                                    return new C4454i.C4462h(g, this.f8102a.mo24575j(h4, annotationArr, this.f8104c)).mo24541c();
                                }
                                throw m13220f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw m13220f(i, i9.getSimpleName() + " must include generic type (e.g., " + i9.getSimpleName() + "<String>)", new Object[0]);
                        } else if (i9.isArray()) {
                            Class<?> b = C4480n.m13211b(i9.getComponentType());
                            if (!cls2.isAssignableFrom(b)) {
                                return new C4454i.C4462h(g, this.f8102a.mo24575j(b, annotationArr, this.f8104c)).mo24540b();
                            }
                            throw m13220f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(i9)) {
                            return new C4454i.C4462h(g, this.f8102a.mo24575j(type, annotationArr, this.f8104c));
                        } else {
                            throw m13220f(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(i9)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw m13220f(i, i9.getSimpleName() + " must include generic type (e.g., " + i9.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(C4482o.m13237i(C4482o.m13236h(0, (ParameterizedType) type)))) {
                            return C4454i.C4468n.f8053a.mo24541c();
                        } else {
                            throw m13220f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (i9.isArray()) {
                        if (cls2.isAssignableFrom(i9.getComponentType())) {
                            return C4454i.C4468n.f8053a.mo24540b();
                        }
                        throw m13220f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(i9)) {
                        return C4454i.C4468n.f8053a;
                    } else {
                        throw m13220f(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw m13220f(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof PartMap) {
                if (this.f8117p) {
                    this.f8109h = true;
                    Class<?> i10 = C4482o.m13237i(type);
                    if (Map.class.isAssignableFrom(i10)) {
                        Type j4 = C4482o.m13238j(type, i10, Map.class);
                        if (j4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) j4;
                            Type h5 = C4482o.m13236h(0, parameterizedType4);
                            if (cls == h5) {
                                Type h6 = C4482o.m13236h(1, parameterizedType4);
                                if (!cls2.isAssignableFrom(C4482o.m13237i(h6))) {
                                    return new C4454i.C4463i(this.f8102a.mo24575j(h6, annotationArr, this.f8104c), ((PartMap) annotation).encoding());
                                }
                                throw m13220f(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw m13220f(i, "@PartMap keys must be of type String: " + h5, new Object[0]);
                        }
                        throw m13220f(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m13220f(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m13220f(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof Body)) {
                return null;
            } else {
                if (this.f8116o || this.f8117p) {
                    throw m13220f(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f8110i) {
                    try {
                        C11575e j5 = this.f8102a.mo24575j(type, annotationArr, this.f8104c);
                        this.f8110i = true;
                        return new C4454i.C4457c(j5);
                    } catch (RuntimeException e) {
                        throw m13221g(e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw m13220f(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* renamed from: m */
        private void m13227m(int i, String str) {
            if (!C4480n.f8089n.matcher(str).matches()) {
                throw m13220f(i, "@Path parameter name must match %s. Found: %s", C4480n.f8088m.pattern(), str);
            } else if (!this.f8121t.contains(str)) {
                throw m13220f(i, "URL \"%s\" does not contain \"{%s}\".", this.f8118q, str);
            }
        }

        /* renamed from: a */
        public C4480n mo24587a() {
            C11573c<T, R> b = m13216b();
            this.f8124w = b;
            Type responseType = b.responseType();
            this.f8107f = responseType;
            if (responseType == C4476l.class || responseType == C4332c0.class) {
                throw m13218d("'" + C4482o.m13237i(this.f8107f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
            }
            this.f8123v = m13217c();
            for (Annotation j : this.f8104c) {
                m13224j(j);
            }
            if (this.f8114m != null) {
                if (!this.f8115n) {
                    if (this.f8117p) {
                        throw m13218d("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f8116o) {
                        throw m13218d("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f8105d.length;
                this.f8122u = new C4454i[length];
                int i = 0;
                while (i < length) {
                    Type type = this.f8106e[i];
                    if (!C4482o.m13239k(type)) {
                        Annotation[] annotationArr = this.f8105d[i];
                        if (annotationArr != null) {
                            this.f8122u[i] = m13225k(i, type, annotationArr);
                            i++;
                        } else {
                            throw m13220f(i, "No Retrofit annotation found.", new Object[0]);
                        }
                    } else {
                        throw m13220f(i, "Parameter type must not include a type variable or wildcard: %s", type);
                    }
                }
                if (this.f8118q == null && !this.f8113l) {
                    throw m13218d("Missing either @%s URL or @Url parameter.", this.f8114m);
                } else if (!this.f8116o && !this.f8117p && !this.f8115n && this.f8110i) {
                    throw m13218d("Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.f8116o && !this.f8108g) {
                    throw m13218d("Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.f8117p || this.f8109h) {
                    return new C4480n(this);
                } else {
                    throw m13218d("Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw m13218d("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    C4480n(C4481a<R, T> aVar) {
        this.f8090a = aVar.f8102a.mo24569c();
        this.f8091b = aVar.f8124w;
        this.f8092c = aVar.f8102a.mo24567a();
        this.f8093d = aVar.f8123v;
        this.f8094e = aVar.f8114m;
        this.f8095f = aVar.f8118q;
        this.f8096g = aVar.f8119r;
        this.f8097h = aVar.f8120s;
        this.f8098i = aVar.f8115n;
        this.f8099j = aVar.f8116o;
        this.f8100k = aVar.f8117p;
        this.f8101l = aVar.f8122u;
    }

    /* renamed from: b */
    static Class<?> m13211b(Class<?> cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* renamed from: c */
    static Set<String> m13212c(String str) {
        Matcher matcher = f8088m.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [j.b<R>, j.b] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo24584a(p173j.C4446b<R> r2) {
        /*
            r1 = this;
            j.c<R, T> r0 = r1.f8091b
            java.lang.Object r2 = r0.mo36498a(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p173j.C4480n.mo24584a(j.b):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4338e mo24585d(@Nullable Object... objArr) {
        C4474k kVar = new C4474k(this.f8094e, this.f8092c, this.f8095f, this.f8096g, this.f8097h, this.f8098i, this.f8099j, this.f8100k);
        C4454i<?>[] iVarArr = this.f8101l;
        int length = objArr != null ? objArr.length : 0;
        if (length == iVarArr.length) {
            for (int i = 0; i < length; i++) {
                iVarArr[i].mo24539a(kVar, objArr[i]);
            }
            return this.f8090a.mo23907a(kVar.mo24559g());
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + iVarArr.length + ")");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public R mo24586e(C4336d0 d0Var) {
        return this.f8093d.convert(d0Var);
    }
}
