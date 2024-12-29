package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "CollectionToArray")
/* renamed from: kotlin.jvm.internal.n */
public final class C9421n {
    @NotNull

    /* renamed from: a */
    private static final Object[] f17309a = new Object[0];

    @NotNull
    @JvmName(name = "toArray")
    /* renamed from: a */
    public static final Object[] m22990a(@NotNull Collection<?> collection) {
        C9424q.m22996e(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        C9424q.m22995d(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        C9424q.m22995d(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f17309a;
    }

    @NotNull
    @JvmName(name = "toArray")
    /* renamed from: b */
    public static final Object[] m22991b(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArr2;
        C9424q.m22996e(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    C9424q.m22994c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        C9424q.m22995d(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        C9424q.m22995d(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }
}
