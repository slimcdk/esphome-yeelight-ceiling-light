package p227x3;

import com.yeelight.yeelib.utils.C8896a;

/* renamed from: x3.o */
public class C11979o extends C11968e {
    /* renamed from: a */
    public byte[] mo42548a() {
        Object[] objArr = this.f21862b;
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(obj == null ? "" : obj.toString());
            str = sb.toString();
        }
        return C8896a.m21225b(str);
    }

    public String toString() {
        Object[] objArr = this.f21862b;
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(obj == null ? "" : obj.toString());
            str = sb.toString();
        }
        return this.f21861a + " " + str;
    }
}
