package p239z5;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Enumeration;
import java.util.List;
import java.util.StringTokenizer;
import org.eclipse.jetty.util.LazyList;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: z5.n */
public class C12180n {

    /* renamed from: c */
    private static final C9003c f22434c = C9001b.m21450a(C12180n.class);

    /* renamed from: a */
    long f22435a = 0;

    /* renamed from: b */
    long f22436b = 0;

    public C12180n(long j, long j2) {
        this.f22435a = j;
        this.f22436b = j2;
    }

    /* renamed from: d */
    public static List m31738d(Enumeration enumeration, long j) {
        long j2;
        long j3;
        Object obj = null;
        while (enumeration.hasMoreElements()) {
            StringTokenizer stringTokenizer = new StringTokenizer((String) enumeration.nextElement(), "=,", false);
            Object obj2 = obj;
            String str = null;
            while (true) {
                try {
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    try {
                        str = stringTokenizer.nextToken().trim();
                        int indexOf = str.indexOf(45);
                        if (indexOf >= 0) {
                            int i = indexOf + 1;
                            if (str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER, i) < 0) {
                                if (indexOf == 0) {
                                    if (i < str.length()) {
                                        j3 = Long.parseLong(str.substring(i).trim());
                                        j2 = -1;
                                    } else {
                                        f22434c.mo36847b("Bad range format: {}", str);
                                    }
                                } else if (i < str.length()) {
                                    j2 = Long.parseLong(str.substring(0, indexOf).trim());
                                    j3 = Long.parseLong(str.substring(i).trim());
                                } else {
                                    j2 = Long.parseLong(str.substring(0, indexOf).trim());
                                    j3 = -1;
                                }
                                if (j2 != -1 || j3 != -1) {
                                    if (j2 != -1 && j3 != -1 && j2 > j3) {
                                        break;
                                    } else if (j2 < j) {
                                        obj2 = LazyList.add(obj2, new C12180n(j2, j3));
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!"bytes".equals(str)) {
                            f22434c.mo36847b("Bad range format: {}", str);
                            break;
                        }
                    } catch (NumberFormatException e) {
                        C9003c cVar = f22434c;
                        cVar.mo36847b("Bad range format: {}", str);
                        cVar.mo36849d(e);
                    }
                } catch (Exception e2) {
                    C9003c cVar2 = f22434c;
                    cVar2.mo36847b("Bad range format: {}", str);
                    cVar2.mo36849d(e2);
                }
            }
            obj = obj2;
        }
        return LazyList.getList(obj, true);
    }

    /* renamed from: e */
    public static String m31739e(long j) {
        StringBuilder sb = new StringBuilder(40);
        sb.append("bytes */");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public long mo43060a(long j) {
        long j2 = this.f22435a;
        if (j2 >= 0) {
            return j2;
        }
        long j3 = j - this.f22436b;
        if (j3 < 0) {
            return 0;
        }
        return j3;
    }

    /* renamed from: b */
    public long mo43061b(long j) {
        if (this.f22435a < 0) {
            return j - 1;
        }
        long j2 = this.f22436b;
        return (j2 < 0 || j2 >= j) ? j - 1 : j2;
    }

    /* renamed from: c */
    public long mo43062c(long j) {
        return (mo43061b(j) - mo43060a(j)) + 1;
    }

    /* renamed from: f */
    public String mo43063f(long j) {
        StringBuilder sb = new StringBuilder(40);
        sb.append("bytes ");
        sb.append(mo43060a(j));
        sb.append('-');
        sb.append(mo43061b(j));
        sb.append(MiotCloudImpl.COOKIE_PATH);
        sb.append(j);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append(Long.toString(this.f22435a));
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(Long.toString(this.f22436b));
        return sb.toString();
    }
}
