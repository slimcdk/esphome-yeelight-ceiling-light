package p159g3;

import p181l3.C9525d;

/* renamed from: g3.b */
public final class C9051b {
    /* renamed from: a */
    public static byte[] m21681a(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return C9525d.m23175a(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
