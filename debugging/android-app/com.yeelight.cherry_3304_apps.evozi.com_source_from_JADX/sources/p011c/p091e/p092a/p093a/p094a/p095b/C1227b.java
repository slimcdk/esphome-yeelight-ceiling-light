package p011c.p091e.p092a.p093a.p094a.p095b;

import p011c.p091e.p092a.p093a.p100f.C1251d;

/* renamed from: c.e.a.a.a.b.b */
public final class C1227b {
    /* renamed from: a */
    public static byte[] m3167a(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return C1251d.m3238a(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
