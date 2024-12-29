package com.squareup.haha.guava.primitives;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;

public final class Ints {
    private static final byte[] asciiDigits;

    static {
        byte[] bArr = new byte[128];
        asciiDigits = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i <= 9; i++) {
            asciiDigits[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 <= 26; i2++) {
            byte[] bArr2 = asciiDigits;
            byte b = (byte) (i2 + 10);
            bArr2[i2 + 65] = b;
            bArr2[i2 + 97] = b;
        }
    }

    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int saturatedCast(long j) {
        if (j > 2147483647L) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
