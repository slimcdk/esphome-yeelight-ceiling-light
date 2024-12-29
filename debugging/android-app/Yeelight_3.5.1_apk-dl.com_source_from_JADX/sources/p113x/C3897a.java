package p113x;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* renamed from: x.a */
public class C3897a {
    /* renamed from: a */
    public static int m11105a(@NonNull Parcel parcel) {
        return m11127w(parcel, 20293);
    }

    /* renamed from: b */
    public static void m11106b(@NonNull Parcel parcel, int i) {
        m11128x(parcel, i);
    }

    /* renamed from: c */
    public static void m11107c(@NonNull Parcel parcel, int i, boolean z) {
        m11129y(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m11108d(@NonNull Parcel parcel, int i, @NonNull Boolean bool, boolean z) {
        if (bool != null) {
            m11129y(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m11109e(@NonNull Parcel parcel, int i, @NonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int w = m11127w(parcel, i);
            parcel.writeBundle(bundle);
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m11110f(@NonNull Parcel parcel, int i, byte b) {
        m11129y(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: g */
    public static void m11111g(@NonNull Parcel parcel, int i, @NonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int w = m11127w(parcel, i);
            parcel.writeByteArray(bArr);
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m11112h(@NonNull Parcel parcel, int i, @NonNull Double d, boolean z) {
        if (d != null) {
            m11129y(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m11113i(@NonNull Parcel parcel, int i, float f) {
        m11129y(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: j */
    public static void m11114j(@NonNull Parcel parcel, int i, @NonNull Float f, boolean z) {
        if (f != null) {
            m11129y(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m11115k(@NonNull Parcel parcel, int i, @NonNull IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int w = m11127w(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m11116l(@NonNull Parcel parcel, int i, int i2) {
        m11129y(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: m */
    public static void m11117m(@NonNull Parcel parcel, int i, @NonNull int[] iArr, boolean z) {
        if (iArr != null) {
            int w = m11127w(parcel, i);
            parcel.writeIntArray(iArr);
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m11118n(@NonNull Parcel parcel, int i, long j) {
        m11129y(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: o */
    public static void m11119o(@NonNull Parcel parcel, int i, @NonNull Long l, boolean z) {
        if (l != null) {
            m11129y(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m11120p(@NonNull Parcel parcel, int i, @NonNull Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int w = m11127w(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m11121q(@NonNull Parcel parcel, int i, @NonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int w = m11127w(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m11122r(@NonNull Parcel parcel, int i, @NonNull String str, boolean z) {
        if (str != null) {
            int w = m11127w(parcel, i);
            parcel.writeString(str);
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m11123s(@NonNull Parcel parcel, int i, @NonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int w = m11127w(parcel, i);
            parcel.writeStringArray(strArr);
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static void m11124t(@NonNull Parcel parcel, int i, @NonNull List<String> list, boolean z) {
        if (list != null) {
            int w = m11127w(parcel, i);
            parcel.writeStringList(list);
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static <T extends Parcelable> void m11125u(@NonNull Parcel parcel, int i, @NonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int w = m11127w(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m11130z(parcel, t, i2);
                }
            }
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static <T extends Parcelable> void m11126v(@NonNull Parcel parcel, int i, @NonNull List<T> list, boolean z) {
        if (list != null) {
            int w = m11127w(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m11130z(parcel, parcelable, 0);
                }
            }
            m11128x(parcel, w);
        } else if (z) {
            m11129y(parcel, i, 0);
        }
    }

    /* renamed from: w */
    private static int m11127w(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: x */
    private static void m11128x(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: y */
    private static void m11129y(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: z */
    private static void m11130z(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
