package com.xiaomi.push;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.xiaomi.push.iv */
public final class C4799iv {

    /* renamed from: a */
    private static final Comparator f9258a = new C4800a();

    /* renamed from: com.xiaomi.push.iv$a */
    private static class C4800a implements Comparator {
        private C4800a() {
        }

        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            return obj instanceof List ? C4799iv.m14843a((List) obj, (List) obj2) : obj instanceof Set ? C4799iv.m14845a((Set) obj, (Set) obj2) : obj instanceof Map ? C4799iv.m14844a((Map) obj, (Map) obj2) : obj instanceof byte[] ? C4799iv.m14848a((byte[]) obj, (byte[]) obj2) : C4799iv.m14840a((Comparable) obj, (Comparable) obj2);
        }
    }

    /* renamed from: a */
    public static int m14837a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* renamed from: a */
    public static int m14838a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* renamed from: a */
    public static int m14839a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* renamed from: a */
    public static int m14840a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: a */
    public static int m14841a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: a */
    public static int m14842a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, remaining);
        return remaining;
    }

    /* renamed from: a */
    public static int m14843a(List list, List list2) {
        int a = m14838a(list.size(), list2.size());
        if (a != 0) {
            return a;
        }
        for (int i = 0; i < list.size(); i++) {
            int compare = f9258a.compare(list.get(i), list2.get(i));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m14844a(Map map, Map map2) {
        int a = m14838a(map.size(), map2.size());
        if (a != 0) {
            return a;
        }
        Comparator comparator = f9258a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f9258a;
            int compare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m14845a(Set set, Set set2) {
        int a = m14838a(set.size(), set2.size());
        if (a != 0) {
            return a;
        }
        Comparator comparator = f9258a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = f9258a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m14846a(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* renamed from: a */
    public static int m14847a(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    /* renamed from: a */
    public static int m14848a(byte[] bArr, byte[] bArr2) {
        int a = m14838a(bArr.length, bArr2.length);
        if (a != 0) {
            return a;
        }
        for (int i = 0; i < bArr.length; i++) {
            int a2 = m14837a(bArr[i], bArr2[i]);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static String m14849a(byte b) {
        return Integer.toHexString((b | 256) & 511).toUpperCase().substring(1);
    }

    /* renamed from: a */
    public static ByteBuffer m14850a(ByteBuffer byteBuffer) {
        return m14850a(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m14850a(byteBuffer));
    }

    /* renamed from: a */
    public static void m14851a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int limit = byteBuffer.limit();
        int i = limit - arrayOffset > 128 ? arrayOffset + 128 : limit;
        for (int i2 = arrayOffset; i2 < i; i2++) {
            if (i2 > arrayOffset) {
                sb.append(" ");
            }
            sb.append(m14849a(array[i2]));
        }
        if (limit != i) {
            sb.append("...");
        }
    }

    /* renamed from: a */
    public static boolean m14852a(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* renamed from: a */
    public static byte[] m14853a(ByteBuffer byteBuffer) {
        if (m14850a(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m14842a(byteBuffer, bArr, 0);
        return bArr;
    }
}
