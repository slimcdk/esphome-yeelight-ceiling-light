package okio;

import android.support.p004v4.media.session.PlaybackStateCompat;
import javax.annotation.Nullable;

/* renamed from: okio.p */
final class C3569p {
    @Nullable

    /* renamed from: a */
    static C3568o f5944a;

    /* renamed from: b */
    static long f5945b;

    private C3569p() {
    }

    /* renamed from: a */
    static void m10054a(C3568o oVar) {
        if (oVar.f5942f != null || oVar.f5943g != null) {
            throw new IllegalArgumentException();
        } else if (!oVar.f5940d) {
            synchronized (C3569p.class) {
                long j = f5945b;
                if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    f5945b = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    oVar.f5942f = f5944a;
                    oVar.f5939c = 0;
                    oVar.f5938b = 0;
                    f5944a = oVar;
                }
            }
        }
    }

    /* renamed from: b */
    static C3568o m10055b() {
        synchronized (C3569p.class) {
            C3568o oVar = f5944a;
            if (oVar == null) {
                return new C3568o();
            }
            f5944a = oVar.f5942f;
            oVar.f5942f = null;
            f5945b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return oVar;
        }
    }
}
