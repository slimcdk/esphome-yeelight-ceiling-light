package p236z2;

import com.squareup.okhttp.internal.framed.ErrorCode;

/* renamed from: z2.i */
public interface C12128i {

    /* renamed from: a */
    public static final C12128i f22288a = new C12129a();

    /* renamed from: z2.i$a */
    static class C12129a implements C12128i {
        C12129a() {
        }

        /* renamed from: a */
        public void mo42889a(C12112d dVar) {
            dVar.mo42855l(ErrorCode.REFUSED_STREAM);
        }
    }

    /* renamed from: a */
    void mo42889a(C12112d dVar);
}
