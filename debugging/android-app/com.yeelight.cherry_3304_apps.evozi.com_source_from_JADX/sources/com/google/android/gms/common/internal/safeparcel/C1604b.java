package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public class C1604b {
    /* renamed from: a */
    public static int m4435a(Parcel parcel) {
        return m4457w(parcel, 20293);
    }

    /* renamed from: b */
    public static void m4436b(Parcel parcel, int i) {
        m4459y(parcel, i);
    }

    /* renamed from: c */
    public static void m4437c(Parcel parcel, int i, boolean z) {
        m4460z(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m4438d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m4460z(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m4439e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int w = m4457w(parcel, i);
            parcel.writeBundle(bundle);
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m4440f(Parcel parcel, int i, byte b) {
        m4460z(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: g */
    public static void m4441g(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int w = m4457w(parcel, i);
            parcel.writeByteArray(bArr);
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m4442h(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m4460z(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m4443i(Parcel parcel, int i, float f) {
        m4460z(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: j */
    public static void m4444j(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m4460z(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m4445k(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int w = m4457w(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m4446l(Parcel parcel, int i, int i2) {
        m4460z(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: m */
    public static void m4447m(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m4460z(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m4448n(Parcel parcel, int i, long j) {
        m4460z(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: o */
    public static void m4449o(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m4460z(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m4450p(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int w = m4457w(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m4451q(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int w = m4457w(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m4452r(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int w = m4457w(parcel, i);
            parcel.writeString(str);
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m4453s(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int w = m4457w(parcel, i);
            parcel.writeStringArray(strArr);
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static void m4454t(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int w = m4457w(parcel, i);
            parcel.writeStringList(list);
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static <T extends Parcelable> void m4455u(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int w = m4457w(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m4458x(parcel, t, i2);
                }
            }
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static <T extends Parcelable> void m4456v(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int w = m4457w(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m4458x(parcel, parcelable, 0);
                }
            }
            m4459y(parcel, w);
        } else if (z) {
            m4460z(parcel, i, 0);
        }
    }

    /* renamed from: w */
    private static int m4457w(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: x */
    private static <T extends Parcelable> void m4458x(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: y */
    private static void m4459y(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: z */
    private static void m4460z(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }
}
