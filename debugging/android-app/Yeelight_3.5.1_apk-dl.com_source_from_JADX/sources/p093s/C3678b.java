package p093s;

import android.net.Uri;
import java.util.Map;

/* renamed from: s.b */
final class C3678b extends Thread {

    /* renamed from: a */
    final /* synthetic */ Map f6200a;

    C3678b(C3676a aVar, Map map) {
        this.f6200a = map;
    }

    public final void run() {
        Map map = this.f6200a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C3680d.m10522a(buildUpon.build().toString());
    }
}
