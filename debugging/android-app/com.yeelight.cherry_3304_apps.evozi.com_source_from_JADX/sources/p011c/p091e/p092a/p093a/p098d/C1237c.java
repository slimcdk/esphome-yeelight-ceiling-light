package p011c.p091e.p092a.p093a.p098d;

import android.os.Bundle;
import p011c.p091e.p092a.p093a.p100f.C1249b;

/* renamed from: c.e.a.a.d.c */
public final class C1237c {

    /* renamed from: a */
    public int f2183a;

    /* renamed from: b */
    public String f2184b;

    /* renamed from: c */
    public String f2185c;

    /* renamed from: d */
    public byte[] f2186d;

    /* renamed from: e */
    public C1239b f2187e;

    /* renamed from: f */
    public String f2188f;

    /* renamed from: g */
    public String f2189g;

    /* renamed from: h */
    public String f2190h;

    /* renamed from: c.e.a.a.d.c$a */
    public static class C1238a {
        /* renamed from: a */
        private static String m3197a(String str) {
            if (str != null && str.length() != 0) {
                return str.replace("com.tencent.mm.opensdk.modelmsg", "com.tencent.mm.sdk.openapi");
            }
            C1249b.m3235b("MicroMsg.SDK.WXMediaMessage", "pathNewToOld fail, newPath is null");
            return str;
        }

        /* renamed from: b */
        public static Bundle m3198b(C1237c cVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("_wxobject_sdkVer", cVar.f2183a);
            bundle.putString("_wxobject_title", cVar.f2184b);
            bundle.putString("_wxobject_description", cVar.f2185c);
            bundle.putByteArray("_wxobject_thumbdata", cVar.f2186d);
            C1239b bVar = cVar.f2187e;
            if (bVar != null) {
                bundle.putString("_wxobject_identifier_", m3197a(bVar.getClass().getName()));
                cVar.f2187e.mo10050a(bundle);
            }
            bundle.putString("_wxobject_mediatagname", cVar.f2188f);
            bundle.putString("_wxobject_message_action", cVar.f2189g);
            bundle.putString("_wxobject_message_ext", cVar.f2190h);
            return bundle;
        }
    }

    /* renamed from: c.e.a.a.d.c$b */
    public interface C1239b {
        /* renamed from: a */
        void mo10050a(Bundle bundle);

        int type();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo10053a() {
        throw null;
    }

    /* renamed from: b */
    public final int mo10054b() {
        throw null;
    }
}
