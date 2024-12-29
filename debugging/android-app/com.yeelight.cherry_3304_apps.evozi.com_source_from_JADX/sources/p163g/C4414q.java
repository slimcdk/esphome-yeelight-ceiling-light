package p163g;

import android.support.p002v4.media.session.PlaybackStateCompat;
import javax.annotation.Nullable;

/* renamed from: g.q */
final class C4414q {
    @Nullable

    /* renamed from: a */
    static C4413p f7965a;

    /* renamed from: b */
    static long f7966b;

    private C4414q() {
    }

    /* renamed from: a */
    static void m12894a(C4413p pVar) {
        if (pVar.f7963f != null || pVar.f7964g != null) {
            throw new IllegalArgumentException();
        } else if (!pVar.f7961d) {
            synchronized (C4414q.class) {
                if (f7966b + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    f7966b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    pVar.f7963f = f7965a;
                    pVar.f7960c = 0;
                    pVar.f7959b = 0;
                    f7965a = pVar;
                }
            }
        }
    }

    /* renamed from: b */
    static C4413p m12895b() {
        synchronized (C4414q.class) {
            if (f7965a == null) {
                return new C4413p();
            }
            C4413p pVar = f7965a;
            f7965a = pVar.f7963f;
            pVar.f7963f = null;
            f7966b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return pVar;
        }
    }
}
