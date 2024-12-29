package p107v1;

import com.google.gson.C2469e;
import com.google.gson.C2534q;
import com.google.gson.C2536r;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.C2497b;
import p119y1.C3918a;

/* renamed from: v1.d */
public final class C3743d implements C2536r {

    /* renamed from: a */
    private final C2497b f6272a;

    public C3743d(C2497b bVar) {
        this.f6272a = bVar;
    }

    /* renamed from: a */
    public <T> C2534q<T> mo19368a(C2469e eVar, C3918a<T> aVar) {
        JsonAdapter jsonAdapter = (JsonAdapter) aVar.mo26409c().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return mo26163b(this.f6272a, eVar, aVar, jsonAdapter);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.google.gson.q<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.google.gson.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: v1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: v1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: v1.l} */
    /* JADX WARNING: type inference failed for: r9v3, types: [com.google.gson.q<?>, com.google.gson.q] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.C2534q<?> mo26163b(com.google.gson.internal.C2497b r9, com.google.gson.C2469e r10, p119y1.C3918a<?> r11, com.google.gson.annotations.JsonAdapter r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            y1.a r0 = p119y1.C3918a.m11207a(r0)
            com.google.gson.internal.f r9 = r9.mo19365a(r0)
            java.lang.Object r9 = r9.mo19367a()
            boolean r0 = r9 instanceof com.google.gson.C2534q
            if (r0 == 0) goto L_0x0017
            com.google.gson.q r9 = (com.google.gson.C2534q) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.google.gson.C2536r
            if (r0 == 0) goto L_0x0022
            com.google.gson.r r9 = (com.google.gson.C2536r) r9
            com.google.gson.q r9 = r9.mo19368a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.google.gson.C2533p
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.google.gson.C2527j
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
            com.google.gson.p r0 = (com.google.gson.C2533p) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.google.gson.C2527j
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.google.gson.j r1 = (com.google.gson.C2527j) r1
        L_0x006b:
            r4 = r1
            v1.l r9 = new v1.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.google.gson.q r9 = r9.mo19413a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p107v1.C3743d.mo26163b(com.google.gson.internal.b, com.google.gson.e, y1.a, com.google.gson.annotations.JsonAdapter):com.google.gson.q");
    }
}
