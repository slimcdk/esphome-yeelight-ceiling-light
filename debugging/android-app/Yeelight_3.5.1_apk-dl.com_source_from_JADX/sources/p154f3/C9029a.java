package p154f3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p159g3.C9051b;
import p181l3.C9523b;
import p181l3.C9528g;

/* renamed from: f3.a */
public class C9029a {

    /* renamed from: f3.a$a */
    public static class C9030a {

        /* renamed from: a */
        public String f16539a;

        /* renamed from: b */
        public String f16540b;

        /* renamed from: c */
        public String f16541c;

        /* renamed from: d */
        public int f16542d = -1;

        /* renamed from: e */
        public Bundle f16543e;

        public String toString() {
            return "targetPkgName:" + this.f16539a + ", targetClassName:" + this.f16540b + ", content:" + this.f16541c + ", flags:" + this.f16542d + ", bundle:" + this.f16543e;
        }
    }

    /* renamed from: a */
    public static boolean m21558a(Context context, C9030a aVar) {
        String str;
        if (context == null || aVar == null) {
            str = "send fail, invalid argument";
        } else if (C9528g.m23177a(aVar.f16539a)) {
            str = "send fail, invalid targetPkgName, targetPkgName = " + aVar.f16539a;
        } else {
            if (C9528g.m23177a(aVar.f16540b)) {
                aVar.f16540b = aVar.f16539a + ".wxapi.WXEntryActivity";
            }
            C9523b.m23171a("MicroMsg.SDK.MMessageAct", "send, targetPkgName = " + aVar.f16539a + ", targetClassName = " + aVar.f16540b);
            Intent intent = new Intent();
            intent.setClassName(aVar.f16539a, aVar.f16540b);
            Bundle bundle = aVar.f16543e;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra("_mmessage_sdkVersion", 620823552);
            intent.putExtra("_mmessage_appPackage", packageName);
            intent.putExtra("_mmessage_content", aVar.f16541c);
            intent.putExtra("_mmessage_checksum", C9051b.m21681a(aVar.f16541c, 620823552, packageName));
            int i = aVar.f16542d;
            if (i == -1) {
                intent.addFlags(268435456).addFlags(134217728);
            } else {
                intent.setFlags(i);
            }
            try {
                context.startActivity(intent);
                C9523b.m23171a("MicroMsg.SDK.MMessageAct", "send mm message, intent=" + intent);
                return true;
            } catch (Exception e) {
                str = "send fail, ex = " + e.getMessage();
            }
        }
        C9523b.m23172b("MicroMsg.SDK.MMessageAct", str);
        return false;
    }
}
