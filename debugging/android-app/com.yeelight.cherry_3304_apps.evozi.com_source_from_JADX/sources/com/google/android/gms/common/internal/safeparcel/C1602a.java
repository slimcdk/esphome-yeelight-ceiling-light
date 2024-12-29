package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C1602a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C1603a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1603a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.C1602a.C1603a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    public static float m4396A(Parcel parcel, int i) {
        m4407L(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: B */
    public static Float m4397B(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        if (I == 0) {
            return null;
        }
        m4408M(parcel, i, I, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: C */
    public static int m4398C(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: D */
    public static IBinder m4399D(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + I);
        return readStrongBinder;
    }

    /* renamed from: E */
    public static int m4400E(Parcel parcel, int i) {
        m4407L(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: F */
    public static Integer m4401F(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        if (I == 0) {
            return null;
        }
        m4408M(parcel, i, I, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: G */
    public static long m4402G(Parcel parcel, int i) {
        m4407L(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: H */
    public static Long m4403H(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        if (I == 0) {
            return null;
        }
        m4408M(parcel, i, I, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: I */
    public static int m4404I(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & SupportMenu.USER_MASK : parcel.readInt();
    }

    /* renamed from: J */
    public static void m4405J(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m4404I(parcel, i));
    }

    /* renamed from: K */
    public static int m4406K(Parcel parcel) {
        int C = m4398C(parcel);
        int I = m4404I(parcel, C);
        int dataPosition = parcel.dataPosition();
        if (m4429u(C) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(C));
            throw new C1603a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = I + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C1603a(sb.toString(), parcel);
    }

    /* renamed from: L */
    private static void m4407L(Parcel parcel, int i, int i2) {
        int I = m4404I(parcel, i);
        if (I != i2) {
            String hexString = Integer.toHexString(I);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(I);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C1603a(sb.toString(), parcel);
        }
    }

    /* renamed from: M */
    private static void m4408M(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C1603a(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    public static BigDecimal m4409a(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + I);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m4410b(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + I);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m4411c(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + I);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m4412d(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + I);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m4413e(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + I);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m4414f(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + I);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m4415g(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + I);
        return createByteArray;
    }

    /* renamed from: h */
    public static double[] m4416h(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + I);
        return createDoubleArray;
    }

    /* renamed from: i */
    public static float[] m4417i(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + I);
        return createFloatArray;
    }

    /* renamed from: j */
    public static int[] m4418j(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + I);
        return createIntArray;
    }

    /* renamed from: k */
    public static long[] m4419k(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + I);
        return createLongArray;
    }

    /* renamed from: l */
    public static Parcel m4420l(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, I);
        parcel.setDataPosition(dataPosition + I);
        return obtain;
    }

    /* renamed from: m */
    public static Parcel[] m4421m(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + I);
        return parcelArr;
    }

    /* renamed from: n */
    public static <T extends Parcelable> T m4422n(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + I);
        return t;
    }

    /* renamed from: o */
    public static String m4423o(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + I);
        return readString;
    }

    /* renamed from: p */
    public static String[] m4424p(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + I);
        return createStringArray;
    }

    /* renamed from: q */
    public static ArrayList<String> m4425q(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + I);
        return createStringArrayList;
    }

    /* renamed from: r */
    public static <T> T[] m4426r(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + I);
        return createTypedArray;
    }

    /* renamed from: s */
    public static <T> ArrayList<T> m4427s(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int I = m4404I(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (I == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + I);
        return createTypedArrayList;
    }

    /* renamed from: t */
    public static void m4428t(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C1603a(sb.toString(), parcel);
        }
    }

    /* renamed from: u */
    public static int m4429u(int i) {
        return i & SupportMenu.USER_MASK;
    }

    /* renamed from: v */
    public static boolean m4430v(Parcel parcel, int i) {
        m4407L(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: w */
    public static Boolean m4431w(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        if (I == 0) {
            return null;
        }
        m4408M(parcel, i, I, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: x */
    public static byte m4432x(Parcel parcel, int i) {
        m4407L(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: y */
    public static double m4433y(Parcel parcel, int i) {
        m4407L(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: z */
    public static Double m4434z(Parcel parcel, int i) {
        int I = m4404I(parcel, i);
        if (I == 0) {
            return null;
        }
        m4408M(parcel, i, I, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
