package p199p5;

import java.util.List;
import okhttp3.internal.http2.C9802a;
import okhttp3.internal.http2.ErrorCode;
import okio.C9838e;

/* renamed from: p5.b */
public interface C10273b {

    /* renamed from: a */
    public static final C10273b f19350a = new C10274a();

    /* renamed from: p5.b$a */
    class C10274a implements C10273b {
        C10274a() {
        }

        /* renamed from: a */
        public boolean mo41760a(int i, List<C9802a> list) {
            return true;
        }

        /* renamed from: b */
        public boolean mo41761b(int i, List<C9802a> list, boolean z) {
            return true;
        }

        /* renamed from: c */
        public boolean mo41762c(int i, C9838e eVar, int i2, boolean z) {
            eVar.skip((long) i2);
            return true;
        }

        /* renamed from: d */
        public void mo41763d(int i, ErrorCode errorCode) {
        }
    }

    /* renamed from: a */
    boolean mo41760a(int i, List<C9802a> list);

    /* renamed from: b */
    boolean mo41761b(int i, List<C9802a> list, boolean z);

    /* renamed from: c */
    boolean mo41762c(int i, C9838e eVar, int i2, boolean z);

    /* renamed from: d */
    void mo41763d(int i, ErrorCode errorCode);
}
