package p236z2;

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.Closeable;
import java.util.List;
import okio.ByteString;
import okio.C9838e;

/* renamed from: z2.a */
public interface C12097a extends Closeable {

    /* renamed from: z2.a$a */
    public interface C12098a {
        /* renamed from: b */
        void mo42815b(int i, long j);

        /* renamed from: e */
        void mo42816e(boolean z, int i, int i2);

        /* renamed from: g */
        void mo42817g(int i, int i2, List<C12117e> list);

        /* renamed from: h */
        void mo42818h();

        /* renamed from: i */
        void mo42819i(boolean z, int i, C9838e eVar, int i2);

        /* renamed from: j */
        void mo42820j(int i, int i2, int i3, boolean z);

        /* renamed from: o */
        void mo42821o(int i, ErrorCode errorCode);

        /* renamed from: q */
        void mo42822q(int i, ErrorCode errorCode, ByteString byteString);

        /* renamed from: r */
        void mo42823r(boolean z, C12136m mVar);

        /* renamed from: s */
        void mo42824s(boolean z, boolean z2, int i, int i2, List<C12117e> list, HeadersMode headersMode);
    }

    /* renamed from: C */
    boolean mo42813C(C12098a aVar);

    /* renamed from: C0 */
    void mo42814C0();
}
