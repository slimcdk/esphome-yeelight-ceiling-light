package com.yeelight.yeelib.utils;

import androidx.core.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.yeelight.yeelib.utils.s */
public class C10555s {
    /* renamed from: a */
    public static int m25790a(int i, int i2) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.put((byte) i);
        allocate.putShort((short) i2);
        allocate.put((byte) 0);
        return allocate.order(ByteOrder.LITTLE_ENDIAN).getInt(0);
    }

    /* renamed from: b */
    public static int m25791b(int i, int i2) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putShort((short) i);
        allocate.put((byte) i2);
        allocate.put((byte) 0);
        return allocate.order(ByteOrder.LITTLE_ENDIAN).getInt(0);
    }

    /* renamed from: c */
    public static int m25792c(byte b, byte b2, byte b3) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.put(b);
        allocate.put(b2);
        allocate.put(b3);
        return allocate.order(ByteOrder.LITTLE_ENDIAN).getInt(0);
    }

    /* renamed from: d */
    public static long m25793d(byte b, byte b2, byte b3, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(b);
        allocate.put((byte) 0);
        allocate.put(b2);
        allocate.put((byte) 0);
        allocate.put(b3);
        allocate.put(z ? (byte) 1 : 0);
        return allocate.order(ByteOrder.LITTLE_ENDIAN).getLong(0);
    }

    /* renamed from: e */
    public static int m25794e(int i) {
        int i2 = (i * 100) / SupportMenu.USER_MASK;
        if (i2 <= 0) {
            return 1;
        }
        if (i2 >= 100) {
            return 100;
        }
        return i2;
    }

    /* renamed from: f */
    public static int m25795f(int i) {
        int i2 = ((i * SupportMenu.USER_MASK) + 99) / 100;
        if (i2 <= 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: g */
    public static byte[] m25796g(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i);
        return allocate.array();
    }

    /* renamed from: h */
    public static byte[] m25797h(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(j);
        return allocate.array();
    }
}
