package org.eclipse.jetty.util;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LazyList implements Cloneable, Serializable {
    private static final String[] __EMTPY_STRING_ARRAY = new String[0];

    private LazyList() {
    }

    public static Object add(Object obj, int i, Object obj2) {
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

    public static Object add(Object obj, Object obj2) {
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

    public static Object addArray(Object obj, Object[] objArr) {
        int i = 0;
        while (objArr != null && i < objArr.length) {
            obj = add(obj, objArr[i]);
            i++;
        }
        return obj;
    }

    public static Object addCollection(Object obj, Collection<?> collection) {
        for (Object add : collection) {
            obj = add(obj, add);
        }
        return obj;
    }

    public static <T> T[] addToArray(T[] tArr, T t, Class<?> cls) {
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

    public static <E> List<E> array2List(E[] eArr) {
        return (eArr == null || eArr.length == 0) ? new ArrayList() : new ArrayList(Arrays.asList(eArr));
    }

    public static Object clone(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof List ? new ArrayList((List) obj) : obj;
    }

    public static boolean contains(Object obj, Object obj2) {
        if (obj == null) {
            return false;
        }
        return obj instanceof List ? ((List) obj).contains(obj2) : obj.equals(obj2);
    }

    public static Object ensureSize(Object obj, int i) {
        if (obj == null) {
            return new ArrayList(i);
        }
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList.size() > i) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(i);
        arrayList3.add(obj);
        return arrayList3;
    }

    public static <E> E get(Object obj, int i) {
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

    public static <E> List<E> getList(Object obj) {
        return getList(obj, false);
    }

    public static <E> List<E> getList(Object obj, boolean z) {
        if (obj != null) {
            return obj instanceof List ? (List) obj : Collections.singletonList(obj);
        }
        if (z) {
            return null;
        }
        return Collections.emptyList();
    }

    public static <E> Iterator<E> iterator(Object obj) {
        return (obj == null ? Collections.emptyList() : obj instanceof List ? (List) obj : getList(obj)).iterator();
    }

    public static <E> ListIterator<E> listIterator(Object obj) {
        return (obj == null ? Collections.emptyList() : obj instanceof List ? (List) obj : getList(obj)).listIterator();
    }

    public static Object remove(Object obj, int i) {
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

    public static Object remove(Object obj, Object obj2) {
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

    public static <T> T[] removeFromArray(T[] tArr, Object obj) {
        if (obj != null && tArr != null) {
            int length = tArr.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                } else if (obj.equals(tArr[i])) {
                    T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), Array.getLength(tArr) - 1);
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

    public static int size(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return 1;
    }

    public static Object toArray(Object obj, Class<?> cls) {
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

    public static String toString(Object obj) {
        if (obj == null) {
            return "[]";
        }
        if (obj instanceof List) {
            return obj.toString();
        }
        return "[" + obj + "]";
    }

    public static String[] toStringArray(Object obj) {
        if (obj == null) {
            return __EMTPY_STRING_ARRAY;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            String[] strArr = new String[list.size()];
            int size = list.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return strArr;
                }
                Object obj2 = list.get(i);
                if (obj2 != null) {
                    strArr[i] = obj2.toString();
                }
                size = i;
            }
        } else {
            return new String[]{obj.toString()};
        }
    }
}
