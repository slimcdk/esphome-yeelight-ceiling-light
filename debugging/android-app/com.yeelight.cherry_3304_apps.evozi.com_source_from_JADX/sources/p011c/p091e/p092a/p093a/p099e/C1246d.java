package p011c.p091e.p092a.p093a.p099e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p011c.p091e.p092a.p093a.p100f.C1249b;

/* renamed from: c.e.a.a.e.d */
class C1246d {
    /* renamed from: a */
    public static boolean m3207a(Context context, Signature[] signatureArr, boolean z) {
        String str;
        if (!z) {
            str = "ignore wechat app signature validation";
        } else {
            int length = signatureArr.length;
            int i = 0;
            while (i < length) {
                String lowerCase = signatureArr[i].toCharsString().toLowerCase();
                C1249b.m3234a("MicroMsg.SDK.WXMsgImplComm", "check signature:" + lowerCase);
                if (lowerCase.equals("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499")) {
                    str = "pass";
                } else {
                    i++;
                }
            }
            return false;
        }
        C1249b.m3234a("MicroMsg.SDK.WXMsgImplComm", str);
        return true;
    }

    /* renamed from: b */
    public static boolean m3208b(Context context, String str, boolean z) {
        if (!z) {
            C1249b.m3234a("MicroMsg.SDK.WXMsgImplComm", "ignore wechat app signature validation");
            return true;
        }
        try {
            return m3207a(context, context.getPackageManager().getPackageInfo(str, 64).signatures, z);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}