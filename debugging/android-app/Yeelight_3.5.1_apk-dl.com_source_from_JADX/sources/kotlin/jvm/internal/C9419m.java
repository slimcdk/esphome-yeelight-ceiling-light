package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C9303a;
import kotlin.C9401i;
import kotlin.Pair;
import kotlin.reflect.C9455c;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p228x4.C11982a;
import p233y4.C12049a;
import p233y4.C12050b;
import p233y4.C12051c;
import p233y4.C12052d;
import p233y4.C12053e;
import p233y4.C12054f;
import p233y4.C12055g;
import p233y4.C12056h;
import p233y4.C12057i;
import p233y4.C12058j;
import p233y4.C12059k;
import p233y4.C12060l;
import p233y4.C12061m;
import p233y4.C12062n;
import p233y4.C12063o;
import p233y4.C12064p;
import p233y4.C12065q;
import p233y4.C12066r;
import p233y4.C12067s;
import p233y4.C12068t;
import p233y4.C12069u;
import p233y4.C12070v;
import p233y4.C12071w;

/* renamed from: kotlin.jvm.internal.m */
public final class C9419m implements C9455c<Object>, C9418l {
    @NotNull

    /* renamed from: b */
    private static final Map<Class<? extends C9303a<?>>, Integer> f17304b;
    @NotNull

    /* renamed from: c */
    private static final HashMap<String, String> f17305c;
    @NotNull

    /* renamed from: d */
    private static final HashMap<String, String> f17306d;
    @NotNull

    /* renamed from: e */
    private static final HashMap<String, String> f17307e;
    @NotNull

    /* renamed from: a */
    private final Class<?> f17308a;

    /* renamed from: kotlin.jvm.internal.m$a */
    public static final class C9420a {
        private C9420a() {
        }

        public /* synthetic */ C9420a(C9422o oVar) {
            this();
        }
    }

    static {
        new C9420a((C9422o) null);
        int i = 0;
        List g = C9366s.m22926g(C12049a.class, C12060l.class, C12064p.class, C12065q.class, C12066r.class, C12067s.class, C12068t.class, C12069u.class, C12070v.class, C12071w.class, C12050b.class, C12051c.class, C12052d.class, C12053e.class, C12054f.class, C12055g.class, C12056h.class, C12057i.class, C12058j.class, C12059k.class, C12061m.class, C12062n.class, C12063o.class);
        ArrayList arrayList = new ArrayList(C9368t.m22930j(g, 10));
        for (Object next : g) {
            int i2 = i + 1;
            if (i < 0) {
                C9366s.m22928i();
            }
            arrayList.add(C9401i.m22955a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f17304b = C9350k0.m22886i(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f17305c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f17306d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C9424q.m22995d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C9424q.m22995d(str, "kotlinName");
            sb.append(C9515r.m23163z(str, FilenameUtils.EXTENSION_SEPARATOR, (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            Pair a = C9401i.m22955a(sb2, str + ".Companion");
            hashMap3.put(a.getFirst(), a.getSecond());
        }
        for (Map.Entry next2 : f17304b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f17307e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9348j0.m22875c(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C9515r.m23163z((String) entry.getValue(), FilenameUtils.EXTENSION_SEPARATOR, (String) null, 2, (Object) null));
        }
    }

    public C9419m(@NotNull Class<?> cls) {
        C9424q.m22996e(cls, "jClass");
        this.f17308a = cls;
    }

    @NotNull
    /* renamed from: a */
    public Class<?> mo38325a() {
        return this.f17308a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C9419m) && C9424q.m22992a(C11982a.m30730b(this), C11982a.m30730b((C9455c) obj));
    }

    public int hashCode() {
        return C11982a.m30730b(this).hashCode();
    }

    @NotNull
    public String toString() {
        return mo38325a().toString() + " (Kotlin reflection is not available)";
    }
}
