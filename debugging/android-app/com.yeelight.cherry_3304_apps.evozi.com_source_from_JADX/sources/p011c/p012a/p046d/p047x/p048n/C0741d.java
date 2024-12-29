package p011c.p012a.p046d.p047x.p048n;

import com.google.gson.annotations.JsonAdapter;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.C0690w;
import p011c.p012a.p046d.p047x.C0696c;
import p011c.p012a.p046d.p051y.C0808a;

/* renamed from: c.a.d.x.n.d */
public final class C0741d implements C0690w {

    /* renamed from: a */
    private final C0696c f495a;

    public C0741d(C0696c cVar) {
        this.f495a = cVar;
    }

    /* renamed from: a */
    public <T> C0688v<T> mo8771a(C0664f fVar, C0808a<T> aVar) {
        JsonAdapter jsonAdapter = (JsonAdapter) aVar.mo8967c().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return mo8853b(this.f495a, fVar, aVar, jsonAdapter);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: c.a.d.v<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: c.a.d.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: c.a.d.x.n.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: c.a.d.x.n.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: c.a.d.x.n.l} */
    /* JADX WARNING: type inference failed for: r9v3, types: [c.a.d.v, c.a.d.v<?>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p011c.p012a.p046d.C0688v<?> mo8853b(p011c.p012a.p046d.p047x.C0696c r9, p011c.p012a.p046d.C0664f r10, p011c.p012a.p046d.p051y.C0808a<?> r11, com.google.gson.annotations.JsonAdapter r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            c.a.d.y.a r0 = p011c.p012a.p046d.p051y.C0808a.m1032a(r0)
            c.a.d.x.i r9 = r9.mo8787a(r0)
            java.lang.Object r9 = r9.mo8789a()
            boolean r0 = r9 instanceof p011c.p012a.p046d.C0688v
            if (r0 == 0) goto L_0x0017
            c.a.d.v r9 = (p011c.p012a.p046d.C0688v) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof p011c.p012a.p046d.C0690w
            if (r0 == 0) goto L_0x0022
            c.a.d.w r9 = (p011c.p012a.p046d.C0690w) r9
            c.a.d.v r9 = r9.mo8771a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof p011c.p012a.p046d.C0683s
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof p011c.p012a.p046d.C0675k
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            c.a.d.s r0 = (p011c.p012a.p046d.C0683s) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof p011c.p012a.p046d.C0675k
            if (r0 == 0) goto L_0x006b
            r1 = r9
            c.a.d.k r1 = (p011c.p012a.p046d.C0675k) r1
        L_0x006b:
            r4 = r1
            c.a.d.x.n.l r9 = new c.a.d.x.n.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            c.a.d.v r9 = r9.mo8769a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p047x.p048n.C0741d.mo8853b(c.a.d.x.c, c.a.d.f, c.a.d.y.a, com.google.gson.annotations.JsonAdapter):c.a.d.v");
    }
}
