package p011c.p091e.p092a.p093a.p094a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p011c.p091e.p092a.p093a.p094a.p095b.C1227b;
import p011c.p091e.p092a.p093a.p100f.C1249b;
import p011c.p091e.p092a.p093a.p100f.C1254g;

/* renamed from: c.e.a.a.a.a */
public class C1223a {

    /* renamed from: c.e.a.a.a.a$a */
    public static class C1224a {

        /* renamed from: a */
        public String f2155a;

        /* renamed from: b */
        public String f2156b;

        /* renamed from: c */
        public String f2157c;

        /* renamed from: d */
        public int f2158d = -1;

        /* renamed from: e */
        public Bundle f2159e;

        public String toString() {
            return "targetPkgName:" + this.f2155a + ", targetClassName:" + this.f2156b + ", content:" + this.f2157c + ", flags:" + this.f2158d + ", bundle:" + this.f2159e;
        }
    }

    /* renamed from: a */
    public static boolean m3165a(Context context, C1224a aVar) {
        String str;
        if (context == null || aVar == null) {
            str = "send fail, invalid argument";
        } else if (C1254g.m3240a(aVar.f2155a)) {
            str = "send fail, invalid targetPkgName, targetPkgName = " + aVar.f2155a;
        } else {
            if (C1254g.m3240a(aVar.f2156b)) {
                aVar.f2156b = aVar.f2155a + ".wxapi.WXEntryActivity";
            }
            C1249b.m3234a("MicroMsg.SDK.MMessageAct", "send, targetPkgName = " + aVar.f2155a + ", targetClassName = " + aVar.f2156b);
            Intent intent = new Intent();
            intent.setClassName(aVar.f2155a, aVar.f2156b);
            Bundle bundle = aVar.f2159e;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra("_mmessage_sdkVersion", 620823552);
            intent.putExtra("_mmessage_appPackage", packageName);
            intent.putExtra("_mmessage_content", aVar.f2157c);
            intent.putExtra("_mmessage_checksum", C1227b.m3167a(aVar.f2157c, 620823552, packageName));
            int i = aVar.f2158d;
            if (i == -1) {
                intent.addFlags(268435456).addFlags(134217728);
            } else {
                intent.setFlags(i);
            }
            try {
                context.startActivity(intent);
                C1249b.m3234a("MicroMsg.SDK.MMessageAct", "send mm message, intent=" + intent);
                return true;
            } catch (Exception e) {
                str = "send fail, ex = " + e.getMessage();
            }
        }
        C1249b.m3235b("MicroMsg.SDK.MMessageAct", str);
        return false;
    }
}
