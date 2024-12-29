package p164h.p211a.p212a.p228h;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: h.a.a.h.j */
public class C11126j implements Cloneable, Serializable {
    /* renamed from: a */
    public static Object m28878a(Object obj, int i, Object obj2) {
        if (obj == null) {
            if (i <= 0 && !(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(i, obj2);
            return arrayList;
        } else if (obj instanceof List) {
            ((List) obj).add(i, obj2);
            return obj;
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(obj);
            arrayList2.add(i, obj2);
            return arrayList2;
        }
    }

    /* renamed from: b */
    public static Object m28879b(Object obj, Object obj2) {
        if (obj == null) {
            if (!(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj2);
            return arrayList;
        } else if (obj instanceof List) {
            ((List) obj).add(obj2);
            return obj;
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(obj);
            arrayList2.add(obj2);
            return arrayList2;
        }
    }

    /* renamed from: c */
    public static Object m28880c(Object obj, Object[] objArr) {
        int i = 0;
        while (objArr != null && i < objArr.length) {
            obj = m28879b(obj, objArr[i]);
            i++;
        }
        return obj;
    }

    /* renamed from: d */
    public static <T> T[] m28881d(T[] tArr, T t, Class<?> cls) {
        if (tArr == null) {
            if (cls == null && t != null) {
                cls = t.getClass();
            }
            T[] tArr2 = (Object[]) Array.newInstance(cls, 1);
            tArr2[0] = t;
            return tArr2;
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), Array.getLength(tArr) + 1);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        tArr3[tArr.length] = t;
        return tArr3;
    }

    /* renamed from: e */
    public static Object m28882e(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof List ? new ArrayList((List) obj) : obj;
    }

    /* renamed from: f */
    public static boolean m28883f(Object obj, Object obj2) {
        if (obj == null) {
            return false;
        }
        return obj instanceof List ? ((List) obj).contains(obj2) : obj.equals(obj2);
    }

    /* renamed from: j */
    public static <E> E m28884j(Object obj, int i) {
        if (obj == null) {
            throw new IndexOutOfBoundsException();
        } else if (obj instanceof List) {
            return ((List) obj).get(i);
        } else {
            if (i == 0) {
                return obj;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: k */
    public static <E> List<E> m28885k(Object obj) {
        return m28886l(obj, false);
    }

    /* renamed from: l */
    public static <E> List<E> m28886l(Object obj, boolean z) {
        if (obj != null) {
            return obj instanceof List ? (List) obj : Collections.singletonList(obj);
        }
        if (z) {
            return null;
        }
        return Collections.emptyList();
    }

    /* renamed from: m */
    public static Object m28887m(Object obj, int i) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            list.remove(i);
            if (list.size() == 0) {
                return null;
            }
            return obj;
        } else if (i == 0) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: o */
    public static Object m28888o(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            list.remove(obj2);
            if (list.size() == 0) {
                return null;
            }
            return obj;
        } else if (obj.equals(obj2)) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: p */
    public static <T> T[] m28889p(T[] tArr, Object obj) {
        if (obj != null && tArr != null) {
            int length = tArr.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                } else if (obj.equals(tArr[i])) {
                    T[] tArr2 = (Object[]) Array.newInstance(tArr == null ? obj.getClass() : tArr.getClass().getComponentType(), Array.getLength(tArr) - 1);
                    if (i > 0) {
                        System.arraycopy(tArr, 0, tArr2, 0, i);
                    }
                    int i2 = i + 1;
                    if (i2 < tArr.length) {
                        System.arraycopy(tArr, i2, tArr2, i, tArr.length - i2);
                    }
                    return tArr2;
                } else {
                    length = i;
                }
            }
        }
        return tArr;
    }

    /* renamed from: q */
    public static int m28890q(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return 1;
    }

    /* renamed from: r */
    public static Object m28891r(Object obj, Class<?> cls) {
        if (obj == null) {
            return Array.newInstance(cls, 0);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (!cls.isPrimitive()) {
                return list.toArray((Object[]) Array.newInstance(cls, list.size()));
            }
            Object newInstance = Array.newInstance(cls, list.size());
            for (int i = 0; i < list.size(); i++) {
                Array.set(newInstance, i, list.get(i));
            }
            return newInstance;
        }
        Object newInstance2 = Array.newInstance(cls, 1);
        Array.set(newInstance2, 0, obj);
        return newInstance2;
    }
}
