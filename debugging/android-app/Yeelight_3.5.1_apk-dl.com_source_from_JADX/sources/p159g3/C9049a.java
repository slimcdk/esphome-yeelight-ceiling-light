package p159g3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p181l3.C9523b;
import p181l3.C9528g;

/* renamed from: g3.a */
public final class C9049a {

    /* renamed from: g3.a$a */
    public static class C9050a {

        /* renamed from: a */
        public String f16615a;

        /* renamed from: b */
        public String f16616b;

        /* renamed from: c */
        public String f16617c;

        /* renamed from: d */
        public long f16618d;

        /* renamed from: e */
        public Bundle f16619e;
    }

    /* renamed from: a */
    public static boolean m21680a(Context context, C9050a aVar) {
        String str;
        if (context == null) {
            str = "send fail, invalid argument";
        } else if (C9528g.m23177a(aVar.f16616b)) {
            str = "send fail, action is null";
        } else {
            String str2 = null;
            if (!C9528g.m23177a(aVar.f16615a)) {
                str2 = aVar.f16615a + ".permission.MM_MESSAGE";
            }
            Intent intent = new Intent(aVar.f16616b);
            Bundle bundle = aVar.f16619e;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra("_mmessage_sdkVersion", 620823552);
            intent.putExtra("_mmessage_appPackage", packageName);
            intent.putExtra("_mmessage_content", aVar.f16617c);
            intent.putExtra("_mmessage_support_content_type", aVar.f16618d);
            intent.putExtra("_mmessage_checksum", C9051b.m21681a(aVar.f16617c, 620823552, packageName));
            context.sendBroadcast(intent, str2);
            C9523b.m23171a("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
            return true;
        }
        C9523b.m23172b("MicroMsg.SDK.MMessage", str);
        return false;
    }
}
