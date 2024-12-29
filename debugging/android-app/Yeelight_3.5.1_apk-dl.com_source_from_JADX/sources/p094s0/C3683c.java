package p094s0;

import com.google.code.microlog4android.Level;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: s0.c */
public final class C3683c implements C3681a {

    /* renamed from: a */
    StringBuffer f6208a = new StringBuffer(256);

    /* renamed from: b */
    private String f6209b = Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* renamed from: a */
    public String mo26090a(String str, String str2, long j, Level level, Object obj, Throwable th) {
        if (this.f6208a.length() > 0) {
            StringBuffer stringBuffer = this.f6208a;
            stringBuffer.delete(0, stringBuffer.length());
        }
        if (str != null) {
            this.f6208a.append(str);
            this.f6208a.append(' ');
        }
        this.f6208a.append(j);
        this.f6208a.append(':');
        if (level != null) {
            this.f6208a.append('[');
            this.f6208a.append(level);
            this.f6208a.append(']');
        }
        if (obj != null) {
            this.f6208a.append(this.f6209b);
            this.f6208a.append(obj);
        }
        if (th != null) {
            this.f6208a.append(this.f6209b);
            this.f6208a.append(th);
        }
        return this.f6208a.toString();
    }
}
