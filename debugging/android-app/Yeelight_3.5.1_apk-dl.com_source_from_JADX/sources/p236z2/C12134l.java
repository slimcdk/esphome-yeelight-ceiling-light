package p236z2;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.util.List;
import okio.C9838e;

/* renamed from: z2.l */
public interface C12134l {

    /* renamed from: a */
    public static final C12134l f22296a = new C12135a();

    /* renamed from: z2.l$a */
    static class C12135a implements C12134l {
        C12135a() {
        }

        /* renamed from: a */
        public boolean mo42896a(int i, List<C12117e> list) {
            return true;
        }

        /* renamed from: b */
        public boolean mo42897b(int i, List<C12117e> list, boolean z) {
            return true;
        }

        /* renamed from: c */
        public boolean mo42898c(int i, C9838e eVar, int i2, boolean z) {
            eVar.skip((long) i2);
            return true;
        }

        /* renamed from: d */
        public void mo42899d(int i, ErrorCode errorCode) {
        }
    }

    /* renamed from: a */
    boolean mo42896a(int i, List<C12117e> list);

    /* renamed from: b */
    boolean mo42897b(int i, List<C12117e> list, boolean z);

    /* renamed from: c */
    boolean mo42898c(int i, C9838e eVar, int i2, boolean z);

    /* renamed from: d */
    void mo42899d(int i, ErrorCode errorCode);
}
