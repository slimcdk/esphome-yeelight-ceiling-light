package p262i;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1138t;
import retrofit.http.DELETE;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.HTTP;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.PUT;

/* renamed from: i.q */
final class C11560q {

    /* renamed from: k */
    private static final Pattern f22958k = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: l */
    private static final Pattern f22959l = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: a */
    private final Method f22960a;

    /* renamed from: b */
    private String f22961b;

    /* renamed from: c */
    private boolean f22962c;

    /* renamed from: d */
    private boolean f22963d;

    /* renamed from: e */
    private boolean f22964e;

    /* renamed from: f */
    private String f22965f;

    /* renamed from: g */
    private C1130q f22966g;

    /* renamed from: h */
    private C1138t f22967h;

    /* renamed from: i */
    private C11548o[] f22968i;

    /* renamed from: j */
    private Set<String> f22969j;

    private C11560q(Method method) {
        this.f22960a = method;
    }

    /* renamed from: a */
    private RuntimeException m30318a(int i, String str, Object... objArr) {
        Method method = this.f22960a;
        return C11566t.m30360i(method, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* renamed from: b */
    private RuntimeException m30319b(Throwable th, int i, String str, Object... objArr) {
        Method method = this.f22960a;
        return C11566t.m30359h(th, method, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* renamed from: c */
    static C11559p m30320c(Method method, Type type, C11562s sVar) {
        C11560q qVar = new C11560q(method);
        qVar.m30323f(type);
        qVar.m30324g(sVar);
        return qVar.m30326i(sVar.mo36476a());
    }

    /* renamed from: d */
    private C1130q m30321d(String[] strArr) {
        C1130q.C1132b bVar = new C1130q.C1132b();
        for (String str : strArr) {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                throw C11566t.m30360i(this.f22960a, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
            String substring = str.substring(0, indexOf);
            String trim = str.substring(indexOf + 1).trim();
            if ("Content-Type".equalsIgnoreCase(substring)) {
                this.f22967h = C1138t.m2782c(trim);
            } else {
                bVar.mo9752b(substring, trim);
            }
        }
        return bVar.mo9755e();
    }

    /* renamed from: e */
    private void m30322e(String str, String str2, boolean z) {
        String str3 = this.f22961b;
        if (str3 == null) {
            this.f22961b = str;
            this.f22962c = z;
            if (!str2.isEmpty()) {
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (f22959l.matcher(substring).find()) {
                        throw C11566t.m30360i(this.f22960a, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f22965f = str2;
                this.f22969j = m30325h(str2);
                return;
            }
            return;
        }
        throw C11566t.m30360i(this.f22960a, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    /* renamed from: f */
    private void m30323f(Type type) {
        String value;
        String str;
        String value2;
        String str2;
        for (Annotation annotation : this.f22960a.getAnnotations()) {
            if (annotation instanceof DELETE) {
                value2 = ((DELETE) annotation).value();
                str2 = "DELETE";
            } else if (annotation instanceof GET) {
                value2 = ((GET) annotation).value();
                str2 = "GET";
            } else {
                if (annotation instanceof HEAD) {
                    m30322e("HEAD", ((HEAD) annotation).value(), false);
                    if (!Void.class.equals(type)) {
                        throw C11566t.m30360i(this.f22960a, "HEAD method must use Void as response type.", new Object[0]);
                    }
                } else {
                    if (annotation instanceof PATCH) {
                        value = ((PATCH) annotation).value();
                        str = "PATCH";
                    } else if (annotation instanceof POST) {
                        value = ((POST) annotation).value();
                        str = "POST";
                    } else if (annotation instanceof PUT) {
                        value = ((PUT) annotation).value();
                        str = "PUT";
                    } else if (annotation instanceof HTTP) {
                        HTTP http = (HTTP) annotation;
                        m30322e(http.method(), http.path(), http.hasBody());
                    } else if (annotation instanceof Headers) {
                        String[] value3 = ((Headers) annotation).value();
                        if (value3.length != 0) {
                            this.f22966g = m30321d(value3);
                        } else {
                            throw C11566t.m30360i(this.f22960a, "@Headers annotation is empty.", new Object[0]);
                        }
                    } else if (annotation instanceof Multipart) {
                        if (!this.f22963d) {
                            this.f22964e = true;
                        } else {
                            throw C11566t.m30360i(this.f22960a, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                    } else if (!(annotation instanceof FormUrlEncoded)) {
                        continue;
                    } else if (!this.f22964e) {
                        this.f22963d = true;
                    } else {
                        throw C11566t.m30360i(this.f22960a, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                    m30322e(str, value, true);
                }
            }
            m30322e(str2, value2, false);
        }
        if (this.f22961b == null) {
            throw C11566t.m30360i(this.f22960a, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        } else if (this.f22962c) {
        } else {
            if (this.f22964e) {
                throw C11566t.m30360i(this.f22960a, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            } else if (this.f22963d) {
                throw C11566t.m30360i(this.f22960a, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025d, code lost:
        throw m30318a(r7, "@Body parameters cannot be used with form or multi-part encoding.", new java.lang.Object[0]);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30324g(p262i.C11562s r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.lang.reflect.Method r2 = r1.f22960a
            java.lang.reflect.Type[] r2 = r2.getGenericParameterTypes()
            java.lang.reflect.Method r3 = r1.f22960a
            java.lang.annotation.Annotation[][] r3 = r3.getParameterAnnotations()
            int r4 = r3.length
            i.o[] r5 = new p262i.C11548o[r4]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x001a:
            if (r7 >= r4) goto L_0x029e
            r15 = r2[r7]
            r6 = r3[r7]
            if (r6 == 0) goto L_0x0280
            int r14 = r6.length
            r16 = r2
            r2 = 0
        L_0x0026:
            r17 = r3
            if (r2 >= r14) goto L_0x027b
            r3 = r6[r2]
            r18 = 0
            r19 = r4
            boolean r4 = r3 instanceof retrofit.http.Url
            r20 = r10
            java.lang.String r10 = "@Path parameters may not be used with @Url."
            if (r4 == 0) goto L_0x0086
            if (r8 != 0) goto L_0x007c
            if (r12 != 0) goto L_0x0074
            if (r13 != 0) goto L_0x006a
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r15 != r3) goto L_0x0060
            java.lang.String r3 = r1.f22965f
            if (r3 != 0) goto L_0x0051
            i.o$j r18 = new i.o$j
            r18.<init>()
            r10 = r20
            r3 = 0
            r8 = 1
            goto L_0x0261
        L_0x0051:
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = r1.f22961b
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "@Url cannot be used with @%s URL"
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x0060:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@Url must be String type."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x006a:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "A @Url parameter must not come after a @Query"
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x0074:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.RuntimeException r0 = r1.m30318a(r7, r10, r0)
            throw r0
        L_0x007c:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "Multiple @Url method annotations found."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x0086:
            boolean r4 = r3 instanceof retrofit.http.Path
            if (r4 == 0) goto L_0x00cd
            if (r13 != 0) goto L_0x00c3
            if (r8 != 0) goto L_0x00bb
            java.lang.String r4 = r1.f22965f
            if (r4 == 0) goto L_0x00ac
            retrofit.http.Path r3 = (retrofit.http.Path) r3
            java.lang.String r4 = r3.value()
            r1.m30327j(r7, r4)
            i.o$g r10 = new i.o$g
            boolean r3 = r3.encoded()
            r10.<init>(r4, r3)
            r18 = r10
            r10 = r20
            r3 = 0
            r12 = 1
            goto L_0x0261
        L_0x00ac:
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = r1.f22961b
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "@Path can only be used with relative url on @%s"
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x00bb:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.RuntimeException r0 = r1.m30318a(r7, r10, r0)
            throw r0
        L_0x00c3:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "A @Path parameter must not come after a @Query."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x00cd:
            boolean r4 = r3 instanceof retrofit.http.Query
            if (r4 == 0) goto L_0x00e8
            retrofit.http.Query r3 = (retrofit.http.Query) r3
            i.o$h r4 = new i.o$h
            java.lang.String r10 = r3.value()
            boolean r3 = r3.encoded()
            r4.<init>(r10, r3)
            r18 = r4
            r10 = r20
            r3 = 0
            r13 = 1
            goto L_0x0261
        L_0x00e8:
            boolean r4 = r3 instanceof retrofit.http.QueryMap
            if (r4 == 0) goto L_0x010e
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.Class r10 = p262i.C11566t.m30355d(r15)
            boolean r4 = r4.isAssignableFrom(r10)
            if (r4 == 0) goto L_0x0104
            retrofit.http.QueryMap r3 = (retrofit.http.QueryMap) r3
            i.o$i r4 = new i.o$i
            boolean r3 = r3.encoded()
            r4.<init>(r3)
            goto L_0x011d
        L_0x0104:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@QueryMap parameter type must be Map."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x010e:
            boolean r4 = r3 instanceof retrofit.http.Header
            if (r4 == 0) goto L_0x0124
            retrofit.http.Header r3 = (retrofit.http.Header) r3
            i.o$d r4 = new i.o$d
            java.lang.String r3 = r3.value()
            r4.<init>(r3)
        L_0x011d:
            r18 = r4
            r10 = r20
            r3 = 0
            goto L_0x0261
        L_0x0124:
            boolean r4 = r3 instanceof retrofit.http.Field
            if (r4 == 0) goto L_0x014b
            boolean r4 = r1.f22963d
            if (r4 == 0) goto L_0x0141
            retrofit.http.Field r3 = (retrofit.http.Field) r3
            i.o$b r4 = new i.o$b
            java.lang.String r10 = r3.value()
            boolean r3 = r3.encoded()
            r4.<init>(r10, r3)
        L_0x013b:
            r18 = r4
            r3 = 0
            r10 = 1
            goto L_0x0261
        L_0x0141:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@Field parameters can only be used with form encoding."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x014b:
            boolean r4 = r3 instanceof retrofit.http.FieldMap
            if (r4 == 0) goto L_0x017f
            boolean r4 = r1.f22963d
            if (r4 == 0) goto L_0x0175
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.Class r10 = p262i.C11566t.m30355d(r15)
            boolean r4 = r4.isAssignableFrom(r10)
            if (r4 == 0) goto L_0x016b
            retrofit.http.FieldMap r3 = (retrofit.http.FieldMap) r3
            i.o$c r4 = new i.o$c
            boolean r3 = r3.encoded()
            r4.<init>(r3)
            goto L_0x013b
        L_0x016b:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@FieldMap parameter type must be Map."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x0175:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@FieldMap parameters can only be used with form encoding."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x017f:
            boolean r4 = r3 instanceof retrofit.http.Part
            if (r4 == 0) goto L_0x01e3
            boolean r4 = r1.f22964e
            if (r4 == 0) goto L_0x01d9
            retrofit.http.Part r3 = (retrofit.http.Part) r3
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r10 = "Content-Disposition"
            r11 = 0
            r4[r11] = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "form-data; name=\""
            r10.append(r11)
            java.lang.String r11 = r3.value()
            r10.append(r11)
            java.lang.String r11 = "\""
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = 1
            r4[r11] = r10
            r10 = 2
            java.lang.String r11 = "Content-Transfer-Encoding"
            r4[r10] = r11
            r10 = 3
            java.lang.String r3 = r3.encoding()
            r4[r10] = r3
            c.d.a.q r3 = p011c.p083d.p084a.C1130q.m2706f(r4)
            i.e r4 = r0.mo36482h(r15, r6)     // Catch:{ RuntimeException -> 0x01ca }
            i.o$e r10 = new i.o$e
            r10.<init>(r3, r4)
            r18 = r10
            goto L_0x0204
        L_0x01ca:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r15
            java.lang.String r3 = "Unable to create @Part converter for %s"
            java.lang.RuntimeException r0 = r1.m30319b(r2, r7, r3, r0)
            throw r0
        L_0x01d9:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@Part parameters can only be used with multipart encoding."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x01e3:
            boolean r4 = r3 instanceof retrofit.http.PartMap
            if (r4 == 0) goto L_0x021d
            boolean r4 = r1.f22964e
            if (r4 == 0) goto L_0x0213
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.Class r10 = p262i.C11566t.m30355d(r15)
            boolean r4 = r4.isAssignableFrom(r10)
            if (r4 == 0) goto L_0x0209
            retrofit.http.PartMap r3 = (retrofit.http.PartMap) r3
            i.o$f r4 = new i.o$f
            java.lang.String r3 = r3.encoding()
            r4.<init>(r0, r3, r6)
            r18 = r4
        L_0x0204:
            r10 = r20
            r3 = 0
            r11 = 1
            goto L_0x0261
        L_0x0209:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@PartMap parameter type must be Map."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x0213:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x021d:
            boolean r3 = r3 instanceof retrofit.http.Body
            if (r3 == 0) goto L_0x025e
            boolean r3 = r1.f22963d
            if (r3 != 0) goto L_0x0254
            boolean r3 = r1.f22964e
            if (r3 != 0) goto L_0x0254
            if (r9 != 0) goto L_0x024a
            i.e r3 = r0.mo36482h(r15, r6)     // Catch:{ RuntimeException -> 0x023b }
            i.o$a r4 = new i.o$a
            r4.<init>(r3)
            r18 = r4
            r10 = r20
            r3 = 0
            r9 = 1
            goto L_0x0261
        L_0x023b:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r15
            java.lang.String r3 = "Unable to create @Body converter for %s"
            java.lang.RuntimeException r0 = r1.m30319b(r2, r7, r3, r0)
            throw r0
        L_0x024a:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "Multiple @Body method annotations found."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x0254:
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x025e:
            r3 = 0
            r10 = r20
        L_0x0261:
            if (r18 == 0) goto L_0x0273
            r4 = r5[r7]
            if (r4 != 0) goto L_0x026a
            r5[r7] = r18
            goto L_0x0273
        L_0x026a:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "Multiple Retrofit annotations found, only one allowed."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x0273:
            int r2 = r2 + 1
            r3 = r17
            r4 = r19
            goto L_0x0026
        L_0x027b:
            r19 = r4
            r20 = r10
            goto L_0x0286
        L_0x0280:
            r16 = r2
            r17 = r3
            r19 = r4
        L_0x0286:
            r2 = r5[r7]
            if (r2 == 0) goto L_0x0294
            int r7 = r7 + 1
            r2 = r16
            r3 = r17
            r4 = r19
            goto L_0x001a
        L_0x0294:
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "No Retrofit annotation found."
            java.lang.RuntimeException r0 = r1.m30318a(r7, r2, r0)
            throw r0
        L_0x029e:
            r2 = 0
            java.lang.String r0 = r1.f22965f
            if (r0 != 0) goto L_0x02b6
            if (r8 == 0) goto L_0x02a6
            goto L_0x02b6
        L_0x02a6:
            java.lang.reflect.Method r0 = r1.f22960a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r1.f22961b
            r3[r2] = r4
            java.lang.String r2 = "Missing either @%s URL or @Url parameter."
            java.lang.RuntimeException r0 = p262i.C11566t.m30360i(r0, r2, r3)
            throw r0
        L_0x02b6:
            boolean r0 = r1.f22963d
            if (r0 != 0) goto L_0x02d1
            boolean r0 = r1.f22964e
            if (r0 != 0) goto L_0x02d1
            boolean r0 = r1.f22962c
            if (r0 != 0) goto L_0x02d1
            if (r9 != 0) goto L_0x02c5
            goto L_0x02d1
        L_0x02c5:
            java.lang.reflect.Method r0 = r1.f22960a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Non-body HTTP method cannot contain @Body."
            java.lang.RuntimeException r0 = p262i.C11566t.m30360i(r0, r3, r2)
            throw r0
        L_0x02d1:
            boolean r0 = r1.f22963d
            if (r0 == 0) goto L_0x02e4
            if (r10 == 0) goto L_0x02d8
            goto L_0x02e4
        L_0x02d8:
            java.lang.reflect.Method r0 = r1.f22960a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Form-encoded method must contain at least one @Field."
            java.lang.RuntimeException r0 = p262i.C11566t.m30360i(r0, r3, r2)
            throw r0
        L_0x02e4:
            r2 = 0
            boolean r0 = r1.f22964e
            if (r0 == 0) goto L_0x02f7
            if (r11 == 0) goto L_0x02ec
            goto L_0x02f7
        L_0x02ec:
            java.lang.reflect.Method r0 = r1.f22960a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Multipart method must contain at least one @Part."
            java.lang.RuntimeException r0 = p262i.C11566t.m30360i(r0, r3, r2)
            throw r0
        L_0x02f7:
            r1.f22968i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p262i.C11560q.m30324g(i.s):void");
    }

    /* renamed from: h */
    static Set<String> m30325h(String str) {
        Matcher matcher = f22959l.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* renamed from: i */
    private C11559p m30326i(C11519a aVar) {
        return new C11559p(this.f22961b, aVar, this.f22965f, this.f22966g, this.f22967h, this.f22962c, this.f22963d, this.f22964e, this.f22968i);
    }

    /* renamed from: j */
    private void m30327j(int i, String str) {
        if (!f22958k.matcher(str).matches()) {
            throw m30318a(i, "@Path parameter name must match %s. Found: %s", f22959l.pattern(), str);
        } else if (!this.f22969j.contains(str)) {
            throw m30318a(i, "URL \"%s\" does not contain \"{%s}\".", this.f22965f, str);
        }
    }
}
