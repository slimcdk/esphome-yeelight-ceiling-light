package p011c.p091e.p092a.p093a.p094a.p095b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p011c.p091e.p092a.p093a.p100f.C1249b;
import p011c.p091e.p092a.p093a.p100f.C1254g;

/* renamed from: c.e.a.a.a.b.a */
public final class C1225a {

    /* renamed from: c.e.a.a.a.b.a$a */
    public static class C1226a {

        /* renamed from: a */
        public String f2160a;

        /* renamed from: b */
        public String f2161b;

        /* renamed from: c */
        public String f2162c;

        /* renamed from: d */
        public long f2163d;

        /* renamed from: e */
        public Bundle f2164e;
    }

    /* renamed from: a */
    public static boolean m3166a(Context context, C1226a aVar) {
        String str;
        if (context == null) {
            str = "send fail, invalid argument";
        } else if (C1254g.m3240a(aVar.f2161b)) {
            str = "send fail, action is null";
        } else {
            String str2 = null;
            if (!C1254g.m3240a(aVar.f2160a)) {
                str2 = aVar.f2160a + ".permission.MM_MESSAGE";
            }
            Intent intent = new Intent(aVar.f2161b);
            Bundle bundle = aVar.f2164e;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra("_mmessage_sdkVersion", 620823552);
            intent.putExtra("_mmessage_appPackage", packageName);
            intent.putExtra("_mmessage_content", aVar.f2162c);
            intent.putExtra("_mmessage_support_content_type", aVar.f2163d);
            intent.putExtra("_mmessage_checksum", C1227b.m3167a(aVar.f2162c, 620823552, packageName));
            context.sendBroadcast(intent, str2);
            C1249b.m3234a("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
            return true;
        }
        C1249b.m3235b("MicroMsg.SDK.MMessage", str);
        return false;
    }
}
