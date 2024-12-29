package p173j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import p156f.C4336d0;
import p163g.C4406c;

/* renamed from: j.o */
final class C4482o {

    /* renamed from: a */
    static final Type[] f8125a = new Type[0];

    /* renamed from: j.o$b */
    private static final class C4483b implements ParameterizedType {

        /* renamed from: a */
        private final Type f8126a;

        /* renamed from: b */
        private final Type f8127b;

        /* renamed from: c */
        private final Type[] f8128c;

        C4483b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                C4482o.m13230b(type3, "typeArgument == null");
                C4482o.m13231c(type3);
            }
            this.f8126a = type;
            this.f8127b = type2;
            this.f8128c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C4482o.m13233e(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f8128c.clone();
        }

        public Type getOwnerType() {
            return this.f8126a;
        }

        public Type getRawType() {
            return this.f8127b;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f8128c) ^ this.f8127b.hashCode();
            Type type = this.f8126a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f8128c;
            if (typeArr.length == 0) {
                return C4482o.m13245q(this.f8127b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C4482o.m13245q(this.f8127b));
            sb.append("<");
            sb.append(C4482o.m13245q(this.f8128c[0]));
            for (int i = 1; i < this.f8128c.length; i++) {
                sb.append(", ");
                sb.append(C4482o.m13245q(this.f8128c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: j.o$a */
    private static final class C4484a implements GenericArrayType {

        /* renamed from: a */
        private final Type f8129a;

        C4484a(Type type) {
            this.f8129a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C4482o.m13233e(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f8129a;
        }

        public int hashCode() {
            return this.f8129a.hashCode();
        }

        public String toString() {
            return C4482o.m13245q(this.f8129a) + "[]";
        }
    }

    /* renamed from: j.o$c */
    private static final class C4485c implements WildcardType {

        /* renamed from: a */
        private final Type f8130a;

        /* renamed from: b */
        private final Type f8131b;

        C4485c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C4482o.m13231c(typeArr2[0]);
                    if (typeArr[0] == cls) {
                        this.f8131b = typeArr2[0];
                        this.f8130a = cls;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            } else if (typeArr[0] != null) {
                C4482o.m13231c(typeArr[0]);
                this.f8131b = null;
                this.f8130a = typeArr[0];
            } else {
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C4482o.m13233e(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f8131b;
            if (type == null) {
                return C4482o.f8125a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f8130a};
        }

        public int hashCode() {
            Type type = this.f8131b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f8130a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f8131b != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f8131b;
            } else if (this.f8130a == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f8130a;
            }
            sb.append(C4482o.m13245q(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    static C4336d0 m13229a(C4336d0 d0Var) {
        C4406c cVar = new C4406c();
        d0Var.mo23840o().mo24216R0(cVar);
        return C4336d0.m12306j(d0Var.mo23839i(), d0Var.mo23838h(), cVar);
    }

    /* renamed from: b */
    static <T> T m13230b(@Nullable T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    static void m13231c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    private static Class<?> m13232d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m13233e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m13233e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    /* renamed from: f */
    static Type m13234f(Type type) {
        if (type instanceof ParameterizedType) {
            return m13236h(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: g */
    static Type m13235g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m13235g(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m13235g(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: h */
    static Type m13236h(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    /* renamed from: i */
    static Class<?> m13237i(Type type) {
        m13230b(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m13237i(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m13237i(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    /* renamed from: j */
    static Type m13238j(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m13242n(type, cls, m13235g(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    static boolean m13239k(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type k : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m13239k(k)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m13239k(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    /* renamed from: l */
    private static int m13240l(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: m */
    static boolean m13241m(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.reflect.Type m13242n(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m13243o(r8, r9, r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m13242n(r8, r9, r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            j.o$a r0 = new j.o$a
            r0.<init>(r8)
        L_0x002c:
            return r0
        L_0x002d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m13242n(r8, r9, r0)
            if (r0 != r8) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            j.o$a r10 = new j.o$a
            r10.<init>(r8)
        L_0x0043:
            return r10
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0086
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m13242n(r8, r9, r0)
            if (r3 == r0) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005e:
            if (r2 >= r5) goto L_0x0079
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m13242n(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0076
            if (r0 != 0) goto L_0x0074
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x0074:
            r4[r2] = r6
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0079:
            if (r0 == 0) goto L_0x0085
            j.o$b r8 = new j.o$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x0085:
            return r10
        L_0x0086:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00ca
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00b1
            r3 = r0[r2]
            java.lang.reflect.Type r8 = m13242n(r8, r9, r3)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00ca
            j.o$c r9 = new j.o$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r2] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r0[r2] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00b1:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00ca
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m13242n(r8, r9, r0)     // Catch:{ all -> 0x00cb }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00ca
            j.o$c r9 = new j.o$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            java.lang.reflect.Type[] r8 = f8125a
            r9.<init>(r10, r8)
            return r9
        L_0x00ca:
            return r10
        L_0x00cb:
            r8 = move-exception
            goto L_0x00ce
        L_0x00cd:
            throw r8
        L_0x00ce:
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: p173j.C4482o.m13242n(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: o */
    private static Type m13243o(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d = m13232d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        Type g = m13235g(type, cls, d);
        if (!(g instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) g).getActualTypeArguments()[m13240l(d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: p */
    static void m13244p(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: q */
    static String m13245q(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: r */
    static <T> void m13246r(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }
}
