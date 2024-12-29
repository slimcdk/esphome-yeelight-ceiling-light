package kotlin.collections;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.l */
class C9351l extends C9349k {
    /* renamed from: g */
    public static char m22888g(@NotNull char[] cArr) {
        C9424q.m22996e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }
}
