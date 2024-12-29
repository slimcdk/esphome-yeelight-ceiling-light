package com.xiaomi.push;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.xiaomi.push.iy */
public final class C4778iy {

    /* renamed from: a */
    private static final Comparator f9793a = new C4779a();

    /* renamed from: com.xiaomi.push.iy$a */
    private static class C4779a implements Comparator {
        private C4779a() {
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
            return obj instanceof List ? C4778iy.m15234a((List) obj, (List) obj2) : obj instanceof Set ? C4778iy.m15236a((Set) obj, (Set) obj2) : obj instanceof Map ? C4778iy.m15235a((Map) obj, (Map) obj2) : obj instanceof byte[] ? C4778iy.m15239a((byte[]) obj, (byte[]) obj2) : C4778iy.m15231a((Comparable) obj, (Comparable) obj2);
        }
    }

    /* renamed from: a */
    public static int m15228a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* renamed from: a */
    public static int m15229a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* renamed from: a */
    public static int m15230a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* renamed from: a */
    public static int m15231a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: a */
    public static int m15232a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: a */
    public static int m15233a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, remaining);
        return remaining;
    }

    /* renamed from: a */
    public static int m15234a(List list, List list2) {
        int a = m15229a(list.size(), list2.size());
        if (a != 0) {
            return a;
        }
        for (int i = 0; i < list.size(); i++) {
            int compare = f9793a.compare(list.get(i), list2.get(i));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m15235a(Map map, Map map2) {
        int a = m15229a(map.size(), map2.size());
        if (a != 0) {
            return a;
        }
        TreeMap treeMap = new TreeMap(f9793a);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(f9793a);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compare = f9793a.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = f9793a.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m15236a(Set set, Set set2) {
        int a = m15229a(set.size(), set2.size());
        if (a != 0) {
            return a;
        }
        TreeSet treeSet = new TreeSet(f9793a);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(f9793a);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = f9793a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m15237a(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* renamed from: a */
    public static int m15238a(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    /* renamed from: a */
    public static int m15239a(byte[] bArr, byte[] bArr2) {
        int a = m15229a(bArr.length, bArr2.length);
        if (a != 0) {
            return a;
        }
        for (int i = 0; i < bArr.length; i++) {
            int a2 = m15228a(bArr[i], bArr2[i]);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static String m15240a(byte b) {
        return Integer.toHexString((b | 256) & 511).toUpperCase().substring(1);
    }

    /* renamed from: a */
    public static ByteBuffer m15241a(ByteBuffer byteBuffer) {
        return m15241a(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m15241a(byteBuffer));
    }

    /* renamed from: a */
    public static void m15242a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int limit = byteBuffer.limit();
        int i = limit - arrayOffset > 128 ? arrayOffset + 128 : limit;
        for (int i2 = arrayOffset; i2 < i; i2++) {
            if (i2 > arrayOffset) {
                sb.append(" ");
            }
            sb.append(m15240a(array[i2]));
        }
        if (limit != i) {
            sb.append("...");
        }
    }

    /* renamed from: a */
    public static boolean m15243a(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* renamed from: a */
    public static byte[] m15244a(ByteBuffer byteBuffer) {
        if (m15241a(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m15233a(byteBuffer, bArr, 0);
        return bArr;
    }
}
